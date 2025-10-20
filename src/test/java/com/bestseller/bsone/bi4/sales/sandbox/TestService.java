package com.bestseller.bsone.bi4.sales.sandbox;


import com.bestseller.bsone.bi4.sales.sandbox.model.EqualsAndHashFalse;
import com.bestseller.bsone.bi4.sales.sandbox.model.EqualsAndHashTrue;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

@Slf4j
public class TestService {


  private final net.datafaker.Faker faker = new net.datafaker.Faker();
  @Test
  @DisplayName(" test using EqualsAndHashFalse, comparing next too each other ")
  void testModels() {
    log.info("test using EqualsAndHashFalse, comparing next too each other ");
    EqualsAndHashFalse modelA = new EqualsAndHashFalse();
    modelA.setName(faker.name().fullName());
    modelA.setVersion(1L );
    EqualsAndHashFalse modelB = new EqualsAndHashFalse();
    modelB.setName(modelA.getName());
    modelB.setVersion(2L );

    log.info("modelA: {}", modelA.hashCode());
    log.info("modelB: {}", modelB.hashCode());
    assert modelA.hashCode() == modelB.hashCode();
  }

  @Test
  @DisplayName(" test using EqualsAndHashTrue, comparing next too each other ")
  void testModels2() {
    log.info(" test using EqualsAndHashTrue, comparing next too each other ");
    EqualsAndHashTrue modelA = new EqualsAndHashTrue();
    modelA.setName(faker.name().fullName());
    modelA.setVersion(1L );
    EqualsAndHashTrue modelB = new EqualsAndHashTrue();
    modelB.setName(modelA.getName());
    modelB.setVersion(2L );
    log.info("modelA: {}", modelA.hashCode());
    log.info("modelB: {}", modelB.hashCode());
    assert modelA.hashCode() != modelB.hashCode();
  }

  @Test
  @DisplayName(" test using EqualsAndHashFalse in a set ")
  void testHashSetWithFalse() {
    HashSet<EqualsAndHashFalse> set = new HashSet<>();
    log.info(" test using EqualsAndHashFalse in a set ");
    EqualsAndHashFalse modelA = new EqualsAndHashFalse();
    modelA.setName(faker.name().fullName());
    modelA.setVersion(1L );
    set.add(modelA);
    EqualsAndHashFalse modelB = new EqualsAndHashFalse();
    modelB.setName(modelA.getName());
    modelB.setVersion(2L );
    set.add(modelB);
    log.info("set: {}", set);
    assert set.size() == 1;
  }

  @Test
  @DisplayName(" test using EqualsAndHashTrue in a set ")
  void testHashSetWithTrue() {
    HashSet<EqualsAndHashTrue> set = new HashSet<>();
    log.info(" test using EqualsAndHashTrue in a set ");
    EqualsAndHashTrue modelA = new EqualsAndHashTrue();
    modelA.setName(faker.name().fullName());
    modelA.setVersion(1L );
    set.add(modelA);
    EqualsAndHashTrue modelB = new EqualsAndHashTrue();
    modelB.setName(modelA.getName());
    modelB.setVersion(2L );
    set.add(modelB);
    log.info("set: {}", set);
    for (EqualsAndHashTrue equalsAndHashTrue : set) {
      log.info("equalsAndHashTrue: {}", equalsAndHashTrue.hashCode());
    }
    assert set.size() == 2;
  }


}
