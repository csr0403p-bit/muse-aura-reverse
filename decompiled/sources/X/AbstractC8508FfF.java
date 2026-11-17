package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.FfF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8508FfF {
    public static C8497Ff4 A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C8497Ff4 c8497Ff4 = new C8497Ff4(rootWindowInsets);
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        c8496Ff3.A0L(c8497Ff4);
        View rootView = view.getRootView();
        c8496Ff3.A0I(rootView);
        c8496Ff3.A0J(rootView);
        c8496Ff3.A0G();
        return c8497Ff4;
    }
}
