package com.opay.controller;

import com.opay.entity.req.PersonRegisterReq;
import com.opay.service.PayService;
import com.opay.service.PeopleService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pay")
public class PayController {

    //@Autowired
    private PayService payService;

    //@PostMapping("/addbanlance")
    @GetMapping("/addbanlance")
    public Result  addBalanc(int  balance,String idCard ){
        System.out.println("addbanlance start ");
        System.out.println(balance+idCard);

        try {
            System.out.println("addbanlance start ");
            return   payService.addBalance(balance,idCard );
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
    }


    @GetMapping("/trans")
    public Result  transAccount(String userSend,String userReceive,int amount){
        System.out.println("transAccount start ");
        try {
            System.out.println("transAccount start ");
            return   payService.transAccount(userSend,userReceive,amount);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
    }


    @GetMapping("/select")
    public Result  queryRecords(String idCard){
        try {
            System.out.println("query start ");
            System.out.println(idCard);

            return   payService.queryRecods(idCard);
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
    }
}
