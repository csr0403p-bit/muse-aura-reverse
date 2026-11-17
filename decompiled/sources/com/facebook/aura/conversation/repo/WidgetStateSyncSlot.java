package com.facebook.aura.conversation.repo;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.JSONState;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class WidgetStateSyncSlot {
    public JSONState committedState;
    public boolean isSyncing;
    public JsonObject optimisticStateData;
    public JsonObject pendingStateData;

    public final void setCommittedState(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        this.committedState = jSONState;
    }

    public /* synthetic */ WidgetStateSyncSlot(JSONState jSONState, JsonObject jsonObject, JsonObject jsonObject2, boolean z, int i, C06H c06h) {
        this(jSONState, (i & 2) != 0 ? null : jsonObject, (i & 4) != 0 ? null : jsonObject2, AnonymousClass005.A1P(i, z));
    }

    public final JSONState getCommittedState() {
        return this.committedState;
    }

    public final JsonObject getOptimisticStateData() {
        return this.optimisticStateData;
    }

    public final JsonObject getPendingStateData() {
        return this.pendingStateData;
    }

    public final boolean isSyncing() {
        return this.isSyncing;
    }

    public final void setOptimisticStateData(JsonObject jsonObject) {
        this.optimisticStateData = jsonObject;
    }

    public final void setPendingStateData(JsonObject jsonObject) {
        this.pendingStateData = jsonObject;
    }

    public final void setSyncing(boolean z) {
        this.isSyncing = z;
    }

    public WidgetStateSyncSlot(JSONState jSONState, JsonObject jsonObject, JsonObject jsonObject2, boolean z) {
        C7384Etj.A0Y(jSONState, 0);
        this.committedState = jSONState;
        this.pendingStateData = jsonObject;
        this.optimisticStateData = jsonObject2;
        this.isSyncing = z;
    }
}
