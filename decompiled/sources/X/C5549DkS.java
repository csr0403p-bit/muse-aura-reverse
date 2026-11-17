package X;

/* renamed from: X.DkS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5549DkS implements InterfaceC6413E4p {
    public final long A00;
    public final InterfaceC6413E4p A01;

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        this.A01.AAe();
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(InterfaceC5509Djl interfaceC5509Djl) {
        this.A01.AcM(new C5548DkR(interfaceC5509Djl, interfaceC5509Djl, this));
    }

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        return this.A01.AhC(i, i2);
    }

    public C5549DkS(InterfaceC6413E4p interfaceC6413E4p, long j) {
        this.A00 = j;
        this.A01 = interfaceC6413E4p;
    }
}
