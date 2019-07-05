package springbootDemo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
//@CrossOrigin(origins = "http://localhost:63342",maxAge = 3600 )
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

    //添加车辆
    @RequestMapping(value = "/addCar",method = RequestMethod.POST)
    @ResponseBody
    public Integer addCar(@RequestBody Car car){
        mysqlService.addCar(car);
        return 1;
    }

    //删除车辆
    @RequestMapping(value = "/delCar",method = RequestMethod.POST)
    @ResponseBody
    public Integer delCar(@RequestBody Car car){
        mysqlService.delCar(car);
        return 1;
    }


}
