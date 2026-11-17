package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AP9 {
    public static final C1003AOr<AaC> A02 = C1003AOr.A00(AbstractC1005AOw.A00);
    public static final AOO A01 = new APA();
    public static final C0918AHu<ARL, C0918AHu<Alignment, APN>> A00 = new C0918AHu<>(6);

    /* JADX WARN: Incorrect types in method signature: (LX/G2j<-LX/AP1;-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, G2j g2j, int i) {
        bfm.AgG(1908320054);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g2j) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AZo.A01(bfm, B1V.A00(bfm, new BUY(g2j, 1), 2062852661), 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(g2j, i, 0);
        }
    }

    public static final void A01(BRg bRg, G0W<? super AP1, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        bfm.AgG(646379026);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            A00(bfm, B1V.A00(bfm, new C05h(bRg, g0w), 1948801580), 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AP8(bRg, g0w, i, i2);
        }
    }
}
