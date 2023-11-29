package PhysicalMove;
// done
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        super.applyOppDamage(pokemon,damage);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Charge Beam";
    }
}
