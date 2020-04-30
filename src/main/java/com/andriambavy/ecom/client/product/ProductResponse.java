package com.andriambavy.ecom.client.product;

import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductResponse extends BaseResponse {

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
