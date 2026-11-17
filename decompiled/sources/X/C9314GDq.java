package X;

import java.util.AbstractCollection;

/* renamed from: X.GDq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9314GDq implements Comparable<C9314GDq> {
    public final long A00;

    public static void A00(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(new C9314GDq(j));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9314GDq c9314GDq) {
        return C7384Etj.A01(this.A00 ^ Long.MIN_VALUE, c9314GDq.A00 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9314GDq) && this.A00 == ((C9314GDq) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return HwO.A00(this.A00);
    }

    public /* synthetic */ C9314GDq(long j) {
        this.A00 = j;
    }
}
