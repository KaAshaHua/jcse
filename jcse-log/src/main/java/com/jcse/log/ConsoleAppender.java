package com.jcse.log;

import java.io.PrintStream;
import java.util.Objects;

public class ConsoleAppender extends Appender {
    private final PrintStream out;
    private final PrintStream err;

    public ConsoleAppender(LogFormatter formatter) {
        this(formatter, System.out, System.err);
    }

    public ConsoleAppender(LogFormatter formatter, PrintStream out, PrintStream err) {
        super(formatter);
        this.out = Objects.requireNonNull(out, "out");
        this.err = Objects.requireNonNull(err, "err");
    }

    @Override
    protected void write(String formattedText, LogRecord record) {
        PrintStream target = record.level().isEnabledFor(LogLevel.WARN) ? err : out;
        target.print(formattedText);   
        target.flush();
    }

    @Override
    protected void doFlush() {
        out.flush();
        err.flush();
    }
}
