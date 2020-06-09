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

public class john_abrahim extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_john_abrahim);

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

        ListProfile.add(new ListProfile(" Bahut jala hoon main is akelepan ki aag mein ... Aur tumhare liye " +
                "main sari duniya ko jala sakta hoon   ","  Aetbaar    "));


        ListProfile.add(new ListProfile(" Gunaah karo ... Karo ... Magar pakde mat jao    ","   Jism   "));


        ListProfile.add(new ListProfile(" Plan yeh hai ki koi plan nahi hai   "," Aetbaar     "));


        ListProfile.add(new ListProfile(" Rishtey buri tarah hi khatam hote hai ... Varna khatam hi nahi hote    ","    Jism  "));


        ListProfile.add(new ListProfile("There is nothing better than you ... And for you i want nothing " +
                "to be better than me    "," Aetbaar     "));


        ListProfile.add(new ListProfile(" Gunaah karneka lekin pakde nahi janeka ... Pakda gaya toh " +
                "gunaahgar ... Nahi pakda gaya toh sahukar    ","    Jism  "));


        ListProfile.add(new ListProfile(" Dost nahi badalte ... Waqt badal jaata hai    ","  Baabul    "));


        ListProfile.add(new ListProfile(" Waqt halaat badalte hai ... Aur halaat insaan    "," Lakeer     "));


        ListProfile.add(new ListProfile(" Pyar mein waqt ki koi seema nahi hoti    ","  Baabul    "));


        ListProfile.add(new ListProfile("Joh useless ho jata hai usse ya to eliminate " +
                "karte hai ya expose     "," Madras Café    "));


        ListProfile.add(new ListProfile("Yeh sach hai ki jagah ki dooriyan ... Aksar dilon ki " +
                "nazdikiyan ban jaati hai   ","   Baabul   "));


        ListProfile.add(new ListProfile(" One man's revolutionary is another man's terrorist    ","   Madras Café  "));


        ListProfile.add(new ListProfile("Aksar yeh bhi hota hai ki jagah ki dooriyan ... Rishton ko aur " +
                "bhi mazboot bana deti hai     ","   Baabul   "));


        ListProfile.add(new ListProfile(" Aaj meri wajah se tumhari ek achchi aadat chute" +
                " jayegi ... Zinda bachchne ki    ","  Race 2   "));


        ListProfile.add(new ListProfile("Tendulkar bina india adhoora, jai ko veeru karta hai poora ... Rocko " +
                "bulaye aur hunter na aaye, aaise dialogue pe rajinikanth bhi taali bajaye     "," Desi Boyz     "));


        ListProfile.add(new ListProfile(" Hum jaise purane paapi agar bhagwan ko pyare hone lage ... " +
                "Toh uske reputation ka kya hoga    ","   Race 2  "));


        ListProfile.add(new ListProfile(" Sirf hindustan chhoda hai ... Hindustaniyat nahi   ","  Dhan Dhana Dhan Goal    "));


        ListProfile.add(new ListProfile(" Deadly, dangerous ya rocky ... Is naam se mujhe woh jaante hai" +
                " joh mujhe janana nahi chahte hai ... Baaki sab ke liye, i'm just handsome    ","  Rocky Handsome    "));


        ListProfile.add(new ListProfile("Mere rules koi nahi todh sakta ... Main bhi nahi     ","   Dhoom    "));


        ListProfile.add(new ListProfile(" Kal ki baat karne waala kal nahi marta ... Kal ki baat karne waala aaj marta hai ... Sirf" +
                " aaj ka sochne waale ke haathon ... Aur main sirf abhi ki sochta hoon    ","  Rocky Handsome    "));


        ListProfile.add(new ListProfile(" Tezzi goli mein nahi ... Chalane waale mein hoti hai    ","   Dhoom    "));


        ListProfile.add(new ListProfile("Tujhse kitni badi galati hui hai woh tujhe teri" +
                " sazaa batayegi     ","  Rocky Handsome    "));


        ListProfile.add(new ListProfile(" Nothing is permanent ... Na tum, na main, na plan, na time   ","   Dhoom    "));


        ListProfile.add(new ListProfile("Shareer mein 206 haddiyan hai, aur samvidhan mein " +
                "1670 kanoon .. Haddi se lekar kanoon sab todhta hoon     "," Shootout At Wadala    "));


        ListProfile.add(new ListProfile(" (mat piyo, it's killing you) - bullets nahi maar payi ... Yeh cigarette kya cheez hai    ","  Dishoom   "));


        ListProfile.add(new ListProfile("Meri bandook se nikli har goli pehle mujhe salaam " +
                "thokti hai ... Aur phir mere nishaane ko    "," Shootout At Wadala    "));


        ListProfile.add(new ListProfile(" Neend ki dawai mat dena ... Nahin toh hosh mein aate hi" +
                " pehle tumhe maar doonga    "," Force     "));


        ListProfile.add(new ListProfile(" Apun pe joh haath dalta hai ... Apun uski phaad " +
                "dalta hai    "," Welcome Back     "));


        ListProfile.add(new ListProfile("Mujhe tapori ko dekhte hi uski aukaad ka andaza ho jaata hai    ","   Force   "));


        ListProfile.add(new ListProfile("  Mobile uska, sim apun ka ... Tu beech mein missed call dene waala kaun .. Behen uski, byah " +
                "apun ka ... Tu beech mein taang adhane waala kaun   ","  Welcome Back    "));


        ListProfile.add(new ListProfile("Apna ghar bech de aur bina khidki wale kamre mein rehne ki aadat daal     ","  Force 2    "));


        ListProfile.add(new ListProfile(" Jab ajju bhai maarne pe aata hai toh gender nahi " +
                "dekhta hai   ","   Welcome Back   "));


        ListProfile.add(new ListProfile(" Time badal chuka hai ... Aur desh bhi ... Ab hum ghar" +
                " mein ghuske maarte hai    ","  Force 2    "));


        ListProfile.add(new ListProfile(" Bhai muh-bola ho ya sagaa ... Apun ke pyar ke beech aaya toh" +
                " beech se hi cheer dalega    ","   Welcome Back   "));


        ListProfile.add(new ListProfile("Gut feeling, aggression, common sense ... Yeh hai mumbai police " +
                "ka kaam karne ka tareeka     ","   Force 2   "));


        ListProfile.add(new ListProfile("Arre yeh saale majnu bhai patthar khane waale kaam karte hai ... Khud ko" +
                " toh laila milti nahi .. Aur jisko mil-rehli hai us mein bhi fingerbaazi     ","  Welcome Back    "));


        ListProfile.add(new ListProfile(" Jab do galatiyan mil jaati hai ... Toh ek cheez sahi" +
                " ho jaati hai    "," Garam Masala     "));


        ListProfile.add(new ListProfile(" Bangkok waala character hoke haridwar waala feel mat de    ","   Welcome Back   "));


        ListProfile.add(new ListProfile(" Chillar ka pata nahi … Lekin mujh mein change aa gaya hai  ","   Housefull 2   "));


        ListProfile.add(new ListProfile(" 206 haddiyon ko 2006 tareeke se todhne ka experience " +
                "hai apun ka   ","  Welcome Back    "));


        ListProfile.add(new ListProfile(" George michael ka pata nahi ... But have faith in me    ","   Housefull 2   "));


        ListProfile.add(new ListProfile(" Doobara haath lagaya toh haath todhunga baad mein ... " +
                "Ukhaadunga pehle  ","  Welcome Back    "));


        ListProfile.add(new ListProfile(" Slumdog ka pata nahi ... Lekin yeh kisi millionaire ka ghar lagta" +
                " hai    ","  Housefull 2    "));


        ListProfile.add(new ListProfile(" Aaj kisses ... Kal misses    ","   Welcome Back   "));


        ListProfile.add(new ListProfile("  Bbc ka pata nahi ... But i've got news for you   ","  Housefull 2    "));


        ListProfile.add(new ListProfile("Jis umar mein aapko haqeemo ke saath hona chahiye … Us umar" +
                " mein haseeno ke saath .. Not good   ","  Welcome Back    "));


        ListProfile.add(new ListProfile("Sambhar ka pata nahi ... Lekin aapko yeh rasam follow " +
                "hi karni padegi     ","  Housefull 2    "));













        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new john_abrahim.MyAppAdapter(ListProfile,john_abrahim.this);
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
                viewHolder1 = new john_abrahim.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (john_abrahim.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(john_abrahim.this,MainActivity.class);
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
