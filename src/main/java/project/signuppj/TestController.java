package project.signuppj;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import project.signuppj.UserDB.User;
import project.signuppj.UserDB.UserRepsoitory;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {

        return "okokokokok"; }

}
