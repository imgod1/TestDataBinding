package com.imgod.gaokang.testdatabinding.customclass;

import android.view.View;
import android.widget.Toast;

/**
 * 项目名称：TestDataBinding
 * 包名称：com.imgod.gaokang.testdatabinding.customclass
 * 类描述：
 * 创建人：gaokang
 * 创建时间：2016-06-12 14:07
 * 修改人：gaokang
 * 修改时间：2016-06-12 14:07
 * 修改备注：
 */
public class EventClick {
    public void handleClick(View view){
        Toast.makeText(view.getContext(),"Hello DataBinding Click",Toast.LENGTH_SHORT).show();
    }

    public void handleLongClick(View view){
        Toast.makeText(view.getContext(),"Hello DataBinding LongClick",Toast.LENGTH_SHORT).show();
    }
}
