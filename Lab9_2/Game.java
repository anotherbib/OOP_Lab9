public abstract class Game{
    protected abstract void initializeGame();
    protected abstract void playingGame();
    protected abstract void ShowResult();

    public final void start(){
        initializeGame();
        playingGame();
        ShowResult();
    }
}