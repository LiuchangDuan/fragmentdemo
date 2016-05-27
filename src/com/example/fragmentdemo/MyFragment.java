package com.example.fragmentdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyFragment extends Fragment {
	
	private String aaa;

	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		//layout�����ļ�ת����View����
		
		/**
		 * resource:Fragment��Ҫ���صĲ����ļ�
		 * root:����layout�ĸ�ViewGroup
		 * attachToRoot:false �����ظ�ViewGroup
		 */
		View view = inflater.inflate(R.layout.fragment, container, false);
		TextView text = (TextView) view.findViewById(R.id.text);
		text.setText("��̬����Fragment");
		Button button = (Button) view.findViewById(R.id.button);
		button.setText("��ȡ����");
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String value = getAaa();
				Toast.makeText(getActivity(), "value = " + value, Toast.LENGTH_SHORT).show();
			}
		});
		
		return view;
	}
	
}
