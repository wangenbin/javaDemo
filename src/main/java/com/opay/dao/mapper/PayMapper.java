package com.opay.dao.mapper;



import com.opay.entity.req.PersonRegisterReq;
import org.apache.ibatis.annotations.Param;

public interface PayMapper {


    int addBalance(int num,int id );
    int queryBalance(int id);
    boolean updateBalance (int num);



   // int queryAccount(@Param("mobile") String mobile,@Param("nickName") String name,@Param("idCard")String idCard);

}
