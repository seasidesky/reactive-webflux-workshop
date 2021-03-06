package com.jos.dem.webflux.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@Document
@AllArgsConstructor
public class Person {

  @Id
  private UUID uuid;
  private String nickname;
  private String email;

}
