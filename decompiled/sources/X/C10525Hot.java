package X;

import java.util.List;

/* renamed from: X.Hot, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10525Hot implements InterfaceC7823FGe {
    public final int A00;
    public final int A01;
    public final FGT<?> A02;
    public final List<InterfaceC7823FGe> A03;

    @Override // X.InterfaceC7823FGe
    public final InterfaceC7823FGe ADY(int i) {
        return this.A03.get(i);
    }

    @Override // X.InterfaceC7823FGe
    public final int ADd() {
        return this.A03.size();
    }

    @Override // X.InterfaceC7823FGe
    public final Object AGy() {
        return null;
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
        return this.A02;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMu(int i) {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int AMv(int i) {
        return 0;
    }

    @Override // X.InterfaceC7823FGe
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC7823FGe
    public final int getWidth() {
        return this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/FGe;>;LX/FGT<*>;II)V */
    public C10525Hot(FGT fgt, List list, int i, int i2) {
        this.A03 = list;
        this.A02 = fgt;
        this.A01 = i;
        this.A00 = i2;
    }
}
