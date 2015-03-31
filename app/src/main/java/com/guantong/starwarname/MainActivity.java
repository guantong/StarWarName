package com.guantong.starwarname;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void generateNewName(View view){
        // Grab the reference to EditText fields on the layout
        EditText input1 = (EditText) findViewById(R.id.fName);
        EditText input2 = (EditText) findViewById(R.id.lName);
        EditText input3 = (EditText) findViewById(R.id.mName);
        EditText input4 = (EditText) findViewById(R.id.cName);
        EditText input5 = (EditText) findViewById(R.id.cBrand);
        // Then we grab the input values
        String fName = input1.getText().toString();
        String lName = input2.getText().toString();
        String mName = input3.getText().toString();
        String cName = input4.getText().toString();
        String cBrand = input5.getText().toString();
        // forming new star war names
        String newFName = fName.substring(0,3) + lName.substring(0,2);
        String newLName = mName.substring(0,2) + cName.substring(0,3);
        int length = lName.length();
        String newPName = lName.substring(length - 2) + cBrand;
        //pass to starwarname object
        StarWarName swn = new StarWarName(newFName, newLName, newPName);
        //pass to intent
        Intent intent = new Intent(this, DisplayNewName.class);
        intent.putExtra("StarWarName", swn);
        startActivity(intent);
    }
}
