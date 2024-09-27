package com.example.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.federation.EntityMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VendorProductResolver {

  @Autowired
  private VendorProductService vendorProductService;

  @QueryMapping
  public VendorProduct getVendorProductById(@Argument  String id) {
    // Implement logic to retrieve VendorProduct by ID from your data source
    return getAllVendorProducts().get(0);
  }





  @QueryMapping
  public List<VendorProduct> getAllVendorProducts() {
    List<VendorProduct> vendorProducts = new ArrayList<>();
    vendorProducts.add(
      createVendorProduct("1",
        "VENDOR_001",
        "global_001",
        "vendor_001",
        "catalog_001",
        "platform_001",
        System.currentTimeMillis(),
        "product_001",
        "remote_001",
        true,
        true,
        false,
        "100",
        "1000",
        System.currentTimeMillis(),
        System.currentTimeMillis(),
        19.99,
        29.99,
        "en-US",
        "in-stock",
        true,
        "ecommerce",
        42L,
        "SKU001",
        List.of("new", "sale"),
        "parent_001",
        15.99,
        false,
        "uuid_001",
        0.5,
        19.99,
        createProductDetails("MPC001", "US", List.of("OVR1", "OVR2"))));

    vendorProducts.add(
      createVendorProduct("2",
        "VENDOR_002",
        "global_002",
        "vendor_002",
        "catalog_002",
        "platform_002",
        System.currentTimeMillis(),
        "product_002",
        "remote_002",
        false,
        true,
        true,
        "200",
        "2000",
        System.currentTimeMillis(),
        System.currentTimeMillis(),
        29.99,
        39.99,
        "en-GB",
        "out-of-stock",
        false,
        "delivery",
        43L,
        "SKU002",
        List.of("featured"),
        "parent_002",
        25.99,
        true,
        "uuid_002",
        1.0,
        25.99,
        createProductDetails("MPC67890", "UK", List.of("OVR3"))));

    return vendorProducts;
  }

  private VendorProduct createVendorProduct(
    String id,
    String vendorId,
    String globalEntityId,
    String globalVendorId,
    String catalogVendorId,
    String platformVendorId,
    Long timestamp,
    String vendorProductId,
    String remoteProductId,
    Boolean active,
    Boolean available,
    Boolean deleted,
    String salesBuffer,
    String maximumSalesQuantity,
    Long creationDate,
    Long updatedDate,
    Double price,
    Double originalPrice,
    String defaultLocale,
    String skuStatus,
    Boolean vendorPosIntegrated,
    String platformType,
    Long chainId,
    String sku,
    List<String> tags,
    String parentId,
    Double minPriceLastMonth,
    Boolean isBundle,
    String uuid,
    Double baseWeight,
    Double pricePerBaseWeight,
    ProductDetails productDetails) {

    VendorProduct product = new VendorProduct();
    product.setId(id);
    product.setVendorId(vendorId);
    product.setGlobalEntityId(globalEntityId);
    product.setGlobalVendorId(globalVendorId);
    product.setCatalogVendorId(catalogVendorId);
    product.setPlatformVendorId(platformVendorId);
    product.setTimestamp(timestamp);
    product.setVendorProductId(vendorProductId);
    product.setRemoteProductId(remoteProductId);
    product.setActive(active);
    product.setAvailable(available);
    product.setDeleted(deleted);
    product.setSalesBuffer(salesBuffer);
    product.setMaximumSalesQuantity(maximumSalesQuantity);
    product.setCreationDate(creationDate);
    product.setUpdatedDate(updatedDate);
    product.setPrice(price);
    product.setOriginalPrice(originalPrice);
    product.setDefaultLocale(defaultLocale);
    product.setSkuStatus(skuStatus);
    product.setVendorPosIntegrated(vendorPosIntegrated);
    product.setPlatformType(platformType);
    product.setChainId(chainId);
    product.setSku(sku);
    product.setTags(tags);
    product.setParentId(parentId);
    product.setMinPriceLastMonth(minPriceLastMonth);
    product.setIsBundle(isBundle);
    product.setUuid(uuid);
    product.setBaseWeight(baseWeight);
    product.setPricePerBaseWeight(pricePerBaseWeight);
    product.setProductDetails(productDetails);
    return product;
  }

  private ProductDetails createProductDetails(
    String masterProductCode, String country, List<String> overrideIds) {
    ProductDetails details = new ProductDetails();
    details.setCode(masterProductCode);
    details.setCountry(country);
    details.setOverride_ids(overrideIds);
    return details;
  }
}
