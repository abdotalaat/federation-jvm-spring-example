package com.example.master;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class MasterProduct {
  private String code;
  private ProductTypeInfo productType;
  private String slugName;
  private BrandInfo brand;
  private CategoryInfo category;
  private List<String> tags;
  private Dimensions dimensions;
  private VariantsInfo variantsInfo;
  private Boolean variantEnabled;
  private Map<String, Double> taxRateByCountry; // Country as key and rate as value
  private Map<String, String> productNameByLocale; // Locale as key and product name as value
  private Map<String, String> descriptionByLocale; // Locale as key and description as value
  private List<Image> images;
  private Map<String, Object> attributes; // Use Object for dynamic attributes
  private Boolean isPackagedFood;
  private List<String> barcodes;
  private WeightableAttribute weightableAttributes;
  private Map<String, CountryReadiness> readinessStatus; // Country as key and readiness status as value
  private Map<String, Boolean> hasFoodLabelling; // Country as key and boolean indicating labelling
  private ProductOverride product_override;

}

@Getter
@Setter
class ProductTypeInfo {
  private String id;
}

@Getter
@Setter
class ProductOverride {
  private Map<String, Double> tax_rate_by_country; // Country as key and rate as value
  private List<LocalizedString> product_name_by_locale; // Locale as key and product name as value
  private List<LocalizedString> description_by_locale; // Locale as key and description as value
  private List<Image> images;
}

@Getter
@Setter
class BrandInfo {
  private String slugId;
}

@Getter
@Setter
class CategoryInfo {
  private String id;
}

@Getter
@Setter
class Dimensions {
  private Double size;
  private Double width;
  private Double height;
  private Double length;
  private Double weight;
  private String weightUnit;
  private Long unitsPerPack;
  private String unitOfMeasure;
}

@Getter
@Setter
class VariantsInfo {
  private GroupInfo groupInfo;
  private List<SelectedOption> selectedOptions;
}

@Getter
@Setter
class GroupInfo {
  private String id;
}

@Getter
@Setter
class SelectedOption {
  private VariantAttribute variantAttribute;
  private Option option;
}

@Getter
@Setter
class VariantAttribute {
  private String id;
  private Map<String, String> name; // Locale as key and name as value
}

@Getter
@Setter
class Option {
  private String id;
  private Map<String, String> name; // Locale as key and name as value
}

@Getter
@Setter
class Image {
  private String id;
  private String name;
  private String path;
  private String url;
  private String contentType;
  private Integer contentLength;
}

@Getter
@Setter
class WeightableAttribute {
  private Boolean soldByWeight;
  private Weight minimumStartingWeight;
  private Boolean soldByPiece;
  private Weight averageWeightPerPiece;
}

@Getter
@Setter
class Weight {
  private Double value;
  private String unit;
}

@Getter
@Setter
class CountryReadiness {
  private Boolean isReady;
  private List<String> validationErrors;
}

@Getter
@Setter
@AllArgsConstructor
class LocalizedString{
  String locale;
  String value;
}

