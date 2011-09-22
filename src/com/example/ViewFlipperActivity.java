package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ViewFlipperActivity extends Activity {

	private ViewFlipper vp = null;
	private Button pre = null;
	private Button auto = null;
	private Button nxt = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		vp = (ViewFlipper) findViewById(R.id.flipper);
		
		pre = (Button) findViewById(R.id.pre);
		pre.setOnClickListener(btnClickListener);
		
		auto = (Button) findViewById(R.id.auto);
		auto.setOnClickListener(btnClickListener);
		
		nxt = (Button) findViewById(R.id.nxt);
		nxt.setOnClickListener(btnClickListener);
	}
	
	private OnClickListener btnClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			if(pre.getId() == v.getId()){
				vp.showPrevious();
			}else if(auto.getId() == v.getId()){
				vp.startFlipping();
			}else if(nxt.getId() == v.getId()){
				vp.showNext();
			}
			
		}
	};
}