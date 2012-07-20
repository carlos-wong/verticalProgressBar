package com.test.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.view.View.OnClickListener;

public class VerticalProgressbarActivity extends Activity {
	ProgressBar progress;
	static int i = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		progress = (ProgressBar) findViewById(R.id.t320100_mypb);
		Button setBtn = (Button) findViewById(R.id.button1);
		progress.setProgress(100);

		setBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i = i + 10;
				progress.setProgress(i);
			}
		});
		// progress.setProgress(50);

	}
}
