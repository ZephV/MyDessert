package contest.s1.studyjams.cn.mydessert;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.List;



public class DessertAdapter extends RecyclerView.Adapter<DessertAdapter.ViewHolder>{

    private Context mContext;

    private List<Dessert> mDessertList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView mImageView;
        TextView mTextView;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView)view;
            mImageView = (ImageView)view.findViewById(R.id.image_view);
            mTextView = (TextView)view.findViewById(R.id.text_view);
        }
    }

    public DessertAdapter(List<Dessert> MyList){
        mDessertList = MyList;
    }

    public ViewHolder onCreateViewHolder (final ViewGroup parent, int viewType){
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()) {
                    case 0 :
                        Intent intent = new Intent(mContext, Etymology.class);
                        mContext.startActivity(intent);
                        break;
                    case 1 :
                        Intent a = new Intent(mContext, History.class);
                        mContext.startActivity(a);
                        break;
                    case 2 :
                        Intent b = new Intent(mContext, Varieties.class);
                        mContext.startActivity(b);
                        break;
                    case 3 :
                        Intent c = new Intent(mContext, Ingredients.class);
                        mContext.startActivity(c);
                        break;
                    case 4 :
                        Intent d = new Intent(mContext, Market.class);
                        mContext.startActivity(d);
                        break;
                }
            }
        });
        return  holder;
    }

    public void onBindViewHolder (ViewHolder holder, int position){
        Dessert dessert = mDessertList.get(position);
        holder.mTextView.setText(dessert.getName());
        Glide.with(mContext).load(dessert.getImageId()).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mDessertList.size();
    }

}
