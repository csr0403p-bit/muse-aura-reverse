package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class AWA {
    public final long A00;

    public static final float A01(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static void A05(MutableState mutableState, long j) {
        mutableState.Af8(new AWA(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AWA) && this.A00 == ((AWA) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A04(this.A00);
    }

    public /* synthetic */ AWA(long j) {
        this.A00 = j;
    }

    public static final long A02(long j, float f) {
        return AnonymousClass005.A0L(C8j4.A00(j, f), AnonymousClass001.A01(j, 4294967295L) * f);
    }

    public static long A03(MutableState mutableState) {
        return ((AWA) mutableState.getValue()).A00;
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String A04(long j) {
        return j != 9205357640488583168L ? FGI.A0e("Size(", AW8.A00(AnonymousClass003.A03(j)), ", ", AW8.A00(AnonymousClass004.A00(j)), ')') : "Size.Unspecified";
    }

    public static final boolean A06(long j) {
        return AnonymousClass002.A1M((j > 9205357640488583168L ? 1 : (j == 9205357640488583168L ? 0 : -1))) | (AnonymousClass003.A03(j) <= 0.0f) | (AnonymousClass004.A00(j) <= 0.0f);
    }
}
