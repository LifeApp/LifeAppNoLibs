package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeparturesScript extends Activity implements OnClickListener {
	
	public DeparturesScript()
	{
		super();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_departures_script);    
		
		Button writtenSampButton = (Button) findViewById(R.id.written_samples);
		writtenSampButton.setOnClickListener(this);		
		
		Button videoSampButton = (Button) findViewById(R.id.video_samples);
		videoSampButton.setOnClickListener(this);
		
		Button familyButton = (Button) findViewById(R.id.family_button);
		familyButton.setOnClickListener(this);
		
		Button friendsButton = (Button) findViewById(R.id.friends_button);
		friendsButton.setOnClickListener(this);
		
		Button newPeopleButton = (Button) findViewById(R.id.new_people_button);
		newPeopleButton.setOnClickListener(this);
		
		Button professionalsButton = (Button) findViewById(R.id.professionals_button);
		professionalsButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.departures_script, menu);
		return true;
	}
	
	public void onClick(View theView)
	{
		int id = theView.getId();
		ImageView departuresBG = (ImageView) findViewById(R.id.departures_background);
		TextView departuresScripts = (TextView) findViewById(R.id.written_samples_script);
		if (id == R.id.written_samples)
		{
			Intent writtenSampIntent = new Intent(this,WrittenSamples.class);
			startActivity(writtenSampIntent);
		}
		
		else if (id == R.id.video_samples) 
		{
			Intent videoIntent = new Intent(this,VideoSamples.class);
			startActivity(videoIntent);
		}
		else if (id == R.id.family_button) 
		{
			WrittenSamples samp = new WrittenSamples(id);
			departuresBG.setImageResource(R.drawable.family);
		}
		else if (id == R.id.friends_button) 
		{
			WrittenSamples samp = new WrittenSamples(id);
			departuresBG.setImageResource(R.drawable.friends);

		}
		else if (id == R.id.new_people_button) 
		{
			WrittenSamples samp = new WrittenSamples(id);
			departuresBG.setImageResource(R.drawable.new_people);

		}
		else if (id == R.id.professionals_button) 
		{
			WrittenSamples samp = new WrittenSamples(id);
			departuresBG.setImageResource(R.drawable.professionals);

		}		
		
	}

}
