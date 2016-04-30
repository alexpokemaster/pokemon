public class Pokemon 
{
	private String name;
	private int ID;
	private int level;
	private int attack;
	private int defense;
	private int hp;
	//private Type type1;
	//private Type type2;
	private Moves move1;
	private Moves move2;
	private Moves move3;
	private Moves move4;
	private String nickName;
	private String status;
	
	public Pokemon(String nName, int nLevel, Moves nMove1)
	{
		name = nName;
		level = nLevel;
		move1 = nMove1;
	}
	public Pokemon(String nName, int nID)
	{
		name = nName;
		ID = nID;
		
	}
	
	public Pokemon(String nName, 
			int nLevel, 
			int nAttack, 
			int nDefense, 
			int nHp, 
			Type nType1)
	{
		level = nLevel;
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		type1 = nType1;
	}
	
	public Pokemon(String nName, 
			int nLevel, 
			int nAttack, 
			int nDefense, 
			int nHp, 
			Type nType1,
			Type nType2)
	{
		level = nLevel;
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		type1 = nType1;
		type2 = nType2;
	}
	
	public Pokemon(String nName, 
			int nLevel, 
			int nAttack, 
			int nDefense, 
			int nHp, 
			Type nType1,
			Type nType2,
			String nNickname)
	{
		level = nLevel;
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		type1 = nType1;
		type2 = nType2;
		nickName = nNickname;
	}
	
	public Pokemon(String nName,
			String nNickname,
			int nLevel, 
			int nAttack, 
			int nDefense, 
			int nHp, 
			Type nType1)
	{
		level = nLevel;
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		type1 = nType1;
		nickName = nNickname;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public String getType()
	{
		return type1 + " " + type2;
	}
	
	public void setType1(Type nType1)
	{
		type1 = nType1;
	}
	
	public void setType2(Type nType2)
	{
		type1 = nType2;
	}
	
	public String getStats()
	{
		return "ATT: " + attack + " " + "DEF: " + defense;
	}
	
	public void setStats(int nAttack, int nDefense, int nHp)
	{
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
	}
	
	public String getNickname()
	{
		return nickName;
	}
	
	public void setNickname(String nNickname)
	{
		nickName = nNickname;
	}
	
	public void levelUp(int attackEV, int defenseEV, int hpEV)
	{
		level ++;
		attack += attackEV;
		defense += defenseEV;
		hp += hpEV;
	}
	
	public String statusCheck()
	{
		return status;
	}
	
	public void evolve(String nName, int nAttack, int nDefense, int nHp)
	{
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		status = "Healthy";
	}
	
	public void evolve(String nName, Type nType2, int nAttack, int nDefense, int nHp)
	{
		name = nName;
		attack = nAttack;
		defense = nDefense;
		hp = nHp;
		status = "Healthy";
		type2 = nType2;
	}
	
	public String show()
	{
		return name;
	}

	
	


}
