package X;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Avd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1972Avd implements AzY {
    public final View A00;
    public final F0C A01 = AbstractC5321DgF.A02(C79.A0C, C2298BSy.A00(this, 26));
    public final C2066Axg A02;

    @Override // X.AzY
    public final void AgL() {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC2104AyU.A00(this.A00, (InputMethodManager) this.A01.getValue());
        }
    }

    public C1972Avd(View view) {
        this.A00 = view;
        this.A02 = new C2066Axg(view);
    }
}
