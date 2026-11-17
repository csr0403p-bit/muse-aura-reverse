package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ActivityUpdatedEvent extends C06G {
    public static final int $stable = 8;
    public final JsonObject payload;
    public final Long seq;

    public ActivityUpdatedEvent(JsonObject jsonObject, Long l) {
        C7384Etj.A0Y(jsonObject, 0);
        this.payload = jsonObject;
        this.seq = l;
    }

    public final ActivityUpdatedEvent copy(JsonObject jsonObject, Long l) {
        C7384Etj.A0Y(jsonObject, 0);
        return new ActivityUpdatedEvent(jsonObject, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityUpdatedEvent) {
                ActivityUpdatedEvent activityUpdatedEvent = (ActivityUpdatedEvent) obj;
                if (!C7384Etj.areEqual(this.payload, activityUpdatedEvent.payload) || !C7384Etj.areEqual(this.seq, activityUpdatedEvent.seq)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityUpdatedEvent copy$default(ActivityUpdatedEvent activityUpdatedEvent, JsonObject jsonObject, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = activityUpdatedEvent.payload;
        }
        if ((i & 2) != 0) {
            l = activityUpdatedEvent.seq;
        }
        C7384Etj.A0Y(jsonObject, 0);
        return new ActivityUpdatedEvent(jsonObject, l);
    }

    public final JsonObject component1() {
        return this.payload;
    }

    public final Long component2() {
        return this.seq;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.payload) + AnonymousClass006.A0D(this.seq);
    }

    public String toString() {
        return super.toString();
    }
}
