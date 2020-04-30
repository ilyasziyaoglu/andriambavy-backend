package com.andriambavy.ecom.client.product;

import com.andriambavy.ecom.common.basemodel.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductRequest extends BaseRequest {

	private String productCode;
	private String name;
	private String description;
	private String mainImgUrl;
	private String imgUrls;
	private BigDecimal price;
	private Integer stockAmount;
	private String additionalInfos;
	private String productOptions;
	private String collection;
	private String category;
}
