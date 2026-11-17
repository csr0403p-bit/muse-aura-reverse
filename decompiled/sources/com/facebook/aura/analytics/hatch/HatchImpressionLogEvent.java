package com.facebook.aura.analytics.hatch;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchImpressionLogEvent extends C06G {
    public static final int $stable = 8;
    public final String component;
    public final Map<String, String> metadata;
    public final String origin;
    public final String screen;
    public final String subsurface;
    public final String surface;
    public final long timestamp;

    public HatchImpressionLogEvent(String str, String str2, String str3, String str4, String str5, Map<String, String> map, long j) {
        C7384Etj.A0Y(str, 0);
        this.origin = str;
        this.surface = str2;
        this.subsurface = str3;
        this.screen = str4;
        this.component = str5;
        this.metadata = map;
        this.timestamp = j;
    }

    public final HatchImpressionLogEvent copy(String str, String str2, String str3, String str4, String str5, Map<String, String> map, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchImpressionLogEvent(str, str2, str3, str4, str5, map, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchImpressionLogEvent) {
                HatchImpressionLogEvent hatchImpressionLogEvent = (HatchImpressionLogEvent) obj;
                if (!C7384Etj.areEqual(this.origin, hatchImpressionLogEvent.origin) || !C7384Etj.areEqual(this.surface, hatchImpressionLogEvent.surface) || !C7384Etj.areEqual(this.subsurface, hatchImpressionLogEvent.subsurface) || !C7384Etj.areEqual(this.screen, hatchImpressionLogEvent.screen) || !C7384Etj.areEqual(this.component, hatchImpressionLogEvent.component) || !C7384Etj.areEqual(this.metadata, hatchImpressionLogEvent.metadata) || this.timestamp != hatchImpressionLogEvent.timestamp) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchImpressionLogEvent copy$default(HatchImpressionLogEvent hatchImpressionLogEvent, String str, String str2, String str3, String str4, String str5, Map map, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchImpressionLogEvent.origin;
        }
        if ((i & 2) != 0) {
            str2 = hatchImpressionLogEvent.surface;
        }
        if ((i & 4) != 0) {
            str3 = hatchImpressionLogEvent.subsurface;
        }
        if ((i & 8) != 0) {
            str4 = hatchImpressionLogEvent.screen;
        }
        if ((i & 16) != 0) {
            str5 = hatchImpressionLogEvent.component;
        }
        if ((i & 32) != 0) {
            map = hatchImpressionLogEvent.metadata;
        }
        if ((i & 64) != 0) {
            j = hatchImpressionLogEvent.timestamp;
        }
        return hatchImpressionLogEvent.copy(str, str2, str3, str4, str5, map, j);
    }

    public final String component1() {
        return this.origin;
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

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getOrigin() {
        return this.origin;
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
        return AnonymousClass006.A05(this.timestamp, (((((((((AnonymousClass001.A0G(this.origin) + AnonymousClass006.A0G(this.surface)) * 31) + AnonymousClass006.A0G(this.subsurface)) * 31) + AnonymousClass006.A0G(this.screen)) * 31) + AnonymousClass006.A0G(this.component)) * 31) + C3cH.A02(this.metadata)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
