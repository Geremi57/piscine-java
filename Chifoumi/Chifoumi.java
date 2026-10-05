public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        ChifoumiAction action;
        switch (chifoumiAction) {
            case ROCK: action = chifoumiAction.SCISSOR;
                 break;
            case PAPER: action = chifoumiAction.ROCK;
                 break;
            case SCISSOR: action = chifoumiAction.PAPER;
                 break;
            default: action = chifoumiAction;
                 break;
        }
        // System.out.println(action);
        return action;
    }
}