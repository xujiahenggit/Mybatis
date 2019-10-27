package dao;

import domain.entry;

import java.util.List;
import java.util.Map;

public interface entryMapper {
  int insertEntry(entry entry);
  int updateEntry(entry entry);
  List<entry> querylike(String s);
  List<Map> seleAll(entry entry);
  int delEntry(Integer i);





}
