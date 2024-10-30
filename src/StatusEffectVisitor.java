class StatusEffectVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println("Applying boost effect...");
        character.setState(new PoweredUpState());
    }

    @Override
    public void applyDamage(Character character) {
        System.out.println("Applying damage effect...");
        // If character's health drops to 0, change to defeated state
        character.setState(new DefeatedState());
    }
}