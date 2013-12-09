package com.example.gittrial;

import android.os.Bundle;
import android.view.Menu;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {

	private FragmentTabHost tabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.landing);
		tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
		tabHost.setup(this,getSupportFragmentManager(),R.id.realtabcontent);
		
		tabHost.addTab(tabHost.newTabSpec("News").setIndicator("News"),NewsTabFragment.class, null);
		tabHost.addTab(tabHost.newTabSpec("Events").setIndicator("Events"),EventsTabFragment.class, null);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
