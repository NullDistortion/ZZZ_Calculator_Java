package dev.zzz.webapp.info;

public class Weapon {

    private String name = "";
    private String rol = "";
    private String base_stat = "";

    public Weapon (){
    }

    public Weapon(String name, String rol, String base_stat) {
        this.name = name;
        this.rol = rol;
        this.base_stat = base_stat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(String base_stat) {
        this.base_stat = base_stat;
    }
}
