package com.jinternals.go4.observer;

import java.util.Map;

/**
 * Created by mradul on 01/08/17.
 */
public class Message {

    public Message(String id, Map<String, String> header, Map<String, String> body){
        this.id = id;
        this.header = header;
        this.body = body;
    }

    private String id;
    private Map<String, String> header;
    private Map<String, String> body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public Map<String, String> getBody() {
        return body;
    }

    public void setBody(Map<String, String> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        Message message = (Message) o;

        if (getId() != null ? !getId().equals(message.getId()) : message.getId() != null) return false;
        if (getHeader() != null ? !getHeader().equals(message.getHeader()) : message.getHeader() != null) return false;
        return getBody() != null ? getBody().equals(message.getBody()) : message.getBody() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getHeader() != null ? getHeader().hashCode() : 0);
        result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
        return result;
    }
}


