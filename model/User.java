package com.securenet.bank.model;
import jakarta.persistence.*;
import java.util.UUID;
@Entity @Table(name="users")
public class User {
  @Id private UUID id = UUID.randomUUID();
  @Column(unique=true) private String username;
  @Column private String passwordHash;
  public User() {}
  public UUID getId(){return id;} public String getUsername(){return username;} public void setUsername(String u){this.username=u;}
  public String getPasswordHash(){return passwordHash;} public void setPasswordHash(String p){this.passwordHash=p;}
}
