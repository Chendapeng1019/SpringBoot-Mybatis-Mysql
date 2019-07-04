package springbootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"springbootDemo.dao"})
public class SpringbootMybatisMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisMysqlApplication.class, args);
	}

}
