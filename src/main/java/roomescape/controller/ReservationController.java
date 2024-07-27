package roomescape.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import roomescape.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReservationController {

    // 임시 예약 목록
    private List<Reservation> reservations = new ArrayList<>();

    // 예약 페이지 응답
    @GetMapping("/reservation")
    public String showReservationPage() {
        // template/reservation.html을 반환
        return "reservation";
    }

    // 예약 목록 조회 API
    @GetMapping("/reservations")
    @ResponseBody
    public ResponseEntity<List<Reservation>> getReservations() {
        return ResponseEntity.ok().body(reservations);
    }
}
