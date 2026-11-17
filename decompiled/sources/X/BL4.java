package X;

/* loaded from: classes4.dex */
public final class BL4 {
    public final long A00;

    public static BL4 A00(long j) {
        return new BL4(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BL4) && this.A00 == ((BL4) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ BL4(long j) {
        this.A00 = j;
    }

    public static String A01(long j) {
        return FGI.A07(C8j3.A0G(j), AnonymousClass002.A09(j), " x ");
    }
}
