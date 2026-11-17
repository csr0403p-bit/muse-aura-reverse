package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FEa extends FGE {
    public int A00;
    public int A01;
    public FEE<? extends Object, FBB> A02;
    public FBB A03;

    public static final boolean A00(FEa fEa) {
        FEE<? extends Object, FBB> fee = fEa.A02;
        FBB fbb = fEa.A03;
        if (fee != null && fbb != null) {
            FGW fgw = fee.A03;
            if (fEa.A01 != 0 && fEa.A00 != 0 && (FGW.A00(fgw) != fEa.A01 || fgw.A02.A03.height() != fEa.A00)) {
                long jA00 = C7827FGi.A00(View.MeasureSpec.makeMeasureSpec(fEa.A01, 1073741824), View.MeasureSpec.makeMeasureSpec(fEa.A00, 1073741824));
                FEE<? extends Object, FBB> feeA00 = FEC.A00(fEa.A02, fbb, (FDW) fee.A02, jA00);
                fEa.A02 = feeA00;
                super.setMountInput(feeA00.A01);
                return true;
            }
        }
        return false;
    }

    public final void A0E(FEE<Object, FBB> fee, FBB fbb, int i, int i2) {
        this.A03 = fbb;
        this.A02 = fee;
        this.A01 = i;
        this.A00 = i2;
        if (A00(this)) {
            return;
        }
        super.setMountInput(fee.A01);
    }

    @Override // X.FGE, X.FGR, X.FFE
    public void setMountInput(FET fet) {
        throw C8j3.A18("setMountInput should only be called in conjunction with also setting the BloksModel");
    }

    public final void setRenderResult(FEE<Object, FBB> fee, FBB fbb) {
        this.A03 = fbb;
        this.A02 = fee;
        if (A00(this)) {
            return;
        }
        super.setMountInput(fee != null ? fee.A01 : null);
    }
}
