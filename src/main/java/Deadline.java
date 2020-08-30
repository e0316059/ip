import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task{
    private LocalDateTime time;

    public Deadline(String command, LocalDateTime time) {
        super(command);
        this.time = time;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " +
                time.format(DateTimeFormatter.ofPattern("MMM d yyyy HH:mm")) + ")";
    }
}