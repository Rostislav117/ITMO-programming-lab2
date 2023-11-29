package Pokemons;

import PhysicalMove.ChargeBeam;
import PhysicalMove.DazzlingGleam;
import PhysicalMove.DoubleTeam;
import PhysicalMove.GigaDrain;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shinotic extends Morelull {
    public Shinotic(String name, int level){
        super(name, level);
        super.setType(Type.GRASS, Type.FAIRY);
        super.setStats(60,45,80,90,100,30);

        setMove(new ChargeBeam(50,90));
    }
}
