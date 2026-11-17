package com.whatsapp.accountlinking.ipc.api.models;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ErrorSubCode {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ErrorSubCode[] A01;
    public static final ErrorSubCode A02;
    public static final ErrorSubCode A03;
    public final int code;

    static {
        ErrorSubCode errorSubCode = new ErrorSubCode("XPOST_ERROR_ALREADY_CROSSPOSTED", 0, 0);
        ErrorSubCode errorSubCode2 = new ErrorSubCode("XPOST_ERROR_UNKNOWN", 1, 1);
        ErrorSubCode errorSubCode3 = new ErrorSubCode("XPOST_ERROR_INVALID_MEDIA_TYPE", 2, 2);
        ErrorSubCode errorSubCode4 = new ErrorSubCode("OPERATION_TIMEOUT_ERROR", 3, 3);
        ErrorSubCode errorSubCode5 = new ErrorSubCode("OPERATION_DISABLED_ERROR", 4, 4);
        A03 = errorSubCode5;
        ErrorSubCode errorSubCode6 = new ErrorSubCode("AC_LINK_NOT_ACTIVE", 5, 5);
        ErrorSubCode errorSubCode7 = new ErrorSubCode("OPERATION_ENTRY_POINT_DISABLED_ERROR", 6, 6);
        ErrorSubCode errorSubCode8 = new ErrorSubCode("SESSION_ID_MISMATCH", 7, 7);
        ErrorSubCode errorSubCode9 = new ErrorSubCode("INVALID_PARAMS_ERROR", 8, 8);
        ErrorSubCode errorSubCode10 = new ErrorSubCode("MISSING_DATA_ERROR", 9, 9);
        A02 = errorSubCode10;
        ErrorSubCode[] errorSubCodeArr = {errorSubCode, errorSubCode2, errorSubCode3, errorSubCode4, errorSubCode5, errorSubCode6, errorSubCode7, errorSubCode8, errorSubCode9, errorSubCode10, new ErrorSubCode("SMB_CROSSPOST_LINKING_MISSING", 10, 10), new ErrorSubCode("SMB_CROSSPOST_ACCOUNT_NOT_SMB", 11, 11), new ErrorSubCode("SMB_CROSSPOST_MULTIPLE_ACCOUNTS", 12, 12), new ErrorSubCode("SMB_CROSSPOST_PHONE_NUMBER_MISMATCH", 13, 13)};
        A01 = errorSubCodeArr;
        A00 = C3cG.A0w(errorSubCodeArr);
    }

    public static ErrorSubCode valueOf(String str) {
        return (ErrorSubCode) Enum.valueOf(ErrorSubCode.class, str);
    }

    public static ErrorSubCode[] values() {
        return (ErrorSubCode[]) A01.clone();
    }

    public ErrorSubCode(String str, int i, int i2) {
        this.code = i2;
    }
}
