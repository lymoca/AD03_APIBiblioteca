package apibiblioteca_morenocarmonalydia.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ejemplares")
@Entity
public class Ejemplar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String descripcion;

    @NotNull(message = "Debes indicar si está disponible (true/false)")

    @JsonIgnore
    @ManyToOne
    private Libro libro;
}
