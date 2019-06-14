/*
package com.opay.test;

import com.opay.BaseJunit4Test;
import com.opay.entity.People;
import com.opay.service.PeopleService;
import com.opay.utils.DateUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserServiceTest extends BaseJunit4Test {

    //private UserServiceImpl userService = null;
    @Autowired(required = true)
    @Qualifier("peopleService")
    private PeopleService peopleService = null;
    */
/*@Before
    public void getBefore(){
        *//*
*/
/*String xmlPath = "classpath*:applicationContext.xml";
        ApplicationContext ac = new FileSystemXmlApplicationContext(xmlPath);
        userService = (UserServiceImpl) ac.getBean("userService");*//*
*/
/*
        ApplicationContext ctx = null;
        ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        UserService userService1 = (UserService) ctx.getBean("userService");
    }*//*




    @Test
    public void testsearch() {

        try {
            People user = new People();
            user.setIdcard("230304198704034412");
            user.setName("李建国");
            user.setTel("18600540051");
            user.setAdress("你才");
            user.setCreateuser("ljg");
            user.setCreatetime(DateUtils.stringToDate(DateUtils.getCurrentDate()));
            People people = peopleService.selectByPrimaryKey(1L);
            System.out.println(people.getName());
            int a = peopleService.insertPeople(user);
            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    */
/*@Test
    public void save() throws  Exception{
        UserService userService1 = new UserServiceImpl();
        User user = new User();
        user.setIdcard("230304198704034411");
        user.setName("李建国");
        user.setTel("18600540051");
        user.setAdress("你才");
        user.setCreateuser("ljg");
        user.setCreatetime(DateUtils.stringToDate(DateUtils.getCurrentDate()));
        int a = userService1.insert(user);
        System.out.println(a);
    }*//*

}
*/
