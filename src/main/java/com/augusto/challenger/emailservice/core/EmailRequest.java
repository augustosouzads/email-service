package com.augusto.challenger.emailservice.core;

public record EmailRequest(String to, String subject, String body) {
}
