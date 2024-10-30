class DefeatedState implements CharacterState {
    @Override
    public int attack(int baseAttack) {
        return 0;
    }

    @Override
    public int defend(int baseDef) {
        return 0;
    }

    @Override
    public void handle(Character character) {
        System.out.println("defeated!");
    }
}