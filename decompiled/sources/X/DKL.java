package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes5.dex */
public final class DKL {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public final IllegalArgumentException A00() {
        StringBuilder sbA0x = C60O.A0x("Multiple entries with same key: ");
        Object obj = this.A00;
        sbA0x.append(obj);
        sbA0x.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        sbA0x.append(this.A01);
        sbA0x.append(" and ");
        sbA0x.append(obj);
        sbA0x.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
        return C60O.A0i(C8j3.A14(this.A02, sbA0x));
    }

    public DKL(Object key, Object value1, Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }
}
