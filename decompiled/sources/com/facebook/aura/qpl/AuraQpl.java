package com.facebook.aura.qpl;

import X.C60O;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes5.dex */
public final class AuraQpl {
    public static final AuraQpl INSTANCE = new AuraQpl();

    public final void onStartupCompletion() {
        AuraQuickPerformanceLogger.INSTANCE.onStartupCompletion();
    }

    public final QuickPerformanceLogger getInstance() {
        return C60O.A0g();
    }
}
