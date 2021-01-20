package com.yue.first.web;

import com.yue.first.bean.*;
import com.yue.first.service.EmployeeInfoService;
import com.yue.first.service.PersonInfoService;
import com.yue.first.util.Logger;
import com.yue.first.util.Moniter;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.annotation.Resource;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private PersonInfoService personInfoService;

    @Resource
    private EmployeeInfoService employeeInfoService;

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
    public int insertEmployee() {

        /** insert **/
        CompanyEntity employee = new CompanyEntity();
        employee.setId(1);
        employee.setAge(15);
        employee.setName("Alice");
        employeeInfoService.save(employee);
        return 1;
    }

    @RequestMapping("/findByEmployeeId")
    @ResponseBody
    public int findByEmployeeId() {
        employeeInfoService.findByEmployeeId(1);
        return 1;
    }

}

