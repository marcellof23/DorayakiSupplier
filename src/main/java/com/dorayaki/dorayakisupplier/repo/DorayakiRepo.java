package com.dorayaki.dorayakisupplier.repo;


import com.dorayaki.dorayakisupplier.model.Dorayaki;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dorayaki.dorayakisupplier.config.DBConfig;

public class DorayakiRepo {
    public static final Connection conn = DBConfig.getDbService().getConnection();

    public List<Dorayaki> getAllDorayaki() throws SQLException {
        List<Dorayaki> dorayakis = new ArrayList<>();
        String sql = "SELECT * FROM coklat";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()){
            Dorayaki c = new Dorayaki();
            c.setId(rs.getLong("id"));
            c.setName(rs.getString("nama"));
            c.setQuantity(rs.getLong("jumlah"));
            dorayakis.add(c);
        }
        return dorayakis;
    }
}
