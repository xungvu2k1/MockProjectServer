//package com.paci.training.android.xungvv.mockprojectserver.data_local;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class MySharedPreferences {
//    Context context;
//    private final String mySharedPreference = "MySharedPreferences";
//
//    public MySharedPreferences(Context context){
//        this.context = context;
//    }
//
//    public void putStringSetValue(String key, Set<String> values){
//        SharedPreferences sharedPreferences = context.getSharedPreferences(
//                mySharedPreference, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putStringSet(key, values);
//        editor.apply();
//    }
//
//    public Set<String> getStringSetValue(String key) {
//        SharedPreferences sharedPreferences = context.getSharedPreferences(
//                mySharedPreference,
//                Context.MODE_PRIVATE);
//        Set<String> valueDefault = new HashSet();
//        return sharedPreferences.getStringSet(key, valueDefault);
//    }
//
//}
