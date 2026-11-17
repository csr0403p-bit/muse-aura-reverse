package com.facebook.aura.conversation.repo;

import X.AnonymousClass003;
import com.facebook.aura.model.JSONState;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class WidgetStateSyncWork {
    public final JsonObject pendingStateData;
    public final JSONState previousState;

    public final JsonObject getPendingStateData() {
        return this.pendingStateData;
    }

    public final JSONState getPreviousState() {
        return this.previousState;
    }

    public WidgetStateSyncWork(JSONState jSONState, JsonObject jsonObject) {
        AnonymousClass003.A0u(jSONState, jsonObject);
        this.previousState = jSONState;
        this.pendingStateData = jsonObject;
    }
}
