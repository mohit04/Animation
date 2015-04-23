package com.example.whatsthat_animation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		final Animation animBounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
		final Animation animfade = AnimationUtils.loadAnimation(this, R.anim.fadein);
		final TextView bt = (TextView)findViewById(R.id.button1);
		bt.startAnimation(animfade);
		final ImageView image = (ImageView)findViewById(R.id.image);
		image.startAnimation(animBounce);
	     

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
