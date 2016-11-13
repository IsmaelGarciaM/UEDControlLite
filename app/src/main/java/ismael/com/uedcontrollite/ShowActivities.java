package ismael.com.uedcontrollite;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Date;

import ismael.com.uedcontrollite.adapter.ActAdapter;

public class ShowActivities extends AppCompatActivity {

    ActAdapter adapter;
    RecyclerView activities;
    Button btnDateActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_activities);
        activities = (RecyclerView) findViewById(R.id.ActRecycler);
        activities.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ActAdapter();
        activities.setAdapter(adapter);
        btnDateActivity = (Button) findViewById(R.id.btnDateActivity);
        btnDateActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(0);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == 0) {
            Date d = new Date();
            d.setTime(d.getTime());
            return new DatePickerDialog(this, myDateListener, d.getYear(), d.getMonth(), d.getDay());
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
        }

    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_act, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.action_sort_alphabetically:
                adapter.getActivitiesOrder();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
