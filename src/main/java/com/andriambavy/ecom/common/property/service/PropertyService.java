package com.andriambavy.ecom.common.property.service;

import com.andriambavy.ecom.common.property.db.entity.Property;
import com.andriambavy.ecom.common.property.db.repository.PropertyRepository;
import com.andriambavy.ecom.common.property.mapper.PropetyMapper;
import com.andriambavy.ecom.common.property.request.PropertyRequest;
import com.andriambavy.ecom.common.property.response.PropertyResponse;
import com.andriambavy.ecom.common.basemodel.service.AbstractBaseService;
import org.springframework.stereotype.Service;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Service
public class PropertyService extends AbstractBaseService<PropertyRequest, Property, PropertyResponse, PropetyMapper> {
    private PropertyRepository repository;
    private PropetyMapper mapper;

    public PropertyService(final PropertyRepository repository, final PropetyMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PropertyRepository getRepository() {
        return repository;
    }

    @Override
    public PropetyMapper getMapper() {
        return mapper;
    }
}
