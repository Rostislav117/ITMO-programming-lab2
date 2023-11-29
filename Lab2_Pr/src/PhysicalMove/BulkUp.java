package PhysicalMove;
import ru.ifmo.se.pokemon.*;
// done
public class BulkUp extends StatusMove{
    public BulkUp(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().stat(Stat.ATTACK,1).stat(Stat.DEFENSE, 1);
        super.applySelfEffects(pokemon);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Bulk Up";
    }
}
