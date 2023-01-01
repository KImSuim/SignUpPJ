package project.signuppj.user.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public final class UserRequest {
    private String userID;
    private String userPW;
    private String userName;
}
