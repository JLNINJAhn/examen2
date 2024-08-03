package unah.hn.lenguajes.examens.modelos;

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
@Table(name = "cuotas")

public class Cuotas {
    @Id
    @Column(name = "codigocuota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CodigoCuota;

    @Column(name = "mes")

    private int Mes;

    @Column(name = "interes")
    private double Interes;

    @Column(name = "capital")

    private double Capital;

    @Column(name = "saldo")
    private double Saldo;

    @JoinColumn(name = "codigoprestamo")
    @OneToMany()
    private double CodigoPrestamo;
}
