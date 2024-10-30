class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight(Character character) {
        int damage = character.getCurrentState().attack(10);
        System.out.println("Performing melee attack with damage: " + damage);
    }
}