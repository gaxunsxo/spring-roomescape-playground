package roomescape;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> home(Model model) {
        // 모델에 필요한 속성 추가
        model.addAttribute("message", "Welcome to Admin Main Page");

        // 상태 코드와 함께 home 뷰 반환
        return new ResponseEntity<>("home", HttpStatus.OK);
    }
}
