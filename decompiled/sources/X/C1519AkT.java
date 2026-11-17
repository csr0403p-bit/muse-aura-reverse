package X;

import kotlin.Unit;

/* renamed from: X.AkT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1519AkT implements AkZ {
    public C1518AkS A00;
    public C1518AkS A01;
    public C1518AkS A02;
    public C1518AkS A03;
    public C1518AkS A04;
    public C1518AkS A05;
    public C1518AkS A06;
    public C1518AkS A07;
    public AaC A08;
    public G0U<? super InterfaceC1535Akr, Unit> A09;
    public G0U<? super InterfaceC1535Akr, Unit> A0A;
    public boolean A0B = true;

    @Override // X.AkZ
    public final boolean ADM() {
        return this.A0B;
    }

    public C1519AkT() {
        C1518AkS c1518AkS = C1518AkS.A02;
        this.A03 = c1518AkS;
        this.A04 = c1518AkS;
        this.A07 = c1518AkS;
        this.A00 = c1518AkS;
        this.A02 = c1518AkS;
        this.A05 = c1518AkS;
        this.A06 = c1518AkS;
        this.A01 = c1518AkS;
        this.A09 = BUT.A00(18);
        this.A0A = BUT.A00(19);
        this.A08 = C1509AkG.A00;
    }

    @Override // X.AkZ
    public final void Ad0(boolean z) {
        this.A0B = z;
    }

    @Override // X.AkZ
    public final void AdT(AaC aaC) {
        this.A08 = aaC;
    }

    @Override // X.AkZ
    public final void Ads(G0U<? super InterfaceC1535Akr, Unit> g0u) {
        this.A09 = g0u;
    }

    @Override // X.AkZ
    public final void Adu(G0U<? super InterfaceC1535Akr, Unit> g0u) {
        this.A0A = g0u;
    }
}
