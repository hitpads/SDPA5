abstract class GameAction {
    // Template method
    public final void executeAction(Character character) {
        prepareAction();
        performAction(character);
        completeAction();
    }

    protected abstract void prepareAction();
    protected abstract void performAction(Character character);
    protected abstract void completeAction();
}