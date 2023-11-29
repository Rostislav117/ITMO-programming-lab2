package PhysicalMove;
// done
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (pokemon.getCondition() == Status.SLEEP) {
            applyOppDamage(pokemon, -100);
        }
        else {
            System.out.println("Покемон не спит");

        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        int hpp = (100 - ((int)pokemon.getHP()))/2;
        pokemon.setMod(Stat.HP, -hpp);
    }

    @Override
    protected java.lang.String describe() {
        return "использует Dream Eater";
    }
}
