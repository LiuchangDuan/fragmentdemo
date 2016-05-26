package com.example.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;


public class MainActivity extends Activity implements OnCheckedChangeListener {
	
	private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        group = (RadioGroup) findViewById(R.id.radiogroup);
        group.setOnCheckedChangeListener(this);
    }

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.first:
			break;
		case R.id.second:
			break;
		case R.id.third:
			break;
		case R.id.fourth:
			break;
		}
	}
}
