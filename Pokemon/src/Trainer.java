import java.util.ArrayList;

public class Trainer
{
	//variables
	int teamNum;
	static ArrayList <Pokemon> team;
	String nickname;
	ArrayList<Items> bagContents;
	
	//constructors
	public Trainer(String nName) 
	{
		nickname = nName;
		team =  new ArrayList <Pokemon>();
		bagContents = new ArrayList<Items>();
		
	}
	// . notation a trainer, and it will give you the name a a pokemon on a team
	public String getPokemonName(int index)
	{
		return team.get(index-1).getName();
	}
	public Trainer(String nName, int nTeamnum) 
	{
		nickname = nName;
		teamNum = nTeamnum;
	}
	public Trainer(String nName, String nickName, int nTeamnum)
	{
		super(nName);
		nickname = nickName;
		teamNum = nTeamnum;
	}
	
	//methods
	
	public void takeChips(int nTeamnum)
	{
		teamNum -= nTeamnum;
	}
	
	public int chipCount()
	{
		return teamNum;
	}
	
	public void KO()
	{
		teamNum = 0;
		System.out.println("You have run out of Pokemon!");
	}
	
	public ArrayList<Pokemon> getTeam()
	{
		return team;
	}
	
	public void setTeam(ArrayList<Pokemon> nTeam)
	{
		team = nTeam;
	}
	
	public void showTeam()
	{
		for(int i = 0; i < team.size(); i++)
		{
			System.out.print(team.get(i).show() + ", ");
		}
	}
	
	public static void addPokemon(Pokemon nPokemon)
	{
		team.add(nPokemon);
	}
	
	public void resetTeam()
	{
		for(int i = 0; i < team.size(); i++)
		{
			team.remove(i);
		}
	}
	
	public String getName()
	{
		return nickname;
	}
	public Trainer usePokeball(Trainer nTrainer, Pokemon nPokemon) 
	{
		bagContents.remove(0);
		if(bagContents.size() == 0)
		{
			System.out.println("It appears you ran out of pokeballs. " + nTrainer.getName() + " fled!");
			return nTrainer;
		}
		else
		return ifCaught(nTrainer, nPokemon);
	}
	Trainer ifCaught(Trainer nTrainer, Pokemon nPokemon)
	{
	int num1 = 1;//(int) Math.random() * 3;
	int num2 = 1;
	if(num1 == num2)
	{
		Trainer.addPokemon(nPokemon);
		wasCaught(num1,nPokemon, num2);
	}
		return nTrainer;
	}
	boolean wasCaught(int num1,Pokemon nPokemon, int num2)
	{
		if(num1 == num2)
		{
		System.out.println("You caught " +  nPokemon.getName() + "!");
		return true;
		}
		else
		{
		System.out.println("would you like to throw another pokeball?");
			return false;
		}
	}
	
	public void addItem(int amount, Items nItem)
	{
		for(int i = 0; i <= amount; i ++)
		{
			bagContents.add(nItem);
		}
		System.out.println("You have just obtained " + amount +  " " + nItem.getName() + "!");
	}
	public int bagContent()
	{
		return bagContents.size();
	}
	public void showTrainer()
	{
		System.out.println("your bag items: ");
		int i = bagContents.size()-1;
		System.out.print(i + " " + bagContents.get(i).getName());
	}
	public int teamLength()
	{
		return team.size();
	}
}


