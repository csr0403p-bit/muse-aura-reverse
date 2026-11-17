package X;

import android.app.Application;
import android.content.Context;
import com.facebook.aura.localbrowser.LocalBrowserRuntime;
import com.facebook.aura.nodes.HatchNodeClient;

/* renamed from: X.4JM, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4JM {
    public static volatile Application A00;
    public static volatile Context A01;

    public static final Application A00() {
        Application application = A00;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("AppContext.set has not been invoked");
    }

    public static void A01(LocalBrowserRuntime localBrowserRuntime, HatchNodeClient.Companion companion) {
        companion.getInstance(localBrowserRuntime.userSession, A00()).resnapshot();
    }
}
