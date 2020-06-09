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

public class irfan_khan extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_irfan_khan);

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
        ListProfile.add(new ListProfile(" Ik baar to yun hoga, thoda sa sukoon hoga ... Na dil mein kasak hogi, na sar" +
                " mein junoon hoga     ","  7 Khoon Maaf    "));


        ListProfile.add(new ListProfile(" Lakeerein bahut ajeeb hoti hai ... Khaal pe khich jaye toh" +
                " khoon nikaal deti hai ... Aur zameen pe khich jaye toh sarhadein bana deti hai     "," Gunday     "));


        ListProfile.add(new ListProfile(" Joh ek baar bhaagte hai ... Woh hamesha bhaagte rehte hai     ","  Aaja Nachle    "));


        ListProfile.add(new ListProfile(" Kismat ki ek khaas baat hoti hai ... Ki woh palatti hai     ","    Gunday  "));


        ListProfile.add(new ListProfile("Kahi baar choti choti nadaaniyo se nuksaan bada ho jaata hai     "," Aan : Men at Work     "));


        ListProfile.add(new ListProfile("  Chhot khaya hua dost dushman se zyada khatarnak hota hai    ","  Gunday    "));


        ListProfile.add(new ListProfile(" India mein artist ki kadar nahi hai ... Aur india ke " +
                "baahar, indian artists ki     "," Chocolate     "));


        ListProfile.add(new ListProfile(" Chaal hum chalenge ... Sheh bhi hum denge ... Aur maat bhi hum denge     ","   Gunday   "));


        ListProfile.add(new ListProfile("  Shaitan ki sabsi badi chaal yeh hai ki woh " +
                "saamne nahi aata  ","  Chocolate    "));


        ListProfile.add(new ListProfile("Hum kanoon hai ... Saala apni aukaat " +
                "pe aa jaye toh kahin bhi ghus sakta hai aur kisi ko bhi todh sakta hai    ","  Gunday    "));


        ListProfile.add(new ListProfile("Pyar andha hota hai ... Aur pyar mein padhne" +
                " waale, usse badhe andhe hote hai    ","   Chocolate   "));


        ListProfile.add(new ListProfile(" Aap jism hai, main rooh … Aap faani hai, main lafaani     "," Haider     "));


        ListProfile.add(new ListProfile("  Paisa agar bhagwan nahi hai ... Toh bhagwan" +
                " se kam bhi nahi hai   "," Chocolate     "));


        ListProfile.add(new ListProfile("Ek france banda, german banda speak wrong english ... " +
                "We no problem ... Ek indian banda say wrong english ... Banda hi bekaar ho jaata hai ji      "," Hindi Medium     "));


        ListProfile.add(new ListProfile(" Husn apne aage peeche poori duniya ko nachata hai     ","  Chocolate    "));


        ListProfile.add(new ListProfile(" Is desh mein angrezi zabaan nahi hai ... Class hai      "," Hindi Medium     "));


        ListProfile.add(new ListProfile(" Galatiya bhi rishto ki tarah hoti hai ... Karni nahi padti" +
                " ... Ho jaati hai    ","D-Day      "));


        ListProfile.add(new ListProfile(" Sharafat ki duniya ka kissa hi khatam … Ab jaisi duniya vaise hum     ","    Jazbaa   "));


        ListProfile.add(new ListProfile(" Customer toh god hi hota hai ... " +
                "Lekin biwi na mata rani hoti hai     ","  Hindi Medium    "));

        ListProfile.add(new ListProfile("  Sirf insaan galat nahi hote ... Waqt bhi galat " +
                "ho sakta hai    ","   D-Day   "));


        ListProfile.add(new ListProfile("Rishton mein bharosa aur mobile pe network na ho toh log game khelne lagte hai      ","    Jazbaa   "));


        ListProfile.add(new ListProfile(" Today god promise i speak english ... Because english is " +
                "india and india is English    ","  Hindi Medium    "));


        ListProfile.add(new ListProfile(" Teri amma ne jiske baare mein nahi bataya main tera woh baap hoon    ","    Jazbaa   "));


        ListProfile.add(new ListProfile("Khoon ka rishtaa khoon bahake hi khatam kiya jaa sakta " +
                "hai      ","   Footpath   "));


        ListProfile.add(new ListProfile("  Yahan sabka ek hi takia-kalaam hai ... Hazaar ke note pe bapu ko salaam hai    "," Jazbaa      "));


        ListProfile.add(new ListProfile(" Log ikke se jeette hai ... Hum tujhe rani se jeetke" +
                " dikhayenge     "," Gunaah     "));



        ListProfile.add(new ListProfile(" Mohabbat hai is liye jaane diya ... Zidd hoti toh baahon mein hoti    ","  Jazbaa     "));



        ListProfile.add(new ListProfile(" Kaam khatam hone ke pehle jashn nahi manate ..." +
                " Nazar lag jati hai    ","  Gunaah    "));



        ListProfile.add(new ListProfile(" Aaj kal shareef sirf woh hota hai jiske mobile mein password nahi hota hai     ","  Jazbaa     "));



        ListProfile.add(new ListProfile("   Ab yeh case aayega mere under ... Aur main " +
                "karoonga iska encounter   "," Gunaah     "));



        ListProfile.add(new ListProfile("  Rokda rokde ko kheenchta hai ... " +
                "Rokda jab rokde se milta hai toh aur rokda pehda karta hai    ","  Jazbaa     "));



        ListProfile.add(new ListProfile(" Pistol ki goli aur laundiya ki boli jab chalti hai ... Toh jaan " +
                "dono mein hi khatre mein hoti hai     "," Gunday     "));



        ListProfile.add(new ListProfile(" Tu toh sarkari naukri ki tarah ho gaya hai ... Badi mushkil se milta hai … " +
                "Woh bhi kismat waalon ko     ","    Jazbaa   "));



        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new irfan_khan.MyAppAdapter(ListProfile,irfan_khan.this);
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
                viewHolder1 = new irfan_khan.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (irfan_khan.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(irfan_khan.this,MainActivity.class);
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
