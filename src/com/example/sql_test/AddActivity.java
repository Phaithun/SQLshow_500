package com.example.sql_test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends Activity {
	private Button btn_adddata;
	private EditText edt_name, edt_tel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add);
		btn_adddata = (Button) findViewById(R.id.btn_adddata);
		btn_adddata.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SaveData();
			}

		});
	}

	private void SaveData() {
		// TODO Auto-generated method stub
		edt_name = (EditText) findViewById(R.id.txt_name);
		edt_tel = (EditText) findViewById(R.id.txt_tel);
		MyDBclass myDBclass = new MyDBclass(this);

		long saveStatus = myDBclass.InsertData(edt_name.getText().toString(),
				edt_tel.getText().toString());
		if (saveStatus <= 0) {
			Log.d("Error Save", "ERROr!!!!!");
		}
		Toast.makeText(getApplicationContext(), "add data sucessfuly!!!!!",
				Toast.LENGTH_SHORT).show();
	}
}
