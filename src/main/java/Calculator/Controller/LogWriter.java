package Calculator.Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogWriter {
    public String log;

    public LogWriter() {
        this.log = log;
    }

    public void writeLog(String log) throws IOException {
        File logFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\" +
                                       "JAVACource\\OopJavaCource\\src\\main\\java\\Calculator",
                                "calculatorLogFile.txt");
        FileWriter fw = new FileWriter(logFile, true);
        fw.append(String.valueOf(new Date())).append("; ");
        //fw.append('\n');
        fw.append(log);
        fw.append('\n');
        fw.flush();
    }

    @Override
    public String toString() {
        return "LogWriter{}";
    }
}
