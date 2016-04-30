import java.util.Scanner;

public class Introduction
{
public Trainer intro(PokemonBaseData dataBase)
{
	Scanner scan = new Scanner(System.in);
	String name;
	int choice;
	char looking = 'y';
	// professor Oak Introduction
	System.out.println("Hello! and welcome to the pokemon world! what is yout name?");
	name = scan.nextLine();
	Trainer trainer1 = new Trainer(name);
	System.out.println("Hello, " + trainer1.getName() + " I am professor Oak");	
	System.out.println("So " + trainer1.getName() + " would you prefer charmander(1), bulbasaur(2), or squirtle(3)? [type the number]");	
	choice = scan.nextInt();
	// algorithm for starter
	Pokemon starter = new Pokemon("banana", 1);
	Moves move = new Moves("scratch", 20);
	if(choice == 1)
	{
		starter = dataBase.getPokemon(4);
	}
	if(choice == 2)
	{
		starter = dataBase.getPokemon(1);
	}
	if(choice == 3)
	{
		starter = dataBase.getPokemon(7);
	}

	
	System.out.println("have fun with your " + starter.getName());
	trainer1.addPokemon(starter);
	Items item1 = new Items("Pokeball");
	trainer1.addItem(5, item1);
	trainer1.showTrainer();
	return trainer1;
}
public char getCommand()
{
	Scanner scan = new Scanner(System.in);
	char choice;
	System.out.println("wanna continue playing?('y') or say 'n' to quit");
	choice = scan.nextLine().charAt(0);
	return choice;
}
public static void getListOfCommands()
{
	System.out.println();
	System.out.println("Wild Grass: takes you to wild grass");
	System.out.println("Pokemon: show pokemon team");
}

public Trainer wildPokemon(PokemonBaseData dataBase, Trainer nTrainer)
{
	Scanner scan = new Scanner(System.in);
	char choice;
	int random = (int) ((int) dataBase.getSize() * Math.random()+1);
	Pokemon obj =  dataBase.getPokemon(random);
	System.out.println("you have encountered a wild " + obj.getName() + "!");
	System.out.println("Would you like to use a pokeball?");
	choice = scan.nextLine().charAt(0);
	while(choice == 'y' && nTrainer.bagContent() > 0)
	{
	nTrainer.usePokeball(nTrainer, obj);
	if(nTrainer.getPokemonName(nTrainer.teamLength()).equals(obj.getName()))
			{
		choice = scan.nextLine().charAt(0);
			}
	else
	{
		System.out.println("It appeared to be caught!, Would you like to try again?");
		choice = scan.nextLine().charAt(0);
	}
	}
	return nTrainer;
}

}
