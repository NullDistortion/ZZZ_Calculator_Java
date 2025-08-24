package dev.zzz.calculator.info;

import java.util.Arrays;

public class Character {

    private String name = "";
    private String weapon = "";
    private String[] disc_info = {""};

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

    public Character () {
    }

    public Character(String name, String weapon, double pv, String[] disc_info, double atack, double defense, double impact, double critic_prob, double critic_dmg, double perforation, double anomalie_mastery, double anomalie_rate, double energie) {
        this.name = name;
        this.weapon = weapon;
        this.pv = pv;
        this.disc_info = disc_info;
        this.atack = atack;
        this.defense = defense;
        this.impact = impact;
        this.critic_prob = critic_prob;
        this.critic_dmg = critic_dmg;
        this.perforation = perforation;
        this.anomalie_mastery = anomalie_mastery;
        this.anomalie_rate = anomalie_rate;
        this.energie = energie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getPv() {
        return pv;
    }

    public void setPv(double pv) {
        this.pv = pv;
    }

    public String[] getDisc_info() {
        return disc_info;
    }

    public void setDisc_info(String[] disc_info) {
        this.disc_info = disc_info;
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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", disc_info=" + Arrays.toString(disc_info) +
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
