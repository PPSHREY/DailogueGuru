package com.example.shreypatel.dailogueguru;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class more_apps extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout mDrawerLayout1;
    private ActionBarDrawerToggle mToggle1;

    private ListView listView;
    private MyAppAdapter myAppAdapter1;
    private ArrayList<more_app_profile> profileModelArrayList1;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_apps);


        mDrawerLayout1 = (DrawerLayout) findViewById(R.id.drawer);
        mToggle1 = new ActionBarDrawerToggle(this, mDrawerLayout1, R.string.open, R.string.close);
        mDrawerLayout1.addDrawerListener(mToggle1);
        mToggle1.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        profileModelArrayList1=new ArrayList<>();
        profileModelArrayList1.add(new more_app_profile("Gujarati Kehvato ","Hii Everyone",R.drawable.guju_kehvato));
        profileModelArrayList1.add(new more_app_profile("Gujarati Kehvato ","Hii Everyone",R.drawable.guju_kehvato));

        listView= (ListView)findViewById(R.id.listview);
        myAppAdapter1= new more_apps.MyAppAdapter(profileModelArrayList1,more_apps.this);
        listView.setAdapter(myAppAdapter1);

    }

    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder1 {
            TextView app_name,app_info;
            ImageView image1;

        }

        public ArrayList<more_app_profile> app_profile;

        public Context context;


        private MyAppAdapter(ArrayList<more_app_profile> apps, Context context) {
            this.app_profile = apps;
            this.context = context;

        }

        @Override
        public int getCount() {
            return app_profile.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View rowView = convertView;
            more_apps.MyAppAdapter.ViewHolder1 viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.more_list, parent,false);
                // configure view holder
                viewHolder = new more_apps.MyAppAdapter.ViewHolder1();
//                viewHolder.copy = (ImageView) rowView.findViewById(R.id.copy);
//                viewHolder.share = (ImageView) rowView.findViewById(R.id.share);
                viewHolder.image1 = (ImageView) rowView.findViewById(R.id.image1);
               viewHolder.app_name = (TextView) rowView.findViewById(R.id.app_name);
                viewHolder.app_info = (TextView) rowView.findViewById(R.id.app_info);
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (more_apps.MyAppAdapter.ViewHolder1) convertView.getTag();
            }

            viewHolder.app_name.setText(app_profile.get(position).getTxt1()+"");
            viewHolder.app_info.setText(app_profile.get(position).getText()+"");
            Glide.with(more_apps.this).load(app_profile.get(position).getImage1()).into(viewHolder.image1);

            return rowView;


        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);
        return true;
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home)
        {
            Intent intent = new Intent(more_apps.this,MainActivity.class);
            startActivity(intent);
        }

        if (id == R.id.fav)
        {
            finish();
            System.exit(0);
        }

        if (id == R.id.share)
        {
            Intent share = new Intent();
            share.setAction(Intent.ACTION_SEND);
            share.putExtra(Intent.EXTRA_TEXT,"Hey Check my new App for Best Best Bollywood Dailgoues \n\n  https://play.google.com/store/apps/details?id=com.sunny.bollywoodfilmydialogues");
            share.setType("text/plain");
            startActivity(share);
        }

        if (id == R.id.rate)
        {
            Toast.makeText(this,"This is Rate App Activity.",Toast.LENGTH_LONG).show();
        }

        if (id == R.id.more)
        {
            Intent intent = new Intent(more_apps.this,more_apps.class);
            startActivity(intent);
        }

        if (id == R.id.about)
        {
            Intent intent = new Intent(this,About_us.class);
            startActivity(intent);
        }

        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
