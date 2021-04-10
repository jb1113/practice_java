public abstract class Player {
    int currentPos;

    Player() {
        this.currentPos = 0;
    }

    abstract void play(int pos);
    abstract void stop();

    void play() {
        play(currentPos);
    }
}
