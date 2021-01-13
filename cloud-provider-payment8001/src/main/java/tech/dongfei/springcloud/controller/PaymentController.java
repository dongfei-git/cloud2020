package tech.dongfei.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tech.dongfei.springcloud.entities.CommonResult;
import tech.dongfei.springcloud.entities.Payment;
import tech.dongfei.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果"+result);
        if(result > 0){
            return new CommonResult(200, "插入数据库成功", result);
        }else {
            return new CommonResult(444,"插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******插入结果"+payment+"haha");

        if(payment != null){
            return new CommonResult(200, "查询数据库成功", payment);
        }else {
            return new CommonResult(404,"查询数据库失败，ID是"+id, null);
        }
    }
}
