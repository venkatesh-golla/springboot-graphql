package com.amigoscode.service;

import com.amigoscode.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PaymentService {
  public List<Payment> getPayments(String userId) {
    sleep(1000);
    return List.of(new Payment("P1", 50.0), new Payment("P2", 75.0));
  }

  public CompletableFuture<List<Payment>> getPaymentsAsync(String userId) {
    return CompletableFuture.supplyAsync(() -> getPayments(userId));
  }

  public void sleep(long ms) {
    try {
      Thread.sleep(ms);
    } catch (Exception ex) {
    }
  }
}
