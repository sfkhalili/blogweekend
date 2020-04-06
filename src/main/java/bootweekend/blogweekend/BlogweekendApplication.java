package bootweekend.blogweekend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class BlogweekendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogweekendApplication.class, args);
	}
//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
////		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/blogweekend");
//		dataSource.setUsername("root");
//		dataSource.setPassword("");
//		return dataSource;
//	}
}
