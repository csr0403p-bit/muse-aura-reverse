package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.ArT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1809ArT {
    public final long A00;
    public static final C1813ArX[] A02 = {new C1813ArX(0), new C1813ArX(LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES), new C1813ArX(8589934592L)};
    public static final long A01 = C19U.A04(0, Float.NaN);

    public static final long A01(long j) {
        return A02[(int) ((j & 1095216660480L) >>> 32)].A00;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1809ArT) && this.A00 == ((C1809ArT) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A02(this.A00);
    }

    public /* synthetic */ C1809ArT(long j) {
        this.A00 = j;
    }

    public static String A02(long j) {
        StringBuilder sbA0w;
        String str;
        long jA01 = A01(j);
        if (jA01 == 0) {
            return "Unspecified";
        }
        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            sbA0w = C60O.A0w();
            sbA0w.append(A00(j));
            str = ".sp";
        } else {
            if (jA01 != 8589934592L) {
                return "Invalid";
            }
            sbA0w = C60O.A0w();
            sbA0w.append(A00(j));
            str = ".em";
        }
        return AnonymousClass001.A0v(str, sbA0w);
    }

    public static final float A00(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
