package PhysicalMove;
// done
import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove{
    public WildCharge(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }
    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        super.applySelfDamage(pokemon, pokemon.getStat(Stat.ATTACK) * 0.25);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Wild Charge";
    }
}
