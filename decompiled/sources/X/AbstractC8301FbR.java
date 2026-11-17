package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.FbR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8301FbR {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.Fbs] */
    public static C8326Fbs A01(final Runnable runnable) {
        return new OnBackInvokedCallback() { // from class: X.Fbs
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void A03(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(View view) {
        return view.findOnBackInvokedDispatcher();
    }
}
