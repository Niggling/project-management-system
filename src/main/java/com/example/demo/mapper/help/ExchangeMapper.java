package com.example.demo.mapper.help;

import com.example.demo.pojo.help.MyTeam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExchangeMapper {

    void ExchangeMember(String eid,String projectID,String employeeID);

}