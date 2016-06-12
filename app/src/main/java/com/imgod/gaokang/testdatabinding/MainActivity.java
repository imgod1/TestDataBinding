package com.imgod.gaokang.testdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.imgod.gaokang.testdatabinding.customclass.EventClick;
import com.imgod.gaokang.testdatabinding.databinding.ActivityMainBinding;
import com.imgod.gaokang.testdatabinding.model.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        person = new Person();
        person.setName("帝释天");
        activityMainBinding.setPerson(person);
        activityMainBinding.setStr("我是一个字符串");
        activityMainBinding.setTestbool(true);
        activityMainBinding.setNum(22);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("hello databinding arraylist position:" + i);
        }
        activityMainBinding.setList(list);
        activityMainBinding.setListKey(6);


        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("" + i, "hello databinding hashmap position:" + i);
        }
        activityMainBinding.setHashmap(hashMap);
        activityMainBinding.setMapkey("6");

        activityMainBinding.setEventclick(new EventClick());//点击事件在别的类
        activityMainBinding.setActivityclick(this);//点击事件在该类（方便修改该类的对象）
    }

    public void testClick(View view) {
        person.setSex("芭芭拉能量" + System.currentTimeMillis());
    }

}
