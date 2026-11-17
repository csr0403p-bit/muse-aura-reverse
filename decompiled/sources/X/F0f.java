package X;

/* loaded from: classes5.dex */
public final class F0f implements F08 {
    public final int A00;
    public volatile T A01;

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // X.F2k
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public final T AMN() {
        if (this.A01 == 0) {
            synchronized (this) {
                if (this.A01 == 0) {
                    this.A01 = C5246DeB.A01(C5249DeE.A00(), this.A00);
                }
            }
        }
        return this.A01;
    }

    public F0f(int i) {
        this.A00 = i;
    }
}
