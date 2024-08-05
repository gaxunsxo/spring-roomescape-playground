package roomescape.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        // 모델에 필요한 속성 추가
        model.addAttribute("message", "Welcome to Admin Main Page");

        // 뷰 이름을 반환
        return "home";
    }
}
