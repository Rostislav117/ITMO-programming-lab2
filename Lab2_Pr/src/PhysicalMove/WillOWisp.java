package PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.burn(pokemon);
        //applyOppDamage(pokemon, -((1 / 8) * pokemon.getHP()));

    }

    @Override
    protected java.lang.String describe() {
        return "использует Will-O-Wisp";
    }
}
