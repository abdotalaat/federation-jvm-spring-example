package com.example.master;

import org.springframework.graphql.data.federation.EntityMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductResolver {

  // Example of a service to fetch products
  private final ProductService productService;

  public ProductResolver(ProductService productService) {
    this.productService = productService;
  }

  @QueryMapping
  public MasterProduct getMasterProduct(@Argument String code, @Argument String country, @Argument List<String> override_ids) {

    return productService.findByMasterProductCode(code,override_ids);

  }



  @EntityMapping
  public MasterProduct masterProduct(@Argument String code, @Argument String country, @Argument List<String> override_ids) {
    return productService.findByMasterProductCode(code, override_ids);
  }

  @QueryMapping
  public List<MasterProduct> listProducts() {
    return productService.findAll();
  }
}

