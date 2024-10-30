class DefendAction extends GameAction {
    @Override
    protected void prepareAction() {
        System.out.println("Preparing to defend...");
    }

    @Override
    protected void performAction(Character character) {
        int defense = character.getCurrentState().defend(5);
        System.out.println("Defending with " + defense + " points");
    }

    @Override
    protected void completeAction() {
        System.out.println("Defense stance ready!");
    }
}