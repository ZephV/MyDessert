package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.id;

public class Market extends Activity {

    public String mText="The market for desserts has grown over the last few decades, which was greatly increased by the commercialism of baking desserts and the rise of food productions. Desserts are present in most restaurants as the popularity has increased. Many commercial stores have been established as solely desserts stores. Ice cream parlors have been around since before 1800. Many businesses started advertising campaigns focusing solely on desserts. The tactics used to market desserts are very different depending on the audience for example desserts can be advertised with popular movie characters to target children. The rise of companies like Food Network has marketed many shows which feature dessert and their creation. Shows like these have displayed extreme desserts and made a game show atmosphere which made desserts a more competitive field.\n" +
            "Desserts are a standard staple in restaurant menus, with different degrees of variety. Pie and cheesecake were among the most popular dessert courses ordered in U.S. restaurants in 2012.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        ImageView imageView = (ImageView)findViewById(R.id.market_img);
        imageView.setImageResource(R.drawable.pudding);

        TextView textView = (TextView)findViewById(R.id.market_text);
        textView.setText(mText);
    }
}
