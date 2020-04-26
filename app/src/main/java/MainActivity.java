package com.nayyemarn.lesson;

import javax.net.ssl.*;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity
{
	TextView tv;


	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		tv=(TextView) findViewById(R.id.tv);

	}
	public void bright(View v){
		tv.setText("၁၈ အဖြေ မှန်ပါတယ် \n\nကိန်းတစ်ခု ကျော်စီတွင် ခြားနားချက်\n\n၃ ဖြင့်လျော့နဲသွားသော ကိန်းစဥ် ။");

	}
	public void bfalse1(View v){
		tv.setText("၁၆ မှားပါတယ်");

	}
	public void bfalse2(View v){
		tv.setText("၁၇ မှားပါတယ်");
	}
	public void bfalse3(View v){
		tv.setText("၂၈ မှားပါတယ်");
	}



}




	

	
