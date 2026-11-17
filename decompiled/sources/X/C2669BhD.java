package X;

/* renamed from: X.BhD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2669BhD implements BhI {
    public final InterfaceC2670BhE A00;

    @Override // X.BhI
    public final InterfaceC2670BhE A7I(long j) {
        return new C2669BhD(j);
    }

    @Override // X.InterfaceC2670BhE
    public final long ALi() {
        return this.A00.ALi();
    }

    @Override // X.InterfaceC2670BhE
    public final BhF AVa(InterfaceC2676BhQ interfaceC2676BhQ) {
        return this.A00.AVa(interfaceC2676BhQ);
    }

    public C2669BhD(long j) {
        this.A00 = new BhA(new BhC(this, j), j);
    }
}
