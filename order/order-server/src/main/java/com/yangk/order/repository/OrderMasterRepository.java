package com.yangk.order.repository;

import com.yangk.order.domain.dos.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
