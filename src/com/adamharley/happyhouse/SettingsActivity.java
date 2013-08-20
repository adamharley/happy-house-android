package com.adamharley.happyhouse;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {
	// TODO Pass volume changes back to the main activity immediately
	// http://developer.android.com/guide/topics/ui/settings.html#Listening
	
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        addPreferencesFromResource(R.xml.preferences);
    }
}