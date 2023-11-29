package PhysicalMove;
// done
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class GigaDrain extends SpecialMove {
    public GigaDrain(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        super.applyOppDamage(pokemon, damage);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Giga Drain";
    }
}
