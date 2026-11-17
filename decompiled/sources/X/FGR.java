package X;

import android.content.Context;
import com.facebook.aura.R;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FGR extends FHQ implements FFE {
    public FET A00;
    public final FGS A01;

    public FGR(Context context) {
        super(context);
        this.A01 = new FGS(FGQ.A00, this, FGM.A00, null, C8472Feb.A00(33));
    }

    @Override // X.FH0
    public final void ARW(Integer num) {
        C7384Etj.A0Y(num, 0);
        FGD fgd = ((FGE) this).A02;
        C7384Etj.A0Y(fgd, 0);
        C7819FGa c7819FGa = ((FGS) fgd).A00;
        if (c7819FGa != null) {
            getLocalVisibleRect(AbstractC7607F5u.A0X());
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                throw AbstractC7609F5w.A0n(list);
            }
        }
    }

    public abstract FGS getMountState();

    public static void A01(FET fet, Object obj) {
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
        ((FGR) obj).setMountInput(fet);
    }

    private final void A0D(FET fet) {
        FGE fge = (FGE) this;
        FGW fgw = fet.A03;
        FBB fbbA00 = Hkz.A00(fgw);
        C7783FEo c7783FEo = fge.A01;
        c7783FEo.A01 = (FDt) FBB.A01(fbbA00, R.id.bk_context_key_continuation_value_store);
        c7783FEo.A00(fet.A02);
        FCA fcaA0m = AbstractC7610F5x.A0m(fbbA00);
        AbstractC0916AHs<C7825FGg> abstractC0916AHsA00 = HsU.A00;
        FGD fgd = fge.A02;
        if (C7384Etj.areEqual(((FGS) fgd).A03, fgw)) {
            abstractC0916AHsA00 = fge.A03.A00(fgd, fcaA0m);
        }
        FGB fgb = fge.A03;
        fgb.A03 = fcaA0m;
        F9b f9bA03 = FBA.A03(fbbA00);
        AbstractC8162FXe.A02("CommitContainer can only be gotten from the UI Thread");
        fgb.A02 = f9bA03.A05;
        fgb.A06 = FBA.A04(fbbA00);
        fgd.A0M(abstractC0916AHsA00, fgw);
        if (!fgb.A06.A01) {
            fcaA0m = null;
        }
        fgb.A04 = fcaA0m;
    }

    @Override // X.FHQ
    public void A0C(boolean z, int i, int i2, int i3, int i4) {
        FET fet = this.A00;
        if (fet != null) {
            A0D(fet);
            int i5 = 0;
            while (true) {
                FET fet2 = this.A00;
                if (fet != fet2) {
                    if (i5 <= 4) {
                        if (fet2 == null) {
                            break;
                        }
                        A0D(fet2);
                        i5++;
                        fet = fet2;
                    } else {
                        Hx0.A00();
                        return;
                    }
                } else {
                    break;
                }
            }
        }
        FHQ.A08(this);
    }

    public final FET getCurrentMountInput() {
        return this.A00;
    }

    public final FGW getCurrentRenderTree() {
        FET fet = this.A00;
        if (fet != null) {
            return fet.A03;
        }
        return null;
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            ARW(C79.A00);
        }
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            ARW(C79.A00);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        FET fet = this.A00;
        if (fet == null) {
            setMeasuredDimension(0, 0);
        } else {
            FGW fgw = fet.A03;
            setMeasuredDimension(FGW.A00(fgw), fgw.A02.A03.height());
        }
    }

    public void setMountInput(FET fet) {
        if (C7384Etj.areEqual(this.A00, fet)) {
            return;
        }
        if (fet == null) {
            ((FGE) this).A02.A0G();
        }
        this.A00 = fet;
        requestLayout();
    }

    public void setRenderTreeUpdateListener(FH2 fh2) {
        FGD fgd = ((FGE) this).A02;
        C7819FGa c7819FGa = ((FGS) fgd).A00;
        if (c7819FGa == null) {
            c7819FGa = new C7819FGa(fgd, fgd.A0C);
        }
        c7819FGa.A00 = fh2;
        ((FGS) fgd).A00 = c7819FGa;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((FGE) this).A02.A0I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((FGE) this).A02.A0J();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            ARW(C79.A00);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            ARW(C79.A00);
        }
    }
}
