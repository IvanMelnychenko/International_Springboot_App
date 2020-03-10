package ua.testing.spring_choose_locale.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.testing.spring_choose_locale.entity.User;
import ua.testing.spring_choose_locale.service.UserService;

@Controller
public class PageController {

  private UserService userService;

  @Autowired
  public PageController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/start")
  public String startApp(Model model) {
    List<User> users = userService.getAllUsers();
    model.addAttribute("users", users);
    return "user-list";
  }

  @GetMapping("/resultUA")
  public String getResultUA(Model model) {
    List<User> users = userService.getUaUsers();
    model.addAttribute("users", users);
    return "user-ua";
  }

  @GetMapping("/resultEN")
  public String getResultEN(Model model) {
    List<User> users = userService.getEnUsers();
    model.addAttribute("users", users);
    return "user-en";
  }
}



