package org.lzw.action;

import org.lzw.pojo.CusSms;
import org.lzw.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
public class CusAction {
    //nihao2。13
    @Autowired
    private CusService cusService;

    @RequestMapping("/reg")
    @ResponseBody
    public String register(){
        CusSms cusSms = new CusSms();
        cusSms.setCname("广告团队");
        cusSms.setToken(UUID.randomUUID().toString());
        cusService.register(cusSms);
        return "ok";
    }

    @RequestMapping("/find")
    @ResponseBody
    public CusSms find(Long cid){
        CusSms cusSms = cusService.findById(cid);
        return cusSms;
    }

    @RequestMapping("/findpage")
    @ResponseBody
    public List<CusSms> findpage(Integer page,Integer size){
        List<CusSms> byPage = cusService.findByPage(page, size);
        return byPage;
    }
}
