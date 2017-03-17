package contest.s1.studyjams.cn.mydessert;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;


public class VarietiesAdapter extends RecyclerView.Adapter<VarietiesAdapter.ViewHolder> {

    private Context mContext;

    private List<vt> mVList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView mTextView;

        public  ViewHolder(View v){
            super(v);
            cardView = (CardView)v;
            mTextView = (TextView)v.findViewById(R.id.vt_text);
        }
    }
    public VarietiesAdapter(List<vt> vList){
        mVList = vList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewTpye){
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.vtrc_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()){
                    case 0 :
                        Toast.makeText(view.getContext(), R.string.Cakes , Toast.LENGTH_SHORT).show();
                        break;
                    case 1 :
                        Toast.makeText(view.getContext(), R.string.Chocolates_and_candies , Toast.LENGTH_SHORT).show();
                        break;
                    case 2 :
                        Toast.makeText(view.getContext(), R.string.Cookies_or_biscuits , Toast.LENGTH_SHORT).show();
                        break;
                    case 3 :
                        Toast.makeText(view.getContext(), R.string.Custards_and_puddings , Toast.LENGTH_SHORT).show();
                        break;
                    case 4 :
                        Toast.makeText(view.getContext(), R.string.Deep_fried_desserts , Toast.LENGTH_SHORT).show();
                        break;
                    case 5 :
                        Toast.makeText(view.getContext(), R.string.Frozen_desserts , Toast.LENGTH_SHORT).show();
                        break;
                    case 6 :
                        Toast.makeText(view.getContext(), R.string.Jellied_desserts , Toast.LENGTH_SHORT).show();
                        break;
                    case 7 :
                        Toast.makeText(view.getContext(), R.string.Pastries , Toast.LENGTH_SHORT).show();
                        break;
                    case 8 :
                        Toast.makeText(view.getContext(), R.string.Pies_cobblers_and_clafoutis , Toast.LENGTH_SHORT).show();
                        break;
                    case 9 :
                        Toast.makeText(view.getContext(), R.string.Sweet_soups , Toast.LENGTH_SHORT).show();
                        break;
                    case 10 :
                        Toast.makeText(view.getContext(), R.string.Dessert_wines , Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        return holder;
    }
    public void onBindViewHolder(ViewHolder holder, int position){
        vt varieties = mVList.get(position);
        holder.mTextView.setText(varieties.getVtName());
    }
    public int getItemCount(){
        return mVList.size();
    }
}
