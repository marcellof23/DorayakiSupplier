package com.dorayakisupplier.service.impl;

import javax.jws.WebService;

import com.dorayakisupplier.repo.LogRepo;
import com.dorayakisupplier.service.ws.LogRequest.LogRequestIdAsLong;
import com.dorayakisupplier.service.ws.LogRequest.StatusCode;
import com.dorayakisupplier.service.ws.LogRequest.LogServicePortType;
import com.dorayakisupplier.service.ws.LogRequest.LogFault;
import com.dorayakisupplier.service.ws.LogRequest.LogType;
import com.dorayakisupplier.service.ws.LogRequest.LogTypes;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.dorayakisupplier.service.ws.LogRequest.LogServicePortType")
public class LogServiceImpl implements  LogServicePortType{

    private static final LogRepo logRepository = new LogRepo();

    public StatusCode addLog (LogType logType) throws LogFault {
        if ((logType.getIp() == null|| logType.getIp().equals("")) ) {
            throw new LogFault("Log should not be null or empty ", "Wrong input Data");
        }

        StatusCode code = new StatusCode();
        code.setCode(201);
        return code;
    }

    public LogTypes getLogs(LogRequestIdAsLong logID) throws LogFault, SQLException {

        LogTypes result = new LogTypes();

        List<LogType> logs = logRepository.getAllLog();
        for(LogType l : logs){
            result.getLogs().add(l);
        }
        return result;
    }

    public LogType getLogById(LogRequestIdAsLong params) throws LogFault {
        LogType result = new LogType();


        return null;
    }

    public StatusCode deleteLog(LogRequestIdAsLong params) throws LogFault {
        return null;
    }

    @Override
    public StatusCode updateLog(LogType params) throws LogFault {
        return null;
    }


}
