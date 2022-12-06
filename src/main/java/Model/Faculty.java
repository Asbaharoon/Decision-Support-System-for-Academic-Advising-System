package Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@Table(name="CICTFaculty")
@Entity
public class Faculty {

    @Id
    @GeneratedValue
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String userName;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
}
