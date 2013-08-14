package com.adamharley.happyhouse;

import android.app.Activity;
import android.os.Bundle;
//import android.os.Handler;
//import android.widget.ImageView;

public class AboutActivity extends Activity {
/*
	private boolean imagesSwapped = false;
	private Handler ticker = new Handler();
	private static int msecsPerFrame = 200;
	private Runnable tick = new Runnable() {

		@Override
		public void run() {
			ticker.removeCallbacks(this);
			
			ImageView angel = (ImageView) findViewById(R.id.about_angel);
			ImageView star = (ImageView) findViewById(R.id.about_star);
			
			if (imagesSwapped) {
				angel.setImageResource(R.drawable.member_293);
				star.setImageResource(R.drawable.member_302);
			} else {
				angel.setImageResource(R.drawable.member_294);
				star.setImageResource(R.drawable.member_303);
			}
			
			imagesSwapped = !imagesSwapped;
			ticker.postDelayed(this, msecsPerFrame);
		}
		
	};
*/	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        
//		ticker.postDelayed(tick, msecsPerFrame);
    }
	
}
