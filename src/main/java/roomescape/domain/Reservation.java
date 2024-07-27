package roomescape.domain;

public class Reservation {
    private Long id;
    private String name;
    private String date;

    // 생성자, getter, setter
    public Reservation(Long id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
