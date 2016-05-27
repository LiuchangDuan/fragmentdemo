package com.example.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment3 extends Fragment {
	
	private TextView tv;
	
	//����Fragment-->��Ļ����-->��Ļ����-->
	//�л���������Fragment-->�ص�����-->�ص�Ӧ��-->�˳�Fragment

	/**
	 * ÿ�δ����������Fragment��View���ʱ�ص��÷���
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment2, container, false);
		TextView tv = (TextView) view.findViewById(R.id.text);  
		tv.setText("First Fragment");
		Log.i("Main", "Fragment1---onCreateView()");
		return view;
	}
	
	/**
	 * ��Fragment����ӵ�Activity��ʱ���ص��������������ֻ����һ��
	 */
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.i("Main", "Fragment1---onAttach()");
	}
	
	/**
	 * ����Fragmentʱ��ص���ֻ�����һ��
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Main", "Fragment1---onCreate()");
	}
	
	/**
	 * ��Fragment���ڵ�Activity������ɺ����
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.i("Main", "Fragment1---onActivityCreated()");
	}
	
	/**
	 * ����Fragment
	 */
	@Override
	public void onStart() {
		super.onStart();
		Log.i("Main", "Fragment1---onStart()");
	}
	
	/**
	 * �ָ�Fragmentʱ�ᱻ�ص�������onStart()��������һ�������onResume()����
	 */
	@Override
	public void onResume() {
		super.onResume();
		Log.i("Main", "Fragment1---onResume()");
	}
	
	/**
	 * ��ͣFragment
	 */
	@Override
	public void onPause() {
		super.onPause();
		Log.i("Main", "Fragment1---onPause()");
	}
	
	/**
	 * ֹͣFragment
	 */
	@Override
	public void onStop() {
		super.onStop();
		Log.i("Main", "Fragment1---onStop()");
	}
	
	/**
	 * ����Fragment��������View���ʱ
	 */
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.i("Main", "Fragment1---onDestroyView()");
	}
	
	/**
	 * ����Fragmentʱ�ᱻ�ص�
	 */
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.i("Main", "Fragment1---onDestroy()");
	}
	
	/**
	 * Fragment��Activity��ɾ��ʱ��ص��÷����������������ֻ�����һ��
	 */
	@Override
	public void onDetach() {
		super.onDetach();
		Log.i("Main", "Fragment1---onDetach()");
	}
	
}
