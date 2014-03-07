package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Scripts_home extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scripts_home);
		
		Button greetingsButton = (Button) findViewById(R.id.greetings_button);
		greetingsButton.setOnClickListener(this);
		
		Button departureButton = (Button) findViewById(R.id.departures_button);
		departureButton.setOnClickListener(this);	
		
		Button disagreementsButton = (Button) findViewById(R.id.disagreements_button);
		disagreementsButton.setOnClickListener(this);
		
		Button dosAndDontsButton = (Button) findViewById(R.id.dos_and_donts_button);
		dosAndDontsButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scripts_home, menu);
		return true;
	}

	@Override
	public void onClick(View theView) 
	{
		int id = theView.getId();
		if (id == R.id.greetings_button)
		{
			Intent greetIntent = new Intent(this,GreetingsScript.class);
			startActivity(greetIntent);
		} 
		else if (id == R.id.departures_button) 
		{
			Intent departIntent = new Intent(this,DeparturesScript.class);
			startActivity(departIntent);
		}
		else if (id == R.id.disagreements_button)
		{
			Intent disagreeIntent = new Intent(this,DisagreementsScript.class);
			startActivity(disagreeIntent);
		}
		else if (id == R.id.dos_and_donts_button)
		{
			Intent dosAndDontsIntent = new Intent(this,DosAndDontsScript.class);
			startActivity(dosAndDontsIntent);
		}
		else
		{
			Intent homeIntent = new Intent(this,Scripts_home.class);
			startActivity(homeIntent);
		}
		
	}

}
