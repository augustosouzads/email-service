package com.augusto.challenger.emailservice.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to,String subject, String body);
}
