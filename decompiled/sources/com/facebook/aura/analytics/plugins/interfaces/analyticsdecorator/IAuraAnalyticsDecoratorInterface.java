package com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator;

import X.DFW;
import X.DLT;

/* loaded from: classes5.dex */
public interface IAuraAnalyticsDecoratorInterface {
    void decorateTimeSpentAppStateEvent(DFW dfw);

    void decorateTimeSpentInteractionEvent(DLT dlt);

    void decorateTimeSpentNavigationEvent(DFW dfw);

    void onTimeSpentAppBackgrounded();

    void onTimeSpentAppForegrounded();

    void onTimeSpentBitArray(long j, int[] iArr, int i);

    void onTimeSpentNavigation();
}
