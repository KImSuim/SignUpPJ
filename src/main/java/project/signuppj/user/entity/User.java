package project.signuppj.user.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

}
