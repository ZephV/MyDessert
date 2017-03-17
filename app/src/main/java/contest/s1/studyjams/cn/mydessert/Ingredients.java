package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class Ingredients extends Activity {

    public String mText="Sweet desserts usually contain cane sugar, palm sugar, honey or some types of syrup such as molasses, maple syrup, treacle, or corn syrup. Other common ingredients in Western-style desserts are flour or other starches, fats such as butter or lard, dairy, eggs, salt, acidic ingredients such as lemon juice, and spices and other flavoring agents such as chocolate, peanut butter, fruits, and nuts. The proportions of these ingredients, along with the preparation methods, play a major part in the consistency, texture, and flavor of the end product.\n" +
            "\n" +
            "Sugars contribute moisture and tenderness to baked goods. Flour or starch components serves as a protein and gives the dessert structure. Fats contribute moisture and can enable the development of flaky layers in pastries and pie crusts. The dairy products in baked goods keep the desserts moist. Many desserts also contain eggs, in order to form custard or to aid in the rising and thickening of a cake-like substance. Egg yolks specifically contribute to the richness of desserts. Egg whites can act as a leavening agent or provide structure. Desserts can contain many spices and extracts to add a variety of flavors. Salt and acids are added to desserts to balance sweet flavors and create a contrast in flavors.\n" +
            "\n" +
            "Some desserts are made with coffee, such as tiramisu, or a coffee-flavoured version of a dessert can be made, for example an iced coffee soufflé or coffee biscuits. Alcohol can also be used as an ingredient, to make alcoholic desserts.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);

        ImageView imageView = (ImageView)findViewById(R.id.ingredients_img);
        imageView.setImageResource(R.drawable.cappuccino);
        TextView textView = (TextView)findViewById(R.id.ingredients_text);
        textView.setText(mText);

    }
}
