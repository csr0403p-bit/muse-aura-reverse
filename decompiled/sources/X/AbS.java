package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AbS {
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+LX/Abd;>;LX/BRg;LX/Af7;LX/Aai;LX/BFM;II)V */
    public static final void A00(InterfaceC1118Aai interfaceC1118Aai, C1229Af7 c1229Af7, BFM bfm, BRg bRg, Function0 function0, int i, int i2) {
        C1229Af7 c1229Af72 = c1229Af7;
        BRg bRg2 = bRg;
        bfm.AgG(1055276397);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, c1229Af7);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass002.A00(AnonymousClass004.A1a(interfaceC1118Aai, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c1229Af72 = null;
            }
            AGC.A00(bfm, B1V.A00(bfm, new BTY(interfaceC1118Aai, c1229Af72, C1er.A00(bfm, function0), bRg2, 0), -933153643), 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2300BTa(interfaceC1118Aai, c1229Af72, bRg2, function0, i, i2, 0);
        }
    }
}
