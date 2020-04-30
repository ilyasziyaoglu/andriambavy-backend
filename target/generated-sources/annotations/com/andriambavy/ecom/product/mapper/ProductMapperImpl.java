package com.andriambavy.ecom.product.mapper;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.client.product.ProductResponse;
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
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( request.getId() );
        product.setProductCode( request.getProductCode() );
        product.setName( request.getName() );
        product.setDescription( request.getDescription() );
        product.setMainImgUrl( request.getMainImgUrl() );
        product.setImgUrls( request.getImgUrls() );
        product.setPrice( request.getPrice() );
        product.setStockAmount( request.getStockAmount() );
        product.setAdditionalInfos( request.getAdditionalInfos() );
        product.setProductOptions( request.getProductOptions() );
        product.setCollection( request.getCollection() );
        product.setCategory( request.getCategory() );

        return product;
    }

    @Override
    public ProductResponse toResponse(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductResponse productResponse = new ProductResponse();

        productResponse.setId( entity.getId() );
        productResponse.setProductCode( entity.getProductCode() );
        productResponse.setName( entity.getName() );
        productResponse.setDescription( entity.getDescription() );
        productResponse.setMainImgUrl( entity.getMainImgUrl() );
        productResponse.setImgUrls( entity.getImgUrls() );
        productResponse.setPrice( entity.getPrice() );
        productResponse.setStockAmount( entity.getStockAmount() );
        productResponse.setAdditionalInfos( entity.getAdditionalInfos() );
        productResponse.setProductOptions( entity.getProductOptions() );
        productResponse.setCollection( entity.getCollection() );
        productResponse.setCategory( entity.getCategory() );

        return productResponse;
    }

    @Override
    public List<Product> toEntity(List<ProductRequest> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( requestList.size() );
        for ( ProductRequest productRequest : requestList ) {
            list.add( toEntity( productRequest ) );
        }

        return list;
    }

    @Override
    public List<ProductResponse> toResponse(List<Product> requestList) {
        if ( requestList == null ) {
            return null;
        }

        List<ProductResponse> list = new ArrayList<ProductResponse>( requestList.size() );
        for ( Product product : requestList ) {
            list.add( toResponse( product ) );
        }

        return list;
    }
}
