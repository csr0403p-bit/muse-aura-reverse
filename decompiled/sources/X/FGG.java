package X;

import com.facebook.aura.R;
import java.util.List;

/* loaded from: classes6.dex */
public class FGG implements FH0 {
    public FED<?, ?, ?> A00;
    public FEJ A01;
    public boolean A02;
    public final FGS A03;
    public final AbstractC7837FGt A04;

    @Override // X.FH0
    public final void ARW(Integer num) {
        C7384Etj.A0Y(num, 0);
        FGS fgs = this instanceof FGC ? ((FGC) this).A01 : this.A03;
        AbstractC7837FGt abstractC7837FGt = this.A04;
        C7819FGa c7819FGa = fgs.A00;
        if (c7819FGa != null) {
            abstractC7837FGt.getLocalVisibleRect(AbstractC7607F5u.A0X());
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                throw AbstractC7609F5w.A0n(list);
            }
        }
    }

    public final void A00(FEJ fej) {
        if (!(this instanceof FGC)) {
            InterfaceC7738FCp<Object> interfaceC7738FCp = fej.A00;
            if (interfaceC7738FCp != null) {
                Object obj = fej.A01;
                fej.A00 = null;
                fej.A01 = null;
                interfaceC7738FCp.A6d(null, obj);
            }
            this.A03.A0M(HsU.A00, fej.A02.A03);
            return;
        }
        FGC fgc = (FGC) this;
        InterfaceC7738FCp<Object> interfaceC7738FCp2 = fej.A00;
        if (interfaceC7738FCp2 != null) {
            Object obj2 = fej.A01;
            fej.A00 = null;
            fej.A01 = null;
            interfaceC7738FCp2.A6d(null, obj2);
        }
        FET fet = fej.A02;
        FGW fgw = fet.A03;
        FBB fbbA00 = Hkz.A00(fgw);
        C7783FEo c7783FEo = fgc.A00;
        c7783FEo.A01 = (FDt) FBB.A01(fbbA00, R.id.bk_context_key_continuation_value_store);
        c7783FEo.A00(fet.A02);
        F9b f9bA03 = FBA.A03(fbbA00);
        C7384Etj.A0U(f9bA03);
        AbstractC8162FXe.A02("Evaluation Context can only be gotten from the UI Thread");
        FCA fca = f9bA03.A08;
        AbstractC0916AHs<C7825FGg> abstractC0916AHsA00 = HsU.A00;
        FGD fgd = fgc.A01;
        if (C7384Etj.areEqual(((FGS) fgd).A03, fgw)) {
            abstractC0916AHsA00 = fgc.A02.A00(fgd, fca);
        }
        FGB fgb = fgc.A02;
        fgb.A03 = fca;
        F9b f9bA032 = FBA.A03(fbbA00);
        AbstractC8162FXe.A02("CommitContainer can only be gotten from the UI Thread");
        fgb.A02 = f9bA032.A05;
        fgb.A06 = FBA.A04(fbbA00);
        fgd.A0M(abstractC0916AHsA00, fgw);
        if (!fgb.A06.A01) {
            fca = null;
        }
        fgb.A04 = fca;
    }

    public final void A01(FEJ fej) {
        if (C7384Etj.areEqual(this.A01, fej)) {
            return;
        }
        if (fej == null) {
            (this instanceof FGC ? ((FGC) this).A01 : this.A03).A0G();
        }
        this.A01 = fej;
        this.A04.requestLayout();
    }

    public FGG(AbstractC7837FGt abstractC7837FGt) {
        this.A04 = abstractC7837FGt;
        this.A03 = new FGS(FGQ.A00, abstractC7837FGt, FGM.A00, null, C8472Feb.A00(33));
    }
}
