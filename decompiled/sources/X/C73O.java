package X;

/* renamed from: X.73O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73O {
    public final long A00;

    public static long A00(BFM bfm) {
        return ((C73O) bfm.A6v(C7VW.A02)).A00;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C73O) && this.A00 == ((C73O) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A01(this.A00);
    }

    public static String A01(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        StringBuilder sbA0w = C60O.A0w();
        C1DG.A07(sbA0w, AnonymousClass003.A03(j));
        sbA0w.append(" x ");
        C1DG.A07(sbA0w, Float.intBitsToFloat(AnonymousClass002.A09(j)));
        return sbA0w.toString();
    }
}
