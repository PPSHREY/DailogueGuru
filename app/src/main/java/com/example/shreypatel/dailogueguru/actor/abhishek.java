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

public class abhishek extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_abhishek);


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
        ListProfile.add(new ListProfile(" Zindagi se bhaagte bhaagte ek modh aaisa aata hai ... " +
                "Jab aage badne se pehle aapko rukna padta hai     "," All Is Well  "));


        ListProfile.add(new ListProfile("Agar tum chor na hote to hum zaroor dost hote    "," Dhoom  "));


        ListProfile.add(new ListProfile("Kuch log sapno ke peeche bhaagte hai kyun ki woh unhe sach karna chahte hai ... Lekin" +
                " kuch log sapno ki peeche is liye bhaagte hai kyun ki unhe apni sachai se bhaagna hota hai    "," All Is Well  "));



        ListProfile.add(new ListProfile("Burai chahe jitni bhi aage chali jaye ... Hamesha achchai se" +
                " peeche rehti hai     ","  Dhoom "));



        ListProfile.add(new ListProfile(" Aadmi khane se gareeb hota hai, kapdon se gareeb hota hai … Lekin " +
                "agar vicharon se gareeb ho na ... Toh woh uski apni galati hoti hai    "," Bas Itna Sa Khwaab Hai  "));



        ListProfile.add(new ListProfile(" Joh pyar karta hai woh jaan leta nahin ... Jaan deta hai     "," Dhoom 2  "));


        ListProfile.add(new ListProfile("Logon ko woh do joh unhe chahiye ... Aur unse woh lo " +
                "joh hum mein chahiye     ","Bas Itna Sa Khwaab Hai   "));


        ListProfile.add(new ListProfile(" Chor ko sirf chori karte hue pakda ja sakta hai ... Na uske" +
                " pehle, na uske baad   "," Dhoom 2  "));


        ListProfile.add(new ListProfile("Hamare dhande mein na bandook chalti hai, na bomb, na chaku ... Chalta hai toh sirf ek hi cheez ... " +
                "Dimaag ... Aur woh hamesha hamare saath rehta hai, loaded     ","Bluffmaster   "));


        ListProfile.add(new ListProfile(" Shuruvat se dekhne ka shaunk hai mujhe ... Chahe " +
                "woh film ho yah chori   "," Dhoom 2  "));


        ListProfile.add(new ListProfile("Kaise lootna hai trick us mein nahi hai ... Kisse " +
                "lootna hai woh trick hai    ","Bluffmaster   "));


        ListProfile.add(new ListProfile("Sikka tumhara par baazi meri    "," Dhoom 2  "));


        ListProfile.add(new ListProfile("Aaise kaamo mein dimaag kisi aur ka lagta hai, haath kisi aur ka ... " +
                "Aur vaat tere jaiso ka    "," Bluffmaster  "));


        ListProfile.add(new ListProfile("Chor ki sachchai sirf ek chor jaan sakta hai      ","Dhoom 2   "));


        ListProfile.add(new ListProfile("Goli woh chalate hai joh dimag nahi chalate      "," Bluffmaster  "));


        ListProfile.add(new ListProfile("Mera kaam choron ko pakadna hai ... Unka shikaar karna nahin    "," Dhoom 2  "));


        ListProfile.add(new ListProfile("Hum baar baar tere dar pe aayenge ... Aur ghanti bajake bhaag jayenge     ","Bol Bachchan  "));


        ListProfile.add(new ListProfile("Chor aur police ki sirf dushmani hoti hai    "," Dhoom 3  "));


        ListProfile.add(new ListProfile("Shagun bhi tabhi shagun kehlata hai ... Jab uski rakkam sau nahi, " +
                "ek sau ek ho   "," Bol Bachchan "));


        ListProfile.add(new ListProfile("Asli jeet badle ki nahi ... Sapne ki hoti hai     "," Dhoom 3  "));


        ListProfile.add(new ListProfile("Yeh world hai na world, is mein do tarah ke log hote hai ... Ek joh saari zindagi school college mein " +
                "time kharab karte hai ... Aur doosre joh khud apna school hote hai     ","Bunty Aur Babli   "));


        ListProfile.add(new ListProfile("Maafi sazaa se badhke hoti hai      "," Dhoom 3  "));


        ListProfile.add(new ListProfile("Yeh world hai na world, is mein do tarah ke log" +
                " hote hai ... Ek joh sirf sunte hai aur doosre joh sirf bolte hai    ","Bunty Aur Babli   "));


        ListProfile.add(new ListProfile(" Ya toh chori nahi hogi ... Ya chor nahi hoga     "," Dhoom 3  "));


        ListProfile.add(new ListProfile(" Yahan nalon mein pani ho na ho ... Aankhon mein hamesha savan rehta hai    "," Delhi-6 "));


        ListProfile.add(new ListProfile(" Kaam ka soocho ... Kamasutra ka nahi    ","Dhoom 3   "));


        ListProfile.add(new ListProfile(" Log pyar ko kahan kahan talash nahi karte hai ..." +
                " Par pyar apne aashiqon ko khud dhoond leta hai   ","Dhaai Akshar Prem Ke   "));


        ListProfile.add(new ListProfile(" Chor ki kismat hamesha police ke haathon mein hoti hai     "," Dhoom 3  "));


        ListProfile.add(new ListProfile("Pyar ko pyar mein pade bina samjha nahi ja sakta     "," Dhaai Akshar Prem Ke  "));


        ListProfile.add(new ListProfile("Goa meri jaan ... Jannat ki shaan      "," Dum Maaro Dum  "));


        ListProfile.add(new ListProfile(" Hum jis mission par hai ... Us mein goliyon ka hisaab nahi diya jaata  "," Dus"));


        ListProfile.add(new ListProfile(" Game aapka ... Rules mere, players mere and no referee     "," Dum Maaro Dum "));


        ListProfile.add(new ListProfile("Jab zameer bikta hai ... Toh zindagi bhi soot sameth vasooli karti hai    "," Dum Maaro Dum  "));








        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new abhishek.MyAppAdapter(ListProfile,abhishek.this);
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
                viewHolder1 = new abhishek.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (abhishek.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(abhishek.this,MainActivity.class);
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
