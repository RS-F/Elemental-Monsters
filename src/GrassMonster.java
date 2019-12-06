
public class GrassMonster extends Monster {

	public GrassMonster(String name, int damage, int life) {
		super(name, damage, life,"grass");
	}

	@Override
	public void takeHit(Monster m) {
		if (m.getType().equals("fire"))
			m.setDamage(m.getDamage() * 2);
		else if (m.getType().equals("water"))
			m.setDamage(m.getDamage() / 2);

		super.takeHit(m);
	}

}
