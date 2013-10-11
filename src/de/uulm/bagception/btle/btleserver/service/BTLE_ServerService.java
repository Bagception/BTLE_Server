package de.uulm.bagception.btle.btleserver.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BTLE_ServerService extends Service{

	public BTLE_ServerService() {
	
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

}
