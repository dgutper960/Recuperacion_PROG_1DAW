package Tema_8.Actividad_8_1;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
public class Ordenadores implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "IdsPc10en10")
    @SequenceGenerator(initialValue = 10,allocationSize = 10, name = "IdsPc10en10")
    private Integer id;
    private String ip;
    private String numSerie;
    private BigInteger memoria;
    private BigInteger discoDuro;
    private String cpu;
    private Timestamp fechaCompra;
    private Boolean SOActivado;
    public Ordenadores() {
    }

    public Ordenadores(String ip, String numSerie, BigInteger memoria, BigInteger discoDuro, String cpu, Timestamp fechaCompra,Boolean SOActivado) {
        this.ip = ip;
        this.numSerie = numSerie;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.cpu = cpu;
        this.fechaCompra = fechaCompra;
        this.SOActivado=SOActivado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public BigInteger getMemoria() {
        return memoria;
    }

    public void setMemoria(BigInteger memoria) {
        this.memoria = memoria;
    }

    public BigInteger getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(BigInteger discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Boolean getSOActivado() {
        return SOActivado;
    }

    public void setSOActivado(Boolean SOActivado) {
        this.SOActivado = SOActivado;
    }

    @Override
    public String toString() {
        return "Ordenadores{" +
                "ip='" + ip + '\'' +
                ", numSerie='" + numSerie + '\'' +
                ", memoria=" + memoria +
                ", discoDuro=" + discoDuro +
                ", cpu='" + cpu + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", SOActivado=" + SOActivado +
                '}';
    }
}