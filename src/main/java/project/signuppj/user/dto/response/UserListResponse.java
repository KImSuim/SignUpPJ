package project.signuppj.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserListResponse {
    private Long id;
    private String userId;
    private String userName;
}
