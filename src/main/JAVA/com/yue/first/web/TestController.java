package com.yue.first.web;

import com.yue.first.bean.*;
import com.yue.first.mapper.EmployeeInfoDao;
import com.yue.first.service.PersonInfoService;
import com.yue.first.util.Logger;
import com.yue.first.util.Moniter;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private PersonInfoService personInfoService;

    @RequestMapping("/one")
    @ResponseBody
    public String testOne() {
        return "test one";
    }

    @RequestMapping("/getPersonInfoById")
    @ResponseBody
    public WebResponse getPersonInfoById(@RequestParam("id") long id) {
        long startTime=System.currentTimeMillis();
        try {
            PersonalInfoBO result = personInfoService.getPersonInfoById(id);
            return WebResponse.createResponse().success().value(result);
        } catch (Exception exception) { //never write return statement under catch!
            Logger.info(exception.toString());
        } finally {  //never write return statement under finally!
            Moniter.count("getPersonInfoById");
            long endTime=System.currentTimeMillis();
            Moniter.duration("getPersonInfoById", endTime - startTime);
        }

        return WebResponse.createResponse().failed();
    }

    @RequestMapping("/insertPersonInfo")
    @ResponseBody
    public WebResponse insertPersonInfo(@RequestBody PersonalInfoBO personalInfoBO) {
        Moniter.count("insertPersonInfo");
        try {
            int result = personInfoService.insertPersonInfo(personalInfoBO);
            return WebResponse.createResponse().success().value(result);
        } catch (Exception exception) {
            Logger.info(exception.toString());

        } finally {

        }
        return WebResponse.createResponse().failed();
    }

    @RequestMapping("/updatePersonInfoById")
    @ResponseBody
    public WebResponse updatePersonInfoById(@RequestBody PersonInfoUpdateRequestVO personInfoUpdateRequestVO) {
        Moniter.count("updatePersonInfoById");
        try {
            int result = personInfoService.updatePersonInfoById(personInfoUpdateRequestVO.getPersonalInfoBO(), personInfoUpdateRequestVO.getId());
            return WebResponse.createResponse().success().value(result);
        } catch (Exception exception) {
            Logger.info(exception.toString());

        } finally {

        }
        return WebResponse.createResponse().failed();
    }

    @RequestMapping("/insertEmployee")
    @ResponseBody
    public void insertEmployee() {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                "src\\applicationContext.xml");
        EmployeeInfoDao personDao = (EmployeeInfoDao) context.getBean("EmployeeInfoDao");
        EmployeeInfoDO person = new EmployeeInfoDO();
        person.setName("Jack");
        person.setAge(32);
        personDao.insertPerson(person);
    }

//        try {
//            EmployeeInfoBo result = EmployeeInfoService.getEmployeeInfoById(id);
//            return WebResponse.createResponse().success().value(result);
//        } catch (Exception exception) { //never write return statement under catch!
//            Logger.info(exception.toString());
//        } finally {  //never write return statement under finally!
//
//        }
//        return WebResponse.createResponse().failed();

}

