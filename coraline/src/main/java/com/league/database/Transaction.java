package com.league.database;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * Created by coraline on 2019/5/27.
 */
public class Transaction {
    private int count = 1;

    @Transactional(rollbackFor = RuntimeException.class)
    public void a() {
        count = 2;
        b();


    }

    @Transactional(rollbackFor = RuntimeException.class)
    private void b() {
        count = 3;
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        throw new RuntimeException("oooooops");
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        try{
            t.a();
        }
        catch(Exception ex){

        }

        System.out.println(t.count);
    }
}
