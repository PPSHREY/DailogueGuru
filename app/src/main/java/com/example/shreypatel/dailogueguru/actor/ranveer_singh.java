package com.example.shreypatel.dailogueguru.actor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
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
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shreypatel.dailogueguru.About_us;
import com.example.shreypatel.dailogueguru.ListProfile;
import com.example.shreypatel.dailogueguru.MainActivity;
import com.example.shreypatel.dailogueguru.R;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class ranveer_singh extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Button bt1,bt2;
    TextView txt1,text;
    ClipboardManager myClipboard;
    ClipData myClip;


    private ListView lv;
    private MyAppAdapter appAdapter;
    private ArrayList<com.example.shreypatel.dailogueguru.ListProfile> ListProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranveer_singh);

        Button  bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);

        myClipboard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        ListProfile=new ArrayList<>();

        ListProfile.add(new ListProfile(" Bajirao ne mastani se mohabbat ki hai … Ayyashi nahi          "," Bajirao Mastani     "));


        ListProfile.add(new ListProfile("   Ab dushmani nibhayenge ... Pyar se         "," Goliyon Ki Raasleela Ram-Leela     "));



        ListProfile.add(new ListProfile(" Cheeteh ki chaal, baaz ki nazar aur bajirao ki talvar par sandeh" +
                " nahi karte . Kabhi bhi maat de sakti hai         ","  Bajirao Mastani    "));


        ListProfile.add(new ListProfile(" Don shok nahi manate, sirf jashan manate           ","  Goliyon Ki Raasleela Ram-Leela    "));


        ListProfile.add(new ListProfile(" Hamare dil ek saath dhadakte hai … Aur ek saath rukte bhi hai           "," Bajirao Mastani     "));


        ListProfile.add(new ListProfile(" Tere se milke aaise bhaaga ... Rann mein hi soya, rann mein hi jaaga          ","  Goliyon Ki Raasleela Ram-Leela    "));


        ListProfile.add(new ListProfile(" Marathaon ke paas dushman jitni daulat ho na ho ... " +
                "Yudh mein bahane ke liye khoon kayi zyada hai           ","   Bajirao Mastani   "));


        ListProfile.add(new ListProfile(" Subah uthte hi bijal, dopahar tak sejal aur raat hote hote tak kinjal           ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile(" Har dharam mohabbat sikhata hai ... Par mohabbat ka toh koi dharam" +
                " nahi hota .. Woh khud apne aap mein ek dharam hai           ","  Bajirao Mastani    "));


        ListProfile.add(new ListProfile(" I don't like this gun goli ... I only want tan choli         ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile(" Surya kirano ke bina, khushboo hawa ke bina aur raja pradhaan" +
                " ke bina adhoora hai          ","   Bajirao Mastani   "));


        ListProfile.add(new ListProfile(" Agar jigar ki jagah jigar hai aur jigar mein dum hai ... Toh rok le aake         ","  Gunday    "));


        ListProfile.add(new ListProfile(" Lagaam dikhti nahi hai par zubaan par honi chahiye ... Samajhla           ","   Bajirao Mastani   "));


        ListProfile.add(new ListProfile(" Hum gunday hai ... Na aaj tak kisi ke haath aaye hai ... Aur na aayenge          ","  Gunday    "));


        ListProfile.add(new ListProfile(" Jab deewaron se zyada doori dilon mein ho jaye ... Toh chatt nahi tikti         "," Bajirao Mastani     "));


        ListProfile.add(new ListProfile(" Hum gunday hai ... Ek baar jiske saath jee liye ... Marte bhi ussi ke saath hai         ","   Gunday   "));


        ListProfile.add(new ListProfile(" One hundred percent total dedication to one client ... Start to finish " +
                "no compromise … Mother promise         "," Band Baaja Baarathi     "));


        ListProfile.add(new ListProfile(" Tabse gun chala raha hoon ... Jabse tu apne maa" +
                " ke andhar nahi, apne baap ke andhar tha        "," Kill Dil    "));


        ListProfile.add(new ListProfile(" Tere bina kisi cheez mein mauj nahi … Na ladkiyan taadne mein, " +
                "na chai mein, na chowmein mein          ","  Band Baaja Baarathi    "));


        ListProfile.add(new ListProfile(" Bacha paida kahin bhi ho ... Banta waisa hi hai jahan bada hota hai          ","  Kill Dil   "));


        ListProfile.add(new ListProfile(" Shit bhi bolti hai toh lagta hai fm baj gaya          ","  Band Baaja Baarathi    "));


        ListProfile.add(new ListProfile(" Gun chalane ke liye finger mein nahi backside mein dum hona chahiye          "," Kill Dil    "));


        ListProfile.add(new ListProfile("(hum kyun nahi ek doosre ko i love you jaisi stupid baatein bolenge) ... Kyun " +
                "ki phir sab emotional ho jaata hai, senty ho jaata hai aur masti ka the end ho jaata hai           "," Befikre     "));


        ListProfile.add(new ListProfile(" Koi atka hua hai pal shayad ... Waqt main pad gaya hai bal shayad ... Dil agar hai " +
                "toh dard bhi hoga .. Iska koi nahi hai hal shayad          ","   Kill Dil  "));


        ListProfile.add(new ListProfile(" Jab tak hawa mein ho befikar hoke udne ka maza " +
                "lete raho ... Shayad kabhi pair zameen pe padne ki zaroorat hi na pade           ","  Befikre    "));


        ListProfile.add(new ListProfile(" Ek ladki joh chhat se apne papa ko dhakel de," +
                " usse ka kehte hai batao? ... Push-paa!           ","  Kill Dil   "));


        ListProfile.add(new ListProfile(" Break-up ke dardiley dank se bachne ka ek hi upaai hai ... Kabhi" +
                " love ke jhoothe jaal mein padho hi mat ... If you won't hook-up, you won't break-up          ","  Befikre    "));


        ListProfile.add(new ListProfile(" Sultan ban'ne ke liye gardan aur iraade dono mazboot hone chahiye        ","  Padmaavat     "));


        ListProfile.add(new ListProfile(" Dilli wale dil ke mamle mein kamzor ho sakte hai ... " +
                "Dare ke mamle mein nahi           ","   Befikre   "));


        ListProfile.add(new ListProfile(" Jung ka ek hi usool hai ... Jeet         ","   Padmaavat    "));


        ListProfile.add(new ListProfile("  16.\tMeri mardangi ke bare mein aap gaon ki kisi bhi ladki se " +
                "pooch sakte ho ... Report achchi milegi          "," Goliyon Ki Raasleela Ram-Leela     "));


        ListProfile.add(new ListProfile(" Name toh kamaal che ... Par surname bawaal che         ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile("  Jitni tu garam hai ... Utna tera bistar naram hai          ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile(" Hero banne ke liye jigar ki zaroorat padti hai ... Aur " +
                "jab jigar ho toh bhari bandook ka kya kaam?           ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile("Jeeonga toh tere saath ... Maroonga toh tere haath          ","  Goliyon Ki Raasleela Ram-Leela    "));


        ListProfile.add(new ListProfile("Saala maut ka dhanda karte karte zindagi ki keemat" +
                " bhool gaye hai hum log          ","   Goliyon Ki Raasleela Ram-Leela   "));


        ListProfile.add(new ListProfile(" Apni saans wapas lene aaya hoon ... Atak ke reh gayi hai tere paas         "," Goliyon Ki Raasleela Ram-Leela     "));


        ListProfile.add(new ListProfile("  Tere dil mein soya tha, kyun utha diya ... Card kahan se" +
                " nikla, ke number mila diya          ","   Goliyon Ki Raasleela Ram-Leela   "));





        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new ranveer_singh.MyAppAdapter(ListProfile,ranveer_singh.this);
        lv.setAdapter(appAdapter);

        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



            }
        });*/


    }


    public class MyAppAdapter extends BaseAdapter {


        public class ViewHolder1 {
            TextView txt1,text;
            Button bt1,bt2;
            /* ImageView Img1,Img2;*/

        }

        public ArrayList<ListProfile> List;

        public Context context;


        private MyAppAdapter(ArrayList<ListProfile> apps, Context context) {
            this.List = apps;
            this.context = context;

        }

        @Override
        public int getCount() {
            return List.size();
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
            ViewHolder1 viewHolder1;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.list_view, parent,false);
                // configure view holder
                viewHolder1 = new ranveer_singh.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (ranveer_singh.MyAppAdapter.ViewHolder1) convertView.getTag();
            }
            viewHolder1.txt1.setText(List.get(position).getTxt1()+"");
            viewHolder1.text.setText(List.get(position).getText()+"");
            viewHolder1.bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("label", List.get(position).getTxt1());
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(context, "Text Copied", Toast.LENGTH_SHORT).show();


                }
            });


            viewHolder1.bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent shareintent = new Intent();
                    shareintent.setAction(Intent.ACTION_SEND);
                    shareintent.putExtra(Intent.EXTRA_TEXT,List.get(position).getTxt1());
                    shareintent.setType("text/plain");
                    startActivity(shareintent);
                }
            });




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

        return super.onOptionsItemSelected(item);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.home)
        {
            Intent intent = new Intent(ranveer_singh.this,MainActivity.class);
            startActivity(intent);

        }

        if (id == R.id.fav)
        {
            finish();
            System.exit(1);
        }

        if (id == R.id.share)
        {
            Intent share = new Intent();
            share.setAction(Intent.ACTION_SEND);
            share.putExtra(Intent.EXTRA_TEXT,"Hey Check my new App for Best Best Bollywood Dailgoues \n\n  https://play.google.com/store/apps/details?id=com.sunny.bollywoodfilmydialogues");
            share.setType("text/plain");
            startActivity(share);
        }

        if (id == R.id.more)
        {
            Toast.makeText(this,"More Apps For You.",Toast.LENGTH_LONG).show();
        }

        if (id == R.id.rate)
        {
            Toast.makeText(this,"This is Rate App Activity.", LENGTH_LONG).show();
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
