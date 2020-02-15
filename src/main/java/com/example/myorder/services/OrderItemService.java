package com.example.myorder.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myorder.api.dtos.CreateOrderItemDto;
import com.example.myorder.entities.Order;
import com.example.myorder.entities.OrderItem;
import com.example.myorder.entities.Product;
import com.example.myorder.repositories.OrderItemRepository;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductService productService;

    public List<OrderItem> createOrderItens(List<CreateOrderItemDto> itens, Order order) {
        return itens.stream()
                .map(createOrderItemDto -> buildOrderItem(createOrderItemDto, order))
                .collect(Collectors.toList());
    }

    private OrderItem buildOrderItem(CreateOrderItemDto createOrderItemDto, Order order) {
        return new OrderItem()
                .setProduct(productService.findById(createOrderItemDto.getProductId()))
                .setOrder(order)
                .setQuantity(createOrderItemDto.getQuantity());
    }

    private Product find(List<Integer> productsId) {

    }
}
