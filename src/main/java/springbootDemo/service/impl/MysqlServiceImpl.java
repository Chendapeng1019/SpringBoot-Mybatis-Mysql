package springbootDemo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootDemo.dao.MysqlMapper;
import springbootDemo.entity.Car;
import springbootDemo.service.MysqlService;

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
}
