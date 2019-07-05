package springbootDemo.dao;

import org.apache.ibatis.annotations.Param;
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

    void addCar(@Param("car") Car car);

    void delCar(@Param("id") Integer id);
}
