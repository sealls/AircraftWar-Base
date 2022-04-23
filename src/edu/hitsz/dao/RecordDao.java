package edu.hitsz.dao;

import java.util.List;

public interface RecordDao {
    //void findByRank(int rank);
    void setAllRecord(List<Record> records);

    List<Record> getAllRecord();

    void addRecord(Record record);

    void deleteRecord(Record record);
}
