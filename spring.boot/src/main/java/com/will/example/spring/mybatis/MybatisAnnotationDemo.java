package com.will.example.spring.mybatis;

import com.will.example.spring.mybatis.mapper.Test201912Mapper;
import com.will.example.spring.mybatis.model.Test201912;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by will on 20/1/22.
 */
public class MybatisAnnotationDemo {

    public static void main(String[] args) throws IOException {
        // 读取mybatis-config.xml文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");

        // 初始化mybatis，创建SqlSessionFactory类的实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 创建Session实例
        SqlSession session = sqlSessionFactory.openSession();

        Test201912Mapper mapper = session.getMapper(Test201912Mapper.class);
        Test201912 test201912 = mapper.queryAllRecord();

        System.out.println(test201912);

        session.commit();

        session.close();
    }
}
