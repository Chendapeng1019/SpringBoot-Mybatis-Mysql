package springbootDemo.dao;

import springbootDemo.entity.Car;

import java.util.List;

/**
 * @ClassName OracleDao
 * @Description
 * @Author chendapeng
 * @Date 2019/1/24
 **/

public interface MysqlMapper {
    List<Car> findList();
}
