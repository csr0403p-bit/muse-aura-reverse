package X;

/* loaded from: classes6.dex */
public final class FJC implements InterfaceC7823FGe {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final InterfaceC7823FGe A04;
    public final FGT A05;
    public final Object A06;

    public FJC(InterfaceC7823FGe interfaceC7823FGe, FGT fgt, Object obj) {
        this(interfaceC7823FGe, fgt, obj, interfaceC7823FGe.getWidth(), interfaceC7823FGe.getHeight(), 0, 0);
    }

    @Override // X.InterfaceC7823FGe
    public final InterfaceC7823FGe ADY(int i) {
        return this.A04;
    }

    @Override // X.InterfaceC7823FGe
    public final int ADd() {
        return 1;
    }

    @Override // X.InterfaceC7823FGe
    public final Object AGy() {
        return this.A06;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIO() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIP() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIQ() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AIR() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final FGT AJY() {
        return this.A05;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMu(int i) {
        return this.A00;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMv(int i) {
        return this.A01;
    }

    @Override // X.InterfaceC7823FGe
    public final int getHeight() {
        return this.A02;
    }

    @Override // X.InterfaceC7823FGe
    public final int getWidth() {
        return this.A03;
    }

    public FJC(InterfaceC7823FGe interfaceC7823FGe, FGT fgt, Object obj, int i, int i2, int i3, int i4) {
        this.A05 = fgt;
        this.A04 = interfaceC7823FGe;
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A06 = obj;
    }
}
