package regimeister.modic;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
//    http://kayaposoft.com/enrico/json/v1.0/?action=getPublicHolidaysForDateRange&fromDate=04-07-2012&toDate=04-07-2014&country=usa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        RecyclerView rv = (RecyclerView) findViewById(R.id.my_recycler_view);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);
    }

    private void showDialog(){
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(
                MainActivity.this);

        builderSingle.setTitle("Select the country");
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("Angola");
        arrayAdapter.add("Australia");
        arrayAdapter.add("Austria");
        arrayAdapter.add("Belgium");
        arrayAdapter.add("Canada");
        arrayAdapter.add("China");
        arrayAdapter.add("Croatia");
        arrayAdapter.add("Czech Republic");
        arrayAdapter.add("Denmark");
        arrayAdapter.add("England");
        arrayAdapter.add("Estonia");
        arrayAdapter.add("Finland");
        arrayAdapter.add("France");
        arrayAdapter.add("Germany");
        arrayAdapter.add("Hong Kong");
        arrayAdapter.add("Hungary");
        arrayAdapter.add("Iceland");
        arrayAdapter.add("Ireland");
        arrayAdapter.add("Isle of Man");
        arrayAdapter.add("Israel");
        arrayAdapter.add("Italy");
        arrayAdapter.add("Japan");
        arrayAdapter.add("Latvia");
        arrayAdapter.add("Lithuania");
        arrayAdapter.add("Luxembourg");
        arrayAdapter.add("Mexico");
        arrayAdapter.add("Netherlands");
        arrayAdapter.add("New Zealand");
        arrayAdapter.add("Northern Ireland");
        arrayAdapter.add("Norway");
        arrayAdapter.add("Poland");
        arrayAdapter.add("Portugal");
        arrayAdapter.add("Russia");
        arrayAdapter.add("Serbia");
        arrayAdapter.add("Slovakia");
        arrayAdapter.add("Slovenia");
        arrayAdapter.add("South Africa");
        arrayAdapter.add("South Korea");
        arrayAdapter.add("Sweden");
        arrayAdapter.add("Ukraine");
        arrayAdapter.add("United States of America");
        builderSingle.setNegativeButton("cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        builderSingle.setAdapter(arrayAdapter,
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String strName = arrayAdapter.getItem(which);
                        AlertDialog.Builder builderInner = new AlertDialog.Builder(
                                MainActivity.this);
                        builderInner.setMessage(strName);
                        builderInner.setTitle("Your Selected Item is");
                        builderInner.setPositiveButton("Ok",
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(
                                            DialogInterface dialog,
                                            int which) {
                                        dialog.dismiss();
                                    }
                                });
                        builderInner.show();
                    }
                });
        builderSingle.show();
    }


}
