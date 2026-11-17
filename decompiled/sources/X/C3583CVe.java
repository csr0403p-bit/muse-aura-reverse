package X;

/* renamed from: X.CVe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3583CVe extends AbstractC3584CVf<C3581CVc> {
    public final DQZ<Class<? extends AbstractC3582CVd>, AbstractC3584CVf<?>> A00;

    public final C3581CVc A03() {
        C3581CVc c3581CVc = new C3581CVc();
        DQZ<Class<? extends AbstractC3582CVd>, AbstractC3584CVf<?>> dqz = this.A00;
        int size = dqz.size();
        for (int i = 0; i < size; i++) {
            Class<? extends AbstractC3582CVd> clsA05 = dqz.A05(i);
            AbstractC3584CVf<?> abstractC3584CVfA07 = dqz.A07(i);
            if (abstractC3584CVfA07 != null) {
                c3581CVc.mMetricsMap.put(clsA05, abstractC3584CVfA07.A01());
                c3581CVc.mMetricsValid.put(clsA05, Boolean.FALSE);
            }
        }
        return c3581CVc;
    }

    public C3583CVe(DQZ dqz) {
        DQZ<Class<? extends AbstractC3582CVd>, AbstractC3584CVf<?>> dqz2 = new DQZ<>(0);
        this.A00 = dqz2;
        dqz2.A0A(dqz);
    }
}
