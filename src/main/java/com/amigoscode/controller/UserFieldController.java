package com.amigoscode.controller;

import com.amigoscode.model.Order;
import com.amigoscode.model.Payment;
import com.amigoscode.model.User;
import com.amigoscode.service.OrderService;
import com.amigoscode.service.PaymentService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Controller
public class UserFieldController {
  private OrderService orderService;
  private PaymentService paymentService;

  public UserFieldController(OrderService orderService, PaymentService paymentService) {
    this.orderService = orderService;
    this.paymentService = paymentService;
  }

  @SchemaMapping(typeName = "User", field = "orders")
  public CompletableFuture<List<Order>> orders(User user) {
    return orderService.getOrdersAsync(user.id());
  }

  @SchemaMapping(typeName = "User", field = "payments")
  public CompletableFuture<List<Payment>> payments(User user) {
    return paymentService.getPaymentsAsync(user.id());
  }
}
