import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
public class CsvAudit {
    private String CsvFile = "audit.csv";
    private FileWriter AuditWriter;
    public CsvAudit()
    {
        try{
            AuditWriter = new FileWriter(CsvFile, true);
        }
        catch(IOException e)
        {
            System.out.println (e.toString());
        }
    }
    public void postAction(String Name)
    {
        try{
            AuditWriter.append(DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss").format(LocalDateTime.now()));
            AuditWriter.append(" - ");
            AuditWriter.append(Name);
            AuditWriter.append("\n");
            AuditWriter.flush();
        }
        catch(IOException e)
        {
            System.out.println (e.toString());
        }
    }
}
