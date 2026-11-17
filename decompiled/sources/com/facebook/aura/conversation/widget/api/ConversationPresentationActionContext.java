package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ConversationPresentationActionContext {
    public static final int $stable = 0;
    public final Map<String, String> analyticsMetadata;
    public final HatchScreen analyticsScreen;
    public final boolean isConnected;
    public final boolean isEligible;
    public final boolean isReadOnly;
    public final String threadId;

    public final Map<String, String> getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    public final HatchScreen getAnalyticsScreen() {
        return this.analyticsScreen;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final boolean isReadOnly() {
        return this.isReadOnly;
    }

    public ConversationPresentationActionContext(String str, boolean z, boolean z2, boolean z3, HatchScreen hatchScreen, Map<String, String> map) {
        AnonymousClass003.A0y(hatchScreen, map);
        this.threadId = str;
        this.isReadOnly = z;
        this.isEligible = z2;
        this.isConnected = z3;
        this.analyticsScreen = hatchScreen;
        this.analyticsMetadata = map;
    }
}
