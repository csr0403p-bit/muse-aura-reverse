package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.Aul, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1947Aul extends AbstractC1437Aj6 implements InterfaceC1356Ahh, InterfaceC1332AhJ, InterfaceC1487Aju {
    public C1951Aup A00;
    public final C1942Auf A01;

    public C1947Aul(C1951Aup c1951Aup, C1DN c1dn, ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, List list, G0U g0u, G0U g0u2, int i, int i2, int i3, boolean z) {
        this.A00 = c1951Aup;
        C1942Auf c1942Auf = new C1942Auf();
        c1942Auf.A06 = apQ;
        c1942Auf.A07 = c1822Arm;
        c1942Auf.A08 = c2k7;
        c1942Auf.A0C = g0u;
        c1942Auf.A02 = i;
        c1942Auf.A0D = z;
        c1942Auf.A00 = i2;
        c1942Auf.A01 = i3;
        c1942Auf.A09 = list;
        c1942Auf.A0A = g0u2;
        c1942Auf.A03 = c1951Aup;
        c1942Auf.A05 = c1dn;
        c1942Auf.A0B = null;
        A0G(c1942Auf);
        this.A01 = c1942Auf;
        if (this.A00 == null) {
            throw C60O.A0i("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        return this.A01.AQN(c3Tr, c3tf, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        return this.A01.AQP(c3Tr, c3tf, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        return this.A01.AQV(axy, c3tg, j);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        return this.A01.AQp(c3Tr, c3tf, i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        return this.A01.AQr(c3Tr, c3tf, i);
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1951Aup c1951Aup = this.A00;
        if (c1951Aup != null) {
            c1951Aup.A00 = new C2069Axk(interfaceC1497Ak4, c1951Aup.A00.A01);
            InterfaceC2072Axn interfaceC2072Axn = c1951Aup.A04;
            long j = c1951Aup.A03;
            C1949Aun c1949Aun = (C1949Aun) interfaceC2072Axn;
            c1949Aun.A08 = false;
            G0U<? super Long, Unit> g0u = c1949Aun.A03;
            if (g0u != null) {
                g0u.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        this.A01.draw(c16z);
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }
}
