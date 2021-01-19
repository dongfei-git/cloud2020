package tech.dongfei.springcloud.service;


import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService paymentInfo_OK, o(╥﹏╥)o-----";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService paymentInfo_Timeout, o(╥﹏╥)o-----";
    }
}
