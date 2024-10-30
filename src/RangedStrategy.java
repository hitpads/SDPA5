class RangedStrategy implements FightingStrategy {
    @Override
    public void fight(Character character) {
        int damage = character.getCurrentState().attack(8);
        System.out.println("Performing ranged attack with damage: " + damage);
    }
}