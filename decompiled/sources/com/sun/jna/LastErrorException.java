package com.sun.jna;

import X.FGI;

/* loaded from: classes5.dex */
public class LastErrorException extends RuntimeException {
    public static final long serialVersionUID = 1;
    public int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LastErrorException(String str) {
        String strTrim = str.trim();
        try {
            strTrim = formatMessage(Integer.parseInt(strTrim));
        } catch (NumberFormatException unused) {
        }
        super(strTrim);
        try {
            this.errorCode = Integer.parseInt(str.startsWith("[") ? str.substring(1, str.indexOf("]")) : str);
        } catch (NumberFormatException unused2) {
            this.errorCode = -1;
        }
    }

    public static String formatMessage(int i) {
        return FGI.A0H(Platform.isWindows() ? "GetLastError() returned " : "errno was ", i);
    }

    public static String parseMessage(String str) {
        try {
            return formatMessage(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public LastErrorException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public LastErrorException(int i) {
        this(i, formatMessage(i));
    }
}
