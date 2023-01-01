package project.signuppj.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.signuppj.user.dto.request.UserRequest;
import project.signuppj.user.dto.response.UserListResponse;
import project.signuppj.user.service.UserService;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("user")
@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/join")
    public String join(){
        return "join";
    }
    @PostMapping("/join")
    public ResponseEntity join(@RequestBody UserRequest request){
        log.info("userID = {}, userPW = {}, userName = {}", request.getUserID(), request.getUserPW(), request.getUserName());
        if(userService.join(request).equals("Success")){
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/list")
    public List<UserListResponse> test() {

        return userService.userList(); }

}
