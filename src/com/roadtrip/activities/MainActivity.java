package com.roadtrip.activities;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import com.roadtrip.R;
import com.roadtrip.R.layout;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());
	}
}
