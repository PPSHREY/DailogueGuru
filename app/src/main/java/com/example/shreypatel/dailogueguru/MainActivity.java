package com.example.shreypatel.dailogueguru;

import android.app.AlarmManager;
import android.app.PendingIntent;
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
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.shreypatel.dailogueguru.actor.aamir_khan;
import com.example.shreypatel.dailogueguru.actor.abhishek;
import com.example.shreypatel.dailogueguru.actor.ajay_devgan;
import com.example.shreypatel.dailogueguru.actor.akshaykumar;
import com.example.shreypatel.dailogueguru.actor.amitabh;
import com.example.shreypatel.dailogueguru.actor.anil_kapoor;
import com.example.shreypatel.dailogueguru.actor.hrithik;
import com.example.shreypatel.dailogueguru.actor.irfan_khan;
import com.example.shreypatel.dailogueguru.actor.john_abrahim;
import com.example.shreypatel.dailogueguru.actor.ranveer_singh;
import com.example.shreypatel.dailogueguru.actor.salman;
import com.example.shreypatel.dailogueguru.actor.sanjay_dutt;
import com.example.shreypatel.dailogueguru.actor.shah_rukh;
import com.example.shreypatel.dailogueguru.actor.sunny_deol;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    private ListView lv;
    private MyAppAdapter myAppAdapter;
    private ArrayList<ProfileModel> profileModelArrayList;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   // Notification Adding



        // Navigation Drawer

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        profileModelArrayList=new ArrayList<>();
        profileModelArrayList.add(new ProfileModel(R.drawable.akshay_kumar));
        profileModelArrayList.add(new ProfileModel(R.drawable.aamir));
        profileModelArrayList.add(new ProfileModel(R.drawable.shahrukh));
        profileModelArrayList.add(new ProfileModel(R.drawable.amitabh));
        profileModelArrayList.add(new ProfileModel(R.drawable.abhishek));
        profileModelArrayList.add(new ProfileModel(R.drawable.salman));
        profileModelArrayList.add(new ProfileModel(R.drawable.irfan));
        profileModelArrayList.add(new ProfileModel(R.drawable.ajay));
        profileModelArrayList.add(new ProfileModel(R.drawable.sanjay));
        profileModelArrayList.add(new ProfileModel(R.drawable.anil));
        profileModelArrayList.add(new ProfileModel(R.drawable.sunny));
        profileModelArrayList.add(new ProfileModel(R.drawable.hrithik));
        profileModelArrayList.add(new ProfileModel(R.drawable.john));
        profileModelArrayList.add(new ProfileModel(R.drawable.ranveer));






        lv= (ListView)findViewById(R.id.lv);
        myAppAdapter=new MyAppAdapter(profileModelArrayList,MainActivity.this);
        lv.setAdapter(myAppAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(MainActivity.this,akshaykumar.class);
                    startActivity(intent);
                }

                else if(position == 1)
                {
                    Intent intent = new Intent(MainActivity.this,aamir_khan.class);
                    startActivity(intent);
                }

                else if(position == 2)
                {
                    Intent intent = new Intent(MainActivity.this,shah_rukh.class);
                    startActivity(intent);
                }

                else if (position == 3)
                {
                    Intent intent = new Intent(MainActivity.this,amitabh.class);
                    startActivity(intent);
                }

                else if (position == 4)
                {
                    Intent intent = new Intent(MainActivity.this,abhishek.class);
                    startActivity(intent);
                }

                else if (position == 5)
                {
                    Intent intent = new Intent(MainActivity.this,salman.class);
                    startActivity(intent);
                }

                else if (position == 6)
                {
                    Intent intent = new Intent(MainActivity.this,irfan_khan.class);
                    startActivity(intent);
                }

                else if (position == 7)
                {
                    Intent intent = new Intent(MainActivity.this,ajay_devgan.class);
                    startActivity(intent);
                }

                else if (position == 8)
                {
                    Intent intent = new Intent(MainActivity.this,sanjay_dutt.class);
                    startActivity(intent);
                }

                else if (position == 9)
                {
                    Intent intent = new Intent(MainActivity.this,anil_kapoor.class);
                    startActivity(intent);
                }

                else if (position == 10)
                {
                    Intent intent = new Intent(MainActivity.this,sunny_deol.class);
                    startActivity(intent);
                }

                else if (position == 11)
                {
                    Intent intent = new Intent(MainActivity.this,hrithik.class);
                    startActivity(intent);
                }

                else if (position == 12)
                {
                    Intent intent = new Intent(MainActivity.this,john_abrahim.class);
                    startActivity(intent);
                }

                else if (position == 13)
                {
                    Intent intent = new Intent(MainActivity.this,ranveer_singh.class);
                    startActivity(intent);
                }

            }
        });

    }

    public class MyAppAdapter extends BaseAdapter {

        public class ViewHolder {
            TextView username,country;
            ImageView profilePic;

        }

        public ArrayList<ProfileModel> profileList;

        public Context context;


        private MyAppAdapter(ArrayList<ProfileModel> apps, Context context) {
            this.profileList = apps;
            this.context = context;

        }

        @Override
        public int getCount() {
            return profileList.size();
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
            ViewHolder viewHolder;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.custom_layout, parent,false);
                // configure view holder
                viewHolder = new ViewHolder();
//                viewHolder.copy = (ImageView) rowView.findViewById(R.id.copy);
//                viewHolder.share = (ImageView) rowView.findViewById(R.id.share);
                viewHolder.profilePic = (ImageView) rowView.findViewById(R.id.imgProfile);
               /* viewHolder.username = (TextView) rowView.findViewById(R.id.txtUsername);
                viewHolder.country = (TextView) rowView.findViewById(R.id.txtCountry);*/
                rowView.setTag(viewHolder);

            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
/*
            viewHolder.username.setText(profileList.get(position).getUsername()+"");
            viewHolder.country.setText(profileList.get(position).getCountry()+"");*/
            Glide.with(MainActivity.this).load(profileList.get(position).getProfilePic()).into(viewHolder.profilePic);

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
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        if (item.getItemId() == R.id.action_search)
        {
            Intent intent = new Intent(MainActivity.this,more_apps.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.home)
        {
            Intent intent = new Intent(MainActivity.this,MainActivity.class);
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
            Intent intent = new Intent(MainActivity.this,more_apps.class);
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
