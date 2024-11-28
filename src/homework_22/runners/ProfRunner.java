package homework_22.runners;

/**
 * @author Sergey Bugaenko
 * {@code @date} 28.11.2024
 */

public class ProfRunner extends AmateurRunner{

    {
        this.setTypeRunner("Профессионал");
    }

    public ProfRunner(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }

    public ProfRunner() {
        super(25, 5);
    }
}
