package com.example.robotarmcontrol;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Instructions extends AppCompatActivity {

    ListView listView;
    String[] programName = {"Arduino", "Thingiverse", "Instructables", "Blynk", "BlynkAPI"};
    String[] programDescription = {"Arduino Docs", "Açık kaynaklı donanım tasarımları ", "Kullanıcılar tarafından yapılmış  DIY projeleri ve Kart Datasheet'leri", "Blynk Docs", "BlynkAPI Docs"};
    int[] programImages = {R.drawable.arduinoicon,  R.drawable.thingiverseicon, R.drawable.instructablesicon,R.drawable.blynkimage, R.drawable.blynkimage};
    String[] urls = {"https://www.arduino.cc/en/main/docs",
                     "https://www.thingiverse.com/thing:1015238",
                     "https://www.instructables.com/NodeMCU-ESP8266-Details-and-Pinout/",
                     "https://docs.blynk.cc/",
                     "https://blynkapi.docs.apiary.io/#"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        listView = findViewById(R.id.listview);

        myAdapter adapter = new myAdapter(this, programName, programDescription, programImages,urls);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(openLinksIntent);
                }
                if (position == 1){
                    Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(openLinksIntent);
                }
                if (position == 2){
                    Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(openLinksIntent);
                }
                if (position == 3){
                    Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(openLinksIntent);
                }
                if (position == 4){
                    Intent openLinksIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urls[position]));
                    startActivity(openLinksIntent);
                }
            }
        });
    }

    class myAdapter extends ArrayAdapter<String> {

            Context context;
            String[] _programName;
            String[] _programDescription;
            int[] _programImages;
            String[] urls;
            public myAdapter(Context c, String[] AprogramName, String[] AprogramDescription, int[] AprogramImages, String[] urls) {
                super(c, R.layout.row, R.id.main_title, programName);
                this.context = c;
                this._programName = AprogramName;
                this._programDescription = AprogramDescription;
                this._programImages = AprogramImages;
                this.urls = urls;
            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.row, parent, false);
                ImageView images = row.findViewById(R.id.main_image);
                TextView mTitle = row.findViewById(R.id.main_title);
                TextView sTitle = row.findViewById(R.id.sub_title);

                images.setImageResource(_programImages[position]);
                mTitle.setText(_programName[position]);
                sTitle.setText(_programDescription[position]);
                return row;
            }
    }
}
