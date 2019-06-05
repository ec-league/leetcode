package com.league.proxy.aop.jdkproxy;


import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by coraline on 2019/6/5.
 */
public class JdkProxyTest {
    public static void main(String[] args) throws IOException {
//        Action targetAction = new TargetAction();
//        Action proxyAction = (Action) Proxy.newProxyInstance(targetAction.getClass().getClassLoader(), targetAction.getClass().getInterfaces(), new InvocationHandlerAction(targetAction));
//        proxyAction.move();
        //输出动态生成代理类的字节码文件
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Action.class});
        FileOutputStream outputStream = new FileOutputStream(new File("/Users/coraline/Documents/code/leetcode/target/classes/com/league/proxy/aop/jdkproxy/$Proxy0.class"));
        try{
            outputStream.write(bytes);
            outputStream.flush();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            outputStream.close();
        }

    }
}
