package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public abstract class GreetingsScript extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_greetings_script);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.greetings_script, menu);
		return true;
	}

}
