package com.example.fragmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends Activity {
	
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		Button button = (Button) findViewById(R.id.button);
		tv = (TextView) findViewById(R.id.text);
		button.setText("�ı�");
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tv.setText("TextView�ı���");
			}
		});
	}
	
}
