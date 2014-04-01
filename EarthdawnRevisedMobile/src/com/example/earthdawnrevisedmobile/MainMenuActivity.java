package com.example.earthdawnrevisedmobile;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainMenuActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		NamegiverListContent.loadNamegivers(getResources());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);
		return true;
	}

    /** Called when the user clicks the New Character button */
    public void newCharacter(View v) {
		// Starts the new character activity
		Intent intent = new Intent("android.intent.action.CHARACTERCREATORACTIVITY");
		startActivity(intent);
    }	
	
    /** Called when the user clicks the Load Character button */
    public void loadCharacter(View v) {
		// Starts the load character activity
		//Intent intent = new Intent("android.intent.action.CHARACTERCHOOSERACTIVITY");
		//startActivity(intent);
    }    

    /** Called when the user clicks the Library Reference button */
    public void libraryMenu(View v) {
		// Starts the library menu activity
		Intent intent = new Intent("android.intent.action.LIBRARYMENUACTIVITY");
		startActivity(intent);
    }    
    
    /** Called when the user clicks the Library Reference button */
    public void helpMenu(View v) {
		// Starts the help menu activity
		//Intent intent = new Intent("android.intent.action.HELPMENUACTIVITY");
		//startActivity(intent);
    }    
    
}
