package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* renamed from: X.0y1, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0y1 {
    /* JADX WARN: Incorrect types in method signature: (JLX/Arm;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, C1822Arm c1822Arm, G0V g0v, int i, long j) {
        bfm.AgG(-716124955);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA0M & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AKH<C1822Arm> akh = C0yq.A00;
            AKT.A02(bfm, g0v, new AKJ[]{AnonymousClass003.A0T(C1AZ.A00, j), akh.A04(((C1822Arm) bfm.A6v(akh)).A02(c1822Arm))}, ((iA0M >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c1(c1822Arm, g0v, i, 0, j);
        }
    }
}
