package com.example.neosoft.frontpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class LocationActivity extends AppCompatActivity {

     MaterialSearchView materialSearchView;
    String[] list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = new String[]{"Clipcodes", "Android Tutorials", "Youtube Clipcodes Tutorials", "SearchView Clicodes", "Android Clipcodes", "Tutorials Clipcodes"};

        materialSearchView = (MaterialSearchView)findViewById(R.id.mysearch);
        materialSearchView.clearFocus();
        materialSearchView.setSuggestions(list);
        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Here Create your filtering
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //You can make change realtime if you typing here
                //See my tutorials for filtering with ListView
                return false;
            }
        });

        //Follow this video for fix and other happend, Comment and Like this video . THANKS
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem item = menu.findItem(R.id.search);
        materialSearchView.setMenuItem(item);

        return true;
    }


    }

