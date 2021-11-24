package com.dorayakisupplier.service.ws.LogRequest;

import java.sql.SQLException;

public class LogServiceClient {
    public static void main(String[] args) throws LogFault, SQLException {
        LogService service = new LogService();
        LogServicePortType hello = service.getLogServicePort();

        LogRequestIdAsLong lRid = new LogRequestIdAsLong();
        lRid.setLogRequestId(1);
        LogTypes response = hello.getLogs(lRid);
        System.out.println("punten");
        System.out.println(response);
    }
}
