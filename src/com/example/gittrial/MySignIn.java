package com.example.gittrial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MySignIn extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signin);
		
		final EditText et1 = (EditText) findViewById(R.id.editText1);
		final EditText et2 = (EditText) findViewById(R.id.editText2);
		Button b = (Button) findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MySignIn.this,MainActivity.class);
				intent.putExtra("username", et1.getText().toString());
				intent.putExtra("password",et2.getText().toString());
			}
			
		});
		

 }
} 