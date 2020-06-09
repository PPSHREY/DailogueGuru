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

public class sunny_deol extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_sunny_deol);

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

        ListProfile.add(new ListProfile(" Shareer jitna adhik sukh paata hai ... Utna hi adhik sukh chahta hai    ","   Shaheed  "));


        ListProfile.add(new ListProfile(" Aaise khilone bazaar mein bahut bikte hai … Magar isse khelne ke liye joh jigar chahiye na .. " +
                "Woh duniya ke kisi bazaar mein nahi bikta ... Mard usse lekar pehda hota hai    ","  Damini   "));


        ListProfile.add(new ListProfile("Imaandari ka toofan baad par aayi nadi ke paani ki tarah phail jaata hai ... " +
                "Aur baimaani ki fasal ka naam aur nishaan mitta deta hai     "," Aag Ka Gola    "));


        ListProfile.add(new ListProfile(" Judge order order karta rahega .. Aur tu pittaa rahega    ","   Damini  "));


        ListProfile.add(new ListProfile(" Jhoot ki deewarein imaandari ki thokar par ret ka dher ban jayengi  ","  Aag Ka Gola   "));


        ListProfile.add(new ListProfile(" Mohabbat na ho toh aadmi saans toh zaroor leta hai " +
                "... Magar zinda nahi rehta hai    "," Darr    "));


        ListProfile.add(new ListProfile("Jhoote saboot kitne bhi mazboot ho … Jhoote hi hote hai    ","   Aag Ka Gola  "));


        ListProfile.add(new ListProfile("Main tumhe bahut pyar karta hoon ... Itna jitna suraj karta hai apni kiranon se," +
                " chand karta hai apni chandni se, phool karte hai apni khushboo se   ","Dillagi     "));


        ListProfile.add(new ListProfile(" Isse pehle ke kuch netaon ne toh sirf yeh desh becha hoga ... Magar" +
                " yeh woh hai joh is desh ka balatkar kar dega    "," Angrakshak    "));


        ListProfile.add(new ListProfile("Aadmi bada ho ya chota, koi farak nahi padta ..." +
                " Bas uski kahani badi honi chahiye     "," Dishkiyaoon    "));


        ListProfile.add(new ListProfile(" Main zindagi se nahi ... Apne aap se naraaz hoon    ","   Arjun   "));


        ListProfile.add(new ListProfile("Marte hue ko kabhi rokne ka nahi ... Dushman galati kare toh tokne ka nahi ..." +
                " Aur yaar ki item ko kabhi chune ka nahi   ","   Dishkiyaoon  "));


        ListProfile.add(new ListProfile("  Main tumhare accountant ka beta hoon ... Aur yeh pitai" +
                " tumhare account mein bahut dino se likhi thi   ","  Arjun    "));


        ListProfile.add(new ListProfile(" Zindagi saanp seedi ki tarah hai … Seedi chada" +
                " toh mauj, saanp dasa toh maut    ","  Dishkiyaoon   "));


        ListProfile.add(new ListProfile("Chalo utho ... Abhi tumhe bahut pitna hai    ","   Arjun   "));


        ListProfile.add(new ListProfile(" Dost se bada dushman koi na hove hai  "," Dishkiyaoon    "));


        ListProfile.add(new ListProfile("Main us mahabharat ka arjun hoon ... Jis mahabharat ke duryodhan aap hai     ","  Arjun    "));


        ListProfile.add(new ListProfile(" Chot ko apni taqat bana ... Kamzori nahi    ","  Dishkiyaoon  "));


        ListProfile.add(new ListProfile(" Arjun jab chidiye ki aankh ka nishana lagata hai ... Toh usse " +
                "chidiye ki aankh ke siva kuch dikhayi nahi deta    ","   Arjun   "));


        ListProfile.add(new ListProfile("Main sapne nahi dekhta ... Khud ek bura sapna hoon     ","Farz     "));


        ListProfile.add(new ListProfile(" Aise kaam ke liye himmat ki zaroorat nahi hoti ... " +
                "Sirf iraada hona chahiye   ","   Arjun Pandit  "));


        ListProfile.add(new ListProfile(" Tere chehre pe mujhe maut dikhai de rahi hai    ","  Farz   "));


        ListProfile.add(new ListProfile("  Insaan joh karam karta hai ... Unhi karamon ki karmi milti hai use   "," Big Brother    "));


        ListProfile.add(new ListProfile(" Kisi bhi terrorist ko pakadne ke liye duty nahi ... " +
                "Junoon ki zaroorat hai ... Junoon   ","  Farz   "));


        ListProfile.add(new ListProfile(" Zindagi ka doosra naam problem hai   ","Border     "));


        ListProfile.add(new ListProfile("Hamara hindustan zindabad tha, zindabad hai, aur zindabad rahega!     "," Gadar: Ek Prem Katha    "));


        ListProfile.add(new ListProfile(" Hum hi hum hai toh kya hum hai ... Tum hi tum ho toh kya tum ho    "," Border    "));


        ListProfile.add(new ListProfile("  Barsaat se bachne ki haisiyat nahin … Aur goli baari ki baat" +
                " kar rahe hai aap log   "," Gadar: Ek Prem Katha    "));


        ListProfile.add(new ListProfile("Isse pehle ki main tujhe gaddar karaar dekar" +
                " goli maar doon ... Bhag ja yahan se     ","  Border   "));


        ListProfile.add(new ListProfile(" Agar aaj ye jatt bighad gaya ... Toh sehkadon ko le marega    ","  Gadar: Ek Prem Katha   "));


        ListProfile.add(new ListProfile(" Zindagi aur maut waheguru ke haath mein hai ... Aur mera waheguru dushman ke " +
                "saath nahin ... Mere saath hai    ","  Border   "));


        ListProfile.add(new ListProfile(" Mard banne ka itna shauk hai ... Toh kutto ka sahara lena chhod de    ","Ghatak     "));


        ListProfile.add(new ListProfile(" Pehli goli woh chalayega ... Aur aakhri goli hum    ","  Border   "));


        ListProfile.add(new ListProfile(" Pinjare mein aakar sher bhi kutta ban jaata hai    "," Ghatak    "));


        ListProfile.add(new ListProfile("Aaj se tumhari har goli par desh ke dushman ka naam likha hoga     ","  Border   "));


        ListProfile.add(new ListProfile("Yeh mazdoor ka haath hai ... Loha piglakar uska aakar badal deta hai    "," Ghatak    "));


        ListProfile.add(new ListProfile(" Tujhe chahiye desi ilaaj aur woh ilaaj karega yeh desi haath    ","  Champion   "));


        ListProfile.add(new ListProfile("Darakar logon ko woh jeeta hai ... Jiski haddiyon mein pani bhara hota hai     ","   Ghatak  "));



        ListProfile.add(new ListProfile(" Tarikh par tarikh, tarikh par tarikh, tarikh par tarikh, tarikh par tarikh milti rahi hai ... Lekin" +
                " insaaf nahi mila my lord, insaaf nahi mila ... Mili hai toh sirf yeh tarikh    ","  Damini   "));


        ListProfile.add(new ListProfile(" Kanoon aur insaaf taqatwar ke ghar ghulam bankar behte hai   ","  Ghatak  "));


        ListProfile.add(new ListProfile("Jab yeh dhai kilo ka haath kisi pe padta hai na ... " +
                "Toh aadmi uthta nahi ... Utth jata hai     ","  Damini   "));


        ListProfile.add(new ListProfile(" Aane waale chaubis ghanto mein tumhare chaubis tukde karke ... Har" +
                " tukde ka alag alag antim sanskar karoonga    ","  Ghayal   "));


        ListProfile.add(new ListProfile(" Maidan mein khule sher ka samna karoge ..." +
                " Tumhare mard hone ki galatphami door ho jayegi    ","   Damini  "));


        ListProfile.add(new ListProfile("Main tera woh hashar karoonga ... Ke tujhe apne pehda hone par afsoos hoga     ","  Ghayal   "));


        ListProfile.add(new ListProfile(" Chilaao mat ... Nahi toh yeh case yahin rafaa dafaa kar doonga" +
                " ... Na tarikh na sunwai, seedha insaaf woh bhi tabartop    ","  Damini   "));


        ListProfile.add(new ListProfile("Agar hum sach ke saath hai ... Toh hum mein jeetne tak haar nahi maanni chahiye     ","  Ghayal Once Again    "));


        ListProfile.add(new ListProfile(" Bijli ka woh jhatka lagega ... Ki tu jhatakna bhool jayega    ","   Damini  "));






        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new sunny_deol.MyAppAdapter(ListProfile,sunny_deol.this);
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
                viewHolder1 = new sunny_deol.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (sunny_deol.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(sunny_deol.this,MainActivity.class);
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
