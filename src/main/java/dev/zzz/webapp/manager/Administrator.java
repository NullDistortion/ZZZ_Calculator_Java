package dev.zzz.webapp.manager;

import dev.zzz.webapp.info.Character;

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
