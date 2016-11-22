package com.prac3.a154405a.practtestq2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {
    Menu myMenu = null;
    Spinner spContactMode;
    int subMenuBase = 100;
    ArrayAdapter<CharSequence> adapter;
    String [] strMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spContactMode = (Spinner) findViewById(R.id.spContactMode);
        Resources myRes = this.getResources();
        strMode = myRes.getStringArray(R.array.Mode);
        adapter = ArrayAdapter.createFromResource(this, R.array.Mode, android.R.layout.simple_spinner_dropdown_item);
        spContactMode.setAdapter(adapter);

        spContactMode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), strMode[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(parent.getContext(), "None", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        this.myMenu = menu;
       // addRegularMenuItems(menu);
       // addSubMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId() == R.id.Login){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.Register){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.Hide){
            this.myMenu.setGroupVisible(R.id.hide, false);

        }
        else if(item.getItemId() == R.id.Show){
            this.myMenu.setGroupVisible(R.id.hide, true);

        }
        else if(item.getItemId() == R.id.ManagePIN){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.ChangePIN){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.ForgotPIN){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.About){
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.Quit){
            finish();
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return true;
    }











//    private void addRegularMenuItems(Menu menu){
//        int index = Menu.FIRST;
//        menu.add(index, index, 0, "Login");
//        menu.add(index, index+1, 1, "Register");
////        menu.add(index, index+2, 2, "Manage PIN");
//        menu.add(index, index+3, 3, "About");
//    }
//    private void addSubMenu(Menu menu){
//        SubMenu sm = menu.addSubMenu(subMenuBase, subMenuBase + 1, 1, "Manage PIN");
//        sm.add(subMenuBase, subMenuBase + 2, subMenuBase + 2, "Change PIN");
//        sm.add(subMenuBase, subMenuBase + 3, subMenuBase + 3, "Forgot PIN");
//    }



}
