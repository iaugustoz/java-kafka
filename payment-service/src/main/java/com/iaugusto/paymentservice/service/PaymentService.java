package com.iaugusto.paymentservice.service;

import com.iaugusto.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
