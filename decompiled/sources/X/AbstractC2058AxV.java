package X;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* renamed from: X.AxV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2058AxV {
    public static final void A00(CursorAnchorInfo.Builder builder, AaC aaC) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(AbstractC1709Aos.A01(aaC)).setHandwritingBounds(AbstractC1709Aos.A01(aaC)).build());
    }
}
