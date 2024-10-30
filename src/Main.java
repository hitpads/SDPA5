public class Main {
    public static void main(String[] args) {
        Character hero = new Character("Hero");

        // Using different strategies
        System.out.println("\nTesting different fighting strategies:");
        hero.setStrategy(new MeleeStrategy());
        new AttackAction().executeAction(hero);

        hero.setStrategy(new RangedStrategy());
        new AttackAction().executeAction(hero);

        hero.setStrategy(new MagicStrategy());
        new AttackAction().executeAction(hero);

        // Testing state changes
        System.out.println("\nTesting state changes:");
        EffectVisitor effectVisitor = new StatusEffectVisitor();
        hero.accept(effectVisitor); // Should apply boost
        new AttackAction().executeAction(hero);

        // Testing defense action
        System.out.println("\nTesting defense action:");
        new DefendAction().executeAction(hero);
    }
}