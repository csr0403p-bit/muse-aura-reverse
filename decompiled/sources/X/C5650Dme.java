package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dme, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5650Dme {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C5596Dlb A05;
    public final C5695Dnc A06;
    public final AtomicBoolean A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C6044Duf A0B;
    public final Integer A0C;
    public final AtomicBoolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5650Dme() {
        AtomicBoolean atomicBooleanA12 = BV4.A12(false);
        AtomicBoolean atomicBooleanA122 = BV4.A12(false);
        AtomicBoolean atomicBooleanA123 = BV4.A12(false);
        this(C6044Duf.A00, null, null, C79.A0P, atomicBooleanA12, atomicBooleanA122, atomicBooleanA123, 1000, 1000, -1, 15000, 30000, false, false, false, false, false);
    }

    public static final long A00(C5650Dme c5650Dme, long j, boolean z) {
        int i;
        int iA00;
        float f;
        C5596Dlb c5596Dlb;
        C5695Dnc c5695Dnc = c5650Dme.A06;
        if (c5695Dnc == null || c5650Dme.A09) {
            return 0L;
        }
        try {
            C0Q.A01("getIntentBasedLowWatermarkUs");
            if (z) {
                i = c5695Dnc.wifiMinLowWaterMarkMs;
                iA00 = (!c5650Dme.A0G || (c5596Dlb = c5650Dme.A05) == null) ? c5695Dnc.wifiMaxLowWaterMarkMs : C5596Dlb.A00(c5596Dlb, 10);
                f = c5695Dnc.wifiLowWaterMarkMultiplier;
            } else {
                C5596Dlb c5596Dlb2 = c5650Dme.A05;
                if (c5596Dlb2 != null && c5596Dlb2.A03 && c5695Dnc.enableTuningOnCellExcellent) {
                    i = c5695Dnc.cellExcellentMinLowWaterMarkMs;
                    iA00 = c5695Dnc.cellExcellentMaxLowWaterMarkMs;
                    f = c5695Dnc.cellExcellentLowWaterMarkMultiplier;
                } else {
                    i = c5695Dnc.cellMinLowWaterMarkMs;
                    iA00 = (!c5650Dme.A0F || c5596Dlb2 == null) ? c5695Dnc.cellMaxLowWaterMarkMs : C5596Dlb.A00(c5596Dlb2, 11);
                    f = c5695Dnc.cellLowWaterMarkMultiplier;
                }
            }
            return (long) (1.0f * Math.min((i * 1000) + (f * j), iA00 * 1000));
        } finally {
            C0Q.A00();
        }
    }

    public static final long A01(C5650Dme c5650Dme, long j, boolean z) {
        Integer num;
        C5596Dlb c5596Dlb = c5650Dme.A05;
        if (c5596Dlb == null || !c5596Dlb.A08 || j <= 0 || (num = c5650Dme.A0C) == C79.A0P) {
            return j;
        }
        int i = (z ? c5596Dlb.A0B : c5596Dlb.A0A)[num.intValue()];
        if (i == 100) {
            return j;
        }
        long j2 = (i * j) / 100;
        long jA0H = BV6.A0H(c5596Dlb.A04);
        return (jA0H <= 0 || j2 <= jA0H) ? j2 : Math.max(jA0H, Math.min(j, j2));
    }

    public static boolean A02(C5650Dme c5650Dme) {
        AtomicBoolean atomicBoolean;
        return c5650Dme.A0E && (atomicBoolean = c5650Dme.A0D) != null && atomicBoolean.get();
    }

    public C5650Dme(C6044Duf c6044Duf, C5596Dlb c5596Dlb, C5695Dnc c5695Dnc, Integer num, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A09 = z;
        this.A06 = c5695Dnc;
        this.A08 = atomicBoolean;
        this.A07 = atomicBoolean2;
        this.A0D = atomicBoolean3;
        this.A0E = z2;
        this.A03 = i * 1000;
        this.A02 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A01 = i4 * 1000;
        this.A00 = i5 * 1000;
        this.A05 = c5596Dlb;
        this.A0G = z3;
        this.A0F = z4;
        this.A0A = z5;
        this.A0C = num;
        this.A0B = c6044Duf;
    }
}
