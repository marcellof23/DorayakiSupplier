package com.dorayakisupplier.service.ws.LogRequest;

public class LogServiceClient {
    public static void main(String[] args) throws LogFault{
        LogService service = new LogService();
        LogServicePortType hello = service.getLogServicePort();

        LogRequestIdAsLong lRid = new LogRequestIdAsLong();
        lRid.setLogRequestId(1);
        LogTypes response = hello.getLogs(lRid);
        System.out.println("punten");
        System.out.println(response);
    }
}
