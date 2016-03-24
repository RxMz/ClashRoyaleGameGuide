package com.todaysfuture.thegameguideforclashroyale;

/**
 * Created by rishabh on 3/3/16.
 */


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by rishabh on 26/2/16.
 */
public class troopcard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.troopcard);
    }
    public void pekkacardclass(View view){
        setContentView(R.layout.pekkacard);
    }
    public void babydcardclass(View view)
    {
        setContentView(R.layout.dragcard);
    }
    public void golemcardclass(View view){
        setContentView(R.layout.golemcard);
    }
    public void minipekkacardclass(View view){
        setContentView(R.layout.minipekka);
    }
    public void witchcardclass(View view){
        setContentView(R.layout.witchcard);
    }
    public void giantskelcardclass(View view){
        setContentView(R.layout.giantskelcard);
    }
    public void princecardclass(View view){
        setContentView(R.layout.princecard);
    }
    public void skelarmycardclass(View view){
        setContentView(R.layout.skelarmycard);
    }
    public void minionhcardclass(View view){
        setContentView(R.layout.minionhcard);
    }
    public void wizardcardclass(View view){
        setContentView(R.layout.wizardcard);
    }
    public void hogridercardclass(View view){
        setContentView(R.layout.hogridercard);
    }
    public void giantcardclass(View view){
        setContentView(R.layout.giantcard);
    }
    public void bombercardclass(View view){
        setContentView(R.layout.bombercard);
    }
    public void archerscardclass(View view){
        setContentView(R.layout.archerscard);
    }
    public  void speargoblinscardclass(View view){
        setContentView(R.layout.speargoblinscard);
    }
    public void minionscardclass(View view){
        setContentView(R.layout.minionscard);
    }
    public void valkyriecardclass(View view){
        setContentView(R.layout.valkyriecard);
    }
    public void skeletonscardclass(View view){
        setContentView(R.layout.skeletonscard);
    }
    public void goblinscardclass(View view){
        setContentView(R.layout.goblinscard);
    }
    public void ballooncardclass(View view){
        setContentView(R.layout.balloonscard);
    }
    public void knightcardclass(View view){
        setContentView(R.layout.knightcard);
    }
    public void goblinbarrelcardclass(View view){
        setContentView(R.layout.goblinbarrelcard);
    }
    public void musketeercardclass(View view){
        setContentView(R.layout.musketeercard);
    }
    public void princesscardclass(View view){
        setContentView(R.layout.princesscard);
    }
    public void royalgiantcardclass(View view){
        setContentView(R.layout.royalgiantcard);
    }
    public void icewizardcardclass(View view){
        setContentView(R.layout.icewizardcard);
    }
    public void darkprincecardclass(View view){
        setContentView(R.layout.darkprincecard);
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

}
