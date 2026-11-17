package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FES {
    public final C1685AoO<FFC> A00 = new C1685AoO<>(10);
    public final FBB A01;
    public final FCO A02;

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(C7782FEm c7782FEm, C7782FEm c7782FEm2, FFC ffc, FES fes, FCA fca) {
        C7748FDa c7748FDa;
        FDW fdw = c7782FEm2.A01;
        int i = fdw.A00;
        if ((i & 1) != 0 || (i & 2) != 0) {
            FEE<?, ?> feeA02 = c7782FEm.A00.A02();
            if (feeA02 != null) {
                Object obj = feeA02.A00.A01.get(fdw);
                if (obj == null) {
                    obj = null;
                }
                if ((obj instanceof C7748FDa) && (c7748FDa = (C7748FDa) obj) != null) {
                    boolean zA1L = AnonymousClass002.A1L(feeA02.A01.A02.A00.A01);
                    State state = feeA02.A04;
                    if (AbstractC7758FDk.A00(c7748FDa, fca.A04(state instanceof FCH ? (FCH) state : null), fes.A02.A03, false)) {
                        View view = ffc.A0I;
                        C7384Etj.A0Z(view, "null cannot be cast to non-null type com.instagram.common.bloks.BloksRenderTreeHostView");
                        FGE fge = (FGE) view;
                        FET fet = c7782FEm2.A00.A00().A01;
                        if (zA1L || fet.A02.A00.A01 != 0) {
                            fge.setMountInput(fet);
                        } else if (fge.A02.A0S()) {
                            fge.requestLayout();
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public FES(FBB fbb) {
        this.A01 = fbb;
        this.A02 = FBA.A04(fbb);
    }
}
