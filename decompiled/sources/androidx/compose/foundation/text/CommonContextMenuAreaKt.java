package androidx.compose.foundation.text;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.Ar1;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BTK;
import X.BU1;
import X.BU3;
import X.C1082AXp;
import X.C1086AXu;
import X.C1943Aug;
import X.C2297BSx;
import X.C3cG;
import X.C78N;
import X.G0V;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* loaded from: classes4.dex */
public abstract class CommonContextMenuAreaKt {
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(TextFieldSelectionState textFieldSelectionState, BFM bfm, G0V g0v, int i, boolean z) {
        BBI bbiA0M;
        BRg c1082AXp;
        bfm.AgG(-1442752422);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            bfm.AgE(-1299459355);
            if (z) {
                boolean zA1Z = AnonymousClass001.A1Z(textFieldSelectionState, bfm, -1299415211);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new BU3(textFieldSelectionState, null, 5);
                    bfm.Ai0(objAaT);
                }
                c1082AXp = new C1082AXp((G0V) objAaT);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1298836224);
                c1082AXp = BRg.A00;
            }
            Ar1.A01(c1082AXp, g0v, bfm, (iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTK(textFieldSelectionState, g0v, i, 0, z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Aug;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(C1943Aug c1943Aug, BFM bfm, G0V g0v, int i) {
        bfm.AgG(-614342087);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c1943Aug) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            bfm.AgE(-1009319487);
            Ar1.A01(new C1082AXp(new BU3(c1943Aug, null, 7)).then(new C1086AXu(c1943Aug.A00, new BU1(c1943Aug, null, 6), null, new C2297BSx(c1943Aug, 14))), g0v, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, c1943Aug, g0v, i, 4);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A02(TextFieldSelectionManager textFieldSelectionManager, BFM bfm, G0V g0v, int i) {
        bfm.AgG(1533506138);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionManager) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            bfm.AgE(-885604480);
            boolean zA0A = MutableState.A0A(textFieldSelectionManager.A0Q);
            BRg bRgThen = BRg.A00;
            if (zA0A) {
                bRgThen = new C1082AXp(new BU3(textFieldSelectionManager, null, 8)).then(new C1086AXu(textFieldSelectionManager.A04, new BU1(textFieldSelectionManager, null, 7), new BU1(textFieldSelectionManager, null, 8), C2297BSx.A00(textFieldSelectionManager, 19)));
            }
            Ar1.A01(bRgThen, g0v, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, textFieldSelectionManager, g0v, i, 3);
        }
    }
}
