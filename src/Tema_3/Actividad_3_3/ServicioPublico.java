package Tema_3.Actividad_3_3;

public class ServicioPublico extends Coche{
    String tipoServicio;
    Boolean Licencia;

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Boolean getLicencia() {
        return Licencia;
    }

    public void setLicencia(Boolean licencia) {
        Licencia = licencia;
    }
}
