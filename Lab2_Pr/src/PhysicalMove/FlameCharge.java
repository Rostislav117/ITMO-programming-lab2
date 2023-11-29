package PhysicalMove;
import ru.ifmo.se.pokemon.*;
// done
public class FlameCharge extends PhysicalMove{
    public FlameCharge(double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        super.applySelfEffects(pokemon);
        Effect e = new Effect().stat(Stat.SPEED, 1);
        pokemon.addEffect(e);

    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        super.applyOppDamage(pokemon,damage);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Flame Charge";
    }
}
