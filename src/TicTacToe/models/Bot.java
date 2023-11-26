package TicTacToe.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    public Bot(){}
    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public BotDifficultyLevel getBotDifficultyLevel(){
        return this.botDifficultyLevel;
    }
}
