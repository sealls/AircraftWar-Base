package edu.hitsz.dao;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class RecordTable {
    public void makeTable(String userName,int score){
        RecordDao recording = new RecordDaoImpl();
        List<Record> records = new ArrayList<>();
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Record record = new Record(userName,score,sdf.format(now));
        try {
            File file = new File("record.ser");
            if(file.exists()){
                ObjectInputStream out = new ObjectInputStream(
                        new FileInputStream(file));
                Record[] obj = (Record[]) out.readObject();
                List<Record> listObject = Arrays.asList(obj);
                recording.setAllRecord(listObject);
                recording.addRecord(record);
                records.addAll(recording.getAllRecord());
                out.close();
                file.delete();
            }
            else {
                recording.addRecord(record);
                records.addAll(recording.getAllRecord());
            }
            file.createNewFile();
            for(Record recordi:records){
                System.out.printf("第%d名：%s，%d，%s\n",
                        recordi.getRank(),
                        recordi.getUserName(),
                        recordi.getScore(),
                        recordi.getTime());
            }
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            Record[] tempRecords = new Record[records.size()];
            records.toArray(tempRecords);
            oos.writeObject(tempRecords);
            oos.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
