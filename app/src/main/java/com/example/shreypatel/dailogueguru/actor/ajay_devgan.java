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

public class ajay_devgan extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_ajay_devgan);

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

        ListProfile.add(new ListProfile(" Confidence bahut kutti cheez hai ... Agar nishane pe lag jaye" +
                " to kamaal hai ... Warna bawaal hai     ","  Akrosh     "));



        ListProfile.add(new ListProfile("Early to double bed and early to wake up fast ... Makes a male mard" +
                " hatta katta and oversmart      ","   Bol Bachchan    "));



        ListProfile.add(new ListProfile(" Barood ke canister pe behet ke diwali nahi manayi jaati hai" +
                " ... Barood ke canister se manayi jaati hai    ","  Akrosh     "));



        ListProfile.add(new ListProfile(" Eat lots and lots of akharot, tighten your langot ... And fight with " +
                "bear hands, no knives no forks    ","   Bol Bachchan    "));



        ListProfile.add(new ListProfile(" Insaan ki jaat usse achcha bura nahi banati … Uske karam usse achcha" +
                " bura banate hai     ","  Akrosh     "));


        ListProfile.add(new ListProfile("  Namak khane se pressure high hove ... Aur namak halaali se imaandari" +
                " aur high hove     ","   Bol Bachchan    "));


        ListProfile.add(new ListProfile("Pasand aaya toh dil mein ... Nahi toh dimaag mein bhi nahi       "," Action Jackson      "));


        ListProfile.add(new ListProfile(" Kabhi kabhi jeetne mein woh mazaa nahi hai ... Joh doosron ko jeetane mein hai      ","   Bol Bachchan    "));


        ListProfile.add(new ListProfile("Na commitment, na appointment ... Only punishment!       ","   Action Jackson    "));


        ListProfile.add(new ListProfile(" Hamare dhande mein ek galati ko maaf karna ... Usse bhi badi galati hai      "," Company      "));


        ListProfile.add(new ListProfile(" Main ek hi baar bolta hoon ... Kyun ki doosri baar sunne ke liye tu nahi hoga    ","  Action Jackson     "));


        ListProfile.add(new ListProfile(" Yeh kaunsi manzil hai, yeh kaunsa makaam hai ... Aankhon mein koi chehra, hothon pe" +
                " koi naam hai      "," Deewane      "));


        ListProfile.add(new ListProfile(" It's my way ya skyway    ","  Action Jackson     "));


        ListProfile.add(new ListProfile("  Aurat ke dil ke andar joh jhankkar uske har khwab ko dekh" +
                " sake ... Wohi uska asli haqdaar hota hai     "," Deewane      "));


        ListProfile.add(new ListProfile(" Honth hai ya vacuum cleaner ... Zabaan toh vapas dede      ","  Action Jackson     "));


        ListProfile.add(new ListProfile("  Jitna tum karti ho mujhse pyar ... Us mein 10% aur jodh lo yaar    "," Deewane      "));


        ListProfile.add(new ListProfile("   Saala jisne daru banaya hai uska putla banana chahiye  ","  Action Jackson     "));


        ListProfile.add(new ListProfile("Raja ki ek rani thi, yeh kahani toh suni thi ... Deewane ki ek deewani" +
                " hai, yeh aaj ki kahani hai       "," Deewane      "));


        ListProfile.add(new ListProfile("  Tere se badi degree mere paas hai … Mba ... \"maha bekaar aadmi\"     ","   All The Best   "));


        ListProfile.add(new ListProfile("Hindustan mein sirf teen hi cheezein chalti hai … Films, cricket aur shaadiyan       ","  Dil Toh Baccha Hai Ji    "));


        ListProfile.add(new ListProfile(" Chillao mat ... Agar humri awaaz oonchi hui toh sabka phat jayega yahan      ","   Apaharan     "));


        ListProfile.add(new ListProfile(" Aag joh dil mein lagi hai, usse duniya mein laga doonga main ... Joh teri doli uthi, zamaane ko jalaa doonga main      ","   Diljale   "));


        ListProfile.add(new ListProfile("Waqt tha emergency ka ... Mahol tha" +
                " dehshat ka ... Mauka tha kismat badalne ka ... Woh army thi, par hum bhi toh harami the       "," Baadshaho     "));


        ListProfile.add(new ListProfile(" Hum toh kabse apni jaan hatheli pe liye ghoom rahe hain ... Kambakht koi leta hi nahin      ","  Diljale     "));


        ListProfile.add(new ListProfile("  Woh ishq hi kya joh salamat chhod de     ","  Baadshaho    "));


        ListProfile.add(new ListProfile(" Pyar mein sauda karne ki aadat in aamiron ki ... Jaan le leti hai hum jaise gareebon ki     ","  Diljale     "));


        ListProfile.add(new ListProfile("  Zubaan aur jaan sirf ek hi baar di jaa sake hai ... Aaj se dono tare     "," Baadshaho     "));


        ListProfile.add(new ListProfile("  Joh jab hindustan ko mitana chahega ... Mitti mein mil jayega   ","  Diljale     "));


        ListProfile.add(new ListProfile(" Duniya mein do kisam ke log hote hai ... Ek jinke saath hum peete" +
                " hai ... Doosre jinki wajah se hum peete hai      ","  Baadshaho    "));


        ListProfile.add(new ListProfile("Hum mein toh apno ne loota, gairon mein kahan dum tha ..." +
                " Meri kishti thi doobi wahan, jahan pani kam tha       ","   dilwale    "));


        ListProfile.add(new ListProfile("Aankhen bhi ajeeb raazdar hove ... Dekhe kuch aur," +
                " dikhaye kuch aur ... Bayaan kuch aur kare, jaati kuch aur       ","  Baadshaho    "));


        ListProfile.add(new ListProfile(" Yeh aankhen, yeh chehra, yeh noor ... Insaan ho ya pari ho tum      ","    dilwale   "));


        ListProfile.add(new ListProfile(" Maut jab sar pe hoti hai ... Zindagi ki keemat tab samajh mein aati hai      ","  Baadshaho    "));


        ListProfile.add(new ListProfile("  Mujhe aaina na dikhao, ismein koi pagal nazar aata hai ... Yeh main nahin, " +
                "ismein sara jahan nazar aata hai     ","   dilwale    "));


        ListProfile.add(new ListProfile("  Zindagi badi choti hai ... Bade bade faisle lene ke liye zyada" +
                " time nahi lena chahiye     ","   Baadshaho   "));

        ListProfile.add(new ListProfile(" Yeh duniya hum mein milne nahi degi ... Lekin main bhi ab is duniya" +
                " ko jeene nahi doonga      ","   dilwale    "));


        ListProfile.add(new ListProfile("  Jab baat jugaad ki ho toh jaan ki keemat kam ho jaati hai     ","   Baadshaho   "));


        ListProfile.add(new ListProfile(" Mohabbat mere dost, aag bhi lagati hai un dilon ko ... Jin mein mohabbat" +
                " ke chirag jalte hai      ","   dilwale    "));


        ListProfile.add(new ListProfile(" Na pine hai na apple ... Phir bhi pineapple      ","  Bol Bachchan    "));


        ListProfile.add(new ListProfile(" Insaan apni family ke bina jee nahi sakta … Unke liye kuch bhi " +
                "kar sakta hai … Phir duniya usse matlabi kahe ya khudgarz      ","  Drishyam     "));



        ListProfile.add(new ListProfile("  When elder get cosy ... Younger don't put nosy     ","  Bol Bachchan     "));



        ListProfile.add(new ListProfile(" Tujhe paakar meri chaati aur bhi chaudi ho gayi hai ... My chest " +
                "has become blouse      ","   Bol Bachchan    "));


        ListProfile.add(new ListProfile("  Har pariwar mein kuch aaise raaz hote hai ... Joh na khule" +
                " toh hi behtar hai     ","  Drishyam     "));


        ListProfile.add(new ListProfile(" Rishton ke fayde nahi ... Rishton ke mainne dekhte hai hum     ","  Bol Bachchan     "));



        ListProfile.add(new ListProfile(" Lagta hai tumhare kaan bajh rahe hai ... Your eardrums are playing drums      ","  Bol Bachchan     "));







        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new ajay_devgan.MyAppAdapter(ListProfile,ajay_devgan.this);
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
                viewHolder1 = new ajay_devgan.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (ajay_devgan.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(ajay_devgan.this,MainActivity.class);
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
