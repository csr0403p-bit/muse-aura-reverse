package X;

/* renamed from: X.9oA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oA implements Comparable<C9oA> {
    public final byte A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9oA c9oA) {
        return C7384Etj.A00(this.A00 & 255, c9oA.A00 & 255);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9oA) && this.A00 == ((C9oA) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(this.A00 & 255);
    }
}
