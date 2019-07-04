package springbootDemo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springbootDemo.entity.Car;
import springbootDemo.service.MysqlService;

import java.util.List;

/**
 * @ClassName OracleTestController
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/

@Controller
@RequestMapping("/mysql")
public class MysqlController {

    @Autowired
    private MysqlService mysqlService;

    //查询列表
    @RequestMapping("/carList")
    @ResponseBody
    public List<Car> list(){

        return mysqlService.findList();
    }
}
