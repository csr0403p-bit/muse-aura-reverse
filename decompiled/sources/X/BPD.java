package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class BPD {
    public static final AKH<BRn> A00 = new AGO(new BUV(11));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 0);
        bfm.AgG(820577390);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AKH<BRn> akh = A00;
            BBI bbi = (BBI) bfm;
            Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
            boolean zA1K = AnonymousClass003.A1K(bfm, AKO.A07(AndroidCompositionLocals_androidKt.A00, bbi), contextA00.getTheme());
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new B69(contextA00);
                BBI.A0O(bbi, objAaT);
            }
            AKT.A01(bfm, akh.A04(objAaT), g0v, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(g0v, i, 9);
        }
    }
}
