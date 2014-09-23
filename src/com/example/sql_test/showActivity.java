package com.example.sql_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class showActivity extends Activity {

	private ListView listview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		listview = (ListView) findViewById(R.id.listView1);
		MyDBclass myDBclass = new MyDBclass(this);
		ArrayList<HashMap<String, String>> arrayList = myDBclass.SelectAllData();
		
		SimpleAdapter adapter;
		adapter = new SimpleAdapter(showActivity.this, arrayList, R.layout.show_item, new String[] {"MemberID","Name","Tel"}, 
				new int[] {R.id.colmember,R.id.colname,R.id.coltel});
		listview.setAdapter(adapter);
	}

}
