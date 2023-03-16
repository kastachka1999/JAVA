import java.util.*;
import java.io.*;
import java.text.*;
public class WriteFile {

    private String id;

    private String deadLine;
    private String fio;

    public WriteFile(String id, String deadLine, String fio) {

        this.id = id;
        this.deadLine = deadLine;
        this.fio = fio;
    }

    public void Write(Map<Integer,Patient> map){
        try(FileWriter writer = new FileWriter("C:\\1234\\java\\src\\main\\java\\Sicks.json", false))
        {
            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("дата E yyyy.MM.dd ' время' hh:mm:ss a zzz");
            writer.append("{\n");

            writer.append("\"id\"" + ": \"" + this.id + "\",\n" );
            writer.append("\"time\"" + ": \"" + formatForDateNow.format(dateNow) + "\",\n" );
            writer.append("\"deadTime\"" + ": \"" + this.deadLine + "\",\n" );
            writer.append("\"FIO\"" + ": \"" + this.fio + "\",\n" );

            int i = 1;

            for(Map.Entry<Integer, Patient> item : map.entrySet()){
                if (i == map.size()) {
                    writer.append("\"" + item.getKey().toString() + "\"" + ": " + "\"" + item.getValue().toString() + "\"" + "\n");
                } else {
                        writer.append("\"" + item.getKey().toString()+"\"" + ": " + "\""+item.getValue().toString()+"\"," + "\n");
                }
                i++;
            }

            writer.append("}");
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
