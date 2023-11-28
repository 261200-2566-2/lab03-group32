public class RPGCharacter {
    private int level;
    private int healthPoints;
    private int mana;
    private int swordBaseDamage;
    private int shieldBaseDefense;
    private double baseRunSpeed;

    public RPGCharacter(int level, int swordBaseDamage, int shieldBaseDefense, double baseRunSpeed) {
        this.level = level;
        this.swordBaseDamage = swordBaseDamage;
        this.shieldBaseDefense = shieldBaseDefense;
        this.baseRunSpeed = baseRunSpeed;
        this.healthPoints = calculateMaxHP();
        this.mana = calculateMaxMana();
    }

    private int calculateMaxHP() {
        return 100 + 10 * level;
    }

    private int calculateMaxMana() {
        return 50 + 2 * level;
    }

    public int getMaxHP() {
        return healthPoints;
    }

    public int getMaxMana() {
        return mana;
    }

    public int getSwordDamage() {
        return (int) (swordBaseDamage * (1 + 0.1 * level));
    }

    public int getShieldDefense() {
        return (int) (shieldBaseDefense * (1 + 0.05 * level));
    }

    public double getMaxRunSpeed() {
        return baseRunSpeed * (0.1 + 0.03 * level);
    }

    public double getSwordRunSpeedDecrease() {
        return baseRunSpeed * (0.1 + 0.04 * level);
    }

    public double getShieldRunSpeedDecrease() {
        return baseRunSpeed * (0.1 + 0.08 * level);
    }

    // Additional methods for modifying character attributes (if needed)
    public void setLevel(int level) {
        this.level = level;
        this.healthPoints = calculateMaxHP();
        this.mana = calculateMaxMana();
    }

    public static void main(String[] args) {
        RPGCharacter player = new RPGCharacter(5, 20, 15, 8.0);
        System.out.println("Max HP: " + player.getMaxHP());
        System.out.println("Max Mana: " + player.getMaxMana());
        System.out.println("Sword Damage: " + player.getSwordDamage());
        System.out.println("Shield Defense: " + player.getShieldDefense());
        System.out.println("Max Run Speed: " + player.getMaxRunSpeed());
        System.out.println("Sword Run Speed Decrease: " + player.getSwordRunSpeedDecrease());
        System.out.println("Shield Run Speed Decrease: " + player.getShieldRunSpeedDecrease());
    }

}