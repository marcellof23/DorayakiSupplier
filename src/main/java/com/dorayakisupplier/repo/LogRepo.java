package com.dorayakisupplier.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.dorayakisupplier.config.DBConfig;
import com.dorayakisupplier.model.LogRequest;
import com.dorayakisupplier.service.ws.LogRequest.LogType;

public class LogRepo {
    public static final Connection conn = DBConfig.getDbService().getConnection();

    public List<LogType> getAllLog() throws SQLException {
        List<LogType> logs = new ArrayList<>();
        String sql = "SELECT * FROM logrequest";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()) {
            LogType l = new LogType();
            l.setLogRequestId(rs.getLong("logrequest_id"));
            l.setIp(rs.getString("ip"));
            l.setEndpoint(rs.getString("endpoint"));
            l.setTimestamp(rs.getString("created_at"));
            logs.add(l);
        }
        return logs;
    }
}

