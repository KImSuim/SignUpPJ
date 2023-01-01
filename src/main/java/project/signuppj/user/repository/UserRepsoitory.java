package project.signuppj.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.signuppj.user.entity.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepsoitory extends JpaRepository<User,Long> {
    Optional<User> findByUserID(String userID);
}
