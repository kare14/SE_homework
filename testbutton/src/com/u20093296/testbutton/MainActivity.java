package com.u20093296.testbutton;
/*******************************/
//
//	�ȵ���̵� ��ư Ŭ�� �̺�Ʈ
//
//
// 	20093296 ���Ǳ�
//
//
//
/*******************************/
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	Activity act = this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		findViewById(R.id.button1).setOnClickListener(
				new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(act.getBaseContext(),"��ư 1 Ŭ��",Toast.LENGTH_LONG).show();
					}
		});
		findViewById(R.id.button2).setOnClickListener(
				new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(act.getBaseContext(),"��ư 2 Ŭ��",Toast.LENGTH_LONG).show();
						
					}
		});
		findViewById(R.id.button3).setOnClickListener(
				new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(act.getBaseContext(),"��ư 3 Ŭ��",Toast.LENGTH_LONG).show();
					}
		});
		findViewById(R.id.button4).setOnClickListener(
				new Button.OnClickListener(){
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(act.getBaseContext(),"��ư 4 Ŭ��",Toast.LENGTH_LONG).show();
					}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
