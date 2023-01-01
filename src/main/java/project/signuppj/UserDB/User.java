package project.signuppj.UserDB;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long userNumber;
    private String userID;
    private String userPW;
    private String userName;


    public User(String userID, String userPW, String userName) {
        this.userID = userID;
        this.userPW = userPW;
        this.userName = userName;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userID.equals(user.userID) &&
                userName.equals(user.userName)&&
                userPW.equals(user.userPW);
    }

//    public int hashCode() {
//        return Object.hash(userID,userPW,userName);
//    }
}
