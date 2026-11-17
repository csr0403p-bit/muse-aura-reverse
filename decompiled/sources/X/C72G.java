package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.72G, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72G {
    /* JADX WARN: Incorrect types in method signature: (LX/76B;LX/72t;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, C76B c76b, C059672t c059672t, G0V g0v, int i, int i2) {
        C76B c76b2 = c76b;
        C059672t c059672t2 = c059672t;
        bfm.AgG(227045628);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c059672t);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA0d & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i3 != 0) {
                c76b2 = C76B.A00;
            }
            if (i4 != 0) {
                c059672t2 = C059672t.A04;
            }
            bfm.AgF(1849434622);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C72H.A00;
                bfm.Ai0(objAaT);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
            bfm.AgF(-683746039);
            int i5 = (((iA0d & 896) | 6) & 896) | 6;
            bfm.AgF(-548224868);
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            C60R.A13(bfm, bbi, function0);
            C8i0.A00(bfm, c76b2, 16);
            C8i0.A00(bfm, c059672t2, 17);
            AnonymousClass005.A0q(bbi, bfm, g0v, i5 >> 6);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iI(c059672t2, c76b2, g0v, i, i2, 2);
        }
    }
}
