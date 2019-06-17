package com.opay.dao.mapper;



import com.opay.entity.req.PersonRegisterReq;
import org.apache.ibatis.annotations.Param;

public interface PayMapper {


    //int addBalance(int balance,String idCard );
    int queryBalance(String idCard);
    boolean updateBalance (@Param("balance")int balance,@Param("idCard") String idCard);



   // int queryAccount(@Param("mobile") String mobile,@Param("nickName") String name,@Param("idCard")String idCard);

}
