package com.facebook.aura.analytics.timespent;

/* loaded from: classes5.dex */
public interface AppStateAnalytics {
    void markFreshUIAppStart();

    void recordAppBackgrounded();

    void recordAppBackgroundedImmediate();

    void recordAppForegrounded();
}
