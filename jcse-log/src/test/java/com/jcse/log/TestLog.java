package com.jcse.log;

import java.time.Instant;

import org.junit.jupiter.api.Test;

public class TestLog {
    @Test 
    void testLog() {
        LogFormatter logFormatter = new LogFormatter();
        LogRecord record = new LogRecord(Instant.now(), LogLevel.INFO, "com.jcse.log", "main", "Log is active", null);
        System.out.println(logFormatter.format(record));
    }
}
