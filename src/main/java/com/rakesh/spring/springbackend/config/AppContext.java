package com.rakesh.spring.springbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;


//clean compile install

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.rakesh.spring.springbackend")

public class AppContext {

	@Bean(name="dataSource")
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/SkillEngine?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("rakesh666");
		System.out.println("connected..."+dataSource);
	return dataSource;
	}
	
	private Properties getHibernatePropertes() {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL55Dialect");
		p.setProperty("hibernate.show_sql", "true");
		//p.setProperty("hibernate.hbm2ddl.auto", "create");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		System.out.println("proprreties ");
		return p;

	}

	
	
@Bean(name="sessionFactory")
	@Autowired
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource ){
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(getHibernatePropertes());
		sessionFactory.setPackagesToScan("com.rakesh.spring.springbackend.model");
		System.out.println("session factory connected "+sessionFactory);	
		return sessionFactory;
			
		}



@Bean(name="transactionManager")
@Autowired
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	
	System.out.println(sessionFactory);
	transactionManager.setSessionFactory(sessionFactory);
	System.out.println("Transaction Manager Created sucessfully....");
	return transactionManager;
	
	
}

	
	
}
