package PhysicalMove;
// done
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(double pow, double acc){
        super(Type.FAIRY, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        super.applyOppDamage(pokemon,damage);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Dazzling Gleam";
    }
}
