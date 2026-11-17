package X;

import android.view.Window;

/* loaded from: classes4.dex */
public class BA8 extends BAH {
    public final void A02(Window window, Boolean bool, Integer num, Integer num2, boolean z, boolean z2) {
        BA9.A00(window, !z);
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        window.setStatusBarContrastEnforced(bool != null ? bool.booleanValue() : AnonymousClass002.A1M(z ? 1 : 0));
        C1971Avc c1971Avc = new C1971Avc(window.getDecorView(), window);
        boolean z3 = !z2;
        c1971Avc.A01(z3);
        c1971Avc.A00(z3);
    }
}
