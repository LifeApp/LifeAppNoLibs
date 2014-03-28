package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActiveListening extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_active_listening);
		
		
		
		Button wit = (Button) findViewById(R.id.what_is_it);
        wit.setOnClickListener(this);		
		
		Button hilButton = (Button) findViewById(R.id.hil);
		hilButton.setOnClickListener(this);
		
		Button vcButton = (Button) findViewById(R.id.video_clips);
		vcButton.setOnClickListener(this);		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.active_listening, menu);
		return true;
	}
	
	
	public void onClick(View theView)
	{
		int id = theView.getId();
		if (id == R.id.what_is_it)
		{
			Intent witIntent = new Intent(this,WhatIsIt.class);
			startActivity(witIntent);
		}		
		
		else if(id==R.id.hil)
		{
			Intent hilIntent = new Intent(this,HowDoIActivelyListen.class);
			startActivity(hilIntent);
		}
		else
		{
			
		}	
		
	}

	
	
	
	
	
	
	
	
	

}
