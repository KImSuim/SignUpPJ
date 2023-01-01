package project.signuppj.UserDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.signuppj.UserDB.User;
import java.util.Optional;

public interface UserRepsoitory extends JpaRepository<User,Long> {
    public User findUserByUserName(String userName);
    public User findUserByUserIDAndUserPW(String userID, String userPW);
}
