package X;

import java.util.Map;

/* renamed from: X.FAj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7690FAj {
    public final Object A00 = C3cG.A0T();
    public final Map<Hk7, Integer> A01 = BV4.A0u();

    public final int A00(FDW fdw, FDW fdw2, String str) {
        int iIncrementAndGet;
        Hk7 hk7 = new Hk7(fdw2.A04, fdw.A04, str);
        synchronized (this.A00) {
            Map<Hk7, Integer> map = this.A01;
            Integer num = map.get(hk7);
            if (num != null) {
                iIncrementAndGet = num.intValue();
            } else {
                iIncrementAndGet = AbstractC7694FAo.A00.incrementAndGet();
                BV4.A1H(hk7, map, iIncrementAndGet);
            }
        }
        return iIncrementAndGet;
    }
}
