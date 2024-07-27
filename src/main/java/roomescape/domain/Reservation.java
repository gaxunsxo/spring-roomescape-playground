package roomescape.domain;

public class Reservation {
    private Long id;
    private String name;
    private String date;

    private String time;

    // 생성자, getter, setter
    public Reservation(Long id, String name, String date, String time) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
    }

    // Id
    public Long getId() {
        return id;
    }
    public void setId(Long id) { this.id = id; }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Date
    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = date;
    }

    // Time
    public String getTime() { return time; }

    public void setTime() {
        this.time = time;
    }

    public static Reservation toEntity(Reservation reservation, Long id) {
        return new Reservation(id, reservation.name, reservation.date, reservation.time);
    }
}
