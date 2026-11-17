package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ASU {
    public static float A00(long j, AXN axn) {
        if (C1809ArT.A01(j) == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            return axn.Ah4(axn.Agw(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static int A01(AXN axn, float f) {
        float fAh4 = axn.Ah4(f);
        if (Float.isInfinite(fAh4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fAh4);
    }

    public static long A02(AXN axn, long j) {
        if (j != 9205357640488583168L) {
            return C16n.A00(axn.Agx(AnonymousClass003.A03(j)), axn.Agx(AnonymousClass004.A00(j)));
        }
        return 9205357640488583168L;
    }

    public static long A03(AXN axn, long j) {
        if (j != 9205357640488583168L) {
            return AnonymousClass007.A0B(axn.Ah4(AnonymousClass001.A00(j)), axn.Ah4(Float.intBitsToFloat(AnonymousClass002.A09(j))));
        }
        return 9205357640488583168L;
    }
}
