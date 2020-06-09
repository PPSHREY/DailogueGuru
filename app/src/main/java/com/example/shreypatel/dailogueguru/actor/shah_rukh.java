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

public class shah_rukh extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_shah_rukh);

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
        ListProfile.add(new ListProfile(" Dare hue log aksar alfazon ke peeche chupte" +
                " hai","Ae Dil Hai Mushkil"));

        ListProfile.add(new ListProfile(" Kabhi kabhi dil jodne ke liye dil todna padta hai .. Aur dil todkar jodne waale ko ..." +
                " Pata nahi kya kehte hai ","Baadshah"));

        ListProfile.add(new ListProfile("Mujhe states ke naam na sunai dete hai na dikhai dete hai ..." +
                " Sirf ek mulk ka naam sunai deta hai i-n-d-i-a    ","Chak De India"));

        ListProfile.add(new ListProfile("Vaar karna hai toh samne waale ke goal par nahi ... Samnewaale ke dimag par" +
                " karo ... Goal khud-ba-khud ho jayega  ","Chak De India"));


        ListProfile.add(new ListProfile("Marr ke aayenge ... Lekin haar ke nahi aayenge  ","Chak De India"));


        ListProfile.add(new ListProfile(" Yaad rakhna ki duniya ke kisi kone mein ek aadmi hai joh bahut " +
                "khush hai ... Kyun ki tum khush ho  ","Chalte Chalte"));


        ListProfile.add(new ListProfile("Don't underestimate the power of a common man  ","Chennai Express"));


        ListProfile.add(new ListProfile("Yeh car nahi, bekaar hai ... Dhikaar hai  ","Chennai Express"));


        ListProfile.add(new ListProfile(" It is very good to be important ... But it is more" +
                " important to be good  ","Chennai Express"));


        ListProfile.add(new ListProfile("Don't let the past blackmail your present ... " +
                "To ruin a beautiful future  ","Dear Zindagi"));


        ListProfile.add(new ListProfile("] Albert einstein ne kaha tha ... Pagal woh hota hai joh roz roz same kaam karta" +
                " hai ... Magar chahta hai ki nateeja alag ho   ","Dear Zindagi"));


        ListProfile.add(new ListProfile("Ek pal mein beta bana liya ... Aur" +
                " doosre hi pal mein paraya kar diya  ","Dilwale Dulhania Le Jayenge"));


        ListProfile.add(new ListProfile("Jab hum apne aap ko achchi tarah samajh lete hai ..." +
                " Toh doosre kya samajhte hai, it doesn't matter ... Not at all  ","Dear Zindagi"));


        ListProfile.add(new ListProfile(" Tum agar khulke ro nahi sakogi ..." +
                " Toh khulkar has kaise sakogi   ","Dear zindagi"));


        ListProfile.add(new ListProfile("Babuji ne kaha gaon chhod do .. Sab ne kaha paro ko chhod do ... Paro ne kaha sharab chhod do ... Aaj tumne keh diya" +
                " haweli chhod do ... Ek din aayega jab woh kahenge, duniya hi chhod do ","Devdas"));


        ListProfile.add(new ListProfile("Aurat maa hoti hai, bahen hoti hai, patni hoti hai, dost hoti hai ... Aur" +
                " jab woh kuch nahi hoti, toh tawaif hoti hai  ","Devdas"));


        ListProfile.add(new ListProfile("Zindagi mein jab koi pattern banta ya koi aadat banti dikhai de na ..." +
                " Toh uske baare mein achchi tarah se sochna chahiye ... Genius is about knowing when to " +
                "stop ","Dear Zindagi"));


        ListProfile.add(new ListProfile(" Pehle fan star ke peeche bhaagta tha ... " +
                "Ab star fan ke peeche bhaagega  ","Fan"));


        ListProfile.add(new ListProfile("My name is khan, and i'm not a terrorist  ","My Name Is Khan"));

        ListProfile.add(new ListProfile(" Zindagi ek jigsaw puzzle ki tarah hai ... Mere jaise log us puzzle ke khoye hue tukde, " +
                "sirf dhoondne aur jodne mein madad kar sakte hai ... Par only you can complete " +
                "the puzzle","Dear Zindagi"));


        ListProfile.add(new ListProfile("Kaun kambakht bardaasht karne ko peeta hai ..." +
                " Hum toh peete hai ki yahan par baith sake, tumhe dekh sake, " +
                "tumhe bardaasht kar sake  ","Devdas"));


        ListProfile.add(new ListProfile("We are all our own teachers in the school of life ","Dear Zindagi"));


        ListProfile.add(new ListProfile("Apne hisse ki zindagi toh hum jee chuke chunni babu, ab toh bus dhadkano ka lihaaz karte hai ... Kya kahen yeh duniya " +
                "waalo ko joh, aakhri saans par bhi aitraaz karte hai  ","Devdas"));


        ListProfile.add(new ListProfile("Connection bhi na kamaal ki cheez hai ... Bas ho gaya toh ho " +
                "gaya ... Wi-fi, bluetooth se bhi zyada strong hai apna connection  ","Fan"));


        ListProfile.add(new ListProfile("Safe feel karne ke liye pehle saare dar mitana " +
                "zaroori hai   ","Dear Zindagi"));

        ListProfile.add(new ListProfile("Joh maza apni pehchaan ke saath jeene mein hai ... Woh kisi " +
                "doosre ki parchai banne mein nahi ","Fan"));


        ListProfile.add(new ListProfile("Duniya mein do tarah ke log hote hai ... Winners and losers ... Lekin zindagi har loser ko woh" +
                " ek mauka zaroor deti hai ... Jis mein woh winner ban sakta hai  ","Happy New Year"));

        ListProfile.add(new ListProfile("Bade bade deshon mein aaisi choti choti baatein ..." +
                " Hoti rehti hai  ","Dilwale Dulhania Le Jayenge"));










        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new shah_rukh.MyAppAdapter(ListProfile,shah_rukh.this);
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
                viewHolder1 = new shah_rukh.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (shah_rukh.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(shah_rukh.this,MainActivity.class);
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
