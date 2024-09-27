package com.example.products;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDetails {
  private String code;
  private String country;
  private List<String> override_ids;
}
