package com.securenet.bank.controller;
import com.securenet.bank.model.Account; import com.securenet.bank.repository.AccountRepository; import com.securenet.bank.service.TransferService; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal; import java.util.Map; import java.util.UUID;
@RestController @RequestMapping("/api/v1/accounts") public class AccountController {
  private final AccountRepository repo; private final TransferService transferService;
  public AccountController(AccountRepository r, TransferService t){this.repo=r; this.transferService=t;}
  @GetMapping("/{id}") public ResponseEntity<?> get(@PathVariable UUID id){ return ResponseEntity.ok(repo.findById(id).orElseThrow()); }
  @PostMapping("/{fromId}/transfer") public ResponseEntity<?> transfer(@PathVariable UUID fromId, @RequestBody Map<String,String> b){
    UUID to = UUID.fromString(b.get("toId")); BigDecimal amt = new BigDecimal(b.get("amount")); transferService.transfer(fromId, to, amt);
    return ResponseEntity.ok(Map.of("status","ok"));
  }
}
