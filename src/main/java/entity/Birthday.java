package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public record Birthday(LocalDate birthDate) {

    public long getAge() {
        return ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}
