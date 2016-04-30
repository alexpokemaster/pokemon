import java.util.Scanner;

public class PokemonRunner extends Introduction
{
	public static void main(String[] args)
	  {
		Scanner scan = new Scanner(System.in);
		char choice = 'y';
		String command;
		
		PokemonBaseData dataBase = new  PokemonBaseData();
		Introduction game = new Introduction();
		Trainer trainer1 = game.intro(dataBase);
		getListOfCommands();
		
		//Command Switch
		System.out.println();
		command = scan.nextLine();
		while(choice == 'y')
		{
			switch(command)
			{
				case "Wild Grass":
				{
				trainer1 = 	game.wildPokemon(dataBase, trainer1);
			    choice = game.getCommand();
			    System.out.println("Would you like to enter a new command?");
				command = scan.nextLine();
					break;
				}
				case "Pokemon":
				{
					trainer1.showTeam();	
					choice = game.getCommand();
					System.out.println("Would you like to enter a new command?");
					command = scan.nextLine();
					break;
				}
		}
		}
		
	}
}

