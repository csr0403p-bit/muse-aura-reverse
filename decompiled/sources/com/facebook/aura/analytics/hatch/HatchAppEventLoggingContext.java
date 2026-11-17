package com.facebook.aura.analytics.hatch;

import X.AnonymousClass003;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;

/* loaded from: classes3.dex */
public final class HatchAppEventLoggingContext {
    public static final int $stable = HatchVmLoggingContext.Attribution.$stable;
    public final boolean isWatch;
    public final String sessionId;
    public final HatchVmLoggingContext.Attribution vm;

    public final String getSessionId$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch() {
        return this.sessionId;
    }

    public final HatchVmLoggingContext.Attribution getVm$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch() {
        return this.vm;
    }

    public final boolean isWatch$fbandroid_express_aura_java_com_facebook_aura_analytics_hatch_hatch() {
        return this.isWatch;
    }

    public HatchAppEventLoggingContext(String str, HatchVmLoggingContext.Attribution attribution, boolean z) {
        AnonymousClass003.A0u(str, attribution);
        this.sessionId = str;
        this.vm = attribution;
        this.isWatch = z;
    }
}
