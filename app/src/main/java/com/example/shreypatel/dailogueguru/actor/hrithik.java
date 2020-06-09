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

public class hrithik extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_hrithik);

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

        ListProfile.add(new ListProfile("Main tumhara haath kabhi nahi chhodunga … Aaj nahi, abhi " +
                "nahi, kabhi nahi      ","Aap Mujhe Achche Lagne Lage    "));


        ListProfile.add(new ListProfile("  Kabhi kabhi aisa kyun hota hai ... Ki apne paraye ho jaate hain    "," Kabhi Khushi Kabhi Gham   "));


        ListProfile.add(new ListProfile("Aap haath uthayen ya haath phailayen ... Main apna pyar aapki" +
                " jholi mein nahi daal sakta      "," Aap Mujhe Achche Lagne Lage   "));


        ListProfile.add(new ListProfile("Khubsoorati saadgi mein hi hai      "," Kaho Na Pyaar Hai   "));


        ListProfile.add(new ListProfile(" Daru peena buri baat hai ... Peeke bottal ko mauke " +
                "padh chhod dena .. Aur buri baat hai     "," Agneepath    "));


        ListProfile.add(new ListProfile(" Love and music have no language    "," Kites   "));


        ListProfile.add(new ListProfile(" Lambe khel mein chote mohron ki zaroorat nahi hoti    ","  Agneepath   "));


        ListProfile.add(new ListProfile(" Pata nahi duniya ke kis kone se aayi thi ... Aur meri duniya ban gayi thi     "," Kites   "));


        ListProfile.add(new ListProfile("Woh yeh soochte hai ki tum kuch jaanti ho … Par woh yeh" +
                " nahi jaante ki tum kuch nahi jaanti      "," Bang Bang   "));


        ListProfile.add(new ListProfile(" Log god fearing hote hai ... Main god loving hoon ... Mera god hai paisa     ","Kites    "));


        ListProfile.add(new ListProfile(" Main toh roz yeh maankar nikalta hoon ki … Yeh mera " +
                "aakhri din hai    ","Bang Bang    "));


        ListProfile.add(new ListProfile("Duniya mein kisi aadmi ko chota mat samajhiye ... Kyun ki har chota, kabhi" +
                " na kabhi badha zaroor ho jaata hai      "," Koi Mil Gaya   "));


        ListProfile.add(new ListProfile("  Kya koi kisi se itna pyar kar sakta hai ki uski jaan lele?   "," Dhoom 2   "));


        ListProfile.add(new ListProfile(" Akela chor kisi ko dhokha nahin de sakta ... Khud ko bhi nahin     "," Dhoom 2   "));


        ListProfile.add(new ListProfile(" Burai mein taqat jitni bhi ho ... Uska antim sanskar achchai hi karti hai     "," Krrish 3   "));


        ListProfile.add(new ListProfile("Is gun ki partner yeh goli hai ... Kabhi dhokha nahin deti ..." +
                " Jahan jati hai jaan leke rehti hai    "," Dhoom 2   "));


        ListProfile.add(new ListProfile(" Insaan hona meri kamzori nahi meri taqat hai … Kyun ki mere paas " +
                "hai har baap ka aashirwad aur har bache ka pyar     "," Krrish 3   "));


        ListProfile.add(new ListProfile("Dhokhe ke baad kisi na kisi ka marna zaroori hota hai      ","  Dhoom 2  "));


        ListProfile.add(new ListProfile(" Haath chote ho toh kya hua ... Himmat badi honi chahiye   ","  Krrish 3  "));


        ListProfile.add(new ListProfile(" Chori jiske naam se hoti hai ... Loot bhi us hi ki hoti hai     "," Dhoom 2   "));



        ListProfile.add(new ListProfile("Joh har haath ko haath aur har kisi ka saath deta" +
                " hai ... Wohi toh krrish hai      ","  Krrish 3  "));


        ListProfile.add(new ListProfile("Jeena koi majboori nahi, ek maqsad hai     ","Fiza    "));


        ListProfile.add(new ListProfile("38.\tJoh mutthi ab tak khuli hui thi ... Usse band karne ka samay aa gaya hai      "," Mohenjo Daro   "));


        ListProfile.add(new ListProfile(" Life bahut choti hai doston ... Par dil se jiyo toh bahut hai ... So go on break the rules, " +
                "forgive quickly, love truly and never regret anything that made you smile     "," Guzaarish   "));


        ListProfile.add(new ListProfile(" Tujhe mohenjo daro pe raj karna hai ... Aur mujhe seva     ","  Mohenjo Daro  "));


        ListProfile.add(new ListProfile(" Koi yeh bhoolke bhi na soche ki hum mein ab zindagi nahi bachi ... Jitni bhi hai," +
                " jaisi bhi hai ... Zindagi bahut khoobsurat hai     "," Guzaarish   "));


        ListProfile.add(new ListProfile(" Shaadi ek vishvas hai, pyar hai … Ek vachan hai joh hum" +
                " ek doosre ko dete hai   "," Mujse Dosti karoge   "));


        ListProfile.add(new ListProfile("Skirts ke naam pe ghagra pehenke aati ho tum      "," Guzaarish   "));


        ListProfile.add(new ListProfile(" Tum jaisi ladkiyan jab pyar mein padti hai na ... Toh " +
                "great love stories banti hai     ","  Yaadein  "));


        ListProfile.add(new ListProfile(" Yeh hamara mulk hai ... Aur hum iske jism par loot" +
                " ke zakhm nahin dekh sakte     ","  Jodhaa Akbar "));


        ListProfile.add(new ListProfile("  Pehle din inkaar kiya ... Duje din iqraar ki ... " +
                "Teeje din pyar kiya    ","  Yaadein  "));


        ListProfile.add(new ListProfile("  Wafaadari ka jazba kabhi kabhi insaan ko gustakh bana deta hai    ","Jodhaa Akbar   "));


        ListProfile.add(new ListProfile("  Ghar ki izzat sanskaro par khadi hoti hai ... Daulat ke " +
                "dherro par nahi    "," Yaadein   "));


        ListProfile.add(new ListProfile(" Jung ki sabse azeem khubi ... Bina shamsheer aazmaye " +
                "dushman ki deewar gira dene mein hai   ","  Jodhaa Akbar "));


        ListProfile.add(new ListProfile(" Sikka girne par awaaz hoti hai... Uthate waqt nahi     "," Jodhaa Akbar  "));



        ListProfile.add(new ListProfile(" Zindagi ki khushiyo ka batwara ... Shunk aur azaan ki " +
                "awaaz se tay nahi hota   ","  Jodhaa Akbar "));



        ListProfile.add(new ListProfile(" Aadmi ka khud pe bharosa, uski taqat hoti hai     "," Kaabil   "));



        ListProfile.add(new ListProfile(" Andhere mein agar kisi ka saath ho na ... Toh andhera kam lagta hai     ","Kaabil    "));



        ListProfile.add(new ListProfile(" Yeh khel unhone shuru kiya tha ... Tamasha aap logon ne dekha ..." +
                " Khatam main karoonga     "," Kaabil   "));



        ListProfile.add(new ListProfile(" Aksar dikhai nahi deta par samne zaroor hota hai ..." +
                " Har khudkhushi karne wale ka qatil zaroor hota hai     "," Kaabil   "));



        ListProfile.add(new ListProfile(" Vishvaas aur confidence, jab yeh do tumhare saath " +
                "ho na ... Toh raaston ko dekhne ki zaroorat nahi padti     ","  Kaabil  "));


        ListProfile.add(new ListProfile(" Log shor se jaagte hai aur khamoshi mujhe sone nahi deti     ","  Kaabil  "));




        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new hrithik.MyAppAdapter(ListProfile,hrithik.this);
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
                viewHolder1 = new hrithik.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (hrithik.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(hrithik.this,MainActivity.class);
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
