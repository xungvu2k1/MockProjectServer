//package com.paci.training.android.xungvv.mockprojectserver.data_local;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.paci.training.android.xungvv.mockprojectserver.model.Fruit;
//
//import java.util.Collections;
//import java.util.List;
//
//public class DataLocalManager {
//    private Context context;
//    private MySharedPreferences mySharedPreferences;
//
//    private static final String PREFERENCES_NAME = "MyAppPreferences";
//    private static final String KEY_USERNAME = "username";
//    private static final String KEY_USER_ID = "user_id";
//
//    private static DataLocalManager instance;
//    private SharedPreferences preferences;
//
//    private DataLocalManager(Context context) {
//        this.context = context;
//        preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
//    }
//
//    public static synchronized DataLocalManager getInstance(Context context) {
//        if (instance == null) {
//            instance = new DataLocalManager(context.getApplicationContext());
//        }
//        return instance;
//    }
//
//    public void setUserObjectList (List<Fruit> fruitList) {
//        Gson gson = new Gson();
//        JsonArray jsonArray = gson.toJsonTree(fruitList).getAsJsonArray();
//        String strJsonArray = jsonArray.toString();
//        DataLocalManager.getInstance(context).mySharedPreferences.putStringSetValue("keyUserObjectList", Collections.singleton(strJsonArray));
//    }
//
//    public List<Fruit> getUserObjectList(){
//        String userObjectListString = DataLocalManager.getInstance(context).mySharedPreferences.getStringSetValue("keyUserObjectList").toString();
//        List<Fruit> fruitList;
//        Gson gson = new Gson();
//        JsonArray jsonUserArray = new JsonArray();
//        jsonUserArray.add(userObjectListString);
//
//        for (int i = 0; i < jsonUserArray.size(); i++){
//            JsonObject jsonUserObject = jsonUserArray.getAsJsonObject();
//            val userStr = gson.fromJson(jsonUserObject.toString(), User::class.java)
//            userList.add(userStr)
//        }
//        return userList
//    }
//
//}
