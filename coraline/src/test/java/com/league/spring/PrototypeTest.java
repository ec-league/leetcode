package com.league.spring;

import com.league.prototype.LookUp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by coraline on 2019/5/11.
 */

public class PrototypeTest extends AbstractTest{

    @Autowired
    private LookUp lookUp;
    @Test
    public void test(){
        lookUp.callPrototype();
        lookUp.callPrototype();
    }
}
