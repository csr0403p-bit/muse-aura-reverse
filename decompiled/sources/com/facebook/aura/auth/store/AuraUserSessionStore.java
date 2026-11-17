package com.facebook.aura.auth.store;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.BzK;
import X.C4oT;
import X.CGw;
import X.CH0;
import X.F0C;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class AuraUserSessionStore {
    public static final String CURRENT_AUTH_FRAMEWORK = "abra_native_to_web";
    public static final String KEY_AUTH_FRAMEWORK = "auth_framework";
    public static String cachedAuthFramework;
    public static final AuraUserSessionStore INSTANCE = new AuraUserSessionStore();
    public static final F0C authFrameworkPrefs$delegate = AbstractC5321DgF.A03(AuraUserSessionStore$authFrameworkPrefs$2.INSTANCE);
    public static final F0C instance$delegate = AbstractC5321DgF.A03(AuraUserSessionStore$instance$2.INSTANCE);

    private final C4oT getAuthFrameworkPrefs() {
        return (C4oT) authFrameworkPrefs$delegate.getValue();
    }

    private final boolean isFromCurrentAuthFramework() {
        String string = cachedAuthFramework;
        if (string == null) {
            string = ((C4oT) authFrameworkPrefs$delegate.getValue()).getString(KEY_AUTH_FRAMEWORK, null);
            cachedAuthFramework = string;
        }
        return CURRENT_AUTH_FRAMEWORK.equals(string);
    }

    private final boolean isFromE2EInjectedSession() {
        return ((CGw) instance$delegate.getValue()).A01.getBoolean("E2E_INJECTED", false);
    }

    public final AbstractC3358CGz getCurrentSessionForWorkManagerWorker() {
        return ((CGw) instance$delegate.getValue()).A00();
    }

    public final CGw getInstance() {
        return (CGw) instance$delegate.getValue();
    }

    public final boolean isCurrentUserAuthenticated() {
        AbstractC3358CGz abstractC3358CGzA00 = ((CGw) instance$delegate.getValue()).A00();
        if (abstractC3358CGzA00 == null || CH0.A01((CH0) abstractC3358CGzA00).A04 == null) {
            return false;
        }
        return isFromCurrentAuthFramework() || isFromE2EInjectedSession();
    }

    public final boolean saveCurrentUserSession(AbstractC3358CGz abstractC3358CGz) {
        BzK bzKA03 = BzK.A03(authFrameworkPrefs$delegate);
        bzKA03.AYr(KEY_AUTH_FRAMEWORK, CURRENT_AUTH_FRAMEWORK);
        bzKA03.apply();
        cachedAuthFramework = CURRENT_AUTH_FRAMEWORK;
        return ((CGw) instance$delegate.getValue()).A01(abstractC3358CGz);
    }

    @Deprecated(message = "DO NOT USE THIS directly. Instead get the user from your screen via LocalUserSession and pass it to the appropriate data layers.")
    public final AbstractC3358CGz getCurrentUserSession() {
        if (isCurrentUserAuthenticated()) {
            return ((CGw) instance$delegate.getValue()).A00();
        }
        return null;
    }
}
