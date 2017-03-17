package contest.s1.studyjams.cn.mydessert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

public class Varieties extends Activity {

    private vt[] vv = {new vt("Cakes"),
            new vt("Chocolates and candies"), new vt("Cookies or biscuits"),
            new vt("Custards and puddings"), new vt("Deep-fried desserts"),
            new vt("Frozen desserts"), new vt("Jellied desserts"),
            new vt("Pastries"), new vt("Pies, cobblers, and clafoutis"),
            new vt("Sweet soups"), new vt("Dessert wines")
    };

    private List<vt> vtList = new ArrayList<>();

    private VarietiesAdapter adt;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varieties);
        initVT();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.vt_recycler_view);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        adt  = new VarietiesAdapter(vtList);
        recyclerView.setAdapter(adt);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mFirebaseAnalytics.setUserProperty("favorite_food","dessert");

    }

    public void initVT(){

        for (int i = 0 ;i < 11; i++){
            vtList.add(vv[i]);
        }
    }
}
