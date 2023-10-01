package EX.Application.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogWriter {
    public String log;
    public String fileName;

    public LogWriter() {
        this.log = log;
        this.fileName = fileName;
    }
    public LogWriter(String fileName){
        this.log = log;
        this.fileName = fileName;
    }

    public void writeLog(String log) throws IOException {
        File logFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\" +
                "JAVACource\\OopJavaCource\\src\\main\\java\\EX\\Application", fileName + ".txt");
        FileWriter fw = new FileWriter(logFile, true);
        //fw.append(String.valueOf(new Date())).append("; ");
        fw.append(log);
        fw.append('\n');
        fw.flush();
    }

    @Override
    public String toString() {
        return "LogWriter{}";
    }
}
