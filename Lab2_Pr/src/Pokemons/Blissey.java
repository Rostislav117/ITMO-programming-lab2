package Pokemons;

import PhysicalMove.DreamEater;
import PhysicalMove.MudBomb;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Chansey{
    public Blissey(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(255,10,10,75,135,55);

        setMove(new DreamEater(100,100));
    }
}
