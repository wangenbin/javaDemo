package com.opay.service;

import com.opay.entity.People;
import org.apache.ibatis.annotations.Param;

public interface PayService {

    //int insertPeople(People people) throws Exception;

    //People selectByPrimaryKey(Long id) throws  Exception;

    int addBalance (int balance,String idCard ) throws Exception;
   // boolean   transBalance(int num) throws  Exception;

}
