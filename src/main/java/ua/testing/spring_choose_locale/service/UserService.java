package ua.testing.spring_choose_locale.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.testing.spring_choose_locale.entity.Lang;
import ua.testing.spring_choose_locale.entity.User;
import ua.testing.spring_choose_locale.repository.UserRepository;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getEnUsers() {
    return userRepository.findByLang(Lang.EN);
  }

  public List<User> getUaUsers() {
    return userRepository.findByLang(Lang.UA);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
