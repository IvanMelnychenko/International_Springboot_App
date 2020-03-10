package ua.testing.spring_choose_locale.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.testing.spring_choose_locale.entity.Lang;
import ua.testing.spring_choose_locale.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  List<User> findByLang(Lang lang);
}
