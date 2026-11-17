package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes6.dex */
public final class Hm0 {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public static Hm0 A00(Object obj, Object obj2, Object[] objArr, int i) {
        int i2 = i ^ 1;
        Object obj3 = objArr[i2];
        obj3.getClass();
        Hm0 hm0 = new Hm0(obj, obj2, obj3);
        objArr[i2] = obj2;
        return hm0;
    }

    public final IllegalArgumentException A01() {
        Object obj = this.A00;
        return C60O.A0i(FGI.A0l(BV3.A00(39), String.valueOf(obj), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(this.A01), " and ", String.valueOf(obj), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(this.A02)));
    }

    public Hm0(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
