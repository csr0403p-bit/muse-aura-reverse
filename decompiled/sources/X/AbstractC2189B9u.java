package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.B9u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2189B9u {
    public static final OnBackInvokedCallback A00(final Function0<Unit> function0) {
        return new OnBackInvokedCallback() { // from class: X.B9w
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                AbstractC2189B9u.A03(function0);
            }
        };
    }

    public static final void A01(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void A02(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }

    public static final void A03(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
