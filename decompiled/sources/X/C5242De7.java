package X;

/* renamed from: X.De7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5242De7 implements F08 {
    public InterfaceC5265DeU A00;
    public boolean A01 = true;
    public final int A02;
    public volatile T A03;

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
    @Override // X.F2k
    /* renamed from: get */
    public final T AMN() {
        if (this.A03 == 0) {
            synchronized (this) {
                if (this.A03 == 0) {
                    if (this.A01) {
                        this.A03 = AbstractC5245DeA.A02(C5249DeE.A00(), this.A02);
                    } else {
                        this.A03 = AbstractC5245DeA.A02(this.A00, this.A02);
                    }
                }
            }
        }
        return this.A03;
    }

    public C5242De7(int i) {
        this.A02 = i;
    }

    public C5242De7(InterfaceC5265DeU interfaceC5265DeU, int i) {
        this.A02 = i;
        this.A00 = interfaceC5265DeU;
    }
}
