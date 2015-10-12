package regimeister.modic;

import android.content.Context;
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


import java.util.ArrayList;

import regimeister.modic.Models.Country;

public class MainActivity extends AppCompatActivity {
//    http://kayaposoft.com/enrico/json/v1.0/?action=getPublicHolidaysForDateRange&fromDate=04-07-2012&toDate=04-07-2014&country=usa

    private ArrayList<Country> countries = new ArrayList<>();
    MyAdapter adapter;
    LinearLayoutManager llm;

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

        fillData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.my_recycler_view);
        rv.setHasFixedSize(true);
        llm = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(llm);

        adapter = new MyAdapter(countries);
        rv.setAdapter(adapter);
    }

    private void fillData() {
        Context con=getApplicationContext();
        countries.add(new Country(con,"Angola","ago",R.drawable.angola));
        countries.add(new Country(con,"Australia","aus",R.drawable.australia));
        countries.add(new Country(con,"Austria","aut",R.drawable.austria));
        countries.add(new Country(con,"Belgium","",R.drawable.belgium));
        countries.add(new Country(con,"Canada","can",R.drawable.canada));
        countries.add(new Country(con,"China","chn",R.drawable.china));
        countries.add(new Country(con,"Croatia","hrv",R.drawable.croatia));
        countries.add(new Country(con,"Czech Republic","cze",R.drawable.czechrepublic));
        countries.add(new Country(con,"Denmark","dnk",R.drawable.denmark));
        countries.add(new Country(con,"England","eng",R.drawable.england));
        countries.add(new Country(con,"Estonia","est",R.drawable.estonia));
        countries.add(new Country(con,"Finland","fin",R.drawable.finland));
        countries.add(new Country(con,"France","fra",R.drawable.france));
        countries.add(new Country(con,"Germany","ger",R.drawable.germany));
        countries.add(new Country(con,"Hong Kong","hkg",R.drawable.hongkong));
        countries.add(new Country(con,"Hungary","hun",R.drawable.hungary));
        countries.add(new Country(con,"Iceland","isl",R.drawable.iceland));
        countries.add(new Country(con,"Ireland","urk",R.drawable.ireland));
        countries.add(new Country(con,"Isle of Man","imn",R.drawable.isleofman));
        countries.add(new Country(con,"Israel","isr",R.drawable.israel));
        countries.add(new Country(con,"Italy","ita",R.drawable.italy));
        countries.add(new Country(con,"Japan","jpn",R.drawable.japan));
        countries.add(new Country(con,"Latvia","lva",R.drawable.latvia));
        countries.add(new Country(con,"Lithuania","ltu",R.drawable.lithuania));
        countries.add(new Country(con,"Luxembourg","lux",R.drawable.luxembourg));
        countries.add(new Country(con,"Mexico","mex",R.drawable.mexico));
        countries.add(new Country(con,"Netherlands","nld",R.drawable.netherlands));
        countries.add(new Country(con,"New Zealand","nzl",R.drawable.newzealand));
        countries.add(new Country(con,"Northern Ireland","nir",R.drawable.ireland));
        countries.add(new Country(con,"Norway","nor",R.drawable.norway));
        countries.add(new Country(con,"Poland","pol",R.drawable.poland));
        countries.add(new Country(con,"Portugal","prt",R.drawable.portugal));
        countries.add(new Country(con,"Russia","rus",R.drawable.russia));
        countries.add(new Country(con,"Serbia","srb",R.drawable.serbia));
        countries.add(new Country(con,"Slovakia","svk",R.drawable.slovakia));
        countries.add(new Country(con,"Slovenia","svn",R.drawable.slovenia));
        countries.add(new Country(con,"South Africa","zaf",R.drawable.southafrica));
        countries.add(new Country(con,"South Korea","rok",R.drawable.southkorea));
        countries.add(new Country(con,"Sweden","swe",R.drawable.sweden));
        countries.add(new Country(con,"Ukraine","ukr",R.drawable.ukraine));
        countries.add(new Country(con,"United States of America","usa",R.drawable.unitedstates));
    }

    private void showDialog() {
        adapter.add(0,new Country(getApplicationContext(),"Angola","ago",R.drawable.angola));
        llm.scrollToPosition(0);
    }


}











































