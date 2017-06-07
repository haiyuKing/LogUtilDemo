package com.why.project.logutildemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.why.project.logutildemo.util.LogUtil;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LogUtil.w(TAG,"测试LogUtil打印日志");
	}
}
