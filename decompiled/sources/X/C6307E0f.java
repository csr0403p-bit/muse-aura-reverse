package X;

/* renamed from: X.E0f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6307E0f implements Comparable<C6307E0f> {
    public final long A00;
    public final E0J A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6307E0f c6307E0f) {
        C6307E0f c6307E0f2 = c6307E0f;
        long j = this.A00 - c6307E0f2.A00;
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        if (this.A01 != null) {
            return AnonymousClass002.A1Y(c6307E0f2.A01) ? 1 : 0;
        }
        return -1;
    }

    public C6307E0f(E0J e0j, long j) {
        this.A01 = e0j;
        this.A00 = j;
    }
}
