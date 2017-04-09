package com.flexible.dev.base.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by lsylsy289.
 * Since 2017-04-03
 */
@Configuration
@MapperScan(basePackages="com.flexible.dev")
@EnableTransactionManagement
public class DatabaseConfig {

    public static final String CONFIG_LOCATION_PATH = "classpath:config/mybatis-config.xml";
    public static final String MAPPER_LOCATIONS_PATH = "com.flexible.dev.*/**.xml";

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setConfigLocation(pathResolver.getResource(CONFIG_LOCATION_PATH));
        sqlSessionFactoryBean.setMapperLocations(pathResolver.getResources(MAPPER_LOCATIONS_PATH));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
        final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSessionTemplate;
    }
}