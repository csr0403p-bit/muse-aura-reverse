package X;

/* loaded from: classes6.dex */
public final class Hp8 implements InterfaceC7823FGe {
    public final Object A00;
    public final int A01;
    public final int A02;
    public final FGT<?> A03;

    @Override // X.InterfaceC7823FGe
    public final InterfaceC7823FGe ADY(int i) {
        throw C60O.A0i("A MountableLayoutResult has no children");
    }

    @Override // X.InterfaceC7823FGe
    public final int ADd() {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final Object AGy() {
        return this.A00;
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
    public final FGT<?> AJY() {
        return this.A03;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMu(int i) {
        throw C60O.A0i("A MountableLayoutResult has no children");
    }

    @Override // X.InterfaceC7823FGe
    public final int AMv(int i) {
        throw C60O.A0i("A MountableLayoutResult has no children");
    }

    @Override // X.InterfaceC7823FGe
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC7823FGe
    public final int getWidth() {
        return this.A02;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FGT<*>;IILjava/lang/Object;)V */
    public Hp8(FGT fgt, Object obj, int i, int i2) {
        this.A03 = fgt;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = obj;
    }
}
