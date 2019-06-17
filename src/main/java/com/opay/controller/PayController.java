package com.opay.controller;

import com.opay.entity.req.PersonRegisterReq;
import com.opay.service.PayService;
import com.opay.service.PeopleService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    //@PostMapping("/addbanlance")
    @GetMapping("/addbanlance")
    public int  addBalanc(int  balance,String idCard ){
        System.out.println("addbanlance start ");
        System.out.println(balance+idCard);

        try {
            System.out.println("addbanlance start ");
            return   payService.addBalance(balance,idCard );
        } catch (Exception e) {
            e.printStackTrace();
            return 20;
        }
    }
}
