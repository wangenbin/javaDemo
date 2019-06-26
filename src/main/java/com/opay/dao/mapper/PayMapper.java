package com.opay.dao.mapper;



import com.opay.entity.req.PersonRegisterReq;
import com.opay.entity.req.TransRecords;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;

import java.util.List;

public interface PayMapper {


    //int addBalance(int balance,String idCard );r
    int queryBalance(String idCard);
    boolean updateBalance (@Param("balance")int balance, @Param("idCard") String idCard);
    boolean insertRecords (@Param("userSend")String userSend, @Param("amount")int amount,@Param("userReceive") String userReceive,@Param("typeName")String type);
    List<TransRecords> queryRecords(@Param("idCard") String idCard);



   // int queryAccount(@Param("mobile") String mobile,@Param("nickName") String name,@Param("idCard")String idCard);

}

