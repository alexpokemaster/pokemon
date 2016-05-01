import java.util.ArrayList;
class PokemonBaseData
    {
        ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
        ArrayList<Moves> allMoves = new ArrayList<Moves>();
        ArrayList<Type> allTypes = new ArrayList<Type>();
        public PokemonBaseData()
        {
        	allPokemon = createAll();
        	allMoves = createAllMoves();
        	allTypes = createAllTypes();
        	
        }
        
        private ArrayList<Type> createAllTypes()
        {
            ArrayList<Type> all = new ArrayList<Type>();
            
            all.add(new Type("Normal"));
            all.add(new Type("Fire"));
            all.add(new Type("Water"));
            all.add(new Type("Grass"));
            all.add(new Type("Electric"));
            all.add(new Type("Rock"));
            all.add(new Type("Ground"));
            all.add(new Type("Bug"));
            all.add(new Type("Psychic"));
            all.add(new Type("Dragon"));
            all.add(new Type("Poison"));
            all.add(new Type("Flying"));
            all.add(new Type("Ghost"));
            all.add(new Type("Ice"));
            all.add(new Type("Fighting"));
           
            return all;

        }
        
        private ArrayList<Moves> createAllMoves()
        {
            ArrayList<Moves> all = new ArrayList<Moves>();
            
            all.add(new Moves("Tackle",40,allTypes.get(0),90));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Scratch",40,allTypes.get(0),100));
            all.add(new Moves("Ember",40,allTypes.get(1),100));
            all.add(new Moves("Withdraw",0,allTypes.get(2),100));
            all.add(new Moves("Bubble",40,allTypes.get(2),100));
            all.add(new Moves("Leech Seed",20,allTypes.get(3),80));
            all.add(new Moves("VineWhip",50,allTypes.get(3),100));
            all.add(new Moves("SmokeScreen",0,allTypes.get(0),100));
            all.add(new Moves("Slash",70,allTypes.get(0),100));
            all.add(new Moves("Water Gun",60,allTypes.get(2),100));
            all.add(new Moves("Bite",70,allTypes.get(0),100));
            all.add(new Moves("PSN Powder",0,allTypes.get(3),100));
            all.add(new Moves("SLP Powder",0,allTypes.get(3),100));
            all.add(new Moves("PLZ Powder",0,allTypes.get(3),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));
            all.add(new Moves("Growl",0,allTypes.get(0),100));

            
            return all;

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

