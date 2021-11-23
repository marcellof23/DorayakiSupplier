package com.dorayakisupplier.model;

import java.sql.Timestamp;

public class LogRequest {
    private Long log_request_id;
    private String ip;
    private String endpoint;
    private Timestamp timestamp;

    public Long getId() {
        return log_request_id;
    }

    public void setId(Long id) {
        this.log_request_id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LogRequest{" +
                "log_request_id=" + this.log_request_id +
                ", ip='" + this.ip + '\'' +
                ", endpoint=" + this.endpoint+
                ", timestamp=" + this.endpoint +
                '}';
    }
}
