import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users",schema = "public")
@Builder
public class User {
    @Id
    private String username;
    private String firstname;
    private String lastname;
    @Column(name = "birth_day")
    private LocalDate birthDay;
    private Integer age;
}
