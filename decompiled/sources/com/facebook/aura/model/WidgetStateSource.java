package com.facebook.aura.model;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class WidgetStateSource {
    public static final int $stable = JSONState.$stable | HatchMessage.$stable;
    public final HatchMessage message;
    public final JSONState state;
    public final String widgetId;

    public final HatchMessage getMessage() {
        return this.message;
    }

    public final JSONState getState() {
        return this.state;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public WidgetStateSource(HatchMessage hatchMessage, String str, JSONState jSONState) {
        AnonymousClass005.A0x(hatchMessage, str, jSONState);
        this.message = hatchMessage;
        this.widgetId = str;
        this.state = jSONState;
    }
}
