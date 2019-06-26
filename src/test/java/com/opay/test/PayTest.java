package com.opay.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.opay.BaseJunit4Test;
import com.opay.service.PayService;
import com.opay.utils.result.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

public class PayTest extends BaseJunit4Test {
    //    @Test
//    public void test(){
//       // Result res=  new PayService().addBalance(50,"37223212052301101");
//        //return Result.failure(ResultCode.IDCARD_EXITS,ResultCode.IDCARD_EXITS.message());
//        System.out.println("测试成功");
//    }
    @Resource
    private PayService payService;

    @Test
    public void test(){
        try {
            Result res =  payService.addBalance(50,"37123212052301101");
            //System.out.println("测试成功");

        }catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            // return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
        // return Result.failure(ResultCode.IDCARD_EXITS,ResultCode.IDCARD_EXITS.message());
        System.out.println("测试成功");
    }
}



