package X;

import kotlin.Unit;

/* renamed from: X.Ahx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1371Ahx<N> implements InterfaceC1370Ahw<N> {
    public N A00;
    public final C1119Aaj A01 = new C1119Aaj(16);
    public final C0912AHo<Object> A02 = new C0912AHo<>(16);

    @Override // X.InterfaceC1370Ahw
    public final void A4R(G0V<? super N, Object, Unit> g0v, Object obj) {
        this.A01.A02(7);
        C0912AHo<Object> c0912AHo = this.A02;
        c0912AHo.A09(obj);
        c0912AHo.A09(g0v);
    }

    @Override // X.InterfaceC1370Ahw
    public final void A9B(N n) {
        this.A01.A02(1);
        this.A02.A09(n);
    }

    @Override // X.InterfaceC1370Ahw
    public final N AEN() {
        return this.A00;
    }

    @Override // X.InterfaceC1370Ahw
    public final void ANj(int i, N n) {
        C1119Aaj c1119Aaj = this.A01;
        c1119Aaj.A02(5);
        c1119Aaj.A02(i);
        this.A02.A09(n);
    }

    @Override // X.InterfaceC1370Ahw
    public final void ANm(int i, N n) {
        C1119Aaj c1119Aaj = this.A01;
        c1119Aaj.A02(6);
        c1119Aaj.A02(i);
        this.A02.A09(n);
    }

    @Override // X.InterfaceC1370Ahw
    public final void AQt(int i, int i2, int i3) {
        C1119Aaj c1119Aaj = this.A01;
        c1119Aaj.A02(3);
        c1119Aaj.A02(i);
        c1119Aaj.A02(i2);
        c1119Aaj.A02(i3);
    }

    @Override // X.InterfaceC1370Ahw
    public final /* synthetic */ void ASy() {
    }

    @Override // X.InterfaceC1370Ahw
    public final void Aab(int i, int i2) {
        C1119Aaj c1119Aaj = this.A01;
        c1119Aaj.A02(2);
        c1119Aaj.A02(i);
        c1119Aaj.A02(i2);
    }

    @Override // X.InterfaceC1370Ahw
    public final void Abn() {
        this.A01.A02(8);
    }

    @Override // X.InterfaceC1370Ahw
    public final void Ahp() {
        this.A01.A02(0);
    }

    @Override // X.InterfaceC1370Ahw
    public final void clear() {
        this.A01.A02(4);
    }

    public C1371Ahx(N n) {
        this.A00 = n;
    }
}
