package de.uulm.bagception.btle.btleserver.service;

import java.util.UUID;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import de.philipphock.android.lib.activities.DialogActivity;
import de.philipphock.android.lib.services.observation.ObservableService;
import de.uulm.bagception.bluetooth.BagceptionBTServiceInterface;
public class BTLE_ServerService extends ObservableService{

	private  BluetoothAdapter btAdapter;
	private BluetoothGattServer btGattServer;
	
	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}



	@Override
	protected void onFirstInit() {
		Log.d("BTLE", "Service started");
		if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
			DialogActivity.showDialog("BTLE", "BTLE not supported", this);
			stopSelf();
			return;
		}

		final BluetoothManager bluetoothManager =
		        (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
		btAdapter = bluetoothManager.getAdapter();
		
		BluetoothGattService btGattService = new BluetoothGattService(UUID.fromString(BagceptionBTServiceInterface.BT_UUID),BluetoothGattService.SERVICE_TYPE_PRIMARY );
		
		btGattServer=bluetoothManager.openGattServer(this,new GattServerCallback() );
		btGattServer.addService(btGattService);
		
		 
	}
	
	@Override
	public String getServiceName() {
		return this.getClass().getCanonicalName(); 
	}

	

}
