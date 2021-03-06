package com.linyuan.mysql01.dao;

import com.linyuan.mysql01.bean.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author dengxi
 * @Date 2021/3/7 11:03 下午
 * @desc:描述
 */
@Mapper
public interface OrdersMapper {
    @Insert("insert into orders(user_id, amount, status, create_time) values(#{userId}, #{amount}, #{status}, #{createTime})")
    int insert(Orders orders);

    @Insert("insert into orders(id, user_id, amount, status, create_time) values(#{id}, #{userId}, #{amount}, #{status}, #{createTime})")
    int insertV2(Orders orders);
}
