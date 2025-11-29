package com.securenet.bank.service;
import com.securenet.bank.model.Account; import com.securenet.bank.repository.AccountRepository; import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal; import java.util.UUID;
@Service public class TransferService {
  private final AccountRepository repo;
  public TransferService(AccountRepository r){this.repo=r;}
  @Transactional public void transfer(UUID fromId, UUID toId, BigDecimal amount){
    var from = repo.findById(fromId).orElseThrow(); var to = repo.findById(toId).orElseThrow();
    if(from.getBalance().compareTo(amount) < 0) throw new RuntimeException("Insufficient");
    from.setBalance(from.getBalance().subtract(amount)); to.setBalance(to.getBalance().add(amount));
    repo.save(from); repo.save(to);
  }
}
