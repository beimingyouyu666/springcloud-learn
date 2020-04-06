package com.yangk.order.repository;
import com.yangk.order.OrderApplicationTests;
import com.yangk.order.domain.dos.OrderMaster;
import com.yangk.order.enums.OrderStatusEnum;
import com.yangk.order.enums.PayStatusEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1");
        orderMaster.setBuyerName("yangk");
        orderMaster.setBuyerPhone("186");
        orderMaster.setBuyerAddress("186");
        orderMaster.setBuyerOpenid("666");
        orderMaster.setOrderAmount(new BigDecimal("0"));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
    }

}