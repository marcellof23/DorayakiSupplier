package com.dorayakisupplier.service.impl;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import javax.xml.datatype.XMLGregorianCalendar;

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

    @Override
    public LogTypes getLogs(LogRequestIdAsLong logID) throws LogFault {
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
        log.setLogRequestId(2);
        log.setEndpoint("http://localhost:8085/api/logService");
        log.setIp("196.168.1.1");
        log.setTimestamp("January 2, 2024, 00:00:00 GMT");

        result.getLogs().add(log);
        result.getLogs().add(log2);

        return result;
    }

    @Override
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
