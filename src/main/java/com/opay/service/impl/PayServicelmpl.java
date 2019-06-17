package com.opay.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.opay.dao.mapper.PayMapper;
import com.opay.dao.mapper.PeopleMapper;
import com.opay.entity.People;
import com.opay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class PayServicelmpl  implements PayService {

    @Autowired
    private PayMapper payMapper;



    @Override
    public int addBalance(int  balance,String idCard ) throws Exception{
        System.out.println(balance);
        //return this.peopleMapper.insert(people);
        //获取当前账户和账户余额，
        int amount =payMapper.queryBalance("37223212052301101");
        System.out.println(amount);
        int newAmount = amount+balance;
        System.out.println(newAmount);
        payMapper.updateBalance(newAmount,idCard);
        return 20;
    }

}
