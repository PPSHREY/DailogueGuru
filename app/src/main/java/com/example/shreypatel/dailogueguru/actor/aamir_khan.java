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

public class aamir_khan extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_aamir_khan);

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

        ListProfile.add(new ListProfile("Aal izz well","3 Idiots"));

        ListProfile.add(new ListProfile("Joh doosro ko tapkane ki himmat rakhte hai ..." +
                " Un mein khud bhi tapakne ka kaleja rehta hai  ","Baazi"));

        ListProfile.add(new ListProfile("Agar silver jeeti toh aaj nahi toh kal log tanne bhool javenge ..." +
                " Gold jeeti toh misaal ban javegi ... Aur misaalein di jaati hai beta, bhooli nahi jaati   ","Dangal"));

        ListProfile.add(new ListProfile("Bande hain hum uske, hum pe kiska zor .. Umeedo ke suraj, nikle chaaron aurr ..." +
                " Iraade hai fauladi, himmati har kadam .. Apne haatho kismat likhne, aaj chale hain hum ","Dhoom 3"));

        ListProfile.add(new ListProfile(" Exam toh bahut hote hai, baap mostly ek hi hota hai","3 Idiots "));

        ListProfile.add(new ListProfile("Humse door jaoge kaise, dil se hum mein bhulaoge kaise ..." +
                " Hum woh khushboo hai joh saason mein bastein hai, khud ki saason ko rok paoge kaise ","Fanaa"));

        ListProfile.add(new ListProfile("Tum jaise talented bache hote hai na woh sode mein is bubbles ki tarah hote hai ... Ek ke baad ek woh aise hi upar aate hai ..." +
                " Apne aap ... Unhe koi nahi rok sakta ","Secret Superstar"));


        ListProfile.add(new ListProfile("Hoshyari, tarkieb aur dokha .. Teeno mil jaaye toh log usse" +
                " jadoo samajhte hai   ","Dhoom 3"));

        ListProfile.add(new ListProfile("Medalist pedh pe nahi ughte ... Unhe banana padta hai ... " +
                "Pyar se, mehnat se, lagan se   ","Dangal"));

        ListProfile.add(new ListProfile(" Bekhudi ki zindagi hum jiya nahi karte .. Jaam doosron se cheenkar hum piya nahi karte ..." +
                " Unko mohabbat hai toh aakar izhaar karen .. Peecha hum bhi kisika kiya nahi karte  ","Fanaa "));

        ListProfile.add(new ListProfile("Dole dole mera bhi dil dole ... Isse pehle ki meri joote bole ..." +
                " Tu patli gali hole   ","Baazi"));

        ListProfile.add(new ListProfile(" Aag suraj mein hoti hai, jalna zameen ko padta hai ..." +
                " Mohabbat nigahein karti hai, tadapna dil ko padta hai  ","Fanaa"));

        ListProfile.add(new ListProfile("Mere pitaji ka kehna tha ki ... Kaam jazbaat ke saath karo ..." +
                " Jazbaati hokar nahi ","Gajini"));

        ListProfile.add(new ListProfile("Bahut ho gayi pehalwani ... Ab dangal hoga   ","Dangal "));

        ListProfile.add(new ListProfile("Pani se pyaas nah bhuji toh maikhane ki taraf chal nikla ..." +
                " Soocha shikayat karoon teri khuda se .. Par khuda bhi tera aashiq nikla  ","Fanaa "));

        ListProfile.add(new ListProfile("Mohe toh wohi chori pasand aavegi, joh mori mai ko pasand aavegi" +
                " ","Lagaan "));

        ListProfile.add(new ListProfile("Dard se aankhen chaar kar lenge, hum bhi imtihaan de denge ..." +
                " Teri dosti ke khatir aye dost, hum dushmano se bhi pyar kar lenge  ","Fanaa"));

        ListProfile.add(new ListProfile(" Taqat toh genda bhi lagata hai ... Lekin sher lagata hai taqat aur technique, dono ... " +
                "Sher ban'na hai, genda nahi ","Dangal"));

        ListProfile.add(new ListProfile("Adhoori saans thi, dhadkan adhoori thi, adhoore hum ... Magar ab chaand poora hai falak pe ..." +
                " Aur ab poore hai hum ","Fanaa"));

        ListProfile.add(new ListProfile("Vishvas aur ghamund mein bahut kum farak hai ... Main kar sakta hoon, yeh mera vishvas hai ..." +
                " Sirf main hi kar sakta hoon, yeh mera ghamund ","Gajini "));

        ListProfile.add(new ListProfile("Kehte hai pyar mein neend udh jaati hai .. Koi humse bhi mohabbat kare ..." +
                " Kambhakt neend bahut aati hai  ","Fanaa "));

        ListProfile.add(new ListProfile("Hamaar pasina hamre tann mein khoon banke daudega  ","Lagaan"));

        ListProfile.add(new ListProfile("Aisa laga khuda ne rakh diya hamare dil pe haath .. Liya naam hamare " +
                "unhone kuch aisi ada ke saath  ","Fanaa"));

        ListProfile.add(new ListProfile("Aaj tak aapne hamari wafaadari dekhi thi ..." +
                " Ab hamara krodh dekhiye ","Mangal Pandey"));

        ListProfile.add(new ListProfile("Phool hoon gulaab ka chameli ka mat samajhna .. Aashiq hoon aapka apni saheli ka " +
                "mat samajhna   ","Fanaa"));








        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new aamir_khan.MyAppAdapter(ListProfile,aamir_khan.this);
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
                viewHolder1 = new aamir_khan.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (aamir_khan.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(aamir_khan.this,MainActivity.class);
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




