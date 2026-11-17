package com.facebook.aura.common.appcontext;

import X.C4JM;
import android.app.Application;
import android.content.Context;

/* loaded from: classes2.dex */
public final class AuraAppContext {
    public static final AuraAppContext INSTANCE = new AuraAppContext();
    public static volatile Application startedApplication;

    public final Context getContext() {
        Application application = C4JM.A00;
        if (application == null) {
            return null;
        }
        if (application == startedApplication) {
            return application;
        }
        if (application.getApplicationContext() == null) {
            return C4JM.A01;
        }
        startedApplication = application;
        return application;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("AppContext.set has not been invoked");
    }
}
