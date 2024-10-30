class AttackAction extends GameAction {
    @Override
    protected void prepareAction() {
        System.out.println("Preparing to attack...");
    }

    @Override
    protected void performAction(Character character) {
        character.getCurrentStrategy().fight(character);
    }

    @Override
    protected void completeAction() {
        System.out.println("Attack completed!");
    }
}