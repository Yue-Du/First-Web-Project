package com.yue.first.web;

import com.yue.first.bean.PersonalInfoBO;
import com.yue.first.bean.PersonalInfoBO;
import com.yue.first.bean.WebResponse;
import com.yue.first.service.PersonInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.logging.LogFactory;

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

        PersonalInfoBO result = personInfoService.getPersonInfoById(id);
        return WebResponse.createResponse().success().value(result);

    }
    @RequestMapping("/insertPersonInfo")
    @ResponseBody
    public WebResponse insertPersonInfo(@RequestBody PersonalInfoBO personalInfoBO) {
//        personInfoService.insertPersonInfo(personalInfoBO);
        return WebResponse.createResponse().success();
    }
}

