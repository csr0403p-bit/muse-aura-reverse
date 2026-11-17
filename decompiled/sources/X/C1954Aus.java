package X;

import kotlin.Unit;

/* renamed from: X.Aus, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1954Aus implements InterfaceC1961AvD {
    public final int A00;
    public final int A01;
    public final C1940Aud A02;
    public final boolean A03;
    public final AvA A04;

    @Override // X.InterfaceC1961AvD
    public final void ABk(G0U<? super AvA, Unit> g0u) {
    }

    @Override // X.InterfaceC1961AvD
    public final AXH<C1940Aud> A82(C1940Aud c1940Aud) {
        boolean z = c1940Aud.A02;
        C1962AvE c1962AvE = c1940Aud.A01;
        int i = c1962AvE.A00;
        C1962AvE c1962AvE2 = c1940Aud.A00;
        int i2 = c1962AvE2.A00;
        if (z ? i <= i2 : i > i2) {
            c1940Aud = new C1940Aud(c1962AvE, c1962AvE2, !z);
        }
        long j = this.A04.A04;
        AXI axi = AXJ.A00;
        AXI axi2 = new AXI();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        AXI.A04(axi2, 6);
        axi2.A0A(j, c1940Aud);
        return axi2;
    }

    @Override // X.InterfaceC1961AvD
    public final Integer AEE() {
        int i = this.A01;
        int i2 = this.A00;
        if (i >= i2) {
            if (i <= i2) {
                AvA avA = this.A04;
                int i3 = avA.A02;
                int i4 = avA.A00;
                if (i3 >= i4) {
                    if (i3 <= i4) {
                        return C79.A0C;
                    }
                }
            }
            return C79.A00;
        }
        return C79.A01;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AER() {
        return this.A04;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AF9() {
        return this.A04;
    }

    @Override // X.InterfaceC1961AvD
    public final int AFB() {
        return this.A00;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AFe() {
        return this.A04;
    }

    @Override // X.InterfaceC1961AvD
    public final C1940Aud AJ1() {
        return this.A02;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AKw() {
        return this.A04;
    }

    @Override // X.InterfaceC1961AvD
    public final int AKx() {
        return this.A01;
    }

    @Override // X.InterfaceC1961AvD
    public final boolean AP5() {
        return this.A03;
    }

    @Override // X.InterfaceC1961AvD
    public final boolean AfY(InterfaceC1961AvD interfaceC1961AvD) {
        if (this.A02 != null && interfaceC1961AvD != null && (interfaceC1961AvD instanceof C1954Aus)) {
            C1954Aus c1954Aus = (C1954Aus) interfaceC1961AvD;
            if (this.A01 == c1954Aus.A01 && this.A00 == c1954Aus.A00 && this.A03 == c1954Aus.A03) {
                AvA avA = this.A04;
                AvA avA2 = c1954Aus.A04;
                if (avA.A04 == avA2.A04 && avA.A02 == avA2.A02 && avA.A00 == avA2.A00) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1961AvD
    public final int getSize() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SingleSelectionLayout(isStartHandle=");
        sbA0x.append(this.A03);
        sbA0x.append(", crossed=");
        sbA0x.append(AbstractC2092AyH.A00(AEE()));
        sbA0x.append(", info=\n\t");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public C1954Aus(AvA avA, C1940Aud c1940Aud, int i, int i2, boolean z) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c1940Aud;
        this.A04 = avA;
    }
}
