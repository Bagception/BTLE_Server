package de.uulm.bagception.btle.btleserver.service;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.util.Log;

public class GattServerCallback extends BluetoothGattServerCallback{

	@Override
	public void onCharacteristicReadRequest(BluetoothDevice device,
			int requestId, int offset,
			BluetoothGattCharacteristic characteristic) {
	
		super.onCharacteristicReadRequest(device, requestId, offset, characteristic);
		Log.d("GTLE","1");
	}
	
	
	@Override
	public void onConnectionStateChange(BluetoothDevice device, int status,
			int newState) {
		super.onConnectionStateChange(device, status, newState);
		Log.d("GTLE","2");
	}
	
	@Override
	public void onDescriptorWriteRequest(BluetoothDevice device, int requestId,
			BluetoothGattDescriptor descriptor, boolean preparedWrite,
			boolean responseNeeded, int offset, byte[] value) {
	
		super.onDescriptorWriteRequest(device, requestId, descriptor, preparedWrite,
				responseNeeded, offset, value);
		
		Log.d("GTLE","3");
	}
	
	@Override
	public void onServiceAdded(int status, BluetoothGattService service) {
	
		super.onServiceAdded(status, service);
		Log.d("GTLE","4");
	}
	
	@Override
	public void onCharacteristicWriteRequest(BluetoothDevice device,
			int requestId, BluetoothGattCharacteristic characteristic,
			boolean preparedWrite, boolean responseNeeded, int offset,
			byte[] value) {
	
		super.onCharacteristicWriteRequest(device, requestId, characteristic,
				preparedWrite, responseNeeded, offset, value);
		
		Log.d("GTLE","5");
	}
	
	@Override
	public void onDescriptorReadRequest(BluetoothDevice device, int requestId,
			int offset, BluetoothGattDescriptor descriptor) {
	
		super.onDescriptorReadRequest(device, requestId, offset, descriptor);
		
		Log.d("GTLE","6");
	}
	
	@Override
	public void onExecuteWrite(BluetoothDevice device, int requestId,
			boolean execute) {
	
		super.onExecuteWrite(device, requestId, execute);
		Log.d("GTLE","7");
	}
}
