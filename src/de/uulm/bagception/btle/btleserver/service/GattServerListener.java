package de.uulm.bagception.btle.btleserver.service;

import java.util.Arrays;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.util.Log;

public class GattServerListener implements ServiceListener{

	
	
	@Override
	public void onServiceConnected(int profile, BluetoothProfile proxy) {
		Log.d("BTLE","BTLE CONNECT ");
		for(BluetoothDevice d:proxy.getConnectedDevices()){
			Log.d("BTLE", " "+d.getName());
		}
		
	}

	@Override
	public void onServiceDisconnected(int profile) {
		// TODO Auto-generated method stub
		
	}

}
