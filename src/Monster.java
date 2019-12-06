
public abstract class Monster {
	
	private String name;
	private int damage;
	private int life;
	private String type = "Normal";
	/**
	 * @param name
	 * @param damage
	 * @param life
	 */
	public Monster(String name, int damage, int life, String type) {
		super();
		this.name = name;
		this.damage = damage;
		this.life = life;
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}
	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public void takeHit (Monster m) {
		this.setLife(this.getLife() - m.getDamage());
		System.out.printf("%5s ", this.name);
		if (this.getLife() > 0) {
			System.out.printf(" has %7s life points remaining.\n", this.getLife());
			}
		else {
			System.out.println(" is KO!");
			System.exit(0);
		}
	}
}