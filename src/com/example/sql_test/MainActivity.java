package com.example.sql_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn_insert,btn_show;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		MyDBclass myDBclass = new MyDBclass(this);
		myDBclass.getWritableDatabase();
		btn_insert = (Button) findViewById(R.id.btn_insert);
		btn_show = (Button) findViewById(R.id.btn_show);
		btn_insert.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (v == btn_insert) {
					Intent add = new Intent(MainActivity.this,
							AddActivity.class);
					startActivity(add);
				}
			}
		});
		
		btn_show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent show = new Intent(MainActivity.this,
						showActivity.class);
				startActivity(show);
			}
		});
	}

}
