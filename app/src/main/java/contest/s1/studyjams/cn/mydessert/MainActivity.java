package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.crash.FirebaseCrash;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Dessert[] my = {new Dessert("Etymology",R.drawable.apple_pie),
            new Dessert("History",R.drawable.cappuccino),
            new Dessert("Varieties",R.drawable.cheesecake),
            new Dessert("Ingredients",R.drawable.griceball),
            new Dessert("Market",R.drawable.pudding)};

    private List<Dessert> myList = new ArrayList<>();

    private DessertAdapter adt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest add = new AdRequest.Builder().build();
        mAdView.loadAd(add);

        initDessert();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        adt  = new DessertAdapter(myList);
        recyclerView.setAdapter(adt);
        FirebaseCrash.report(new Exception("My Android non-fatal error"));


    }


    public void initDessert(){

        for (int i = 0 ;i < 5; i++){
            myList.add(my[i]);
        }
    }
}
