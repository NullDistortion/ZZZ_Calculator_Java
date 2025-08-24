package dev.zzz.webapp.info;

public class StatsPerCharacter {

    private int atack = 0;
    private int evasion = 0;
    private int supportTechnique = 0;
    private int EXTechnique = 0;
    private int definitive = 0;
    private int mentalCinema = 0;

    public StatsPerCharacter() {
    }

    public StatsPerCharacter(int atack, int evasion, int supportTechnique, int EXTechnique,
                             int definitive, int mentalCinema) {
        this.atack = atack;
        this.evasion = evasion;
        this.supportTechnique = supportTechnique;
        this.EXTechnique = EXTechnique;
        this.definitive = definitive;
        this.mentalCinema = mentalCinema;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getSupportTechnique() {
        return supportTechnique;
    }

    public void setSupportTechnique(int supportTechnique) {
        this.supportTechnique = supportTechnique;
    }

    public int getEXTechnique() {
        return EXTechnique;
    }

    public void setEXTechnique(int EXTechnique) {
        this.EXTechnique = EXTechnique;
    }

    public int getDefinitive() {
        return definitive;
    }

    public void setDefinitive(int definitive) {
        this.definitive = definitive;
    }

    public int getMentalCinema() {
        return mentalCinema;
    }

    public void setMentalCinema(int mentalCinema) {
        this.mentalCinema = mentalCinema;
    }


}
