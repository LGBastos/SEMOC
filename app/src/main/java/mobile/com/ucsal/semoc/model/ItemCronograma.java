package mobile.com.ucsal.semoc.model;

import java.io.Serializable;

public class ItemCronograma implements Serializable {
    private String horario;
    private String content;
    private String local;
    private String detail;
    private String dia;

    public String getDia() {
        return dia;
    }

    public String getDetail() {
        return this.detail;
    }



    public ItemCronograma(String horario,String dia, String content,String detail, String local) {
        this.horario = horario;
        this.content = content;
        this.local = local;
        this.detail = detail;
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
