package PhysicalMove;
// done
import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        super.applyOppDamage(pokemon, damage);
    }

    protected void applyOppEffects(Pokemon pokemon){
        Effect e = new Effect().chance(0.3).stat(Stat.ACCURACY, -1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Mud Bomb";
    }
}
