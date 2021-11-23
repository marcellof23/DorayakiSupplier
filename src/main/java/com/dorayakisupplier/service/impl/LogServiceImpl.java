package com.dorayakisupplier.service.impl;

import javax.jws.WebService;

import com.dorayakisupplier.service.ws.LogRequest.LogRequestIdAsLong;
import com.dorayakisupplier.service.ws.LogRequest.StatusCode;
import com.dorayakisupplier.service.ws.LogRequest.LogServicePortType;
import com.dorayakisupplier.service.ws.LogRequest.LogFault;
import com.dorayakisupplier.service.ws.LogRequest.LogType;
import com.dorayakisupplier.service.ws.LogRequest.LogTypes;

@WebService(endpointInterface = "com.dorayakisupplier.service.ws.LogRequest.LogServicePortType")
public class LogServiceImpl implements  LogServicePortType{

    public StatusCode addLog (LogType logType) throws LogFault {
        if ((logType.getIp() == null|| logType.getIp().equals("")) ) {
            throw new LogFault("Log should not be null or empty ", "Wrong input Data");
        }

        StatusCode code = new StatusCode();
        code.setCode(201);
        return code;
    }

    public LogTypes getLogs(LogRequestIdAsLong logID) throws LogFault {
        System.out.println("WOI");
        if (logID.getLogRequestId() == 0) {
            throw new LogFault("Id is not valid", "Wrong input Data");
        }
        LogTypes result = new LogTypes();

        LogType log = new LogType();
        log.setLogRequestId(1);
        log.setEndpoint("http://localhost:8085/api/logService");
        log.setIp("196.168.0.1");
        log.setTimestamp("January 1, 2024, 00:00:00 GMT");

        LogType log2 = new LogType();
        log2.setLogRequestId(2);
        log2.setEndpoint("http://localhost:8085/api/logService");
        log2.setIp("196.168.1.1");
        log2.setTimestamp("January 2, 2024, 00:00:00 GMT");

        result.getLogs().add(log);
        result.getLogs().add(log2);
        System.out.println(result);
        return result;
    }

    public LogType getLogById(LogRequestIdAsLong params) throws LogFault {
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
