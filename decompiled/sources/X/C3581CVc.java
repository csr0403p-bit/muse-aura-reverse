package X;

/* renamed from: X.CVc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3581CVc extends AbstractC3582CVd<C3581CVc> {
    public final DQZ<Class<? extends AbstractC3582CVd>, AbstractC3582CVd> mMetricsMap = new DQZ<>(0);
    public final DQZ<Class<? extends AbstractC3582CVd>, Boolean> mMetricsValid = new DQZ<>(0);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3581CVc c3581CVc = (C3581CVc) obj;
                if (!AbstractC7485Exn.A00(this.mMetricsValid, c3581CVc.mMetricsValid) || !AbstractC7485Exn.A00(this.mMetricsMap, c3581CVc.mMetricsMap)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final void A00(C3581CVc c3581CVc, C3581CVc c3581CVc2) {
        DQZ<Class<? extends AbstractC3582CVd>, Boolean> dqz;
        Boolean bool;
        int size = c3581CVc.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class<? extends AbstractC3582CVd> clsA05 = c3581CVc.mMetricsMap.A05(i);
            AbstractC3582CVd abstractC3582CVdA03 = c3581CVc2.A03(clsA05);
            if (abstractC3582CVdA03 != null) {
                c3581CVc.A03(clsA05).A01(abstractC3582CVdA03);
                boolean zA04 = c3581CVc2.A04(clsA05);
                dqz = c3581CVc.mMetricsValid;
                if (zA04) {
                    bool = Boolean.TRUE;
                }
                dqz.put(clsA05, bool);
            } else {
                dqz = c3581CVc.mMetricsValid;
            }
            bool = Boolean.FALSE;
            dqz.put(clsA05, bool);
        }
    }

    public final <T extends AbstractC3582CVd<T>> T A03(Class<T> cls) {
        return cls.cast(this.mMetricsMap.get(cls));
    }

    public final boolean A04(Class cls) {
        Boolean bool = this.mMetricsValid.get(cls);
        return bool != null && bool.booleanValue();
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.mMetricsValid, AnonymousClass005.A0E(this.mMetricsMap));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            sbA0x.append(this.mMetricsMap.A07(i));
            sbA0x.append(A04(this.mMetricsMap.A05(i)) ? " [valid]" : " [invalid]");
            sbA0x.append('\n');
        }
        return BV7.A11(sbA0x);
    }
}
