package comp.apptest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/** Called when the user clicks the Set Alarm button */
	public void setAlarm(View view) {
		Intent intent = new Intent(this, AlarmHandler.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Codewords button */
	public void setCodewords(View view) {
		Intent intent = new Intent(this, CodeWord.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Setup Sensor button */
	public void setupSensor(View view) {
		Intent intent = new Intent(this, Sensor.class);
		startActivity(intent);
	}
	
	/** Called when the user clicks the Help button */
	public void sendHelp(View view) {
		Intent intent = new Intent(this, Help.class);
		startActivity(intent);
	}

}
