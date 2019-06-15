package com.opay.dao.mapper;



import com.opay.entity.req.PersonRegisterReq;
import org.apache.ibatis.annotations.Param;

public interface PeopleMapper {


    int insert(PersonRegisterReq req);

    boolean  insertAmount(PersonRegisterReq req);

    int queryUserCount(@Param("mobile") String mobile,@Param("nickName") String name,@Param("idCard")String idCard);

    //boolean mobileVerify(@Param("mobile") String mobile);
}
