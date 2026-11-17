package com.facebook.aura.perf;

/* loaded from: classes3.dex */
public interface HatchNavTTRCTrace {
    void annotate(String str, Object obj);

    void cancel(String str);

    void completeStep(String str);

    void displayQuery(String str);

    void fail(String str);

    int getInstanceId();

    HatchNavTTRCTraceTerminalState getTerminalState();

    boolean isQueryPending(String str);

    boolean isStepPending(String str);

    void markerPoint(String str);

    void registerNetworkOnlyQuery(String str);

    void registerStep(String str);

    void revokeQuery(String str);

    void revokeStep(String str);
}
