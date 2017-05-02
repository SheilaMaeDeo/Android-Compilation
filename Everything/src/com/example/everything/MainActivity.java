package com.example.everything;


import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener {

	GridAdapter adapter;
	GridView gv;
	ArrayList<Person> list= new ArrayList<Person>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.gv=(GridView) this.findViewById(R.id.gridView1);
        this.list.add(new Person(R.drawable.img1,"Alpha,", "BSIT"));
        this.list.add(new Person(R.drawable.img2,"Sheila,", "BEED"));
        this.list.add(new Person(R.drawable.img3,"Mae,", "BSOA"));
        this.list.add(new Person(R.drawable.img4,"She,", "BSCOE"));
        this.list.add(new Person(R.drawable.img5,"Felix,", "BSBA"));
        this.list.add(new Person(R.drawable.img6,"Lex,", "BEED"));
        this.list.add(new Person(R.drawable.img7,"Dennis,", "BSEE"));
        this.list.add(new Person(R.drawable.img8,"Durano,", "BSHRM"));
        this.list.add(new Person(R.drawable.img9,"Beta,", "BSCRIM"));
        this.list.add(new Person(R.drawable.img10,"Se,", "BSEE"));
        this.list.add(new Person(R.drawable.img11,"Delta,", "BSIT"));
        this.list.add(new Person(R.drawable.img12,"Charlie,", "BSIT"));
        
        this.adapter=new GridAdapter(this,list);
        this.gv.setAdapter(adapter);
        this.gv.setOnItemClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
		ImageView lv=new ImageView(this);
		lv.setImageResource(list.get(arg2).getImage());
		TextView tv= new TextView(this);
		tv.setText(list.get(arg2).getCcourse());
		
		LinearLayout layout= new LinearLayout(this);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.addView(lv);
		layout.addView(tv);
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle(list.get(arg2).getName());
			builder.setView(layout);
			builder.setNeutralButton("Okey",null);
			
			AlertDialog dialog = builder.create();
				dialog.show();
		
	}
}
