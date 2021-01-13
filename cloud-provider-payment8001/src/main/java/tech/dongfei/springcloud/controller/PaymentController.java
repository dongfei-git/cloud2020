package tech.dongfei.springcloud.controller;

import org.springframework.web.bind.annotation.RestController;
import tech.dongfei.springcloud.entities.CommonResult;
import tech.dongfei.springcloud.entities.Payment;
import tech.dongfei.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    public CommonResult create(Payment payment){
        int result = paymentService.create
    }
}
