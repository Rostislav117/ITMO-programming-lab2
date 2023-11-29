package brain;

import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;

public class Main {

    //https://pokemondb.net/pokedex/mew
    //https://pokemondb.net/pokedex/morelull
    //https://pokemondb.net/pokedex/shiinotic
    //https://pokemondb.net/pokedex/happiny
    //https://pokemondb.net/pokedex/chansey
    //https://pokemondb.net/pokedex/blissey

    public static void main(String[] args){
        Battle b = new Battle();
        b.addFoe(new Mew("Melkiy", 1));
        b.addAlly(new Blissey("blissey", 1));
        b.addAlly(new Chansey("chancey", 1));
        b.addAlly(new Happiny("Happiny", 1));
        b.addFoe(new Morelull("smal grip",1));
        b.addFoe(new Shinotic("big grip", 1));
        b.go();

    }

}