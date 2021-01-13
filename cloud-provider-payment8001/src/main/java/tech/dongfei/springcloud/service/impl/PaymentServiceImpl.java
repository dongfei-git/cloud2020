package tech.dongfei.springcloud.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import tech.dongfei.springcloud.dao.PaymentDao;
import tech.dongfei.springcloud.entities.Payment;
import tech.dongfei.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }

}
