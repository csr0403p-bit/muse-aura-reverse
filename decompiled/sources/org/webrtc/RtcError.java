package org.webrtc;

import X.AnonymousClass002;

/* loaded from: classes6.dex */
public class RtcError {
    public final RtcException error;

    public static RtcError success() {
        return new RtcError(null);
    }

    public RtcException error() {
        return this.error;
    }

    public boolean isError() {
        return AnonymousClass002.A1X(this.error);
    }

    public boolean isSuccess() {
        return AnonymousClass002.A1Y(this.error);
    }

    public void throwError() {
        RtcException rtcException = this.error;
        if (rtcException != null) {
            throw rtcException;
        }
    }

    public RtcError(RtcException rtcException) {
        this.error = rtcException;
    }

    public static RtcError error(String str) {
        return new RtcError(new RtcException(str));
    }
}
