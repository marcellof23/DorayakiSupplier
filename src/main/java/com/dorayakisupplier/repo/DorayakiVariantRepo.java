package com.dorayakisupplier.repo;


import com.dorayakisupplier.model.DorayakiVariant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dorayakisupplier.config.DBConfig;

public class DorayakiVariantRepo {
    public static final Connection conn = DBConfig.getDbService().getConnection();

    public List<DorayakiVariant> getDorayakiVariants() throws SQLException {
        List<DorayakiVariant> dorayakiVariants = new ArrayList<>();
        String sql = "SELECT * FROM dorayaki";
        ResultSet rs = this.conn.createStatement().executeQuery(sql);
        while (rs.next()){
            DorayakiVariant c = new DorayakiVariant();
            c.setId(rs.getLong("id"));
            c.setName(rs.getString("nama"));
            c.setStock(rs.getLong("jumlah"));
            dorayakiVariants.add(c);
        }
        return dorayakiVariants;
    }
}
