package Pokemons;

import PhysicalMove.ChargeBeam;
import PhysicalMove.DoubleTeam;
import PhysicalMove.Flamethrower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(100,5,5,15,65,30);

        setMove(new DoubleTeam(0,0), new Flamethrower(90,100));
    }
}
