package com.facebook.aura.analytics.timespent;

/* loaded from: classes5.dex */
public interface TimeSpentAnalytics {
    void recordAppBackgrounded();

    void recordAppForegrounded();

    void recordUserInteraction();

    void reportTimeChangeEvent();
}
