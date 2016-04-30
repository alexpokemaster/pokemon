import java.util.ArrayList;
class PokemonBaseData
    {
        ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
        public PokemonBaseData()
        {
        	allPokemon = createAll();
        }

        private ArrayList<Pokemon> createAll()
        {
        ArrayList<Pokemon> all = new ArrayList<Pokemon>();
  
        	all.add(new Pokemon("Bulbasaur", 1));
        	all.add(new Pokemon("Ivysaur", 2));
        	all.add(new Pokemon("Venasaur", 3));
        	all.add(new Pokemon("Charmander", 4));
        	all.add(new Pokemon("Charmeleon", 5));
        	all.add(new Pokemon("Charizard", 6));
        	all.add(new Pokemon("Squirtle", 7));
        	all.add(new Pokemon("Wartortle", 8));
        	all.add(new Pokemon("Blastoise", 9));
        	all.add(new Pokemon("Caterpie", 10));
        	all.add(new Pokemon("Metapod", 11));
        	all.add(new Pokemon("Butterfree", 12));
        	all.add(new Pokemon("Weedle", 13));
        	all.add(new Pokemon("Kakuna", 14));
        	all.add(new Pokemon("Beedrill", 15));
        	all.add(new Pokemon("Pidgey", 16));
        	all.add(new Pokemon("Pidgeotto", 17));
        	all.add(new Pokemon("Pidgeot", 18));
        	return all;
        	
        
        }
        Pokemon getPokemon(int nID)
        {
        	return allPokemon.get(nID-1);
        }
        int getSize()
        {
        	int sum = allPokemon.size();
        	return sum;
        }
    }

