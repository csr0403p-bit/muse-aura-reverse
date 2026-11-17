package X;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.FbS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8302FbS {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Fbn, android.window.OnBackInvokedCallback] */
    public static C8321Fbn A01(final LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT, Object obj) {
        ?? r1 = new OnBackInvokedCallback() { // from class: X.Fbn
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                layoutInflaterFactory2C8250FaT.A0W();
            }
        };
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, r1);
        return r1;
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
