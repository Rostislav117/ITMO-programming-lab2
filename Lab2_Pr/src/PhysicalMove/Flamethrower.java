package PhysicalMove;
// done
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower(double pow, double acc) {

        super(Type.FIRE, pow, acc);
    }
    public static boolean chance(double chance) {
        return chance > Math.random();
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (chance(0.1)) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected java.lang.String describe() {
        return "использует Flamethrower";
    }
}
