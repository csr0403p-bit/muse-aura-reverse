package com.facebook.aura.startup.analytics;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class AnalyticsModeStateSignOutCleanupHandler implements SignOutCleanupHandler {
    public static final AnalyticsModeStateSignOutCleanupHandler INSTANCE = new AnalyticsModeStateSignOutCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        AnalyticsModeStateStartupJob.INSTANCE.stopCollecting$fbandroid_express_aura_java_com_facebook_aura_startup_analytics_analytics();
    }
}
