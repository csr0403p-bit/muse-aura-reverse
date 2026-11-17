package X;

import android.view.View;
import android.view.Window;

/* loaded from: classes4.dex */
public class BA6 extends BAI {
    @Override // X.BAE
    public void Af7(View view, Window window, BAD bad, BAD bad2, boolean z, boolean z2) {
        C7384Etj.A0Y(bad, 0);
        AnonymousClass005.A11(bad2, window, view, 1);
        BA9.A00(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C1971Avc c1971Avc = new C1971Avc(view, window);
        c1971Avc.A01(!z);
        c1971Avc.A00(!z2);
    }
}
