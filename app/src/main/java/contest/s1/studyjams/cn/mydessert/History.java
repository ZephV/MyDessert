package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class History extends Activity {

    public String mText="Sweets were fed to the gods in ancient Mesopotamia and India and other ancient civilizations. Dried fruit and honey were probably the first sweeteners used in most of the world, but the spread of sugarcane around the world was essential to the development of dessert.\n" +
            "\n" +
            "Sugarcane was grown and refined in India before 500 BCE and was crystallized, making it easy to transport, by 500 CE. Sugar and sugarcane were traded, making sugar available to Macedonia by 300 BCE and China by 600 CE. In South Asia, the Middle East and China, sugar has been a staple of cooking and desserts for over a thousand years. Sugarcane and sugar were little known and rare in Europe until the twelfth century or later, when the Crusades and then colonialization spread its use.\n" +
            "\n" +
            "Europeans began to manufacture sugar in the Middle Ages, and more sweet desserts became available. Even then sugar was so expensive usually only the wealthy could indulge on special occasions. The first apple pie recipe was published in 1381. The earliest documentation of the term cupcake was in \"Seventy-five Receipts for Pastry, Cakes, and Sweetmeats\" in 1828 in Eliza Leslie's Receipts cookbook.\n" +
            "\n" +
            "The Industrial Revolution in America and Europe caused desserts (and food in general) to be mass-produced, processed, preserved, canned, and packaged. Frozen foods became very popular starting in the 1920s when freezing emerged. These processed foods became a large part of diets in many industrialized nations. Many countries have desserts and foods distinctive to their nations or region.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageView imageView = (ImageView)findViewById(R.id.history_img);
        imageView.setImageResource(R.drawable.cappuccino);

        TextView textView = (TextView)findViewById(R.id.history_text);
        textView.setText(mText);
    }
}
