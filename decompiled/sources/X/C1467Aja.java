package X;

/* renamed from: X.Aja, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1467Aja implements InterfaceC1382AiC {
    @Override // X.InterfaceC1382AiC
    public final boolean ANr(AbstractC1439Aj8 abstractC1439Aj8) {
        return false;
    }

    @Override // X.InterfaceC1382AiC
    public final void A6E(C0923AHz c0923AHz, C1453AjM c1453AjM, int i, long j, boolean z) {
        AbstractC1387AiH abstractC1387AiH = c1453AjM.A0f.A04;
        abstractC1387AiH.A0x(c0923AHz, AbstractC1387AiH.A0T, 1, AbstractC1387AiH.A08(abstractC1387AiH, j, true), z);
    }

    @Override // X.InterfaceC1382AiC
    public final int AAm() {
        return 8;
    }

    @Override // X.InterfaceC1382AiC
    public final boolean AfL(C0923AHz c0923AHz, C1453AjM c1453AjM) {
        return false;
    }

    @Override // X.InterfaceC1382AiC
    public final boolean AfT(AbstractC1439Aj8 abstractC1439Aj8) {
        return AbstractC1571All.A05(AbstractC1468Ajb.A00(AbstractC1414Aij.A04(abstractC1439Aj8), false));
    }

    @Override // X.InterfaceC1382AiC
    public final boolean AfU(C1453AjM c1453AjM) {
        C0919AHv c0919AHvAKL = c1453AjM.AKL();
        boolean z = false;
        if (c0919AHvAKL != null && c0919AHvAKL.A00) {
            z = true;
        }
        return !z;
    }
}
