package com.baobaotao.aspectj.basic;

import com.baobaotao.Seller;
import com.baobaotao.SmartSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by zhujie on 16/8/16.
 */
@Aspect
public class EnableSellerAspect {
    @DeclareParents(value = "com.baobaotao.NaiveWaiter",
            defaultImpl = SmartSeller.class)
    public Seller seller;
}
