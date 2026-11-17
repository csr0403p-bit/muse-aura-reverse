package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes6.dex */
public final class Hns extends C8053FRg {
    public final FDW A00;

    public Hns(FDW fdw) {
        this.A00 = fdw;
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        boolean zA1b = AnonymousClass004.A1b(view, c2197BAc);
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        FDW fdw = this.A00;
        String strA0p = AbstractC7608F5v.A0p(fdw);
        String strA0q = AbstractC7608F5v.A0q(fdw);
        if (strA0p != null) {
            c2197BAc.A02.setContentDescription(strA0p);
        }
        AbstractC10585Hwr.A00(view.getContext(), view, c2197BAc, strA0q);
        String strA0r = AbstractC7608F5v.A0r(fdw);
        if (strA0r != null) {
            c2197BAc.A05(new C2203BAi(16, strA0r));
        }
        boolean zA0L = fdw.A0L(42, zA1b);
        boolean zA0L2 = fdw.A0L(43, zA1b);
        AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
        accessibilityNodeInfo.setSelected(zA0L);
        accessibilityNodeInfo.setEnabled(!zA0L2);
    }
}
