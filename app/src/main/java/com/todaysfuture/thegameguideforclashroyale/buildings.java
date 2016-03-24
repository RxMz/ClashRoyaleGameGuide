package com.todaysfuture.thegameguideforclashroyale;

/**
 * Created by rishabh on 3/3/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by rishabh on 29/2/16.
 */
public class buildings extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildings);
    }
    public void xbowcardclass(View view){
        setContentView(R.layout.xbowcard);
    }
    public void elixercollectorcardclass(View view){
        setContentView(R.layout.elixercollectorcard);
    }
    public void teslacardclass(View view){
        setContentView(R.layout.teslacard);
    }
    public void mortarcardclass(View view){
        setContentView(R.layout.mortarcard);
    }
    public void infernotowercardclass(View view){
        setContentView(R.layout.infernocard);
    }
    public void tombstonecardclass(View view){
        setContentView(R.layout.tombstonecard);
    }
    public void goblinhutcardclass(View view){
        setContentView(R.layout.goblinhutcard);
    }
    public void barbarianhutcardclass(View view){
        setContentView(R.layout.barbarianhutcard);
    }
    public void bombtowercardclass(View view){
        setContentView(R.layout.bombtowercard);
    }
    public void canoncardclass(View view){
        setContentView(R.layout.canoncard);
    }
}

