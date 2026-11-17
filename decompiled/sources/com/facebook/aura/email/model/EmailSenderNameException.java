package com.facebook.aura.email.model;

/* loaded from: classes.dex */
public final class EmailSenderNameException extends RuntimeException {
    public final String userFacingMessage;

    public final String getUserFacingMessage() {
        return this.userFacingMessage;
    }

    public EmailSenderNameException(String str) {
        this.userFacingMessage = str;
    }
}
