package com.paci.training.android.xungvv.mockprojectserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.paci.training.android.xungvv.mockprojectserver.data_local.FruitEntity;
import com.paci.training.android.xungvv.mockprojectserver.model.Fruit;

public class FruitDetailService extends Service {
    private final String TAG = "aidlService";
    public FruitDetailService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IMyAidlInterface.Stub() {
            @Override
            public String getFruitDetail(String fruitName) throws RemoteException {
                for (Fruit fruit : FruitEntity.getFruits()){
                    if(fruit.getName().equals(fruitName)){
                        return fruit.getDetail();
                    }
                }
                return "Invalid fruit name";
            }
        };
    }
}