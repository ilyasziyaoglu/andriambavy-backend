package com.andriambavy.ecom.accessory.mapper;

import com.andriambavy.ecom.accessory.db.entity.Accessory;
import com.andriambavy.ecom.client.accessory.AccessoryRequest;
import com.andriambavy.ecom.client.accessory.AccessoryResponse;
import com.andriambavy.ecom.common.basemodel.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Mapper(componentModel = "spring")
public interface AccessoryMapper extends BaseMapper<AccessoryRequest, Accessory, AccessoryResponse> {
}
