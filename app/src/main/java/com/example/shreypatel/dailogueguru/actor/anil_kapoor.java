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

public class anil_kapoor extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.activity_anil_kapoor);


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

        ListProfile.add(new ListProfile("Pichle janam mein tum zaroor maachis ki dibiya rahe hoge … Is liye is janam" +
                " mein baatein kam aur mooh se chingaariya zyada nikalte ho     "," Andar Baahar       "));


        ListProfile.add(new ListProfile(" Joh log khudse nahi darte ... Yeh samaaj ussi se darta hai     ","  Hamara Dil Aapke Paas Hai      "));


        ListProfile.add(new ListProfile("Apun bhi apni marzi ka maalik hai ... Apne mood ka" +
                " badshah hai      ","   Andar Baahar     "));


        ListProfile.add(new ListProfile("  Sukh aur dukh wohi samajh sakta hai jispar beetti hai    ","   Hamara Dil Aapke Paas Hai     "));


        ListProfile.add(new ListProfile(" Papaya jaisa chehra, chikoo jaisi aankhen, tarbuj" +
                " jaisa badan ... Ladki hai yah fruit ki tokri?     ","   Andar Baahar     "));


        ListProfile.add(new ListProfile("  Bacha apni maa ki maar khake bada hota hai ... Lekin apni maa " +
                "ko maarne waala bacha tabah hota hai    "," hifazat        "));


        ListProfile.add(new ListProfile(" Janam ka pata nau mahine pehle chal jaata hai ... Magar marne ka pata" +
                " nau second pehle bhi nahi chalta     ","  Apradhi      "));


        ListProfile.add(new ListProfile(" Jis aulaad ke saath maa ka aashirwad aur baap ki dua ho ... Woh" +
                " haathon se nahi laaton se bhi kaam chala sakte hai     ","   hifazat      "));


        ListProfile.add(new ListProfile("Kriya karam ka samaan koi bhi khareed ke laye ... Magar kaam uske aata hai " +
                "jiska waqt aaya ho    ","  Apradhi      "));


        ListProfile.add(new ListProfile("Khana khane ke liye pati ka nahi … Bhook lagne ka intezaar karna chahiye     ","Hum Aapke Dil Mein Rehte Hain        "));


        ListProfile.add(new ListProfile(" Supari ka paisa kha jaane wale ko ... Shiva supari ki tarah kha jaata hai   "," Apradhi       "));


        ListProfile.add(new ListProfile("  Do premiyon ko milane ke liye hazaar jhoot bhi bolne pade ... Toh bolna chahiye    "," Jamai Raja       "));


        ListProfile.add(new ListProfile("Dharam ka asli matlab prem ke alava kuch aur ho hi nahi sakta     ","   Badhaai Ho Badhaai     "));


        ListProfile.add(new ListProfile(" Dil daulat se zyada taqatwar hota hai     ","  Jamai Raja      "));


        ListProfile.add(new ListProfile(" Ek ladki miss universe ka taj apne sar par pehan sakti hai ... Gold medal apne gale mein latka sakti hai ... " +
                "Lekin ek mangalsutra bina mantra ke kabhi nahi pehan sakti     ","  Badhaai Ho Badhaai      "));


        ListProfile.add(new ListProfile(" Asli daulat gadiyaan, bungley, bank balance, kutte, billiyaan nahi hote ..." +
                " Asli daulat woh hamare apne hote hai     ","    Jamai Raja    "));


        ListProfile.add(new ListProfile("Aurat ki izzat par agar ek baar daag lag jaye ... Toh woh kabhi nahi " +
                "dhul sakta hai     ","  Benaam Badsha      "));


        ListProfile.add(new ListProfile(" Main tera yamraj hoon      ","   Jamai Raja     "));


        ListProfile.add(new ListProfile(" Hum toh gulaab lene gaye the ... Yahan toh guldasta hi haath" +
                " mein aa gaya     ","   Beta      "));


        ListProfile.add(new ListProfile(" Joh mard apne pyar ke bandhan ki hifazat nahi kar sakta, woh mard nahi ... Joh aurat" +
                " apne pyar ke bandhan ko todna chahti hai, woh aurat nahi     ","    Jamai Raja    "));


        ListProfile.add(new ListProfile("  Jab tak ishq na karo, sab khush rakhti hai ... The problem starts" +
                " once you fall in love   ","   Chocolate     "));


        ListProfile.add(new ListProfile("Ek goli daali aur paanch ghar khali ... Yun lagali aur goli chalali .. Joh " +
                "jeeta woh zinda, joh haara woh murda    ","  Janbaaz     "));


        ListProfile.add(new ListProfile("Ladkiyan do kisam ki hoti hai ... High voltage, low voltage      ","   Chocolate     "));


        ListProfile.add(new ListProfile(" Jaan ki baazi lagane waala hota hai janbaaz ... Jeene ka hai marne" +
                " ka hai, apna hi andaz    ","    Janbaaz   "));


        ListProfile.add(new ListProfile(" Kabhi kabhi haar aur jeet mein farak karna mushkil ho jaata hai     ","   Chocolate     "));


        ListProfile.add(new ListProfile(" Aadmi ko khel wahi khelna chahiye ... Joh achchi tarah khelna aata ho    ","  Joshilaay      "));


        ListProfile.add(new ListProfile("  Chup rehna har mulzim ka haq hai ... Par chup rehna kisi bhi " +
                "desh ki police ko achcha nahi lagta    ","   Chocolate     "));


        ListProfile.add(new ListProfile(" Jis pyar ko samajhne ke liye shabdon ka sahara lena padta " +
                "hai na ... Woh pyar bahut kamzor hota hai     ","   Kala Bazaar     "));


        ListProfile.add(new ListProfile(" Sachchai aur nyay ki koi jaat ya paat nahi hoti     ","   Chocolate     "));


        ListProfile.add(new ListProfile("Aadmi jitna ganja hota hai, utna maaldaar hota hai      ","  Kala Bazaar      "));


        ListProfile.add(new ListProfile("  Truth and justice needs no lobby, no politics    ","  Chocolate      "));


        ListProfile.add(new ListProfile(" Aashiq se bada sust janwar maine aaj tak zindagi mein nahi dekha     ","    Karma     "));


        ListProfile.add(new ListProfile(" The difference between a lawyer and a computer is ... A computer gets twice as " +
                "intelligent and half as expensive, compared to a lawyer every year     ","  Chocolate      "));


        ListProfile.add(new ListProfile("Ek ek do do peg toh do do takke ke log peete hai ... Hum" +
                " toh poori botal peene waalon mein se hai      ","  Kishan Kanhaiya      "));


        ListProfile.add(new ListProfile("  Truth and justice need no caste, creed or nationality ... Let truth " +
                "and justice prevail   ","   Chocolate     "));


        ListProfile.add(new ListProfile(" Pehle din meena, doosre din tina, teesre din reena aur aaj yeh angina    ","   Loafer      "));


        ListProfile.add(new ListProfile("Abhe shamshaan ke bhuje huye koile      "," Deewane Mastana       "));


        ListProfile.add(new ListProfile(" Shatranj ke mohre wahi hai ... Magar baazi palat chuki hai    ","   Meri Jung     "));


        ListProfile.add(new ListProfile("  Abhe marre huye kauve ke pankh    ","   Deewane Mastana     "));


        ListProfile.add(new ListProfile("  Police asli ho ya nakli ... Aati saali hamesha late hi hai    ","    Musafir     "));


        ListProfile.add(new ListProfile("Bhagwan ka banaya hua sansar ek aisa bazaar hai .. Jahan insaan ka kiya hua" +
                " hisaab usse yahin chutta karke jaana padta hai      ","  Ghar Ho To Aaisa     "));


        ListProfile.add(new ListProfile("Thukai aur kamai mein ek se zyada zariya hona bahut zaroori hai ... Varna khud " +
                "ki thukti hai      ","      Musafir   "));


        ListProfile.add(new ListProfile("  Aurat zindagi mein sab kuch baant sakti hai ... Apna mangalsutra nahi   "," Gharwali Baharwali       "));


        lv= (ListView)findViewById(R.id.lv1);
        appAdapter=new anil_kapoor.MyAppAdapter(ListProfile,anil_kapoor.this);
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
                viewHolder1 = new anil_kapoor.MyAppAdapter.ViewHolder1();
                viewHolder1.bt1 = (Button) rowView.findViewById(R.id.bt1);
                viewHolder1.bt2 = (Button) rowView.findViewById(R.id.bt2);
                viewHolder1.txt1 = (TextView) rowView.findViewById(R.id.txt1);
                viewHolder1.text = (TextView) rowView.findViewById(R.id.text);

                rowView.setTag(viewHolder1);

            } else {
                viewHolder1 = (anil_kapoor.MyAppAdapter.ViewHolder1) convertView.getTag();
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
            Intent intent = new Intent(anil_kapoor.this,MainActivity.class);
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
