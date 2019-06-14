package com.opay.controller;

import com.opay.entity.req.PersonRegisterReq;
import com.opay.service.PayService;
import com.opay.service.PeopleService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @PostMapping("/addbanlance")
    public int  addBalanc(int  num,int id ){

        try {
            return   payService.addBalance(num,id );
        } catch (Exception e) {
            e.printStackTrace();
            return 20;
        }
    }
}
