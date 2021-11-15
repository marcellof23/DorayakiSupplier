package com.dorayaki.dorayakisupplier;

import com.dorayaki.dorayakisupplier.service.*;

import javax.xml.ws.Endpoint;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        Endpoint.publish("http://localhost:8080/api/hello", new Hello());
        Endpoint.publish("http://localhost:8081/api/login", new DorayakiService());
    }
}
