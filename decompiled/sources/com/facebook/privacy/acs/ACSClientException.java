package com.facebook.privacy.acs;

/* loaded from: classes4.dex */
public class ACSClientException extends Exception {
    public static final long serialVersionUID = 1;
    public final String errorSite;

    public ACSClientException(String str) {
        super(str);
        this.errorSite = null;
    }

    public ACSClientException(String str, String str2) {
        super(str);
        this.errorSite = str2;
    }
}
