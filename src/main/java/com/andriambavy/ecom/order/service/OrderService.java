package com.andriambavy.ecom.order.service;

import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.client.order.OrderResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.order.db.entity.Order;
import com.andriambavy.ecom.order.db.repository.OrderRepository;
import com.andriambavy.ecom.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class OrderService extends AbstractBaseService<OrderRequest, Order, OrderResponse, OrderMapper> {
    private OrderRepository repository;
    private OrderMapper mapper;

    public OrderService(final OrderRepository repository, final OrderMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public OrderRepository getRepository() {
        return repository;
    }

    @Override
    public OrderMapper getMapper() {
        return mapper;
    }
}
