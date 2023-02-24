/*
 * package com.cropbazaar;
 * 
 * import org.springframework.boot.jdbc.DataSourceBuilder; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.Primary;
 * 
 * @Configuration public class JpaConfig {
 * 
 * @Bean(name = "mySqlDataSource")
 * 
 * @Primary public DataSource mySqlDataSource() { DataSourceBuilder
 * dataSourceBuilder = DataSourceBuilder.create();
 * dataSourceBuilder.url("jdbc:mysql://localhost/testdb");
 * dataSourceBuilder.username("dbuser"); dataSourceBuilder.password("dbpass");
 * return dataSourceBuilder.build(); } }
 */
