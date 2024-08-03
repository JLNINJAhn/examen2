package unah.hn.lenguajes.examens.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prestamos")

public class Prestamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoprestamo")
    private int CodigoPrestamo;
    @Column(name = "fechaapertura")
    private Date fechaApertura;

    @Column(name = "monto")
    private double Monto;
    @Column(name = "cuota")
    private double Cuota;
    @Column(name = "plazo")
    private int Plazo;

    @Column(name = "interes")
    private double Interes;

    @OneToMany
    @JoinColumn(name = "dni")
    private String dni;
}
