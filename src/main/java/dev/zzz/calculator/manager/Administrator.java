package dev.zzz.calculator.manager;

import dev.zzz.calculator.info.Character;

public class Administrator {

    public Character create ( ){
        Character character = new Character();
        return character;
    }

    public Character modify(Character character){
        Character character_new = new Character();
        character =  character_new;
        return character;
    }

    public Character delete(Character character){
        character = null;
        return character;
    }
    
}
