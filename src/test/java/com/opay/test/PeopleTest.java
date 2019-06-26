package com.opay.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.opay.controller.PayController;
import com.opay.service.PayService;
import com.opay.service.PeopleService;
import com.opay.service.impl.PayServicelmpl;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

public class PeopleTest {
//    @Test
//    public void test(){
//       // Result res=  new PayService().addBalance(50,"37223212052301101");
//        //return Result.failure(ResultCode.IDCARD_EXITS,ResultCode.IDCARD_EXITS.message());
//        System.out.println("测试成功");
//    }

    private PayService payService;

    @Autowired(required = true)
    @Qualifier("peopleService")
    private PeopleService peopleService;

    @Test
    public void test(){
        try {
           Result res =  payService.addBalance(50,"12233333");

        }catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
           // return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
       // return Result.failure(ResultCode.IDCARD_EXITS,ResultCode.IDCARD_EXITS.message());
        System.out.println("测试成功");
    }
}


