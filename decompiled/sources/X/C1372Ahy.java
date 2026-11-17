package X;

import kotlin.Unit;

/* renamed from: X.Ahy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1372Ahy<N> implements InterfaceC1370Ahw<N> {
    public int A00;
    public final int A01;
    public final InterfaceC1370Ahw<N> A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1370Ahw
    public final void A4R(G0V<? super N, Object, Unit> g0v, Object obj) {
        this.A02.A4R(g0v, obj);
    }

    @Override // X.InterfaceC1370Ahw
    public final void A9B(N n) {
        this.A00++;
        this.A02.A9B(n);
    }

    @Override // X.InterfaceC1370Ahw
    public final N AEN() {
        return this.A02.AEN();
    }

    @Override // X.InterfaceC1370Ahw
    public final void ANj(int i, N n) {
        this.A02.ANj(i + (this.A00 == 0 ? this.A01 : 0), n);
    }

    @Override // X.InterfaceC1370Ahw
    public final void ANm(int i, N n) {
        this.A02.ANm(i + (this.A00 == 0 ? this.A01 : 0), n);
    }

    @Override // X.InterfaceC1370Ahw
    public final void AQt(int i, int i2, int i3) {
        int i4 = this.A00 == 0 ? this.A01 : 0;
        this.A02.AQt(i + i4, i2 + i4, i3);
    }

    @Override // X.InterfaceC1370Ahw
    public final /* synthetic */ void ASy() {
    }

    @Override // X.InterfaceC1370Ahw
    public final void Aab(int i, int i2) {
        this.A02.Aab(i + (this.A00 == 0 ? this.A01 : 0), i2);
    }

    @Override // X.InterfaceC1370Ahw
    public final void Abn() {
        this.A02.Abn();
    }

    @Override // X.InterfaceC1370Ahw
    public final void Ahp() {
        int i = this.A00;
        if (i <= 0) {
            BBL.A01("OffsetApplier up called with no corresponding down");
            throw F60.createAndThrow();
        }
        this.A00 = i - 1;
        this.A02.Ahp();
    }

    @Override // X.InterfaceC1370Ahw
    public final void clear() {
        BBL.A01("Clear is not valid on OffsetApplier");
        throw F60.createAndThrow();
    }

    public C1372Ahy(InterfaceC1370Ahw<N> interfaceC1370Ahw, int i) {
        this.A02 = interfaceC1370Ahw;
        this.A01 = i;
    }
}
