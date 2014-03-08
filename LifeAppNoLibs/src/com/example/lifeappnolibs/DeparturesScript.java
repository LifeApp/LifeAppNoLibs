package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class DeparturesScript extends Activity implements OnClickListener {
	
	public DeparturesScript()
	{
		super();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_test);
		
        final TabHost tabHost = (TabHost) findViewById(R.id.tabhost);
        tabHost.setup();
        
        TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("Family", null);
        tabHost.addTab(spec1);	
        
        TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("Friends", null);
        tabHost.addTab(spec2);	
        
        TabSpec spec3 = tabHost.newTabSpec("tab3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("New people", null);
        tabHost.addTab(spec3);	
        
        TabSpec spec4 = tabHost.newTabSpec("tab4");
        spec4.setContent(R.id.tab4);
        spec4.setIndicator("Professionals", null);
        tabHost.addTab(spec4);      
        /*
		
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
		*/
	}
	/*

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
			
			departuresBG.setImageResource(R.drawable.family);
		}
		else if (id == R.id.friends_button) 
		{
			
			departuresBG.setImageResource(R.drawable.friends);

		}
		else if (id == R.id.new_people_button) 
		{
			departuresBG.setImageResource(R.drawable.new_people);

		}
		else if (id == R.id.professionals_button) 
		{
			departuresBG.setImageResource(R.drawable.professionals);

		}	
		
	}
	*/

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
}
