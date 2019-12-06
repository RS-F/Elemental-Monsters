
public class FireMonster extends Monster {

	public FireMonster(String name, int damage, int life) {
		super(name, damage, life, "fire");
	}

	@Override
	public void takeHit(Monster m) {
		if (m.getType().equals("grass"))
			m.setDamage(m.getDamage() / 2);
		else if (m.getType().equals("water"))
			m.setDamage(m.getDamage() * 2);

		super.takeHit(m);
	}

}
