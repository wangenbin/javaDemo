package com.opay.service;

import com.opay.entity.req.PersonRegisterReq;
import com.opay.utils.result.Result;

public interface PeopleService {

    Result insertPeople(PersonRegisterReq req) throws Exception;

}
