package com.todaysfuture.thegameguideforclashroyale;

/**
 * Created by rishabh on 3/3/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by rishabh on 29/2/16.
 */
public class spellcard extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spellcard);
    }
    public void mirrorcardclass(View view){
        setContentView(R.layout.mirrorcard);
    }
    public void zapcardclass(View view){
        setContentView(R.layout.zapcard);
    }
    public void goblinbarrelcardclass(View view){
        setContentView(R.layout.goblinbarrelcard);
    }
    public void rocketcardclass(View view){
        setContentView(R.layout.rocketcard);
    }
    public void ragecardclass(View view)
    {
        setContentView(R.layout.ragecard);
    }
    public void lightningcardclass(View view){
        setContentView(R.layout.lightningcard);
    }
    public void freezecardclass(View view){
        setContentView(R.layout.freezecard);
    }
    public void fireballcardclass(View view){
        setContentView(R.layout.fireball);
    }
    public void arrowscardclass(View view){
        setContentView(R.layout.arrowscard);
    }
    public void poisoncardclass(View view){
        setContentView(R.layout.poisoncard);
    }

}
