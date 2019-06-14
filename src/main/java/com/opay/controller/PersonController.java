package com.opay.controller;

import com.opay.entity.req.PersonRegisterReq;
import com.opay.service.PeopleService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/register")
    public Result register(@RequestBody PersonRegisterReq req){

        try {
          return   peopleService.insertPeople(req);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(ResultCode.FAIL,ResultCode.FAIL.message());
        }
    }
}
