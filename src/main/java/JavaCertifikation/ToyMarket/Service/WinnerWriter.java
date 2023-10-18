package JavaCertifikation.ToyMarket.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WinnerWriter {
    public String winner;

    public WinnerWriter(String winner) {
        this.winner = winner;
    }
    public WinnerWriter() {}
    public void winnerWriter(String winner) throws IOException {
        File winnerFile = new File("C:\\Users\\SlavaMar\\Desktop\\ДЗ GB\\" +
                "JAVACource\\OopJavaCource\\src\\main\\java\\JavaCertifikation\\" +
                "ToyMarket", "winnerFile.txt");
        FileWriter fw = new FileWriter(winnerFile, true);
        fw.append(String.valueOf(new Date())).append("; ");
        fw.append(winner);
        fw.append('\n');
        fw.flush();
    }
}
