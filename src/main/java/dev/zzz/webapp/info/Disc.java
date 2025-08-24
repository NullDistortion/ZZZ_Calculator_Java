package dev.zzz.webapp.info;

public class Disc {

    private String name = "";
    private String description_by2 = "";
    private String description_by4 = "";

    private String dics_4 = "";
    private String dics_5 = "";
    private String dics_6 = "";


    public Disc () {
    }

    public Disc(String name, String description_by2, String description_by4, String dics_4, String dics_5, String dics_6) {
        this.name = name;
        this.description_by2 = description_by2;
        this.description_by4 = description_by4;
        this.dics_4 = dics_4;
        this.dics_5 = dics_5;
        this.dics_6 = dics_6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription_by2() {
        return description_by2;
    }

    public void setDescription_by2(String description_by2) {
        this.description_by2 = description_by2;
    }

    public String getDescription_by4() {
        return description_by4;
    }

    public void setDescription_by4(String description_by4) {
        this.description_by4 = description_by4;
    }

    public String getDics_4() {
        return dics_4;
    }

    public void setDics_4(String dics_4) {
        this.dics_4 = dics_4;
    }

    public String getDics_5() {
        return dics_5;
    }

    public void setDics_5(String dics_5) {
        this.dics_5 = dics_5;
    }

    public String getDics_6() {
        return dics_6;
    }

    public void setDics_6(String dics_6) {
        this.dics_6 = dics_6;
    }
}
