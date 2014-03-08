package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class WrittenSamples extends Activity {
	
	private int selectedTab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_written_samples);
		this.setText(selectedTab);
	}
	
	public void setSelectedTab(int A)
	{
		selectedTab = A;
	}
	
	public void setText(int tab)
	{
		TextView departuresScripts = (TextView) findViewById(R.id.written_samples_script);
		
		switch(tab)
		{
			case R.id.family_button:
				departuresScripts.setText(R.string.sample_script_family);
				break;
			case R.id.friends_button:
				departuresScripts.setText(R.string.sample_script_friends);
				break;
			case R.id.new_people_button:
				departuresScripts.setText(R.string.sample_script_new_people);
				break;
			case R.id.professionals_button:
				departuresScripts.setText(R.string.sample_script_professionals);
				break;
			default:
				departuresScripts.setText(R.string.sample_script_long);
				break;			
				
		}		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.written_samples, menu);
		return true;
	}

}
