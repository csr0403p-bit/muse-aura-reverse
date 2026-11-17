package X;

import kotlin.Unit;

/* renamed from: X.73I, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C73I {
    public static final void A00(BFM bfm, final int i) {
        bfm.AgG(1257244356);
        if (i == 0 && bfm.AKh()) {
            bfm.Afo();
        } else {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C73J.A00;
                bfm.Ai0(objAaT);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
            C60R.A10(bfm);
            BBI bbi = (BBI) bfm;
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgB();
            if (bbi.A0M) {
                bfm.A7w(new C07358io(interfaceC7353EnQ, 3));
            } else {
                bfm.AiE();
            }
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.73H
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    C73I.A00((BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
