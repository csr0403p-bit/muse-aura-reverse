package X;

/* renamed from: X.9oE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oE implements Comparable<C9oE> {
    public final short A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9oE c9oE) {
        return C7384Etj.A00(this.A00 & 65535, c9oE.A00 & 65535);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9oE) && this.A00 == ((C9oE) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 65535);
    }
}
