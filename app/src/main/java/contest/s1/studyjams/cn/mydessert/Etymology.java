package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.text;

public class Etymology extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etymology);

        ImageView imageView = (ImageView)findViewById(R.id.etymology_img);
        imageView.setImageResource(R.drawable.apple_pie);

        TextView textView = (TextView)findViewById(R.id.etymology_text);
        textView.setText(R.string.Dessert);
    }
}
