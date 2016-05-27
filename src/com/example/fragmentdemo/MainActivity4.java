package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentdemo.MyFragment5.MyListener;

public class MainActivity4 extends Activity implements MyListener {

	private EditText editText;
	private Button send;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main4);
		editText = (EditText) findViewById(R.id.editText);
		send = (Button) findViewById(R.id.send);
		
		send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String text = editText.getText().toString();
				MyFragment5 fragment5 = new MyFragment5();
				Bundle bundle = new Bundle();
				bundle.putString("name", text);
				fragment5.setArguments(bundle);
				FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction beginTransaction = 
						fragmentManager.beginTransaction();
				beginTransaction.add(R.id.layout, fragment5, "fragment5");
				beginTransaction.commit();
				Toast.makeText(MainActivity4.this, "��Fragment��������" + text, Toast.LENGTH_SHORT).show();
			}
		});
		
		FragmentManager fragmentManager = getFragmentManager();
		Fragment findFragmentById = fragmentManager.findFragmentById(R.id.frag);
		MyFragment frag = (MyFragment) findFragmentById;
		frag.setAaa("fragment��̬��ֵ");
		
	}

	@Override
	public void thank(String code) {
		Toast.makeText(MainActivity4.this, "�ѳɹ����յ�" + code + ", ������", 
				Toast.LENGTH_SHORT).show();
	}
	
}
