package edu.hitsz.dao;

import java.util.ArrayList;
import java.util.List;

public class RecordDaoImpl implements RecordDao{
    private List<Record> records = new ArrayList<>();

    @Override
    public void setAllRecord(List<Record> records){
        this.records.addAll(records);
    }

    @Override
    public List<Record> getAllRecord(){
        return records;
    }

    @Override
    public void addRecord(Record record){
        boolean insertDone = false;
        if(records.isEmpty()){
            record.setRank(1);
            records.add(record);
            return;
        }
        for(Record recordi:records){
            if(record.getScore() >= recordi.getScore() && !insertDone){
                record.setRank(recordi.getRank());
                records.add(records.indexOf(recordi),record);
                insertDone = true;
                break;
            }
        }
        if (!insertDone){
            records.add(record);
        }
        else {
            for (int i = record.getRank();i<records.size();i++){
                records.get(i).setRank(records.get(i).getRank()+1);
            }
        }
    }

    @Override
    public void deleteRecord(Record record){
        records.remove(record);
        for(Record recordi:records){
            int index = records.indexOf(recordi);
            if (recordi.getRank() != index+1){
                recordi.setRank(index+1);
            }
        }
    }
}
