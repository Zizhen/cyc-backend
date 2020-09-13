package com.cyc.dao;

import com.cyc.pojo.Payment;

public interface PaymentMapper {
    int deleteByPrimaryKey(Integer uuid);

    int insert(Payment record);

    int insertSelective(Payment record);

    Payment selectByPrimaryKey(Integer uuid);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}