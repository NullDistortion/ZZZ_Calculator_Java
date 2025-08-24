package dev.zzz.webapp.info;

public class Character {

    private String name = "";
    private Disc dics = new Disc();
    private Weapon weapon = new Weapon();
    private StatsPerCharacter statspercharacter = new StatsPerCharacter();

    private double pv = 0;
    private double atack = 0;
    private double defense = 0;
    private double impact = 0;
    private double critic_prob = 0;
    private double critic_dmg = 0;
    private double anomalie_rate = 0;
    private double anomalie_mastery = 0;
    private double perforation = 0;
    private double energie = 0;

    private int pasive = 0;

    public Character() {
    }

    public Character(String name, Disc dics, Weapon weapon, StatsPerCharacter statspercharacter, double pv,
                     double atack, double defense, double impact, double critic_prob, double critic_dmg,
                     double anomalie_rate, double anomalie_mastery, double perforation, double energie, int pasive) {
        this.name = name;
        this.dics = dics;
        this.weapon = weapon;
        this.statspercharacter = statspercharacter;
        this.pv = pv;
        this.atack = atack;
        this.defense = defense;
        this.impact = impact;
        this.critic_prob = critic_prob;
        this.critic_dmg = critic_dmg;
        this.anomalie_rate = anomalie_rate;
        this.anomalie_mastery = anomalie_mastery;
        this.perforation = perforation;
        this.energie = energie;
        this.pasive = pasive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public Disc getDics() {
        return dics;
    }

    public void setDics(Disc dics) {
        this.dics = dics;
    }

    public double getAtack() {
        return atack;
    }

    public void setAtack(double atack) {
        this.atack = atack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getImpact() {
        return impact;
    }

    public void setImpact(double impact) {
        this.impact = impact;
    }

    public double getCritic_prob() {
        return critic_prob;
    }

    public void setCritic_prob(double critic_prob) {
        this.critic_prob = critic_prob;
    }

    public double getAnomalie_rate() {
        return anomalie_rate;
    }

    public void setAnomalie_rate(double anomalie_rate) {
        this.anomalie_rate = anomalie_rate;
    }

    public double getCritic_dmg() {
        return critic_dmg;
    }

    public void setCritic_dmg(double critic_dmg) {
        this.critic_dmg = critic_dmg;
    }

    public double getAnomalie_mastery() {
        return anomalie_mastery;
    }

    public void setAnomalie_mastery(double anomalie_mastery) {
        this.anomalie_mastery = anomalie_mastery;
    }

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }

    public double getPerforation() {
        return perforation;
    }

    public void setPerforation(double perforation) {
        this.perforation = perforation;
    }

    public int getPasive() {
        return pasive;
    }

    public void setPasive(int pasive) {
        this.pasive = pasive;
    }

    public StatsPerCharacter getStatspercharacter() {
        return statspercharacter;
    }

    public void setStatspercharacter(StatsPerCharacter statspercharacter) {
        this.statspercharacter = statspercharacter;
    }

    // BORRAR
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", dics=" + dics +
                ", weapon=" + weapon +
                ", pv=" + pv +
                ", atack=" + atack +
                ", defense=" + defense +
                ", impact=" + impact +
                ", critic_prob=" + critic_prob +
                ", critic_dmg=" + critic_dmg +
                ", anomalie_rate=" + anomalie_rate +
                ", anomalie_mastery=" + anomalie_mastery +
                ", perforation=" + perforation +
                ", energie=" + energie +
                '}';
    }
}
