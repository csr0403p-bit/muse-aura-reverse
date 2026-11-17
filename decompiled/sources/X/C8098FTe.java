package X;

/* renamed from: X.FTe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8098FTe {
    public final DQZ<FTV, FU0> A01 = new DQZ<>(0);
    public final C1685AoO<FTV> A00 = new C1685AoO<>();

    public final void A00(FTV ftv) {
        FU0 fu0 = this.A01.get(ftv);
        if (fu0 != null) {
            fu0.A00 &= -2;
        }
    }

    public final void A01(FTV ftv) {
        C1685AoO<FTV> c1685AoO = this.A00;
        int iA00 = c1685AoO.A00();
        while (true) {
            iA00--;
            if (iA00 < 0) {
                break;
            }
            if (ftv == c1685AoO.A03(iA00)) {
                Object[] objArr = c1685AoO.A03;
                Object obj = objArr[iA00];
                Object obj2 = AbstractC1693AoX.A00;
                if (obj != obj2) {
                    objArr[iA00] = obj2;
                    c1685AoO.A01 = true;
                }
            }
        }
        FU0 fu0Remove = this.A01.remove(ftv);
        if (fu0Remove != null) {
            fu0Remove.A00 = 0;
            fu0Remove.A02 = null;
            fu0Remove.A01 = null;
            FU0.A03.AaC(fu0Remove);
        }
    }
}
