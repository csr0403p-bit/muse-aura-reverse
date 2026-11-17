package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SessionUpdatedEvent extends C06G {
    public static final int $stable = HatchSessionUpdate.$stable;
    public final String change;
    public final String sessionId;
    public final HatchSessionUpdate sessionUpdate;
    public final Long updatedAtMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionUpdatedEvent) {
                SessionUpdatedEvent sessionUpdatedEvent = (SessionUpdatedEvent) obj;
                if (!C7384Etj.areEqual(this.sessionId, sessionUpdatedEvent.sessionId) || !C7384Etj.areEqual(this.change, sessionUpdatedEvent.change) || !C7384Etj.areEqual(this.updatedAtMs, sessionUpdatedEvent.updatedAtMs) || !C7384Etj.areEqual(this.sessionUpdate, sessionUpdatedEvent.sessionUpdate)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SessionUpdatedEvent copy$default(SessionUpdatedEvent sessionUpdatedEvent, String str, String str2, Long l, HatchSessionUpdate hatchSessionUpdate, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionUpdatedEvent.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = sessionUpdatedEvent.change;
        }
        if ((i & 4) != 0) {
            l = sessionUpdatedEvent.updatedAtMs;
        }
        if ((i & 8) != 0) {
            hatchSessionUpdate = sessionUpdatedEvent.sessionUpdate;
        }
        AnonymousClass003.A0u(str, str2);
        return new SessionUpdatedEvent(str, str2, l, hatchSessionUpdate);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.change;
    }

    public final Long component3() {
        return this.updatedAtMs;
    }

    public final HatchSessionUpdate component4() {
        return this.sessionUpdate;
    }

    public final String getChange() {
        return this.change;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final HatchSessionUpdate getSessionUpdate() {
        return this.sessionUpdate;
    }

    public final Long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.change, AnonymousClass001.A0G(this.sessionId)) + AnonymousClass006.A0D(this.updatedAtMs)) * 31) + C3cH.A02(this.sessionUpdate);
    }

    public SessionUpdatedEvent(String str, String str2, Long l, HatchSessionUpdate hatchSessionUpdate) {
        AnonymousClass003.A0u(str, str2);
        this.sessionId = str;
        this.change = str2;
        this.updatedAtMs = l;
        this.sessionUpdate = hatchSessionUpdate;
    }

    public final SessionUpdatedEvent copy(String str, String str2, Long l, HatchSessionUpdate hatchSessionUpdate) {
        AnonymousClass003.A0u(str, str2);
        return new SessionUpdatedEvent(str, str2, l, hatchSessionUpdate);
    }

    public String toString() {
        return super.toString();
    }
}
