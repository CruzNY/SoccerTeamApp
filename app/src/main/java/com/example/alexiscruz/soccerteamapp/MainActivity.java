package com.example.alexiscruz.soccerteamapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;

import static android.R.attr.breadCrumbShortTitle;
import static android.R.attr.checked;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> playerlist = new ArrayList<String>();
    String t1="Team 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playerlist.add(t1);
    }
    public void addPlayer(View view){
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.albert_cb:
                if (checked){
                    playerlist.add("Albert");
                }
                else{
                    playerlist.remove("Albert");
                }
                break;
            case R.id.alex_cb:
                if (checked){
                    playerlist.add("Alex");
                }
                else playerlist.remove("Alex");
                break;
            case R.id.angel_cb:
                if(checked){
                    playerlist.add("Angel");
                }
                else playerlist.remove("Agnel");
                break;
            case R.id.chris_cb:
                if (checked){
                    playerlist.add("Chris");
                }
                else playerlist.remove("Chris");
                break;
            case R.id.david_cb:
                if (checked){
                    playerlist.add("David");
                }
                else playerlist.remove("David");
                break;
            case R.id.downy_cb:
                if (checked){
                    playerlist.add("Downy");
                }
                else playerlist.remove("Downy");
                break;
            case R.id.edward_cb:
                if (checked){
                    playerlist.add("Edward");
                }
                else playerlist.remove("Edward");
                break;
            case R.id.erik_cb:
                if (checked){
                    playerlist.add("Erik");
                }
                else playerlist.remove("Erik");
                break;
            case R.id.gabby_cb:
                if (checked){
                    playerlist.add("Gabby");
                }
                else playerlist.remove("Gabby");
                break;
            case R.id.jesus_cb:
                if (checked){
                    playerlist.add("Jesus");
                }
                else playerlist.remove("Jesus");
                break;
            case R.id.jose_cb:
                if (checked){
                    playerlist.add("Jose");
                }
                else playerlist.remove("Jose");
                break;
            case R.id.omar_cb:
                if (checked){
                    playerlist.add("Omar");
                }
                else playerlist.remove("Omar");
                break;
            case R.id.skips_cb:
                if (checked){
                    playerlist.add("Skips");
                }
                else playerlist.remove("Skips");
                break;
            case R.id.rodi_cb:
                if (checked){
                    playerlist.add("Rodi");
                }
                else playerlist.remove("Rodi");
                break;
            case R.id.roy_cb:
                if (checked){
                    playerlist.add("Roy");
                }
                else playerlist.remove("Roy");
                break;
            case R.id.raul_cb:
                if (checked){
                    playerlist.add("Raul");
                }
                else playerlist.remove("Raul");
                break;
        }
    }
    public void submitPlayer(View view){
        //Creating intent for new screen or activity

        Intent i = new Intent(this,Main2Activity.class);
        i.putStringArrayListExtra("playerArray", playerlist);
        startActivity(i);
    }
}
