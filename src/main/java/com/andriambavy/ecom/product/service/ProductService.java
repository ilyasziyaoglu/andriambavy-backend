package com.andriambavy.ecom.product.service;

import com.andriambavy.ecom.client.product.ProductRequest;
import com.andriambavy.ecom.client.product.ProductResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import com.andriambavy.ecom.product.db.entity.Product;
import com.andriambavy.ecom.product.db.repository.ProductRepository;
import com.andriambavy.ecom.product.mapper.ProductMapper;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class ProductService extends AbstractBaseService<ProductRequest, Product, ProductResponse, ProductMapper> {
    private ProductRepository repository;
    private ProductMapper mapper;

    public ProductService(final ProductRepository repository, final ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProductRepository getRepository() {
        return repository;
    }

    @Override
    public ProductMapper getMapper() {
        return mapper;
    }
}
