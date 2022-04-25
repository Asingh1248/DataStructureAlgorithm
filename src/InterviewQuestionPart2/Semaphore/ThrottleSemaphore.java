package InterviewQuestionPart2.Semaphore;

import java.util.concurrent.Semaphore;

public class ThrottleSemaphore extends Semaphore {


    public ThrottleSemaphore(int permits) {
        super(permits);
    }
}
