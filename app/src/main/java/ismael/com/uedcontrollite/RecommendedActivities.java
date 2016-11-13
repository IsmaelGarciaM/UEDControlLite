package ismael.com.uedcontrollite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ismael.com.uedcontrollite.adapter.ActAdapter;

public class RecommendedActivities extends AppCompatActivity {

    ActAdapter adapter;
    RecyclerView activitiesR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_activities);
        activitiesR = (RecyclerView) findViewById(R.id.ActRecyclerR);
        activitiesR.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ActAdapter();
        activitiesR.setAdapter(adapter);
    }
}
