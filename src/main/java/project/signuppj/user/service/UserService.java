package project.signuppj.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.signuppj.user.dto.response.UserListResponse;
import project.signuppj.user.entity.User;
import project.signuppj.user.repository.UserRepsoitory;
import project.signuppj.user.dto.request.UserRequest;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepsoitory userRepsoitory;

    public String join(UserRequest request){
        userRepsoitory.save(User.builder()
                .userID(request.getUserID())
                .userPW(request.getUserPW())
                .userName(request.getUserName())
                .build());
        return "Success";
    }

    public List<UserListResponse> userList() {
        List<User> userList = userRepsoitory.findAll();
        List<UserListResponse> userListResponse = new ArrayList<>();
        for (User user : userList) {
            userListResponse.add(new UserListResponse(user.getUserNumber(),user.getUserID(),user.getUserName()));

        }
        return userListResponse;
    }
}
