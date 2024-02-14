package com.paci.training.android.xungvv.mockprojectserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class FruitDetailService extends Service {
    private final String TAG = "aidlService";
    public FruitDetailService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IMyAidlInterface.Stub() {
            @Override
            public String getFruitDetail(String fruitName) throws RemoteException {
                return null;
            }
        };
    }
}