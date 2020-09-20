package com.cyc.dao;

import com.cyc.pojo.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(String wechatId);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(String wechatId);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}