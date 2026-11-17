package com.whatsapp.accountlinking.ipc.api.models;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ResponseCode {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ResponseCode[] A01;
    public static final ResponseCode A02;
    public static final ResponseCode A03;
    public final int code;

    static {
        ResponseCode responseCode = new ResponseCode("SUCCESS", 0, 0);
        A03 = responseCode;
        ResponseCode responseCode2 = new ResponseCode("ERROR", 1, 1);
        A02 = responseCode2;
        ResponseCode[] responseCodeArr = {responseCode, responseCode2};
        A01 = responseCodeArr;
        A00 = C3cG.A0w(responseCodeArr);
    }

    public static ResponseCode valueOf(String str) {
        return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
    }

    public static ResponseCode[] values() {
        return (ResponseCode[]) A01.clone();
    }

    public ResponseCode(String str, int i, int i2) {
        this.code = i2;
    }
}
