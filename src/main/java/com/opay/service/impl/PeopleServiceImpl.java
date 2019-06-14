package com.opay.service.impl;


import com.opay.dao.mapper.PeopleMapper;
import com.opay.entity.req.PersonRegisterReq;
import com.opay.service.PeopleService;
import com.opay.utils.result.Result;
import com.opay.utils.result.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;

//import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Service;

import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public Result insertPeople(PersonRegisterReq req) throws Exception {

        //检查昵称用户名是否为空
        if (StringUtils.isEmpty(req.getNickName())) {
            System.out.println("111111111");
            return Result.failure(ResultCode.PARAM_ERR, ResultCode.PARAM_ERR.message());
        }
        //校验手机号是否存在
        int countMobile = peopleMapper.queryUserCount(req.getMobile(), null, null);
        if (countMobile > 0) {
            return Result.failure(ResultCode.MOBILE_EXITS, ResultCode.MOBILE_EXITS.message());

        }
        //校验用户是否存在
        int countName = peopleMapper.queryUserCount(null, req.getNickName(), null);
        if (countName > 0) {
            return Result.failure(ResultCode.NAME_EXITS, ResultCode.NAME_EXITS.message());

        }
        //校验身份证是否已经注册
        int countCard = peopleMapper.queryUserCount(null, null, req.getIdCard());
        if (countCard > 0) {
            return Result.failure(ResultCode.IDCARD_EXITS, ResultCode.IDCARD_EXITS.message());

        }

        //校验手机号是否合法
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        int num =  req.getMobile().length();
        System.out.println("手机号有"+num);
        if (req.getMobile().length() != 11) {
           return Result.failure(ResultCode.PHONE_LESS,ResultCode.PHONE_LESS.message());
        } else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(req.getMobile());
            boolean isMatch = m.matches();
            if (!isMatch) {
                System.out.println("您的手机号" + "mobile" + "是错误格式！！！");
                return Result.failure(ResultCode.PHONE_INVALID, ResultCode.PHONE_INVALID.message());
            }
        }
        //校验银行卡号是否合法
        if (req.getBankNo().length() > 19 && req.getBankNo().length() < 15) {
            System.out.println("银行卡号不合法");
            return Result.failure(ResultCode.BANKCARD_INVALID, ResultCode.BANKCARD_INVALID.message());
        }


        //入库
        Date now = new Date();
        req.setCreateTime(now);
        req.setUpdateTime(now);
        peopleMapper.insertPeoPle(req);
        return Result.success();
    }


}

//验证方法，写在util包中
//私服   maven文件 关经理级jar包     release 稳定   snapshots 自动更新 -i  ls :   Java maven  nexus  两个服务调用

/*

pom调用opay bzo zimz
spring 捕获方法自动开启事务，throws exception   不能catch

mybaties 配置文件 自动生产SQL语句
不适用外键盘
重约束  dobble
微服务对测试环境的搭建和测试很不利
web层使用spring clound boot
不建议使用Tomcat发布   HTTP长连接协议
hook
3 pom里面的包不能随便乱引入
shadding
dubb会自动扫描带server的标签
 */








