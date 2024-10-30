class NormalState implements CharacterState {
    @Override
    public int attack(int baseAttack) {
        return baseAttack;
    }

    @Override
    public int defend(int baseDef) {
        return baseDef;
    }

    @Override
    public void handle(Character character) {
        System.out.println("normal state");
    }
}