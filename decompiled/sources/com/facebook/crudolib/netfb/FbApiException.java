package com.facebook.crudolib.netfb;

import X.BV5;
import X.BV8;
import X.C60O;
import X.C60P;
import X.EnumC2377BWn;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FbApiException extends IOException {
    public static final long serialVersionUID = 1;
    public final int apiErrorCode;
    public final String errorData;
    public final EnumC2377BWn errorDomain;
    public final String errorMessage;
    public final String errorUserMsg;
    public final String errorUserTitle;
    public final String fbTraceId;

    public FbApiException(EnumC2377BWn enumC2377BWn, String str, String str2, int i) {
        super(str == null ? C60P.A1O(": code=", BV5.A0q(enumC2377BWn), i) : str);
        this.apiErrorCode = i;
        this.errorMessage = str;
        this.errorData = str2;
        this.errorUserTitle = null;
        this.errorUserMsg = null;
        this.fbTraceId = null;
        this.errorDomain = enumC2377BWn;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{apiErrorCode=");
        sbA0x.append(this.apiErrorCode);
        sbA0x.append(", errorMessage=");
        sbA0x.append(this.errorMessage);
        sbA0x.append(", errorData=");
        sbA0x.append(this.errorData);
        sbA0x.append(", errorUserTitle=");
        sbA0x.append(this.errorUserTitle);
        sbA0x.append(", errorUserMsg=");
        sbA0x.append(this.errorUserMsg);
        sbA0x.append(", fbTraceId=");
        sbA0x.append(this.fbTraceId);
        sbA0x.append(", errorDomain=");
        return BV8.A0v(this.errorDomain, sbA0x);
    }

    public FbApiException(EnumC2377BWn enumC2377BWn, String str, String str2, String str3, String str4, String str5, int i) {
        super(str);
        this.apiErrorCode = i;
        this.errorMessage = str;
        this.errorData = str2;
        this.errorUserTitle = str3;
        this.errorUserMsg = str4;
        this.fbTraceId = str5;
        this.errorDomain = enumC2377BWn;
    }
}
