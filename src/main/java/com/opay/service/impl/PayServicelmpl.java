package com.opay.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.opay.dao.mapper.PayMapper;
import com.opay.entity.req.TransRecords;
import com.opay.service.PayService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class PayServicelmpl  implements PayService {

    @Autowired
    private PayMapper payMapper;



    @Override
    public Result addBalance(int  balance, String idCard ) throws Exception{
        System.out.println(balance);
        //return this.peopleMapper.insert(people);
        //获取当前账户和账户余额，
        int amount =payMapper.queryBalance(idCard);
        System.out.println(amount);
        int newAmount = amount+balance;
        //TODO 充值和充值记录需要事务
        payMapper.updateBalance(newAmount,idCard);
        payMapper.insertRecords(idCard,balance,null,"充值");

        return Result.success();
    }




    @Override
    public Result transAccount(String userSend,String userReceive,int amount) throws Exception{
        //自己不能给自己转账
        if( userSend.equals(userReceive)){
            return Result.failure(ResultCode.AMOUNT_REPEACE,ResultCode.AMOUNT_REPEACE.message());
        }
        System.out.println("sender:"+userSend+"receiver:"+userReceive+"amount:"+amount);
        //判断转账金额是否大于余额
        int amountForSend = payMapper.queryBalance(userSend);
        int amountForReceive = payMapper.queryBalance(userReceive);
        if (amountForSend<amount){
            return Result.failure(ResultCode.AMOUNT_LESS,ResultCode.AMOUNT_LESS.message());
        }
        //开始转账,更新两个账户的余额
        int newAmountSend = amountForSend- amount;
        int newAmountReceive = amount+amountForReceive;

        //TODO 操作的两条SQL语句要放在事务里面，如果没有完成要回滚。
        payMapper.updateBalance(newAmountSend,userSend);
        payMapper.updateBalance(newAmountReceive,userReceive);
        payMapper.insertRecords(userSend,amount,userReceive,"转账");

        return Result.success();
    }


    //查询操作
    @Override
    public Result queryRecods(String idCard ) throws Exception{
        System.out.println(idCard);

         List<TransRecords> res =  payMapper.queryRecords(idCard);
         System.out.println(res);
         System.out.println("结果开始显示");
         System.out.println(res);
         System.out.println(res.get(1).amount);
        // System.out.println(res.amount);

        for(int i = 0; i < res.size(); i++){

            System.out.print(res.get(i).user_send+"转账"+res.get(i).user_receive+res.get(i).amount+"元");
            System.out.println();
        }
        //街二手多
        return Result.success();
    }



}
