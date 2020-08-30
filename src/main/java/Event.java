import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    private LocalDateTime time;

    public Event(String command, LocalDateTime time) {
        super(command);
        this.time = time;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at: " +
                time.format(DateTimeFormatter.ofPattern("MMM d yyyy HH:mm")) + ")";
    }
}