package Pokemons;

import PhysicalMove.DazzlingGleam;
import PhysicalMove.DoubleTeam;
import PhysicalMove.GigaDrain;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Morelull extends Pokemon {
    public Morelull(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.FAIRY);
        super.setStats(40, 35,55,65,75,15);

        setMove(new DoubleTeam(0,0), new DazzlingGleam(80,100), new GigaDrain(75,100));
    }
}
