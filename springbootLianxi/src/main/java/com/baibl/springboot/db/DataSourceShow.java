/*
 * package com.baibl.springboot.db;
 * 
 * import javax.activation.DataSource;
 * 
 * import org.springframework.beans.BeansException; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.ApplicationContextAware; import
 * org.springframework.stereotype.Component;
 * 
 * @Component //实现Spring Bean 生命周期接口ApplicationContextAware public class
 * DataSourceShow implements ApplicationContextAware{
 * 
 * 
 * ApplicationContext applicationContext = null;
 * 
 * //容器会自动调用这个方法，注入到Sping IoC容器
 * 
 * @Override public void setApplicationContext(ApplicationContext
 * applicationContext) throws BeansException { this.applicationContext =
 * applicationContext; DataSource dataSource =
 * applicationContext.getBean(DataSource.class);
 * System.out.println("----------------------------------------------");
 * System.out.println(dataSource.getClass().getName());
 * System.out.println("----------------------------------------------"); }
 * 
 * }
 */