package X;

/* renamed from: X.E6i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6455E6i implements Comparable<C6455E6i> {
    public int A00;
    public long A01;
    public Object A02;
    public final C6322E0x A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6455E6i c6455E6i) {
        C6455E6i c6455E6i2 = c6455E6i;
        Object obj = this.A02;
        if (AnonymousClass002.A1Y(obj) != AnonymousClass002.A1Y(c6455E6i2.A02)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i = this.A00 - c6455E6i2.A00;
        return i == 0 ? (this.A01 > c6455E6i2.A01 ? 1 : (this.A01 == c6455E6i2.A01 ? 0 : -1)) : i;
    }

    public C6455E6i(C6322E0x c6322E0x) {
        this.A03 = c6322E0x;
    }
}
