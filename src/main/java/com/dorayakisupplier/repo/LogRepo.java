package com.dorayakisupplier.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dorayakisupplier.config.DBConfig;
import com.dorayakisupplier.model.LogRequest;
import com.dorayakisupplier.service.ws.LogRequest.LogType;

public class LogRepo {
    public static final Connection conn = DBConfig.getDbService().getConnection();

    public Boolean addLog(LogType logType) throws SQLException {
        try {
            Statement smt = this.conn.createStatement();
            String sql = "INSERT INTO logrequest values(NULL, '" + logType.getIp() + "', '" + logType.getEndpoint() + "', '" + logType.getTimestamp() + "', '" + logType.getTimestamp() + "');";
            sql = sql.replace("\"", "");
            smt.executeUpdate(sql);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public List<LogType> getAllLog() throws SQLException {
        List<LogType> logs = new ArrayList<>();
        String sql = "SELECT * FROM logrequest";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()) {
            LogType l = new LogType();
            l.setIp(rs.getString("ip"));
            l.setEndpoint(rs.getString("endpoint"));
            l.setTimestamp(rs.getString("created_at"));
            logs.add(l);
        }
        return logs;
    }

    public int countLog(String ip, Date start, Date end) throws SQLException {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String sql = "SELECT COUNT(*) as log_count FROM logrequest " +
                "WHERE ip = '" + ip + "' AND created_at between '" +
                f.format(start) + "' and '" + f.format(end) + "'";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        if (rs.next()) return rs.getInt("log_count");
        return 0;
    }
}

