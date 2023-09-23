package ComplexCalculatorHW7.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogWriter {
    public String log;

    public LogWriter() {
        this.log = log;
    }

    public static void writeLog(String log) throws IOException {
        File logFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\" +
                "JAVACource\\OopJavaCource\\src\\main\\java\\ComplexCalculatorHW7",
                "calculatorLogFile.txt");
        FileWriter fw = new FileWriter(logFile, true);
        fw.append(String.valueOf(new Date())).append("; ");
        fw.append(log);
        fw.append('\n');
        fw.flush();
    }

    @Override
    public String toString() {
        return "LogWriter{}";
    }
}
