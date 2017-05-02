package com.example.exam;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {

	ListView lv;
	ArrayList<String> list=new ArrayList<String>();
	MyAdapter adapter;
	EditText txtName;
	EditText txtnumber;
	AlertDialog.Builder builder;
	AlertDialog dialog;
	//EditText txtName;
	//private Object txtName, number;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list.add("Alpha,Bravo 09077527866");
        list.add("Alpha,Bravo 09077527866");
        list.add("Alpha,Bravo 09077527866");
        //list.add("Alpha,Bravo 09077527866");
        //list.add("Alpha,Bravo 09077527866");
        //list.add("Alpha,Bravo 09077527866");
        
        
        this.lv=(ListView) this.findViewById(R.id.listView1);
        //this.Iv.setOnItemClickListener(this);
        adapter=new MyAdapter(this,list);
        this.lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
   
		
    public boolean onOptionsItemSelected(MenuItem item) {
	
    	LinearLayout layout= new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.addView(txtName);
		layout.addView(txtnumber);
		
		txtName = new EditText(this);
		txtName.setHint("Enter Name:");
		txtName.setPadding(10,10,10,10);
	txtnumber = new EditText(this);
	txtnumber.setHint("Enter Phone:");
	txtnumber.setPadding(10,10,10,10);
		
	layout.addView(txtName);
	layout.addView(txtnumber);
	
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Add Item");
		builder.setView(layout);
		builder.setPositiveButton("Save", this);
		builder.setNegativeButton("Cancel", this);
				
		return super.onOptionsItemSelected(item);
	}


	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		// TODO Auto-generated method stub
		
		switch (arg1){
		case DialogInterface.BUTTON_POSITIVE:
			String s = this.txtName.getText().toString() + this.txtnumber.getText().toString();
			//String s= this.txtName.getText().toString();
			list.add(s);
			//list.add(i);
			adapter.notifyDataSetChanged();
			
			break;
			
		case DialogInterface.BUTTON_NEGATIVE:
			dialog.dismiss();
		
		}
		
	}


}
