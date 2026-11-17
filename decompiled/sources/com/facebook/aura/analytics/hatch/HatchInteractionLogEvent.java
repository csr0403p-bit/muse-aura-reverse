package com.facebook.aura.analytics.hatch;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchInteractionLogEvent extends C06G {
    public static final int $stable = 8;
    public final String component;
    public final String eventType;
    public final Map<String, String> metadata;
    public final String screen;
    public final String subsurface;
    public final String surface;
    public final long timestamp;

    public HatchInteractionLogEvent(String str, String str2, String str3, String str4, String str5, Map<String, String> map, long j) {
        C7384Etj.A0Y(str, 0);
        this.eventType = str;
        this.surface = str2;
        this.subsurface = str3;
        this.screen = str4;
        this.component = str5;
        this.metadata = map;
        this.timestamp = j;
    }

    public final HatchInteractionLogEvent copy(String str, String str2, String str3, String str4, String str5, Map<String, String> map, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchInteractionLogEvent(str, str2, str3, str4, str5, map, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchInteractionLogEvent) {
                HatchInteractionLogEvent hatchInteractionLogEvent = (HatchInteractionLogEvent) obj;
                if (!C7384Etj.areEqual(this.eventType, hatchInteractionLogEvent.eventType) || !C7384Etj.areEqual(this.surface, hatchInteractionLogEvent.surface) || !C7384Etj.areEqual(this.subsurface, hatchInteractionLogEvent.subsurface) || !C7384Etj.areEqual(this.screen, hatchInteractionLogEvent.screen) || !C7384Etj.areEqual(this.component, hatchInteractionLogEvent.component) || !C7384Etj.areEqual(this.metadata, hatchInteractionLogEvent.metadata) || this.timestamp != hatchInteractionLogEvent.timestamp) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchInteractionLogEvent copy$default(HatchInteractionLogEvent hatchInteractionLogEvent, String str, String str2, String str3, String str4, String str5, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchInteractionLogEvent.eventType;
        }
        if ((i & 2) != 0) {
            str2 = hatchInteractionLogEvent.surface;
        }
        if ((i & 4) != 0) {
            str3 = hatchInteractionLogEvent.subsurface;
        }
        if ((i & 8) != 0) {
            str4 = hatchInteractionLogEvent.screen;
        }
        if ((i & 16) != 0) {
            str5 = hatchInteractionLogEvent.component;
        }
        if ((i & 32) != 0) {
            map = hatchInteractionLogEvent.metadata;
        }
        if ((i & 64) != 0) {
            j = hatchInteractionLogEvent.timestamp;
        }
        return hatchInteractionLogEvent.copy(str, str2, str3, str4, str5, map, j);
    }

    public final String component1() {
        return this.eventType;
    }

    public final String component2() {
        return this.surface;
    }

    public final String component3() {
        return this.subsurface;
    }

    public final String component4() {
        return this.screen;
    }

    public final String component5() {
        return this.component;
    }

    public final Map<String, String> component6() {
        return this.metadata;
    }

    public final long component7() {
        return this.timestamp;
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final String getSubsurface() {
        return this.subsurface;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.timestamp, (((((((((AnonymousClass001.A0G(this.eventType) + AnonymousClass006.A0G(this.surface)) * 31) + AnonymousClass006.A0G(this.subsurface)) * 31) + AnonymousClass006.A0G(this.screen)) * 31) + AnonymousClass006.A0G(this.component)) * 31) + C3cH.A02(this.metadata)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
