package X;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes6.dex */
public abstract class FHE {
    public final Object A00 = C3cG.A0T();

    public G0U<Object, Unit> A00(HxO<? super Unit> hxO) {
        FHB fhb = (FHB) this;
        C0918AHu<HxO<Unit>, G0U<Object, Unit>> c0918AHu = fhb.A01;
        G0U<Object, Unit> g0uA05 = c0918AHu.A05(hxO);
        if (g0uA05 != null) {
            return g0uA05;
        }
        C8941Ftx c8941Ftx = new C8941Ftx(0, hxO, fhb);
        c0918AHu.A0C(hxO, c8941Ftx);
        return c8941Ftx;
    }

    public void A01() {
        List<FHH> list;
        FHB fhb = (FHB) this;
        synchronized (((FHE) fhb).A00) {
            list = fhb.A04;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FHH fhh = list.get(i);
                if (fhh instanceof FHF) {
                    AI3.A01(fhb.A00, ((FHF) fhh).A00, ((FHF) fhh).A01);
                } else {
                    if (!(fhh instanceof FHG)) {
                        throw C3cG.A0q();
                    }
                    AI3.A00(fhb.A00, ((FHG) fhh).A00);
                }
            }
        }
        list.clear();
    }

    public final void A02() {
        Object obj;
        if (this instanceof FHC) {
            FHC fhc = (FHC) this;
            fhc.A05.dispose();
            fhc.A03 = null;
            fhc.A01 = null;
            obj = ((FHE) fhc).A00;
            synchronized (obj) {
                fhc.A04 = null;
                fhc.A02 = null;
                fhc.A00 = null;
            }
        } else {
            FHB fhb = (FHB) this;
            fhb.A03.dispose();
            fhb.A04.clear();
            fhb.A01.A0D();
            obj = ((FHE) fhb).A00;
            synchronized (obj) {
                fhb.A00.A0D();
            }
        }
    }

    public void A03(HxO<? super Unit> hxO) {
        ((FHB) this).A04.add(new FHG(hxO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(HxO<? super Unit> hxO) {
        FHB fhb;
        if (this instanceof FHC) {
            FHC fhc = (FHC) this;
            fhc.A04 = null;
            fhb = fhc;
        } else {
            FHB fhb2 = (FHB) this;
            fhb2.A01.A0B(hxO);
            fhb = fhb2;
        }
        fhb.A03(hxO);
        fhb.A01();
    }
}
