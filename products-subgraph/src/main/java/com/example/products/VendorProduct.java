package com.example.products;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class VendorProduct {
  private String id;
  private String vendorId;
  private String globalEntityId;
  private String globalVendorId;
  private String catalogVendorId;
  private String platformVendorId;
  private Long timestamp;
  private String vendorProductId;
  private String remoteProductId;
  private Boolean active;
  private Boolean available;
  private Boolean deleted;
  private String salesBuffer;
  private String maximumSalesQuantity;
  private Long creationDate;
  private Long updatedDate;
  private Double price;
  private Double originalPrice;
  private String defaultLocale;
  private String skuStatus;
  private Boolean vendorPosIntegrated;
  private String platformType;
  private Long chainId;
  private String sku;
  private List<String> tags;
  private ProductDetails productDetails;
  private String parentId;
  private Double minPriceLastMonth;
  private Boolean isBundle;
  private String uuid;
  private Double baseWeight;
  private Double pricePerBaseWeight;


}
