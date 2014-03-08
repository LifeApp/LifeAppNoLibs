package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class WrittenSamples extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_written_samples);
		
		Intent sender = getIntent();
		int extraData=sender.getExtras().getInt("selectedTab");
		
		TextView departuresScripts = (TextView) findViewById(R.id.written_samples_script);


		switch(extraData)
		{
			case 1:
				departuresScripts.setText(R.string.sample_script_family);
				break;
			case 2:
				departuresScripts.setText(R.string.sample_script_friends);
				break;
			case 3:
				departuresScripts.setText(R.string.sample_script_new_people);
				break;
			case 4:
				departuresScripts.setText(R.string.sample_script_professionals);
				break;
			default:
				departuresScripts.setText(R.string.sample_script_friends);
				break;			
		}	
		
	}
	
	public void setSelectedTab(int A)
	{
		selectedTab = A;
	}
	public int getSelectedTab()
	{
		return selectedTab;
	}
	
	public void setText()
	{
		TextView departuresScripts = (TextView) findViewById(R.id.written_samples_script);
		
		switch(selectedTab)
		{
			case 1:
				departuresScripts.setText(R.string.sample_script_family);
				break;
			case 2:
				departuresScripts.setText(R.string.sample_script_friends);
				break;
			case 3:
				departuresScripts.setText(R.string.sample_script_new_people);
				break;
			case 4:
				departuresScripts.setText(R.string.sample_script_professionals);
				break;
			default:
				departuresScripts.setText(R.string.sample_script_friends);
				break;			
		}		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.written_samples, menu);
		return true;
	}
	private int selectedTab;
}
