package X;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class AkV {
    public static final View A00(AbstractC1439Aj8 abstractC1439Aj8) {
        View view;
        C1634An9 c1634An9 = AbstractC1414Aij.A04(abstractC1439Aj8.node).A0H;
        if (c1634An9 == null || (view = c1634An9.A0H) == null) {
            throw C3cG.A0Q("Could not fetch interop view");
        }
        return view;
    }
}
