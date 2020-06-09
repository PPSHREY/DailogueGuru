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

public class akshaykumar extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    Button bt1,bt2;
    TextView txt1,text;
    ClipboardManager myClipboard;
    ClipData myClip;


    private ListView lv;
    private akshaykumar.MyAppAdapter appAdapter;
    private ArrayList<com.example.shreypatel.dailogueguru.ListProfile> ListProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshaykumar);

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
        ListProfile.add(new ListProfile("Peene ki capacity, jeene ki strength, account ka balance aur naam ka khauf.... " +
                "kabhi bhi kam nahi hona chahiye","Once Upon A Time In Mumbai Dobara"));

        ListProfile.add(new ListProfile("Mujhe achcha banne ka koi shaunk nahi hai ... suna hai upar waala achche logon" +
                " ko bahut jald apne paas bula leta hai","Once Upon A Time In Mumbai Dobara"));

        ListProfile.add(new ListProfile("Don't angry me!  ","Rowdy Rathore "));

        ListProfile.add(new ListProfile("Hero marne ke baad swarg jaata hai ... aur villian jeete ji swarg " +
                "paata hai ","Once Upon A Time In Mumbai Dobara"));

        ListProfile.add(new ListProfile("Hero ban na kaun chahta hai main to villain hoon ","Once Upon A" +
                " Time In Mumbai Dobara"));

        ListProfile.add(new ListProfile("Tum log parivaar ke saath yahan chain se jeeo … is liye hum log roz border " +
                "par marte hai  "," Holiday "));

        ListProfile.add(new ListProfile("Maut ko toh yunhi log badnaam karte hai .. Takleef toh zindagi" +
                " deti hai  ","Boss "));

        ListProfile.add(new ListProfile("Aadmi ki fitrat hi aaisi hai ... Chhot lagti hai na toh aadmi maa maa hi " +
                "chilata hai sabse pehle  ","Airlift "));

        ListProfile.add(new ListProfile("Nafrat ko sirf mohabbat se jeeta ja sakta hai ..." +
                " Sirf mohabbat se  ","Dhadkan "));

        ListProfile.add(new ListProfile("Agar main hero ban gaya … toh meri pehchaan bura maan" +
                " jayegi  ","Once Upon A Time In Mumbai Dobara "));

        ListProfile.add(new ListProfile(" Khaak mazaa hai jeene mein ... Jab tak aag na lagi ho apne dushman" +
                " ke seene mein  ","Boss"));

        ListProfile.add(new ListProfile("Na yeh sarkari hai, na gair kanooni ... Na yeh neta hai, na koi terrorist ..." +
                " Kaam se hero, naam se villain ... Yeh hai gabbar ","Gabbar is Back "));

        ListProfile.add(new ListProfile("Main krishna hoon is liye chamatkar karta hoon ..." +
                " Chamatkar karta hoon is liye krishna nahin hoon","Oh My God "));

        ListProfile.add(new ListProfile("Saturday yaane ki no thokna thukana ... Only gaana bajhana  ","Boss "));

        ListProfile.add(new ListProfile("Textbook se copy karta hua student ..." +
                " Aur tees maar khan ke bheje se nikla hua plan ... Kabhi fail nahi ho sakta  ","Tees Maar Khan "));

        ListProfile.add(new ListProfile("Kutte ke mooh se haddi ... Aur tees maar khan ki noton ki gaddi ..." +
                " Dono cheenana bekaar hai  ","Tees Maar Khan"));

        ListProfile.add(new ListProfile("Apne ko kya hai … Apne ko sirf pani nikalna hai  ","Boss"));

        ListProfile.add(new ListProfile("Achchai se hi burai ko maara ja sakta hai .. Neki se hi baddi ko mitaya ja sakta hai ..." +
                " Shanti se hi kisi ki mann ki jalan ko hataya ja sakta hai  ","Dhadkan "));

        ListProfile.add(new ListProfile("Joh mere kaam ka nahi ... Uska is duniya " +
                "mein koi kaam nahi   ","Gabbar is Back "));

        ListProfile.add(new ListProfile("Jaise ek bakht bhagwan ke bina adhoora hota hai ..." +
                " Waise hi bhagwan bhi ek sachche bakht ke bina adhoora hota hai  ","Oh My God "));

        ListProfile.add(new ListProfile("Haddiyan todne mein woh mazaa nahi ... Joh teri" +
                " akad todne mein hai  ","Gabbar is Back "));

        ListProfile.add(new ListProfile("Ughta hua suraj aur bhaagta hua tees maar khan ..." +
                " Dono kabhi kisi ke haath nahi aate  ","Tees Maar Khan"));



        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new MyAppAdapter(ListProfile,akshaykumar.this);
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
            akshaykumar.MyAppAdapter.ViewHolder1 viewHolder1;

            if (rowView == null) {
                LayoutInflater inflater = getLayoutInflater();
                rowView = inflater.inflate(R.layout.list_view, parent,false);
                // configure view holder
                viewHolder1 = new akshaykumar.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (akshaykumar.MyAppAdapter.ViewHolder1) convertView.getTag();
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
        Intent intent = new Intent(akshaykumar.this,MainActivity.class);
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
