package com.meta.mftpaymentssecurity.ptt;

/* loaded from: classes5.dex */
public class PttException extends RuntimeException {
    public static final long serialVersionUID = 1;
    public final int mCode;

    public PttException(String str, int i) {
        super(str);
        this.mCode = i;
    }
}
