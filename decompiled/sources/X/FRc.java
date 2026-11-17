package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FRc extends AbstractC8051FRe {
    public final G0U<View, Boolean> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public FRc(C8053FRg c8053FRg, G0U<? super View, Boolean> g0u) {
        super(c8053FRg);
        this.A00 = g0u;
    }

    @Override // X.AbstractC8051FRe, X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        AnonymousClass003.A0u(view, c2197BAc);
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        c2197BAc.A02.setSelected(AnonymousClass003.A1X(view, this.A00));
    }
}
