package com.facebook.aura.gateway;

import X.C7384Etj;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchChatHandler$parseChatEventsToMessages$EventRow {
    public final JsonObject json;
    public final long occurredAtMs;
    public final long seq;

    public HatchChatHandler$parseChatEventsToMessages$EventRow(JsonObject jsonObject, long j, long j2) {
        C7384Etj.A0Y(jsonObject, 0);
        this.json = jsonObject;
        this.seq = j;
        this.occurredAtMs = j2;
    }

    public final JsonObject getJson() {
        return this.json;
    }

    public final long getOccurredAtMs() {
        return this.occurredAtMs;
    }

    public final long getSeq() {
        return this.seq;
    }
}
