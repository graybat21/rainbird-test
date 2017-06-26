package com.ehwa.rainbird.backend;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value = {"com.ehwa.rainbird.backend.restful.v1.user.UserDAO"})
public class RainbirdBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RainbirdBackendApplication.class, args);
	}
	
	/**
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*Mapper.xml");
            sessionFactory.setMapperLocations(res);
            return sessionFactory.getObject();
    }

}
