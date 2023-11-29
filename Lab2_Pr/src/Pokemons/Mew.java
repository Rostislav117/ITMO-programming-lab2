package Pokemons;

import PhysicalMove.BulkUp;
import PhysicalMove.FlameCharge;
import PhysicalMove.WildCharge;
import PhysicalMove.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mew extends Pokemon {
    public Mew(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC);
        super.setStats(100,100,100,100,100,100);

        //WildCharge wildcharge = new WildCharge(90, 100);
        setMove(new WildCharge(90, 100), new FlameCharge(50, 100), new WillOWisp( 0,85), new BulkUp(0,0));

    }
}
