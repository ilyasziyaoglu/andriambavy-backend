package com.andriambavy.ecom.product.db.entity;


import com.andriambavy.ecom.common.basemodel.db.entity.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-04-18
 */


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "product")
public class Product extends AbstractBaseEntity {

	private static final long serialVersionUID = -6997084654327883455L;

	@Id
	@Column(name = "id", nullable = false)
	@SequenceGenerator(name = "product_id_gen", sequenceName = "product_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_id_gen", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "product_code")
	private String productCode;

	@Column(name = "name")
	private String name;

	@Column(name = "description", length = 2000)
	private String description;

	@Column(name = "main_img_url")
	private String mainImgUrl;

	@Column(name = "img_urls")
	private String imgUrls;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "stock_amount")
	private Integer stockAmount;

	/*
	[
		{
			"title": "PRODUCT INFO",
			"description": "<p>I'm a product detail. I'm a great place to add more information about your product such as sizing, material, care and cleaning instructions. This is also a great space to write what makes this product special and how your customers can benefit from this item. Buyers like to know what they’re getting before they purchase, so give them as much information as possible so they can buy with confidence and certainty.</p>"
		},
		{
			"title": "RETURN AND REFUND POLICY",
			"description": "<p>I’m a Return and Refund policy. I’m a great place to let your customers know what to do in case they are dissatisfied with their purchase. Having a straightforward refund or exchange policy is a great way to build trust and reassure your customers that they can buy with confidence.</p>"
		}
	]
	 */
	@Column(name = "additional_infos", length = 10000)
	private String additionalInfos;

	/*
	{
	  "color": {
		"optionType": "color",
		"name": "Color",
		"choices": [
		  {
			"value": "#6f4b25",
			"description": "Brown",
			"inStock": true,
		  }
		]
	  }
	}
	 */
	@Column(name = "product_options", length = 10000)
	private String productOptions;

	@Column(name = "collection")
	private String collection;

	@Column(name = "category")
	private String category;

	@Override
	public Long getId() {
		return this.id;
	}
}
