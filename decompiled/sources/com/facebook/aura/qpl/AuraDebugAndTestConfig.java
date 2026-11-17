package com.facebook.aura.qpl;

import X.C9X;
import X.InterfaceC3472COx;
import com.facebook.common.util.TriState;

/* loaded from: classes5.dex */
public final class AuraDebugAndTestConfig implements InterfaceC3472COx {
    public final boolean isAnalyticsLoggingDisabled;
    public final boolean isLocalBuild;
    public final TriState isOutputToLogcatEnabled;
    public final TriState isOutputToLogcatJsonEnabled;
    public final boolean isRunningInPerfTest;
    public final TriState isSendingAllMarkersEnabled;

    public boolean isAnalyticsLoggingDisabled() {
        return this.isAnalyticsLoggingDisabled;
    }

    public boolean isLocalBuild() {
        return this.isLocalBuild;
    }

    public TriState isOutputToLogcatEnabled() {
        return this.isOutputToLogcatEnabled;
    }

    public TriState isOutputToLogcatJsonEnabled() {
        return this.isOutputToLogcatJsonEnabled;
    }

    public boolean isRunningInPerfTest() {
        return this.isRunningInPerfTest;
    }

    public TriState isSendingAllMarkersEnabled() {
        return this.isSendingAllMarkersEnabled;
    }

    public AuraDebugAndTestConfig() {
        this.isOutputToLogcatEnabled = C9X.A06() ? TriState.A04 : TriState.A02;
        this.isOutputToLogcatJsonEnabled = C9X.A06() ? TriState.A04 : TriState.A02;
        this.isSendingAllMarkersEnabled = TriState.A02;
    }

    public void setUpdateListener(Runnable runnable) {
    }
}
