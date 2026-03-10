package com.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.demo")
public class SpringConfig {

 @Bean
 public ViewResolver viewResolver(){
  InternalResourceViewResolver vr =
   new InternalResourceViewResolver();

  vr.setPrefix("/WEB-INF/views/");
  vr.setSuffix(".jsp");

  return vr;
 }

 @Bean
 public DataSource dataSource(){

  BasicDataSource ds = new BasicDataSource();
  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
  ds.setUrl("jdbc:mysql://localhost:3306/test");
  ds.setUsername("root");
  ds.setPassword("root");

  return ds;
 }

 @Bean
 public LocalSessionFactoryBean sessionFactory(){

  LocalSessionFactoryBean sf =
   new LocalSessionFactoryBean();

  sf.setDataSource(dataSource());
  sf.setPackagesToScan("com.demo.entity");

  Properties p = new Properties();
  p.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
  p.put("hibernate.hbm2ddl.auto","update");
  p.put("hibernate.show_sql","true");

  sf.setHibernateProperties(p);

  return sf;
 }
}
