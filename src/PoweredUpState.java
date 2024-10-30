class PoweredUpState implements CharacterState {
    @Override
    public int attack(int baseAttack) {
        return baseAttack * 2;
    }

    @Override
    public int defend(int baseDef) {
        return baseDef * 2;
    }

    @Override
    public void handle(Character character) {
        System.out.println("powered up!");
    }
}