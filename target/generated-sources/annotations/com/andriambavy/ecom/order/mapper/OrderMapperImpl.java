package com.andriambavy.ecom.order.mapper;

import com.andriambavy.ecom.client.order.OrderRequest;
import com.andriambavy.ecom.client.order.OrderResponse;
import com.andriambavy.ecom.order.db.entity.Order;
import com.andriambavy.ecom.product.db.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-26T13:57:27+0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toEntity(OrderRequest request) {
        if ( request == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( request.getId() );
        order.setUser( request.getUser() );
        List<Product> list = request.getProducts();
        if ( list != null ) {
            order.setProducts( new ArrayList<Product>( list ) );
        }
        order.setBuyerNote( request.getBuyerNote() );
        order.setStatus( request.getStatus() );
        order.setHistory( request.getHistory() );
        order.setPreferedProductOptions( request.getPreferedProductOptions() );
        order.setShippingInfo( request.getShippingInfo() );

        return order;
    }

    @Override
    public OrderResponse toResponse(Order entity) {
        if ( entity == null ) {
            return null;
        }

        OrderResponse orderResponse = new OrderResponse();

        orderResponse.setId( entity.getId() );
        orderResponse.setUser( entity.getUser() );
        List<Product> list = entity.getProducts();
        if ( list != null ) {
            orderResponse.setProducts( new ArrayList<Product>( list ) );
        }
        orderResponse.setBuyerNote( entity.getBuyerNote() );
        orderResponse.setStatus( entity.getStatus() );
        orderResponse.setHistory( entity.getHistory() );
        orderResponse.setPreferedProductOptions( entity.getPreferedProductOptions() );
        orderResponse.setShippingInfo( entity.getShippingInfo() );

        return orderResponse;
    }

    @Override
    public List<Order> toEntity(List<OrderRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( requestList.size() );
        for ( OrderRequest orderRequest : requestList ) {
            list.add( toEntity( orderRequest ) );
        }

        return list;
    }

    @Override
    public List<OrderResponse> toResponse(List<Order> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<OrderResponse> list = new ArrayList<OrderResponse>( requestList.size() );
        for ( Order order : requestList ) {
            list.add( toResponse( order ) );
        }

        return list;
    }
}
