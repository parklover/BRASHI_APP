package com.example.brashi;

import java.text.DecimalFormat;
import java.util.Date;

public class Dzielo {

    private String nazwa;
    private Double lat;
    private Double lng;
    private String opis;
    private Date data_powstania;
    private Date data_dodania;
    private Boolean status;
    private Boolean w_archiwum;

    public Dzielo(String nazwa, Double lat, Double lng, String opis, Date data_powstania, Date data_dodania, Boolean status, Boolean w_archiwum) {
        this.nazwa=nazwa;
        this.lat=lat;
        this.lng=lng;
        this.opis=opis;
        this.data_powstania=data_powstania;
        this.data_dodania=data_dodania;
        this.status=status;
        this.w_archiwum=w_archiwum;
    }

    public Dzielo(){

    }

    public String getNazwa() {
        return nazwa;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getData_powstania() {
        return data_powstania;
    }

    public void setData_powstania(Date data_powstania) {
        this.data_powstania = data_powstania;
    }

    public Date getData_dodania() {
        return data_dodania;
    }

    public void setData_dodania(Date data_dodania) {
        this.data_dodania = data_dodania;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getW_archiwum() {
        return w_archiwum;
    }

    public void setW_archiwum(Boolean w_archiwum) {
        this.w_archiwum = w_archiwum;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
