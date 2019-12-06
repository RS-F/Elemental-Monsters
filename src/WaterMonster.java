
public class WaterMonster  extends Monster {

	public WaterMonster(String name, int damage, int life) {
		super(name, damage, life, "water");
	}

	@Override
	public void takeHit(Monster m) {
		if (m.getType().equals("grass"))
			m.setDamage(m.getDamage() * 2);
		else if (m.getType().equals("fire"))
			m.setDamage(m.getDamage() / 2);

		super.takeHit(m);
	}

}
