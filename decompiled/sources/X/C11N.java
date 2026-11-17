package X;

/* renamed from: X.11N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11N {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C11N) && this.A00 == ((C11N) obj).A00);
    }

    public C11N(boolean z, boolean z2) {
        int i = z ? 262144 : 262152;
        this.A00 = z2 ? i : i | 512;
    }

    public final int hashCode() {
        return ((((((((((((this.A00 * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1237) * 31) + 1002) * 31;
    }

    public C11N(boolean z) {
        this.A00 = z ? 262144 : 262152;
    }
}
