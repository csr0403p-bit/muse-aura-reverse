package X;

/* loaded from: classes4.dex */
public final class Au3 {
    public static final long A01 = C8j3.A0M();
    public final long A00;

    public static String A03(long j) {
        return C8j4.A0y("TextRange(", ", ", C8j3.A0G(j), AnonymousClass002.A09(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Au3) && this.A00 == ((Au3) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A03(this.A00);
    }

    public /* synthetic */ Au3(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        return AnonymousClass002.A09(j);
    }

    public static final int A01(long j) {
        return Math.max(C8j3.A0G(j), AnonymousClass002.A09(j));
    }

    public static final int A02(long j) {
        return Math.min(C8j3.A0G(j), AnonymousClass002.A09(j));
    }

    public static final boolean A04(long j) {
        return AnonymousClass002.A1Q(C8j3.A0G(j), AnonymousClass002.A09(j));
    }

    public static final boolean A05(long j) {
        return C8j4.A1V(C8j3.A0G(j), AnonymousClass002.A09(j));
    }

    public static final boolean A06(long j, long j2) {
        return (A02(j) <= A02(j2)) & (A01(j2) <= A01(j));
    }
}
