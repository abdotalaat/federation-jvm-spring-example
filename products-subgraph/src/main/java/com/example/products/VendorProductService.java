package com.example.products;

import org.springframework.stereotype.Service;

@Service
public class VendorProductService {

  // Example method to convert Protobuf VendorProduct to GraphQL VendorProduct
  public VendorProduct getVendorProductById(String id) {
    // Fetch the VendorProduct from your data source, possibly as a Protobuf object

    // Convert the Protobuf object to the GraphQL object
    VendorProduct graphqlProduct = convertToGraphQL(new VendorProduct());

    return graphqlProduct;
  }

  private VendorProduct convertToGraphQL(VendorProduct protoProduct) {
    VendorProduct product = new VendorProduct();
    product.setVendorId(protoProduct.getVendorId());
    product.setGlobalEntityId(protoProduct.getGlobalEntityId());
    // Map other fields accordingly...
    return product;
  }
}
