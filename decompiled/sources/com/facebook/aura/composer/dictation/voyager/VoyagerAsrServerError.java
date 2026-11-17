package com.facebook.aura.composer.dictation.voyager;

import X.C7384Etj;

/* loaded from: classes5.dex */
public final class VoyagerAsrServerError {
    public final String errorCode;
    public final String errorType;
    public final String message;
    public final String serverSessionId;

    public VoyagerAsrServerError(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str3, 2);
        this.errorType = str;
        this.errorCode = str2;
        this.message = str3;
        this.serverSessionId = str4;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getServerSessionId() {
        return this.serverSessionId;
    }
}
