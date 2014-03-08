package com.example.lifeappnolibs;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class WrittenSamples extends Activity {

	WrittenSamples(int A){selectedTab = A;}
	
	private int selectedTab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_written_samples);
		
		TextView departuresScripts = (TextView) findViewById(R.id.written_samples_script);
		
		switch(selectedTab)
		{
		case R.id.family_button:
			departuresScripts.setText(R.);
			
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.written_samples, menu);
		return true;
	}

}
