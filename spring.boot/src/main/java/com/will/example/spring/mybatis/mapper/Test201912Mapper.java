package com.will.example.spring.mybatis.mapper;

import com.will.example.spring.mybatis.model.Test201912;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by will on 20/1/22.
 */
public interface Test201912Mapper {

    @Select("select * from test_201912")
    @Results(
            {
                    @Result(id = true,  column = "id", property = "id"),
                    @Result(column = "scene", property = "scene")
            }
    )
    Test201912 queryAllRecord();
}
