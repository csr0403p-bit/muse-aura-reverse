package com.facebook.aura.widgets;

import X.C3cG;
import X.CFK;
import X.FGI;
import android.content.Context;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class WidgetSignOutCleanup implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final WidgetSignOutCleanup INSTANCE = new WidgetSignOutCleanup();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        Context contextA06 = C3cG.A06();
        if (WidgetsGate.INSTANCE.areWidgetsEnabled(contextA06)) {
            for (HomeScreenWidget homeScreenWidget : HomeScreenWidgetKt.homeScreenWidgets) {
                try {
                    homeScreenWidget.deleteFiles(contextA06);
                } catch (Exception e) {
                    CFK.A08(WidgetSignOutCleanupKt.TAG, FGI.A0U("Failed to delete ", homeScreenWidget.getKey(), " files on sign-out"), e);
                }
            }
            WidgetSessionReconcileWorker.Companion.enqueueSignedOut(contextA06);
        }
    }
}
