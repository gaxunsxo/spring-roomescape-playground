package roomescape.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import roomescape.domain.Reservation;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class ReservationController {

    // 임시 예약 목록
    private List<Reservation> reservations = new ArrayList<>();
    private final AtomicLong index = new AtomicLong(1);

    // 예약 페이지 응답
    @GetMapping("/reservation")
    public String showReservationPage() {
        // template/reservation.html을 반환
        return "reservation";
    }

    // 예약 추가
    @PostMapping("/reservations")
    @ResponseBody
    public ResponseEntity<Reservation> create(@RequestBody Reservation reservation) {
        // TODO: 예약 정보를 받아 예약을 추가한다.
        Reservation newReservation = Reservation.toEntity(reservation, index.getAndIncrement());
        reservations.add(newReservation);
        return ResponseEntity.created(URI.create("/reservations/" + newReservation.getId()))
                .contentType(MediaType.APPLICATION_JSON)
                .body(newReservation);
    }

    // 예약 취소
    @DeleteMapping("/reservations/{id}")
    @ResponseBody
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        // TODO: url 상의 id 정보를 받아 예약을 취소(삭제)한다.
        Reservation reservation = reservations.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElseThrow(RuntimeException::new);

        reservations.remove(reservation);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    // 예약 목록 조회 API
    @GetMapping("/reservations")
    @ResponseBody
    public ResponseEntity<List<Reservation>> getReservations() {
        return ResponseEntity.ok().body(reservations);
    }
}
