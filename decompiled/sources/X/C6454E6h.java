package X;

/* renamed from: X.E6h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6454E6h implements Comparable<C6454E6h> {
    public int A00;
    public long A01;
    public Object A02;
    public final C6322E0x A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6454E6h c6454E6h) {
        C6454E6h c6454E6h2 = c6454E6h;
        Object obj = this.A02;
        if (AnonymousClass002.A1Y(obj) != AnonymousClass002.A1Y(c6454E6h2.A02)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i = this.A00 - c6454E6h2.A00;
        return i == 0 ? (this.A01 > c6454E6h2.A01 ? 1 : (this.A01 == c6454E6h2.A01 ? 0 : -1)) : i;
    }

    public C6454E6h(C6322E0x c6322E0x) {
        this.A03 = c6322E0x;
    }
}
