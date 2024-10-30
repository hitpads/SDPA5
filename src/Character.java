class Character {
    private CharacterState currentState;
    private FightingStrategy currentStrategy;
    private String name;
    private int health;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.currentState = new NormalState();
        this.currentStrategy = new MeleeStrategy();
    }

    public void setState(CharacterState state) {
        this.currentState = state;
        currentState.handle(this);
    }

    public void setStrategy(FightingStrategy strategy) {
        this.currentStrategy = strategy;
    }

    public CharacterState getCurrentState() {
        return currentState;
    }

    public FightingStrategy getCurrentStrategy() {
        return currentStrategy;
    }

    public void accept(EffectVisitor visitor) {
        if (health > 50) {
            visitor.applyBoost(this);
        } else {
            visitor.applyDamage(this);
        }
    }
}