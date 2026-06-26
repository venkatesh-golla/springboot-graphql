package com.amigoscode.service;

import com.amigoscode.model.Order;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  public List<Order> getOrders(String userId) {
    sleep(1000);
    return List.of(new Order("1", 100.0), new Order("2", 200.0));
  }

  public CompletableFuture<List<Order>> getOrdersAsync(String userId) {
    return CompletableFuture.supplyAsync(() -> getOrders(userId));
  }

  public void sleep(long ms) {
    try {
      Thread.sleep(ms);
    } catch (Exception ex) {
    }
  }
}
