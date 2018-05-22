package com.example.neosoft.frontpage;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class NavActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img4};
    String[] NAMES = {"Ashi Singh","Prachi singh", "Nayan singh","Ankit  Singh"};
    String[] DESCRIPTION = {"Actor", "Freedom Fightter","Sports","Scientist"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

//        ListView listView= (ListView) findViewById(R.id.listView);
//        CustomerAdapter customerAdapter  = new CustomerAdapter();
//        listView.setAdapter(customerAdapter);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Main title");
        getSupportActionBar().setIcon(R.drawable.ic_keyboard_arrow_down_black_24dp);
        toolbar.setSubtitle("sub title ");

`      Item item = (ClipData.Item) findViewById(R.id.item2);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent (NavActivity.this, IconActivity.class);
                startActivity(intent);
            }
        });




        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_favorties:
                            selectedFragment = new FavoritesFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment = new SearchFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };


//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.example_menu, menu);
//        return true;
//    }

//    class  CustomerAdapter extends BaseAdapter{
//
//        @Override
//        public int getCount() {
//            return IMAGES.length;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int i, View view, ViewGroup viewGroup) {
//
//            view = getLayoutInflater().inflate(R.layout.customlayout,null);
//            ImageView imageView =(ImageView)view.findViewById(R.id.imageView);
//            TextView textView_name =(TextView)view.findViewById(R.id.textView_name);
//            TextView  textView_description =(TextView)view.findViewById(R.id.textView_description);
//
//            imageView.setImageResource(IMAGES[i]);
//            textView_name.setText(NAMES[i]);
//            textView_description.setText(DESCRIPTION[i]);
//
//            return view;
//
//
//        }
//    }

}
