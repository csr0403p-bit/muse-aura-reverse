package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AGC {
    /* JADX WARN: Incorrect types in method signature: (LX/G0W<-LX/BN2;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(BFM bfm, G0W g0w, int i) {
        bfm.AgG(-709502251);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0w) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AKH<AFx> akh = AG8.A00;
            AFx aFx = (AFx) AKO.A07(akh, (BBI) bfm);
            AG9 ag9A00 = AG7.A00(bfm);
            Object[] objArr = {aFx};
            C0872AFu c0872AFu = new C0872AFu(C2282BSi.A00(4), BTA.A01(ag9A00, aFx, 35));
            boolean zA1M = AnonymousClass003.A1M(bfm, aFx, ag9A00);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new BTB(6, aFx, ag9A00);
                bfm.Ai0(objAaT);
            }
            Object objA01 = AFz.A01(bfm, c0872AFu, (Function0) objAaT, objArr);
            AnonymousClass003.A0m(bfm, akh.A04(objA01), new BTC(6, g0w, objA01), -412824043);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(g0w, i, 3);
        }
    }
}
