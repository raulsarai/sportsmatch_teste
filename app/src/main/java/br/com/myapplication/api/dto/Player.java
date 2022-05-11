package br.com.myapplication.api.dto;

public class Player {

    private String img;
    private String name;
    private Double percentual;
    private String pos;
    private String country;
    private Barras barras;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Barras getBarras() {
        return barras;
    }

    public void setBarras(Barras barras) {
        this.barras = barras;
    }

}
