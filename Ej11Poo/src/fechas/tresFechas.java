package fechas;

import java.util.Date;

public class tresFechas {

    Date anio;
    Date mes;
    Date dia;

    public tresFechas() {
    }

    public tresFechas(Date anio, Date mes, Date dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "tresFechas{" + "anio=" + anio + ", mes=" + mes + ", dia=" + dia + '}';
    }

}
