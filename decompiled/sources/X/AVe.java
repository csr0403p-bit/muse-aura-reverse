package X;

/* loaded from: classes4.dex */
public final class AVe {
    public final long A00;

    public final boolean equals(Object obj) {
        return (obj instanceof AVe) && this.A00 == ((AVe) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A00(this.A00);
    }

    public /* synthetic */ AVe(long j) {
        this.A00 = j;
    }

    public static String A00(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        StringBuilder sbA0x = C60O.A0x("(");
        C1DG.A07(sbA0x, AnonymousClass003.A03(j));
        C8j3.A1K(sbA0x);
        return AnonymousClass007.A0Z(C1DG.A05(AnonymousClass004.A00(j)), sbA0x);
    }
}
