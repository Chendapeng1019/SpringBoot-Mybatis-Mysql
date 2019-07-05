package springbootDemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootDemo.dao.MysqlMapper;
import springbootDemo.entity.Car;
import springbootDemo.service.MysqlService;
import springbootDemo.utils.CarUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OracleServiceImpl
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/
@Service
public class MysqlServiceImpl implements MysqlService {

    @Autowired
    private MysqlMapper mysqlDao;



    @Override
    public List<Car> findList() {
        List<Car> carList = new ArrayList<Car>();
        carList = mysqlDao.findList();
        return carList;
    }

    @Override
    public void addCar(Car car) {
        car.setId(CarUtils.getID());
        car.setCtime(CarUtils.dateToString());
        mysqlDao.addCar(car);
    }

    @Override
    public void delCar(Car car) {
        mysqlDao.delCar(car.getId());
    }
}
