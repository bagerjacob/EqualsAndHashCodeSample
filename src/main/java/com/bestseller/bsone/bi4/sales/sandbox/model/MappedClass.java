package com.bestseller.bsone.bi4.sales.sandbox.model;

import jakarta.persistence.Transient;
import lombok.Data;

@Data
public class MappedClass
{
  @Transient
  private Long version;

}
