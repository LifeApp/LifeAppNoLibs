package com.example.lifeappnolibs;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Volume extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_volume);
		
		
		Button iab = (Button) findViewById(R.id.iab);
        iab.setOnClickListener(this);		
		
		Button vc= (Button) findViewById(R.id.vc);
		vc.setOnClickListener(this);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.volume, menu);
		return true;
	}
	
	
	
	
	
	public void onClick(View theView)
	{
		int id = theView.getId();
		if (id == R.id.iab)
		{
			Intent witIntent = new Intent(this,ItsAllAboutBalance.class);
			startActivity(witIntent);
		}		
		
		else 
		{
				}

	
	
	
	}
}

