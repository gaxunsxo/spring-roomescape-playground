package roomescape;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
