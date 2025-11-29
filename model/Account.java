package com.securenet.bank.model;
import jakarta.persistence.*;
import java.math.BigDecimal; import java.util.UUID;
@Entity @Table(name="accounts")
public class Account {
  @Id private UUID id = UUID.randomUUID();
  @Column(unique=true) private String accountNumber;
  @ManyToOne private User owner;
  @Column(precision=19, scale=4) private BigDecimal balance = BigDecimal.ZERO;
  public Account() {}
  public UUID getId(){return id;} public String getAccountNumber(){return accountNumber;} public void setAccountNumber(String s){this.accountNumber=s;}
  public User getOwner(){return owner;} public void setOwner(User u){this.owner=u;}
  public BigDecimal getBalance(){return balance;} public void setBalance(BigDecimal b){this.balance=b;}
}
