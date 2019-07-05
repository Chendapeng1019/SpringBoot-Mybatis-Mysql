package springbootDemo.service;

import springbootDemo.entity.Car;

import java.util.List;


public interface MysqlService {
    List<Car> findList();

    void addCar(Car car);

    void delCar(Car car);
}
