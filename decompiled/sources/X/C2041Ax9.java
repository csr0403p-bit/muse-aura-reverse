package X;

/* renamed from: X.Ax9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2041Ax9 implements InterfaceC2128Ayu {
    public final int A00;
    public final int A01;
    public final InterfaceC2128Ayu A02;

    @Override // X.InterfaceC2128Ayu
    public final int originalToTransformed(int i) {
        int iOriginalToTransformed = this.A02.originalToTransformed(i);
        if (i >= 0 && i <= this.A00) {
            AbstractC1929Atq.A01(iOriginalToTransformed, this.A01, i);
        }
        return iOriginalToTransformed;
    }

    @Override // X.InterfaceC2128Ayu
    public final int transformedToOriginal(int i) {
        int iTransformedToOriginal = this.A02.transformedToOriginal(i);
        if (i >= 0 && i <= this.A01) {
            AbstractC1929Atq.A02(iTransformedToOriginal, this.A00, i);
        }
        return iTransformedToOriginal;
    }

    public C2041Ax9(InterfaceC2128Ayu interfaceC2128Ayu, int i, int i2) {
        this.A02 = interfaceC2128Ayu;
        this.A00 = i;
        this.A01 = i2;
    }
}
