package X;

import X.InterfaceC1186Adp;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;

/* loaded from: classes4.dex */
public abstract class AdZ<Interval extends InterfaceC1186Adp> {
    public InterfaceC1183Adm<Interval> A00() {
        return this instanceof C1169AdU ? ((C1169AdU) this).A00 : ((C1167AdO) this).A02;
    }

    public final Object A01(int i) {
        Object objA0r;
        C1181Adk<Interval> c1181AdkABv = A00().ABv(i);
        int i2 = i - c1181AdkABv.A01;
        G0U<Integer, Object> g0uAGn = c1181AdkABv.A02.AGn();
        return (g0uAGn == null || (objA0r = C8j4.A0r(g0uAGn, i2)) == null) ? new DefaultLazyKey(i) : objA0r;
    }
}
