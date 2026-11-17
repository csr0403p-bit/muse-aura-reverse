package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes6.dex */
public class FGE extends FGR implements FH4 {
    public boolean A00;
    public final C7783FEo A01;
    public final FGD A02;
    public final FGB A03;

    @Override // X.FH4
    public boolean getForwardsOutsetBoxShadows() {
        return this.A00;
    }

    @Override // X.FGR
    public final FGD getMountState() {
        return this.A02;
    }

    public void setForwardsOutsetBoxShadows(boolean z) {
        this.A00 = z;
    }

    public FGE(Context context) {
        super(context);
        FGB fgb = new FGB();
        this.A03 = fgb;
        C7783FEo c7783FEo = new C7783FEo();
        this.A01 = c7783FEo;
        this.A02 = new FGD(this, c7783FEo, fgb, new FZP(this, 20));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass003.A0u(canvas, view);
        if (!this.A00) {
            FMA.A00(canvas, view);
        }
        return super.drawChild(canvas, view, j);
    }

    public FH3 getMountRestartPolicy() {
        FGW currentRenderTree = getCurrentRenderTree();
        return (currentRenderTree == null || !FBA.A04(Hkz.A00(currentRenderTree)).A03) ? FGO.A00 : FGP.A00;
    }

    @Override // X.FGR, X.FFE
    public void setMountInput(FET fet) {
        FGW fgw;
        super.setMountInput(fet);
        FBB fbbA00 = null;
        if (fet != null) {
            fgw = fet.A03;
            fbbA00 = Hkz.A00(fgw);
        } else {
            fgw = null;
        }
        boolean zA0A = FBA.A0A(fbbA00);
        FGW currentRenderTree = getCurrentRenderTree();
        if (zA0A && currentRenderTree != null && currentRenderTree == fgw) {
            requestLayout();
        }
    }

    @Override // X.FGR
    public /* bridge */ /* synthetic */ FGS getMountState() {
        return this.A02;
    }
}
