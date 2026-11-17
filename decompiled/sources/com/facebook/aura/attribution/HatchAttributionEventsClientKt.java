package com.facebook.aura.attribution;

import X.AnonymousClass003;
import X.BV5;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes5.dex */
public abstract class HatchAttributionEventsClientKt {
    public static final String attributionFailureMessage(Throwable th) {
        NetworkException networkException;
        C7384Etj.A0Y(th, 0);
        return FGI.A0H("HTTP ", (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) ? -1 : networkException.httpResponseCode);
    }

    public static final void logAttributionFailure(String str, Throwable th) {
        NetworkException networkException;
        AnonymousClass003.A0u(str, th);
        int i = (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) ? -1 : networkException.httpResponseCode;
        if (400 > i || i >= 500) {
            CFK.A0D("HatchAttribution", "%s failed (HTTP %d)", th, BV5.A1a(str, i));
        } else {
            CFK.A0C("HatchAttribution", "%s rejected the request (HTTP %d)", th, BV5.A1a(str, i));
        }
    }
}
