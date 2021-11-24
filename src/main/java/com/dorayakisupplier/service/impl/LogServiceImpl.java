package com.dorayakisupplier.service.impl;

import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

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

    @Resource WebServiceContext context;

    private static final LogRepo logRepository = new LogRepo();

    public StatusCode addLog (LogType logType) throws LogFault, SQLException {
        if ((logType.getIp() == null|| logType.getIp().equals("")) ) {
            throw new LogFault("Log IP should not be null or empty ", "Wrong input Data");
        }

        HttpServletRequest request = (HttpServletRequest)context.getMessageContext().get(MessageContext.SERVLET_REQUEST);
        logType.setIp(request.getRemoteAddr());

        Boolean isSuccess = logRepository.addLog(logType);

        StatusCode code = new StatusCode();
        if(isSuccess) {
            code.setCode(201);
        } else {
            code.setCode(400);
        }
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
        return null;
    }

    public StatusCode deleteLog(LogRequestIdAsLong params) throws LogFault {
        return null;
    }

    public StatusCode updateLog(LogType params) throws LogFault {
        return null;
    }
}
