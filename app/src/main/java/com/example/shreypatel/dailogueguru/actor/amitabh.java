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

public class amitabh extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_amitabh);


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
        ListProfile.add(new ListProfile(" Jis desh mein pehda hue ho tum, us desh ke agar tum bakht nahi .." +
                ". Nahi piya doodh maa ka tumne, aur baap ka tum mein rakht nahi         "," Ab Tumhare Hawale Watan Sathiyo "));


        ListProfile.add(new ListProfile("Dushman se agar fayda ho .. Toh usko apna dost banalo  "," Agneepath  "));

        ListProfile.add(new ListProfile(" Taqdeer kabhi kabhi insaan ko apne hi desh mein pardesi" +
                " bana deti hai           ","Desh Premee  "));


        ListProfile.add(new ListProfile("Galat cheez banaya telephone ... Udhar se aadmi soochta kuch " +
                "hai, bolta kuch hai, karta kuch hai          "," Agneepath  "));


        ListProfile.add(new ListProfile("  Don ka intezaar toh gyarah mulkon ki police kar rahi hai         ","Don   "));


        ListProfile.add(new ListProfile("Kehne ko yeh shehar hai, sirf kehne ko ..." +
                " Par idhar jungle ka kanoon chalta hai          ","  Agneepath "));


        ListProfile.add(new ListProfile("  Don ko pakadna mushkil hi nahin ... Namumkin hai          ","Don  "));


        ListProfile.add(new ListProfile(" Idhar har taqatwar apne se kam ko maarkar jeeta hai " +
                "malum? ... Maarkar         ","  Agneepath "));


        ListProfile.add(new ListProfile(" tYeh tum janti ho ki yeh revolver khali hai … " +
                "Main janta hoon ki yeh revolver khali hai ... Lekin police nahin janti ki yeh revolver khali hai          ","Don  "));


        ListProfile.add(new ListProfile("  Yeh che foot ka body ludkane ke liye char inch ka goli " +
                "kam pad gaya malum?          ","  Agneepath "));


        ListProfile.add(new ListProfile(" Don zakhmi hai toh kya ... Phir bhi don hai          ","Don  "));


        ListProfile.add(new ListProfile(" Is duniya mein zinda rehne ke liye ... Bhigda" +
                " hua hona bahut zaroori hai          ","  Agneepath "));


        ListProfile.add(new ListProfile(" Jab jab is dharti par kans ne janam liya hai …" +
                " Uska sar kuchalne ke liye krishna bhi pehda hota raha hai          ","Don  "));


        ListProfile.add(new ListProfile("Pyar ka mazaa saath marne mein nahi .. Saath jeene " +
                "mein hai          ","Alaap  "));


        ListProfile.add(new ListProfile(" Yeh sher ki maa hai ... Maine bakri ka nahi, sherni ka dhood piya hai          "," Hera Pheri "));


        ListProfile.add(new ListProfile("  Aaisa toh aadmi life mein do-heech time bhaagta hai ... Olympic " +
                "ka race ho yah police ka case ho ... Tum kahe mein bhaagta hai bhai?        ","Amar Akbar Anthony  "));


        ListProfile.add(new ListProfile("  Jiska koi dost nahi hota ... Uska koi dushman bhi nahi hota           ","Hera Pheri  "));


        ListProfile.add(new ListProfile(" Anand mara nahi, anand marte nahi         ","Anand  "));


        ListProfile.add(new ListProfile("Hum, hum hai … Tum nahi            ","Hera Pheri  "));


        ListProfile.add(new ListProfile("Maanta hoon ki zindagi ki taqat maut se zyada badi hai ... Lekin " +
                "yeh zindagi kya maut se bhattar nahi          ","Anand  "));


        ListProfile.add(new ListProfile(" Kitna bhi bhaago, apni maut se nahi bhaag sakte ... Aur tumhari maut mere haathon likhi hai           ","Hera Pheri  "));


        ListProfile.add(new ListProfile("Aapka kanoon kisi insaan ko ek hi jurm ke liye do baar sazaa nahi " +
                "de sakta           ","Andha Kanoon  "));

        ListProfile.add(new ListProfile("Paap karne waalon par patthar uthane ka adhikaar ... Sirf usse hai jisne paap na kiya ho          ","Kaala Pathar   "));


        ListProfile.add(new ListProfile("Sirf saansein lene ko jeena nahi kehte          ","Babul  "));


        ListProfile.add(new ListProfile(" Aadmi himalaya ki choti se girke uth " +
                "sakta hai ... Lekin ek baar khud apni nazron se gir jaye toh phir woh girta hi chala jaata hai           "," Kaala Pathar  "));


        ListProfile.add(new ListProfile("Yeh kambakht mohabbat hai hi badi musibat waali cheez ..." +
                " Aksar imtehaan leti hai ... Lekin khushiyan bhi deti hai          ","Babul  "));


        ListProfile.add(new ListProfile(" Hum jaha khade ho jaate hai line wahin se shuru hoti hai          "," Kaalia   "));


        ListProfile.add(new ListProfile("Khuda ke karam se, ishwar ki krupa se aur public ki demand " +
                "se          ","Bade Miyan Chote Miyan  "));


        ListProfile.add(new ListProfile(" Aap ne jail ki deewaron aur zanjeeron ka loha dekha hai jailer sahab ... " +
                "Kaalia ki himmat ka faulaad nahi dekha         ","  Kaalia  "));


        ListProfile.add(new ListProfile("  Ek baap agar apne bete ki zindagi ka pehla kadam uthane mein uski madad kar sakta hai …" +
                " Toh wahi beta apne baap ke aakhri kadam uthane mein usse sahara kyun nahi de sakta?         ","Baghban  "));


        ListProfile.add(new ListProfile(" Daulat ka pedh jab bhi ughta hai ... Paap ki zameen mein hi ughta hai           ","  Kaalia  "));


        ListProfile.add(new ListProfile("Tum ho toh hum hai ... Hum hai toh sab kuch hai ... " +
                "Varna kuch nahi, kuch bhi nahi           ","Baghban  "));


        ListProfile.add(new ListProfile(" Ye sar kisi insaan ke samne nahi jhuk" +
                " sakta jailer sab ... Jhukega to uski chaukhat pe ... Ya uski darbar mein jhukega          "," Kaalia   "));


        ListProfile.add(new ListProfile("Pyar hi toh woh jaado hai ... Joh umar bhar" +
                " jawan banaye rakhta hai            ","Baghban  "));


        ListProfile.add(new ListProfile(" Main tumhe itni maar maroonga ... Shareer " +
                "mein itne zakhm doonga ... Ki dard bhi pareshaan ho jayega ki uthe toh kahan se uthe           "," Khakee "));


        ListProfile.add(new ListProfile("oh bachche apne maa baap ko pyar nahi de sakte, sahara nahi de sakte," +
                " maan samaan nahi de sakte … Unhe main kabhi maaf nahi karta          ","Baghban  "));


        ListProfile.add(new ListProfile(" Upar waala bhookha jagata zaroor hai ... Lekin bhookha sulata nahi           ","Mard   "));


        ListProfile.add(new ListProfile(" Tere haath mein maut ka samaan hai toh ... " +
                "Mere seene pe khuda ka naam hai         ","Coolie   "));


        ListProfile.add(new ListProfile(" Main ghulam mulk mein pehda zaroor hua hoon …" +
                " Lekin mere dil ne ghulami na kabhi kubool ki hai aur na kabhi karega           ","Mard   "));


        ListProfile.add(new ListProfile(" Mazdoor ka paseena sookhne se pehle, uski mazdoori mil jani chahiye janaab         "," Coolie  "));


        ListProfile.add(new ListProfile(" Jiske seene mein doosro ke liye dard " +
                "hota hai ... Asal mein wahi mard hota hai           ","Mard   "));


        ListProfile.add(new ListProfile("Jiske seene mein dil nahi usse dil ki bemaari kaise ho" +
                " sakti hai?           "," Coolie  "));


        ListProfile.add(new ListProfile("Koyle ki dalaali mein haath kaale ho jate hai ..." +
                " Magar kaala dhanda karne waalon ke toh mooh bhi kaale ho jate hai          ","Mard   "));


        ListProfile.add(new ListProfile("Main aaj bhi phenke hue paise nahin uthata           ","Deewaar  "));


        ListProfile.add(new ListProfile("Hamare liye toh har maa apni maa hoti hai             "," Mard  "));


        ListProfile.add(new ListProfile(" Aaj khush to bahut hoge tum?         ","Deewaar  "));


        ListProfile.add(new ListProfile("Dahej dimak hoti hai ... Ghar mein basne se pehle " +
                "hi ghar ko khokla kar deti hai             "," Mard  "));


        ListProfile.add(new ListProfile("  Yeh namak … Namak haraamo ke zakhmo ko jalata hoga ... Namak halaalo ke nahi           ","Mard   "));


        ListProfile.add(new ListProfile("Aaj pehli baar pata chala ki ... Sabhi goron ka dil kaala nahi hota             "," Mard  "));


        ListProfile.add(new ListProfile("Zakhmi dil chain nahi paate ... Jala karte hai             "," Mard  "));



        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new amitabh.MyAppAdapter(ListProfile,amitabh.this);
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
                viewHolder1 = new amitabh.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (amitabh.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(amitabh.this,MainActivity.class);
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
