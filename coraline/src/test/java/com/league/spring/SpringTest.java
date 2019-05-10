package com.league.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by coraline on 2019/5/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:config/spring/appcontext-core.xml"})
public class SpringTest {

    @Autowired
    private SpringBean springBean;

    @Test
    public void test(){
         springBean.tt();
    }


}
