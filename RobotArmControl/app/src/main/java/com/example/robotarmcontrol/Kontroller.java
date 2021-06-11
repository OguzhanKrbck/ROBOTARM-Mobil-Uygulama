package com.example.robotarmcontrol;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class Kontroller extends AppCompatActivity implements View.OnClickListener {
    int a,b,c,d=0;
    int degistirilecekDeger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontroller);

        ImageButton button1 = findViewById(R.id.button1);
        ImageButton button2 = findViewById(R.id.button2);
        ImageButton button3 = findViewById(R.id.button3);
        ImageButton button4 = findViewById(R.id.button4);
        ImageButton button5 = findViewById(R.id.button5);
        ImageButton button6 = findViewById(R.id.button6);
        ImageButton button7 = findViewById(R.id.button7);
        ImageButton button8 = findViewById(R.id.button8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        getResetV1();
        getResetV2();
        getResetV3();
        getResetV4();
    }

    @Override
    public void onClick( View v) {
        switch (v.getId()){
            case R.id.button1:
                a -= 20;
                getWebservice();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                 a +=20;
                getWebservice();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                b -= 20;
                getWebservice1();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                b += 20;
                getWebservice1();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                c -= 20;
                getWebservice2();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                c += 20;
                getWebservice2();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                d -= 20;
                getWebservice3();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                d += 20;
                getWebservice3();
                //Toast.makeText(this, "Deger degistirildi", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void getResetV1(){
        OkHttpClient client = new OkHttpClient();
        String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=0";
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                }
            }
        });
    }
    public void getResetV2(){
        OkHttpClient client = new OkHttpClient();
        String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=0";
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                }
            }
        });
    }
    public void getResetV3(){
        OkHttpClient client = new OkHttpClient();
        String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=0";
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                }
            }
        });
    }
    public void getResetV4(){
        OkHttpClient client = new OkHttpClient();
        String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=0";
        Request request = new Request.Builder().url(url).build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                }
            }
        });
    }
    public void getWebservice(){

        if (a < 0){
            a = 0;
        }
        else if (a > 180){
            a = 180;
        }
        else if (a == 0){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=0";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 20){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=20";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 40){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=40";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 60){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=60";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 80){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=80";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 100){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=100";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 120){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=120";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 140){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=140";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a == 160){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=160";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (a ==180){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V1?value=180";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
    }
    public void getWebservice1(){

        if (b < 0){
            b = 0;
        }
        else if (b > 180){
            b = 180;
        }
        else if (b == 0){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=0";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 20){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=20";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 40){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=40";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 60){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=60";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 80){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=80";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 100){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=100";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 120){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=120";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 140){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=140";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b == 160){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=160";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (b ==180){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V2?value=180";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
    }
    public void getWebservice2(){

        if (c < 0){
            c = 0;
        }
        else if (c > 180){
            c = 180;
        }
        else if (c == 0){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=0";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 20){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=20";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 40){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=40";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 60){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=60";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 80){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=80";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 100){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=100";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 120){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=120";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 140){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=140";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c == 160){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=160";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (c ==180){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V3?value=180";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
    }
    public void getWebservice3(){

        if (d < 0){
            d = 0;
        }
        else if (d > 180){
            d = 180;
        }
        else if (d == 0){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=0";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 20){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=20";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 40){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=40";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 60){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=60";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 80){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=80";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 100){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=100";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 120){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=120";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 140){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=140";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d == 160){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=160";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
        else if (d ==180){
            OkHttpClient client = new OkHttpClient();
            String url ="http://blynk-cloud.com/_kYTn3e6vja6ER4VmkOhnGhtBSo1Ur-7/update/V4?value=180";
            Request request = new Request.Builder().url(url).build();

            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                    }
                }
            });
        }
    }
}