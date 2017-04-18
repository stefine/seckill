package org.seckill.controller;

import org.seckill.dto.excutionResult;
import org.seckill.dto.exposeResult;
import org.seckill.entity.Seckill;
import org.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by 533 on 2017/4/15.
 */
@Controller
@RequestMapping("/seckill")  //module
public class SeckillController {
    @Autowired
    private SeckillService seckillService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model){
        return "home";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET,
                    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    // 返回的数据结构如下：
    //    [
    //        {"seckillId":1000,"name":"iphone6","number":99,"startTime":1460596869000,"endTime":1486137600000,"createTime":1448904094000},
    //        {"seckillId":1001,"name":"ipad2","number":199,"startTime":1492133555000,"endTime":1486137600000,"createTime":1441041704000},
    //        {"seckillId":1002,"name":"macAir","number":300,"startTime":1460596879000,"endTime":1486137600000,"createTime":1423848113000},
    //        {"seckillId":1003,"name":"notebook","number":400,"startTime":1460597115000,"endTime":1486137600000,"createTime":1420905600000}
    //    ]
    public List<Seckill> list(){
        List<Seckill> seckillList = seckillService.getSeckillList();
        return seckillList;
    }

    @RequestMapping(value = "/expose/{skillId}", method = RequestMethod.GET,
                    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    // 返回的数据结构如下：
    // {"flag":true,"seckillId":1000}
    public exposeResult expose(@PathVariable Long skillId){
        exposeResult exposeResult = seckillService.exposeSecKill(skillId);
        return exposeResult;
    }

    @RequestMapping(value = "/excute/{skillId}", method = RequestMethod.GET,
                    produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    // 返回的数据结构如下：
    //    {
    //        "flag":true,
    //            "successkilled":{
    //            "seckillId":1002,
    //            "userPhone":13813833967,
    //            "state":0,
    //            "createTime":1492300144000,
    //            "seckillItem":{
    //                "seckillId":1002,
    //                "name":"macAir",
    //                "number":299,
    //                "startTime":1492300144000,
    //                "endTime":1486137600000,
    //                "createTime":1423848113000
    //            }
    //         }
    //    }
    public excutionResult excute(@PathVariable Long skillId){
        long userPhone = 13813844967L;
        excutionResult excutionResult = seckillService.excuteSecKill(skillId, userPhone);
        return excutionResult;
    }
}
