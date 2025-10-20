package com.bestseller.bsone.bi4.sales.sandbox.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EqualsAndHashFalse extends MappedClass {

  private String name;
}

