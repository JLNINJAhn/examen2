package unah.hn.lenguajes.examens.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "dbi")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Dni;

    @Column(name = "nombre")
    private String Nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Prestamo>prestamos;
}
