package com.example.master;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

  // Inject repository or any data source
  public MasterProduct findByMasterProductCode(String masterProductCode, List<String> override_ids) {
    // Sample Product 1
    if ("MPC12345".equals(masterProductCode)) {
      MasterProduct product = new MasterProduct();
      product.setCode("MPC12345");
      product.setSlugName("apple-iphone-13");
      product.setBrand(new BrandInfo());
      product.getBrand().setSlugId("apple");

      product.setCategory(new CategoryInfo());
      product.getCategory().setId("CAT456");
      product.setTags(List.of("electronics", "smartphone"));

      Dimensions dimensions = new Dimensions();
      dimensions.setSize(10.5);
      dimensions.setWidth(5.0);
      dimensions.setHeight(0.3);
      dimensions.setLength(14.0);
      dimensions.setWeight(0.174);
      dimensions.setWeightUnit("kg");
      dimensions.setUnitsPerPack(1L);
      dimensions.setUnitOfMeasure("piece");
      product.setDimensions(dimensions);

      product.setVariantEnabled(true);
      product.setTaxRateByCountry(Map.of("US", 7.5, "DE", 19.0));
      product.setProductNameByLocale(
        Map.of("en-US", "Apple iPhone 13", "de-DE", "Apple iPhone 13"));
      product.setDescriptionByLocale(
        Map.of(
          "en-US",
          "Latest model of the Apple iPhone",
          "de-DE",
          "Neueste Modell des Apple iPhone"));

      List<Image> images = new ArrayList<>();
      Image image = new Image();
      image.setId("IMG001");
      image.setName("front-view");
      image.setPath("/images/iphone13/front-view.jpg");
      image.setUrl("https://example.com/images/iphone13/front-view.jpg");
      image.setContentType("image/jpeg");
      image.setContentLength(204800);
      images.add(image);
      product.setImages(images);

      product.setIsPackagedFood(false);
      product.setBarcodes(List.of("012345678905", "012345678906"));

      WeightableAttribute weightableAttributes = new WeightableAttribute();
      weightableAttributes.setSoldByWeight(true);
      weightableAttributes.setMinimumStartingWeight(new Weight());
      weightableAttributes.getMinimumStartingWeight().setValue(0.5);
      weightableAttributes.getMinimumStartingWeight().setUnit("kg");
      weightableAttributes.setSoldByPiece(false);
      weightableAttributes.setAverageWeightPerPiece(new Weight());
      weightableAttributes.getAverageWeightPerPiece().setValue(0.3);
      weightableAttributes.getAverageWeightPerPiece().setUnit("kg");
      product.setWeightableAttributes(weightableAttributes);

      product.setHasFoodLabelling(Map.of("US", false));

      if (!override_ids.isEmpty()) {
        ProductOverride override = new ProductOverride();
        override.setProduct_name_by_locale(List.of(new LocalizedString("en_SG", "Test Abdou")));
        product.setProduct_override(override);
      }

      return product;
    }

    // Sample Product 2
    if ("MPC67890".equals(masterProductCode) || "MPC001".equalsIgnoreCase(masterProductCode)) {
      MasterProduct product = new MasterProduct();
      product.setCode("MPC67890");
      product.setSlugName("samsung-galaxy-s21");
      product.setBrand(new BrandInfo());
      product.getBrand().setSlugId("samsung");

      product.setCategory(new CategoryInfo());
      product.getCategory().setId("CAT789");
      product.setTags(List.of("electronics", "smartphone"));

      Dimensions dimensions = new Dimensions();
      dimensions.setSize(11.0);
      dimensions.setWidth(5.8);
      dimensions.setHeight(0.7);
      dimensions.setLength(15.0);
      dimensions.setWeight(0.166);
      dimensions.setWeightUnit("kg");
      dimensions.setUnitsPerPack(1L);
      dimensions.setUnitOfMeasure("piece");
      product.setDimensions(dimensions);

      product.setVariantEnabled(true);
      product.setTaxRateByCountry(Map.of("US", 7.5));
      product.setProductNameByLocale(Map.of("en-US", "Samsung Galaxy S21"));
      product.setDescriptionByLocale(Map.of("en-US", "Latest model of the Samsung Galaxy"));

      List<Image> images = new ArrayList<>();
      Image image = new Image();
      image.setId("IMG002");
      image.setName("back-view");
      image.setPath("/images/samsung-galaxy-s21/back-view.jpg");
      image.setUrl("https://example.com/images/samsung-galaxy-s21/back-view.jpg");
      image.setContentType("image/jpeg");
      image.setContentLength(204800);
      images.add(image);
      product.setImages(images);

      product.setIsPackagedFood(false);
      product.setBarcodes(List.of("012345678907", "012345678908"));

      WeightableAttribute weightableAttributes = new WeightableAttribute();
      weightableAttributes.setSoldByWeight(false);
      weightableAttributes.setMinimumStartingWeight(new Weight());
      weightableAttributes.getMinimumStartingWeight().setValue(0.0);
      weightableAttributes.getMinimumStartingWeight().setUnit("kg");
      weightableAttributes.setSoldByPiece(true);
      weightableAttributes.setAverageWeightPerPiece(new Weight());
      weightableAttributes.getAverageWeightPerPiece().setValue(0.0);
      weightableAttributes.getAverageWeightPerPiece().setUnit("kg");
      product.setWeightableAttributes(weightableAttributes);

      product.setHasFoodLabelling(Map.of("US", false));
      if (!override_ids.isEmpty()) {
        ProductOverride override = new ProductOverride();
        override.setProduct_name_by_locale(List.of(new LocalizedString("en_SG", "Test Abdou")));
        product.setProduct_override(override);
      }

      return product;
    }

    // If no product is found, return null or throw an exception
    return null;
  }

  public List<MasterProduct> findAll() {
    List<MasterProduct> products = new ArrayList<>();

    // Sample Product 1
    MasterProduct product1 = new MasterProduct();
    product1.setCode("MPC12345");
    product1.setSlugName("apple-iphone-13");
    product1.setBrand(new BrandInfo());
    product1.getBrand().setSlugId("apple");
    product1.setCategory(new CategoryInfo());
    product1.getCategory().setId("CAT456");
    product1.setTags(List.of("electronics", "smartphone"));

    Dimensions dimensions1 = new Dimensions();
    dimensions1.setSize(10.5);
    dimensions1.setWidth(5.0);
    dimensions1.setHeight(0.3);
    dimensions1.setLength(14.0);
    dimensions1.setWeight(0.174);
    dimensions1.setWeightUnit("kg");
    dimensions1.setUnitsPerPack(1L);
    dimensions1.setUnitOfMeasure("piece");
    product1.setDimensions(dimensions1);

    product1.setVariantEnabled(true);
    product1.setTaxRateByCountry(Map.of("US", 7.5, "DE", 19.0));
    product1.setProductNameByLocale(Map.of("en-US", "Apple iPhone 13", "de-DE", "Apple iPhone 13"));
    product1.setDescriptionByLocale(
      Map.of(
        "en-US",
        "Latest model of the Apple iPhone",
        "de-DE",
        "Neueste Modell des Apple iPhone"));

    List<Image> images1 = new ArrayList<>();
    Image image1 = new Image();
    image1.setId("IMG001");
    image1.setName("front-view");
    image1.setPath("/images/iphone13/front-view.jpg");
    image1.setUrl("https://example.com/images/iphone13/front-view.jpg");
    image1.setContentType("image/jpeg");
    image1.setContentLength(204800);
    images1.add(image1);
    product1.setImages(images1);

    product1.setIsPackagedFood(false);
    product1.setBarcodes(List.of("012345678905", "012345678906"));

    WeightableAttribute weightableAttributes1 = new WeightableAttribute();
    weightableAttributes1.setSoldByWeight(true);
    weightableAttributes1.setMinimumStartingWeight(new Weight());
    weightableAttributes1.getMinimumStartingWeight().setValue(0.5);
    weightableAttributes1.getMinimumStartingWeight().setUnit("kg");
    weightableAttributes1.setSoldByPiece(false);
    weightableAttributes1.setAverageWeightPerPiece(new Weight());
    weightableAttributes1.getAverageWeightPerPiece().setValue(0.3);
    weightableAttributes1.getAverageWeightPerPiece().setUnit("kg");
    product1.setWeightableAttributes(weightableAttributes1);

    product1.setHasFoodLabelling(Map.of("US", false));

    products.add(product1);

    // Sample Product 2
    MasterProduct product2 = new MasterProduct();
    product2.setCode("MPC67890");
    product2.setSlugName("samsung-galaxy-s21");
    product2.setBrand(new BrandInfo());
    product2.getBrand().setSlugId("samsung");
    product2.setCategory(new CategoryInfo());
    product2.getCategory().setId("CAT789");
    product2.setTags(List.of("electronics", "smartphone"));

    Dimensions dimensions2 = new Dimensions();
    dimensions2.setSize(11.0);
    dimensions2.setWidth(5.8);
    dimensions2.setHeight(0.7);
    dimensions2.setLength(15.0);
    dimensions2.setWeight(0.166);
    dimensions2.setWeightUnit("kg");
    dimensions2.setUnitsPerPack(1L);
    dimensions2.setUnitOfMeasure("piece");
    product2.setDimensions(dimensions2);

    product2.setVariantEnabled(true);
    product2.setTaxRateByCountry(Map.of("US", 7.5));
    product2.setProductNameByLocale(Map.of("en-US", "Samsung Galaxy S21"));
    product2.setDescriptionByLocale(Map.of("en-US", "Latest model of the Samsung Galaxy"));

    List<Image> images2 = new ArrayList<>();
    Image image2 = new Image();
    image2.setId("IMG002");
    image2.setName("back-view");
    image2.setPath("/images/samsung-galaxy-s21/back-view.jpg");
    image2.setUrl("https://example.com/images/samsung-galaxy-s21/back-view.jpg");
    image2.setContentType("image/jpeg");
    image2.setContentLength(204800);
    images2.add(image2);
    product2.setImages(images2);

    product2.setIsPackagedFood(false);
    product2.setBarcodes(List.of("012345678907", "012345678908"));

    WeightableAttribute weightableAttributes2 = new WeightableAttribute();
    weightableAttributes2.setSoldByWeight(false);
    weightableAttributes2.setMinimumStartingWeight(new Weight());
    weightableAttributes2.getMinimumStartingWeight().setValue(0.0);
    weightableAttributes2.getMinimumStartingWeight().setUnit("kg");
    weightableAttributes2.setSoldByPiece(true);
    weightableAttributes2.setAverageWeightPerPiece(new Weight());
    weightableAttributes2.getAverageWeightPerPiece().setValue(0.0);
    weightableAttributes2.getAverageWeightPerPiece().setUnit("kg");
    product2.setWeightableAttributes(weightableAttributes2);

    product2.setHasFoodLabelling(Map.of("US", false));

    products.add(product2);

    return products;
  }
}
