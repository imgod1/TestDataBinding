package com.imgod.gaokang.testdatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.imgod.gaokang.testdatabinding.BR;

/**
 * 项目名称：TestDataBinding
 * 包名称：com.imgod.gaokang.testdatabinding.model
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016-06-12 10:06
 * 修改人：gaokang
 * 修改时间：2016-06-12 10:06
 * 修改备注：
 */
public class Person extends BaseObservable {
    private String name;
    private int age;
    private String sex;

    public Person() {
        this.name = "default";
        this.age = 100;
        this.sex = "男";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }
}
