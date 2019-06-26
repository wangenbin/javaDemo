package com.opay.service;

import com.opay.utils.result.Result;

public interface PayService {

    //int insertPeople(People people) throws Exception;

    //People selectByPrimaryKey(Long id) throws  Exception;

    Result addBalance (int balance, String idCard ) throws Exception;
    Result  transAccount(String userSend,String userReceive,int amount) throws  Exception;
    //查询
    Result  queryRecods (String user) throws Exception;


}
