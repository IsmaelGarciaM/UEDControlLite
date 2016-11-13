package ismael.com.uedcontrollite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.Comparator;

import ismael.com.uedcontrollite.adapter.TherapistAdapter;
import ismael.com.uedcontrollite.model.Therapist;

public class TherapisList extends AppCompatActivity {

    private TherapistAdapter adapter;
    private ListView tlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapis_list);
        adapter = new TherapistAdapter(this);
        tlist = (ListView) findViewById(R.id.listTherapist);
        tlist.setAdapter(adapter);

        tlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(TherapisList.this, ChatActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_act, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_sort_alphabetically:
                adapter.sort(new Comparator<Therapist>() {
                    @Override
                    public int compare(Therapist o1, Therapist o2) {
                        return o1.compareTo(o2);
                    }
                });                break;

        }
        return super.onOptionsItemSelected(item);
    }


}
