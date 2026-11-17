package com.facebook.aura.commands.sms;

import X.C06H;

/* loaded from: classes3.dex */
public final class SmsAddressResolution {
    public final String address;
    public final String errorCode;
    public final String errorMessage;

    public final String getAddress() {
        return this.address;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public SmsAddressResolution(String str, String str2, String str3) {
        this.address = str;
        this.errorCode = str2;
        this.errorMessage = str3;
    }

    public /* synthetic */ SmsAddressResolution(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public SmsAddressResolution() {
        this(null, null, null);
    }
}
