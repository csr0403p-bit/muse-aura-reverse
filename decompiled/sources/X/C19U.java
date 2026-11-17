package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.19U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19U {
    public static final void A05(long j) {
        long j2 = C1809ArT.A01;
        if ((j & 1095216660480L) == 0) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final long A04(long j, float f) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        long j2 = C1809ArT.A01;
        return jFloatToRawIntBits;
    }

    public static final long A00(double d) {
        return A04(8589934592L, (float) d);
    }

    public static final long A01(double d) {
        return A04(LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES, (float) d);
    }

    public static final long A02(float f) {
        return A04(LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES, f);
    }

    public static final long A03(int i) {
        return A04(LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES, i);
    }
}
