package com.test.progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class VerticalProgressbarActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ProgressBar progress = (ProgressBar) findViewById(R.id.t320100_mypb);
        progress.setProgress(50);
        
    }
}
