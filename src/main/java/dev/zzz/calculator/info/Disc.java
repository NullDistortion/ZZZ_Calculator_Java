package dev.zzz.calculator.info;

public class Disc {

    private String name = "";
    private String description_by2 = "";
    private String description_by4 = "";

    public Disc () {
    }

    public Disc(String name, String description_by2, String description_by4) {
        this.name = name;
        this.description_by2 = description_by2;
        this.description_by4 = description_by4;
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
}
