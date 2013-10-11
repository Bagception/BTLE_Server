package de.uulm.bagception.btle.btleserver.activities;

import de.uulm.bagception.btle.btleserver.R;
import de.uulm.bagception.btle.btleserver.R.layout;
import de.uulm.bagception.btle.btleserver.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ServerControl extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_server_control);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.server_control, menu);
		return true;
	}

}
