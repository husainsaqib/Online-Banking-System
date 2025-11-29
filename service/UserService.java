package com.securenet.bank.service;
import com.securenet.bank.model.User; import com.securenet.bank.repository.UserRepository; import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import org.springframework.stereotype.Service;
import java.util.Optional;
@Service public class UserService {
  private final UserRepository repo; private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
  public UserService(UserRepository r){this.repo=r;}
  public User register(String username, String password){ User u=new User(); u.setUsername(username); u.setPasswordHash(encoder.encode(password)); return repo.save(u); }
  public Optional<User> findByUsername(String u){ return repo.findByUsername(u); }
  public boolean passwordMatches(String raw, String hash){ return encoder.matches(raw, hash); }
}
