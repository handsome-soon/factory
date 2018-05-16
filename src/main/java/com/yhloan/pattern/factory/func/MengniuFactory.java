package com.yhloan.pattern.factory.func;

import com.yhloan.pattern.factory.Mengniu;
import com.yhloan.pattern.factory.Milk;

/**
 * Created by 15995 on 2018/5/16.
 */
public class MengniuFactory implements FunctionFactory {
    @Override
    public Milk create() {
        return new Mengniu();
    }
}
