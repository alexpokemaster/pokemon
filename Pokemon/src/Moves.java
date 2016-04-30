public class Moves
{
	String name;
	int power;
	Type type;
	int accuracy;
	
	Moves(String nName, int nPower, Type nType, int nAccuracy)
	{
		type = nType;
		name = nName;
		power = nPower;
		accuracy = nAccuracy;
	}
	String show()
	{
		String move;
		move = name;
		return move;
	}
	
	int getPower()
	{
		return power;
	}
	
	int getAccuracy()
	{
		return accuracy;
	}
	
	Type getType()
	{
		return type;
	}
	
}
