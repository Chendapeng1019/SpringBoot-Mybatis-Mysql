package springbootDemo.service;

import springbootDemo.entity.Car;

import java.util.List;

/*
 *@ClassName OracleService
 *@Description
 *@Author chendapeng
 *@Date 2019/1/24
 */
public interface MysqlService {
    List<Car> findList();
}
