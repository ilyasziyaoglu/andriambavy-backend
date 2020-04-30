package com.andriambavy.ecom.client.order;

import com.andriambavy.ecom.common.enums.Status;
import com.andriambavy.ecom.common.basemodel.response.BaseResponse;
import com.andriambavy.ecom.product.db.entity.Product;
import com.andriambavy.ecom.user.db.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderResponse extends BaseResponse {

	private User user;
	private List<Product> products = new ArrayList<>();
	private String buyerNote;
	private Status status;
	private String history;
	private String preferedProductOptions;
	private String shippingInfo;
}
