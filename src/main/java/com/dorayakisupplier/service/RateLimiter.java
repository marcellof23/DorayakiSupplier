package com.dorayakisupplier.service;

import com.dorayakisupplier.repo.LogRepo;
import com.dorayakisupplier.service.ws.LogRequest.*;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class RateLimiter {
    private static final LogRepo logRepository = new LogRepo();

    public boolean check(String ip, String endpoint) throws LogFault, SQLException {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        LogType lt = new LogType();
        lt.setIp(ip);
        lt.setEndpoint(endpoint);
        lt.setTimestamp(f.format(
                new Date(System.currentTimeMillis())
        ));

        logRepository.addLog(lt);

        int i = logRepository.countLog(ip, new Date(
                System.currentTimeMillis() - 60000
        ), new Date(
                System.currentTimeMillis()
        ));

        return i <= 10;
    }
}
