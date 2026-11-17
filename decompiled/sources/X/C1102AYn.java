package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.AYn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1102AYn extends AbstractC1439Aj8 implements InterfaceC1356Ahh, InterfaceC1476Ajj {
    public C1110AYw A00;
    public boolean A01;

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKa() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return c3Tr.AQM(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        if (this.A01) {
            i = Integer.MAX_VALUE;
        }
        return c3Tr.AQO(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        int iA00;
        int iA01;
        boolean z = this.A01;
        AbstractC1109AYv.A00(z ? EnumC1108AYu.A03 : EnumC1108AYu.A02, j);
        if (z) {
            iA00 = Integer.MAX_VALUE;
            iA01 = Constraints.A01(j);
        } else {
            iA00 = Constraints.A00(j);
            iA01 = Integer.MAX_VALUE;
        }
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), iA01, Constraints.A02(j), iA00));
        int i = azeAQW.A01;
        int iA012 = Constraints.A01(j);
        int i2 = i;
        if (i > iA012) {
            i2 = iA012;
        }
        int i3 = azeAQW.A00;
        int iA002 = Constraints.A00(j);
        int i4 = i3;
        if (i3 > iA002) {
            i4 = iA002;
        }
        int i5 = i3 - i4;
        int i6 = i - i2;
        if (!this.A01) {
            i5 = i6;
        }
        this.A00.A01(i5);
        C1110AYw c1110AYw = this.A00;
        int i7 = i2;
        if (this.A01) {
            i7 = i4;
        }
        c1110AYw.A05.AdX(i7);
        this.A00.A03.AdX(this.A01 ? azeAQW.A00 : azeAQW.A01);
        return AXY.A01(axy, new BTF(azeAQW, this, i5, 0), i2, i4);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!this.A01) {
            i = Integer.MAX_VALUE;
        }
        return c3Tr.AQo(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        if (this.A01) {
            i = Integer.MAX_VALUE;
        }
        return c3Tr.AQq(i);
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        AbstractC1564Ale.A05(interfaceC0857A6e);
        interfaceC0857A6e.Aca(this.A01 ? AbstractC1671Anw.A0i : AbstractC1671Anw.A0C, new Ao7(false, C2292BSs.A00(this, 14), C2292BSs.A00(this, 15)));
    }
}
