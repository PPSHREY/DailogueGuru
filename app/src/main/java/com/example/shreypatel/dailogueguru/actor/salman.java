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

public class salman extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_salman);

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
        ListProfile.add(new ListProfile("Jab tum prem se milogi, toh prem ke prem mein prem deewani ho jaogi " +
                "... Meri premika    ","Andaz Apna Apna    "));


        ListProfile.add(new ListProfile("There izz always a first time, always a next time      "," Dabangg  "));



        ListProfile.add(new ListProfile("Abhe kaika tu yaar ... Bhaad mein gaya tera pyar     "," Andaz Apna Apna   "));


        ListProfile.add(new ListProfile(" Hum yahan ke robinhood hai ... Robinhood pandey    ","  Dabangg "));


        ListProfile.add(new ListProfile("Yeh illaka tera ho, tere baap ka ho, ya tere baap ke baap ka ho ... " +
                "Yeh desh hamara hai      "," Auzar  "));


        ListProfile.add(new ListProfile("Abhi tak sabko nehlaya hai ... Ab sabko dhounga      "," Dabangg  "));


        ListProfile.add(new ListProfile(" Is vardi ki shaan pe jaan dena seekho ... Imaan bechna nahi     "," Auzar   "));


        ListProfile.add(new ListProfile(" Hamara naam hamari personality ko shoba deta hai ... Chulbul pandey     "," Dabangg  "));


        ListProfile.add(new ListProfile("Taqat is vardi mein nahi ... Iske pehenne waale ke zameer mein hoti hai     "," Auzar   "));


        ListProfile.add(new ListProfile("Haramzaade se yaad aaya chaube ji ... " +
                "Aapke aadhar niye pitashri aaj kal kaise hai?     "," Dabangg  "));


        ListProfile.add(new ListProfile("Jhoot do kisam ke hote hai ... Ek bhalai ke liye aur ek burai ke liye     "," Auzar   "));


        ListProfile.add(new ListProfile("Between two legs itna danda maarenge ... " +
                "Ki na bajne layak rahoge na bajane layak     "," Dabangg  "));


        ListProfile.add(new ListProfile("Joh tumhari tarah shaadi ke chakkar mein phaste" +
                " hai ... Woh phir hamari tarah nahi haste hai      ","  Auzar  "));


        ListProfile.add(new ListProfile(" Mote waale uss taraf ... Patle waale iss taraf ... Aur fit " +
                "waale mere peeche    "," Dabangg  "));


        ListProfile.add(new ListProfile(" Dil ki aawaz kaano se nahi dil se suni jaati hai     ","Baabul   "));


        ListProfile.add(new ListProfile("Police waale ko thokne ka anjaam pata hai kya hai? ... Ikkis saal jail " +
                "aur thukkai alag se ... Aur ussi police waale ne agar tumhe thokka, toh promotion alag se aur bahaduri ka medal bhi     "," Dabangg  "));


        ListProfile.add(new ListProfile(" After every sunset there's a sun rise ... Ek naya" +
                " din, ek nayi umeed, ek nayi shuruvat     "," Baabul  "));


        ListProfile.add(new ListProfile(" Swagat nahi karoge aap hamara?     "," Dabangg 2   "));


        ListProfile.add(new ListProfile(" This is a race between man and machine ... He may have" +
                " the better machine but i'm a better man     "," Baabul  "));


        ListProfile.add(new ListProfile(" Gulab jamun se yaad aaya … Tiwari ji aapke hernia ka " +
                "operation hone waala tha?    ","  Dabangg 2  "));



        ListProfile.add(new ListProfile(" Tumhari aankhon se tumhara dil dikhta hai ... Jis " +
                "mein meri tasveer chupi hui hai     "," Baghban  "));


        ListProfile.add(new ListProfile(" Waqt tumhara kharab aaya hai aur din hum gine     ","Dabangg 2    "));


        ListProfile.add(new ListProfile("  Hum bajrangbali ke bakht hai ... Mar jayenge lekin jhoot nahi bolenge    "," Bajrangi Bhaijaan  "));


        ListProfile.add(new ListProfile("Sudhar jao ... Varna agar hum sudhaarne par utar " +
                "aaye ... Toh bahut nuksaan ho jayega      "," Dabangg 2   "));


        ListProfile.add(new ListProfile(" Jiske dil mein ram base ho ... Uske liye koi bhi cheez asambhav nahi hai    "," Bajrangi Bhaijaan  "));


        ListProfile.add(new ListProfile(" Utna hi maaro ... Jitna ki khud bardaash kar sako   ","  Dabangg 2  "));


        ListProfile.add(new ListProfile(" Mujhpar ek ehsaan karna ... Ki mujhpar koi ehsaan na karna     ","Bodyguard   "));


        ListProfile.add(new ListProfile(" Akal ke aane ke liye shakal ke bighadneka kyun intezar kar rahe " +
                "the tum?    "," Dabangg 2   "));


        ListProfile.add(new ListProfile("Meri ek khasiyat hai ki main maarta kam hoon … Aur ghaseet-ta zyada hoon      "," Bodyguard  "));





        ListProfile.add(new ListProfile("Main ek bodyguard hoon ... Meri duty ke ilawa na mujhe kuch dikhai " +
                "deta hai, na mujhe kuch sunai deta hai     "," Bodyguard  "));





        ListProfile.add(new ListProfile("Ghar waalon ke aasoon pochne ka ek hi tarika hai ... " +
                "Ki hamare aasoon nahi nikle     "," Chori Chori Chupke Chupke   "));





        ListProfile.add(new ListProfile(" Hum tum mein itne ched karenge ... Ki confuse ho jaoge ki saans kahan se" +
                " le ... Aur paadein kahan se    "," Dabangg  "));









        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new salman.MyAppAdapter(ListProfile,salman.this);
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
                viewHolder1 = new salman.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (salman.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(salman.this,MainActivity.class);
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
