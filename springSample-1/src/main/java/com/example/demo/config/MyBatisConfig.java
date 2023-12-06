//package com.example.demo.config;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
//@MapperScan("com.example.demo.repository")
//public class MyBatisConfig {
//
//    @Autowired
//    private DataSource dataSource; // 필요에 따라 DataSource를 주입하세요.
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        // 다른 설정도 추가할 수 있습니다.
//        return factoryBean.getObject();
//    }
//}
