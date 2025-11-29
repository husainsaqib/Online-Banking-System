package com.securenet.bank.controller;
import com.securenet.bank.service.UserService; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestController @RequestMapping("/api/v1/auth") public class AuthController {
  private final UserService userService;
  public AuthController(UserService us){this.userService=us;}
  @PostMapping("/register") public ResponseEntity<?> register(@RequestBody Map<String,String> b){ var u=userService.register(b.get("username"), b.get("password")); return ResponseEntity.ok(Map.of("id",u.getId(),"username",u.getUsername())); }
  @PostMapping("/login") public ResponseEntity<?> login(@RequestBody Map<String,String> b){
    var opt = userService.findByUsername(b.get("username")); if(opt.isEmpty()) return ResponseEntity.status(401).body(Map.of("error","invalid"));
    var u = opt.get(); if(!userService.passwordMatches(b.get("password"), u.getPasswordHash())) return ResponseEntity.status(401).body(Map.of("error","invalid"));
    return ResponseEntity.ok(Map.of("token","demo-token-for-"+u.getUsername()));
  }
}
