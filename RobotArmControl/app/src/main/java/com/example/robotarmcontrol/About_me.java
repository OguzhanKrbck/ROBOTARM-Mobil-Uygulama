package com.example.robotarmcontrol;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class About_me extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Element adsElement = new Element();
        adsElement.setTitle("AboutMe");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription("Merhaba geleceğimizde önemli bir rol alacağını düşündüğüm " +
                        "IoT teknolojileriyle ilgili yaptığım projede" +
                        "aynı ağda bulunan cihazların iletişimi üzerinde çalıştım. " +
                        "Sonuç olarakta mobil cihazınız üzerinden kontrol edebileceğiniz bir " +
                        "robot el ürettim. ")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Connect with me")
                .addEmail("krbckoguzhan@gmail.com")
                .addGitHub("OguzhanKrbck")
                .addYoutube("UCjuoZQp1EDNJDbR7fMKzb6Q")
                .addItem(createCopyRight())
                .create();

        setContentView(aboutPage);
    }

    private Element createCopyRight() {
        Element copyright = new Element();
        String copyrightString = String.format("Copyright %d by Oğuzhan Karabacak", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(About_me.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}