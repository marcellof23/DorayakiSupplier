package com.dorayakisupplier.service.impl;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.dorayakisupplier.service.ws.LogRequest.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.;

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
    public LogType getLogs(LogRequestIdAsLong logID) throws LogFault {
        if (logID.getLogRequestId() == 0) {
            throw new LogFault("Id is not valid", "Wrong input Data");
        }
        LogTypes result = new LogTypes();

        LogType log = new LogType();
        log.setLogRequestId(1);
        log.setEndpoint("http://localhost:8085/api/logService");
        log.setIp("196.168.0.1");
        Calendar createDate = Calendar.getInstance();
        Date cDate = createDate.getTime();
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(cDate);

        XMLGregorianCalendar date2 = DatatypeFactory.newInstance()
        log.setTimestamp(gcal.getTime());

        TutorialType tutorial2 = new TutorialType();
        tutorial2.setId(4);
        tutorial2.setAuthor("will john");
        tutorial2.setName("Rest with jersey");

        result.getTutorials().add(tutorial);
        result.getTutorials().add(tutorial2);

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
