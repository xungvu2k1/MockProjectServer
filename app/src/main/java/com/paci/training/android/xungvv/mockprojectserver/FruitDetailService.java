package com.paci.training.android.xungvv.mockprojectserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import com.paci.training.android.xungvv.mockprojectserver.data_local.FruitEntity;
import com.paci.training.android.xungvv.mockprojectserver.model.Fruit;

public class FruitDetailService extends Service {
    public FruitDetailService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
    private final IMyAidlInterface.Stub binder = new IMyAidlInterface.Stub() {
        @Override
        public String getFruitDetail(int positionItem) throws RemoteException {
            for (Fruit fruit : FruitEntity.getFruits()){
                if(fruit.getId() == positionItem){
                    return fruit.getDetail();
                }
            }
            return "Invalid fruit id";
        }
    };
}