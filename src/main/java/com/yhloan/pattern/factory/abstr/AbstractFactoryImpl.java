package com.yhloan.pattern.factory.abstr;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yhloan.pattern.factory.Guangming;
import com.yhloan.pattern.factory.Mengniu;
import com.yhloan.pattern.factory.Milk;
import com.yhloan.pattern.factory.Yili;
import com.yhloan.pattern.factory.func.GuangmingFactroy;
import com.yhloan.pattern.factory.func.MengniuFactory;
import com.yhloan.pattern.factory.func.YiliFactory;

/**
 * Created by 15995 on 2018/5/16.
 */
public class AbstractFactoryImpl extends AbstractFactory {
    @Override
    Milk createMengniu() {
        return new MengniuFactory().create();
    }

    @Override
    Milk createYili() {
        return new YiliFactory().create();
    }

    @Override
    Milk createGuangming() {
        return new GuangmingFactroy().create();
    }
}
