package com.example.gittrial;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MyListView extends ListActivity{
	
	String[] items = {"Item 1","Item 2","Item 3","Item 4","Item 5"};
    ListView l;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylistview);
		
		l=getListView();
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		
		l.setAdapter(adapter);
		
	}		
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		switch(position){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:startActivity(new Intent(MyListView.this,MainActivity.class));
		
	}
	}
}
	
	