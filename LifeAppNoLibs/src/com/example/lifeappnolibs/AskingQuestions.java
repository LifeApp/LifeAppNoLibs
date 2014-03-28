package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AskingQuestions extends Activity implements OnClickListener {
	
	public AskingQuestions()
	{
		super();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_asking_questions);
		
		Button scripts = (Button) findViewById(R.id.scripts);
        scripts.setOnClickListener(this);		
		
		Button activeListeningButton = (Button) findViewById(R.id.videos);
		activeListeningButton.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.asking_questions, menu);
		return true;
	}
	
	public void onClick(View theView)
	{
		int id = theView.getId();
		if (id == R.id.scripts)
		{
			Intent scriptsIntent = new Intent(this,Scripts.class);
			startActivity(scriptsIntent);
		}		
		
		else 
		{
			
		}
		
	}

}