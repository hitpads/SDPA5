class MagicStrategy implements FightingStrategy {
    @Override
    public void fight(Character character) {
        int damage = character.getCurrentState().attack(15);
        System.out.println("Performing magic attack with damage: " + damage);
    }
}