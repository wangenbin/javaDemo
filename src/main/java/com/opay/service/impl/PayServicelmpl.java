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
    public int addBalance(int  num,int id ) throws Exception{
        //return this.peopleMapper.insert(people);
        //获取当前账户和账户余额，
        int amount =payMapper.queryBalance(5);
        int newAmount = amount+num;
        payMapper.updateBalance(newAmount);
        return 20;
    }

//    @Override
//    public boolean transBalance (int num) throws  Exception{
//        return true;
//    }
}
