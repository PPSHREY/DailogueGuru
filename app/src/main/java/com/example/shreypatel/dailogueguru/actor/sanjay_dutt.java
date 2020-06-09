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

public class sanjay_dutt extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_sanjay_dutt);

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
        ListProfile.add(new ListProfile("  Zindagi jeene ka mazaa tab aata hai … " +
                "Jab maut ki ungliyan thamkar bhaga jaye     ","Aatish     "));


        ListProfile.add(new ListProfile("  Case mein dum hai .. Lekin witnesses kam hai     "," Desi Boyz   "));


        ListProfile.add(new ListProfile("  Zindagi mein jab sirf ek hi raasta bacha ho ... Toh kya galat aur kya sahi ... " +
                "Koi mainey nahi rakhta     ","  Aatish   "));


        ListProfile.add(new ListProfile("Yeh sardar hai aur asardar bhi hai       ","Double Dhamaal    "));


        ListProfile.add(new ListProfile("Bambai ki sari ladkiyan tere do by do dil mein bhari padi hai      ","  Aatish   "));


        ListProfile.add(new ListProfile("  Wafaadari, imaandari, khuddari aur zimmedari ... In charon ki saajedari se aaj kabir" +
                " nayak itne paise waala hai     ","  Double Dhamaal  "));


        ListProfile.add(new ListProfile(" Tum kya leke aaye the ... Aur kya leke jaoge     "," Agneepath    "));


        ListProfile.add(new ListProfile("  Loan aur shaadi ek jaise hai ... Loan liya toh chukao, shaadi kiya toh nibhao      "," EMI   "));


        ListProfile.add(new ListProfile("  Na moh, na maya, na mamta ka bandhan ... Bus anand hi anand     "," Agneepath    "));


        ListProfile.add(new ListProfile("   Duniya mein har cheez badalti hai ... Mausam, rishtey, naseeb    ","   EMI "));


        ListProfile.add(new ListProfile(" Aaj ke jeevan ka doosra naam hai ... Rokda, paisa, maal      "," Agneepath    "));


        ListProfile.add(new ListProfile("  Jitna talk time hai utna bol     ","  EMI  "));


        ListProfile.add(new ListProfile("Comedy toh abhi abhi shuru ki hai beta ... Action main tees saal se karta" +
                " aa raha hoon       ","  All The Best   "));


        ListProfile.add(new ListProfile(" 30.\tThoda roothegi, thoda cheekhegi, thoda chilayegi ... Dil kehta hai ek" +
                " din haseena maan jayegi      "," Haseena Maan Jayengi    "));


        ListProfile.add(new ListProfile(" Woh sapna kya sapna hai, joh sirf sooke dekha jaaye ... Sapna toh " +
                "woh hona chahiye, joh neendein udda de      ","  All The Best   "));


        ListProfile.add(new ListProfile(" Jabse is raaste pe kadam rakha hai na ... Tabse kafan saath leke" +
                " ghoomta hoon main      "," Hathyar    "));


        ListProfile.add(new ListProfile(" Jab bhook lagti hai na toh pet yeh nahin poochta ... Ki yeh roti imaandari " +
                "ki hai ya baimaani ki     ","  Andolan   "));


        ListProfile.add(new ListProfile(" Today corruption is a part of our lives ... An honest man " +
                "is a liability      ","   Hathyar  "));


        ListProfile.add(new ListProfile("Yeh duniya bahut buri hai, bahut buri hai ... Joh bhi deti hai bura " +
                "banane ke baad hi deti hai     "," Andolan    "));


        ListProfile.add(new ListProfile(" Sawaal yeh nahi hai ki bar mein kitni daru hai ... Sawaal yeh hai ki tu " +
                "kitni pee sakta hai      ","  Kaante   "));


        ListProfile.add(new ListProfile("  Tu police waala nahin bhadwaa hai ... Joh kanoon ko rundi banakar" +
                " gundon ke haathon mein bechta hai     "," Andolan    "));


        ListProfile.add(new ListProfile("Taqdeer tera bistara garam karna chahti hai … Aur tujhe sofe pe sona hai       "," Kaante    "));


        ListProfile.add(new ListProfile("Gunday ka sirf ek hi ussool hota hai ... Ki uska koi ussool nahi" +
                " hota hai       "," Andolan    "));


        ListProfile.add(new ListProfile(" Hindustanio ke samne ... Hindustan ko jalane ki baatein nahi karte     ","  Kaante   "));


        ListProfile.add(new ListProfile("Yeh dhanda hai na bewafaa aurat ki tarah hai … Bewafai par utar aaye " +
                "toh kangaal kar deta hai ... Aur wafaadari par utar aaye toh malamaal       ","  Annarth   "));



        ListProfile.add(new ListProfile(" Insaaf na kanoon de sakta hai na police ... Agar koi insaaf de sakta hai ... " +
                "To ek insaan doosre insaan ko de sakta hai      "," Khal Nayak   "));



        ListProfile.add(new ListProfile("  Is jahaan mein aaye ho toh kuch aaisa karo kadardaan … " +
                "Ke jis gali se guzro toh awaaz aaye, abbajaan abbajaan     ","   Annarth  "));



        ListProfile.add(new ListProfile(" Aurat aur zevar dono ka sangam is duniya ki sabse badi " +
                "sundarta hai     "," Khatron Ke Khiladi    "));



        ListProfile.add(new ListProfile(" Pyar maanga tha, judaai nahi ... Wafaa maangi tha, bewafai nahi      ","  Annarth   "));



        ListProfile.add(new ListProfile(" Haath mein pistol lekar joh jeete hai ... Unka anth pistol hi likhti hai      ","Khauff    "));



        ListProfile.add(new ListProfile("  Apna aakhri shradh mana le ... Kyun ki iske baad tere haath aur hathyar" +
                " bhi kaam nahi aayenge     "," Bhoomi    "));


        ListProfile.add(new ListProfile(" Aaj tumhe maut sirf dekhni hi nahi ... Mehsoos bhi karni padegi      ","  Khauff  "));


        ListProfile.add(new ListProfile(" Ek second lagega tujhe maarne mein ... Lekin nahi ... Tujhe har din maarunga, " +
                "har second maarunga      ","  Bhoomi   "));


        ListProfile.add(new ListProfile(" Jahan paisa hota hai wahan jurm hai … Jahan jurm hota hai wahan" +
                " khauff ... Aur jahan khauff hota hai wahan mere jaisa mujrim      ","   Khauff "));


        ListProfile.add(new ListProfile(" Samundar ki machli, ladki ka dil aur currency note pe kisi ka naam nahi likha hota ..." +
                " Jiske haath lagi us hi ki sagi      ","   Blue   "));


        ListProfile.add(new ListProfile(" Aadmi chahte hue bhi apna ateeth nahi badal sakta ... Lekin apne aaj ko" +
                " sudhar sakta hai .. Apne kal ko badal sakta hai      "," Kidnap    "));


        ListProfile.add(new ListProfile("  Agar main marr gaya toh tu jee gaya ... Agar main " +
                "jee gaya toh tu marr gaya      ","  Daag: The Fire  "));


        ListProfile.add(new ListProfile("  Teri dono life line khatam ho chuki hai ... Ab teesri galati ki toh episode khatam      ","  Knock Out   "));


        ListProfile.add(new ListProfile(" Waqt ne tumhe hamesha dhokha diya hai … Lekin is baar woh" +
                " tumhare saath chalega      "," Deewaar    "));


        ListProfile.add(new ListProfile(" Lene ke baad dena toh padta hi hai bachchu      "," Knock Out    "));


        ListProfile.add(new ListProfile(" Duniya mein log achche ya burre nahi hote … Sirf samajhdaar" +
                " ya chutiye hote hai      "," Department    "));


        ListProfile.add(new ListProfile("  Log apna paap dhone ke liye haridwar jaate hai ... Main toh khud ganga ko" +
                " tere pass leke aa raha hoon      ","  Knock Out   "));


        ListProfile.add(new ListProfile(" Aadmi ko zindagi mein kam se kam ek cheez ke saath wafadaar" +
                " hona chahiye      ","  Department   "));


        ListProfile.add(new ListProfile("  Main insaan par bharosa nahi karta ... Technology mere liye kaafi hai     ","  Knock Out   "));


        ListProfile.add(new ListProfile("  Duniya ki koi bhi kitaab ek aurat ko khush karna nahi sikha sakti .. " +
                "Uske liye degree nahi, pedigree chahiye     "," Desi Boyz   "));


        ListProfile.add(new ListProfile(" Maut aankhon ke samne hoti hai na ... Toh achchon achchon ki gateway of india ho jaati hai     ","  Knock Out   "));


        ListProfile.add(new ListProfile(" Rishwat dene waale se zyada bada gunehgar rishwat lene waala hai      ","  Kurukshetra    "));


        ListProfile.add(new ListProfile(" Desh toh apna ho gaya hai ... Lekin log paraye ho gaye hain      ","  Lage Raho Munna Bhai     "));


        ListProfile.add(new ListProfile(" Bole toh gandhigiri zindabad!    ","    Lage Raho Munna Bhai   "));


        ListProfile.add(new ListProfile(" Ox mane behll ... Ford mane gaadi ... Oxford bole toh behllgaadi      ","  Lage Raho Munna Bhai     "));


        ListProfile.add(new ListProfile(" Apun ke bheje mein saala chemical locha hai      ","  Lage Raho Munna Bhai     "));








        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new sanjay_dutt.MyAppAdapter(ListProfile,sanjay_dutt.this);
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
                viewHolder1 = new sanjay_dutt.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (sanjay_dutt.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(sanjay_dutt.this,MainActivity.class);
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
