package X;

import android.content.res.Resources;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

/* renamed from: X.Atb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1914Atb {
    /* JADX WARN: Incorrect types in method signature: (LX/ArD;Landroid/content/res/Resources;LX/BRQ;ZLX/G0U<-LX/BNk;Lkotlin/Unit;>;)V */
    public static final void A00(Resources resources, BRQ brq, C1794ArD c1794ArD, G0U g0u, boolean z) {
        if (z) {
            c1794ArD.A00.A09(new C7dk(brq.key, resources.getString(brq.stringId), g0u, brq.drawableId));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(TextFieldSelectionState textFieldSelectionState, BFM bfm, G0V g0v, int i, boolean z) {
        bfm.AgG(-579239002);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            CommonContextMenuAreaKt.A00(textFieldSelectionState, bfm, g0v, iA0T & 1022, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTK(textFieldSelectionState, g0v, i, 1, z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Aug;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A02(C1943Aug c1943Aug, BFM bfm, G0V g0v, int i) {
        bfm.AgG(-954926513);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c1943Aug) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            CommonContextMenuAreaKt.A01(c1943Aug, bfm, g0v, iA0T & 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, c1943Aug, g0v, i, 5);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A03(TextFieldSelectionManager textFieldSelectionManager, BFM bfm, G0V g0v, int i) {
        bfm.AgG(2080741862);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionManager) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            CommonContextMenuAreaKt.A02(textFieldSelectionManager, bfm, g0v, iA0T & 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, textFieldSelectionManager, g0v, i, 6);
        }
    }
}
