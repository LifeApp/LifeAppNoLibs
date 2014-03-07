package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DosAndDontsScript extends Activity implements OnClickListener {
	
	public DosAndDontsScript()
	{
		super();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dos_and_donts_script);
		
		Button askingQButton = (Button) findViewById(R.id.asking_qs);
		askingQButton.setOnClickListener(this);		
		
		Button activeListeningButton = (Button) findViewById(R.id.active_listening);
		activeListeningButton.setOnClickListener(this);
		
		Button volumeButton = (Button) findViewById(R.id.volume);
		volumeButton.setOnClickListener(this);
		
		Button contentButton = (Button) findViewById(R.id.content);
		contentButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dos_and_donts_script, menu);
		return true;
	}
	
	public void onClick(View theView)
	{
		int id = theView.getId();
		if (id == R.id.asking_qs)
		{
			Intent writtenSampIntent = new Intent(this,AskingQuestions.class);
			startActivity(writtenSampIntent);
		}		
		else if (id == R.id.active_listening) 
		{
			Intent videoIntent = new Intent(this,ActiveListening.class);
			startActivity(videoIntent);
		}
		else if (id == R.id.volume)
		{
			Intent videoIntent = new Intent(this,Volume.class);
			startActivity(videoIntent);
		}
		else if (id == R.id.content)
		{
			Intent videoIntent = new Intent(this,Content.class);
			startActivity(videoIntent);
		}
		
	}

}
