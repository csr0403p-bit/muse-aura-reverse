package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.CeR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3783CeR {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public final IllegalArgumentException A00() {
        Object obj = this.A02;
        Object obj2 = this.A01;
        Object obj3 = this.A00;
        return C60O.A0i(FGI.A0l("Multiple entries with same key: ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj2), " and ", String.valueOf(obj3), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj)));
    }

    public C3783CeR(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
