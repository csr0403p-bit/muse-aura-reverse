package X;

/* renamed from: X.2ae, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ae {
    public final long A00;

    public static final long A01(long j, long j2) {
        return ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L) | ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32);
    }

    public static final long A02(long j, long j2) {
        return ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L) | ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2ae) && this.A00 == ((C2ae) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        long j = this.A00;
        return FGI.A0Q("(", ", ", ')', (int) (j >> 32), AnonymousClass002.A09(j));
    }

    public /* synthetic */ C2ae(long j) {
        this.A00 = j;
    }

    public static final int A00(long j) {
        return AnonymousClass002.A09(j);
    }
}
