package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public abstract class GreetingsScript extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_greetings_script);
		
		Button writtenSampButton = (Button) findViewById(R.id.written_samples);
		writtenSampButton.setOnClickListener((android.view.View.OnClickListener) this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.greetings_script, menu);
		return true;
	}

	public void onClick(View theView)
	{
		int id = theView.getId();
		
		if(id == R.id.written_samples)
		{
			Intent writtenIntent = new Intent(this,WrittenSamples.class);
			startActivity(writtenIntent);
		}
		
		
	}

}
