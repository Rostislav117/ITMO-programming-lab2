package Pokemons;

import PhysicalMove.DoubleTeam;
import PhysicalMove.Flamethrower;
import PhysicalMove.MudBomb;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny{
    public Chansey(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(250,5,5,35,105,50);

        setMove(new MudBomb(65,85));
    }
}
