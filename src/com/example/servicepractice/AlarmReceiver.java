package com.example.servicepractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver{
	public void onReceive(Context context,Intent intent){
		Intent i=new Intent(context,LongRunningService.class);
		context.startService(i);
	}

}
