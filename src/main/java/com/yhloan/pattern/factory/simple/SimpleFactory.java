package com.yhloan.pattern.factory.simple;

import com.yhloan.pattern.factory.Guangming;
import com.yhloan.pattern.factory.Mengniu;
import com.yhloan.pattern.factory.Milk;
import com.yhloan.pattern.factory.Yili;
import org.springframework.util.StringUtils;

/**
 * Created by 15995 on 2018/5/16.
 */
public class SimpleFactory {

    Milk getMilk(String name){
        if("蒙牛".equals(name)){
            return  new Mengniu();
        }else if ("伊利".equals(name)){
            return  new Yili();
        }else if("光明".equals(name)){
            return  new Guangming();
        }
        return  null;
    }
}
