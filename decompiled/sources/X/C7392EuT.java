package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.EuT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7392EuT {
    public final Object A00;
    public final List A01 = C3cG.A0h();

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(100);
        BV7.A1J(sbA0p, C3cI.A0Y(this.A00));
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sbA0p.append(C60Q.A0n(list, i));
            if (i < size - 1) {
                C8j3.A1K(sbA0p);
            }
        }
        return C8j3.A15(sbA0p);
    }

    public /* synthetic */ C7392EuT(Object obj) {
        this.A00 = obj;
    }

    public final void A00(Object obj, String str) {
        this.A01.add(FGI.A0U(str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, String.valueOf(obj)));
    }
}
