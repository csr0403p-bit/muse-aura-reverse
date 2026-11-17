package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchTaskEntry extends C06G {
    public static final int $stable = 8;
    public final HatchTaskCadence cadence;
    public final boolean enabled;
    public final String executionTarget;
    public final String id;
    public final boolean isHeartbeat;
    public final String mode;
    public final Long nextRunAtUtc;
    public final String path;
    public final String scheduleKey;
    public final String timezone;
    public final String title;

    public HatchTaskEntry(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, HatchTaskCadence hatchTaskCadence) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.title = str2;
        this.path = str3;
        this.scheduleKey = str4;
        this.mode = str5;
        this.enabled = z;
        this.executionTarget = str6;
        this.isHeartbeat = z2;
        this.nextRunAtUtc = l;
        this.timezone = str7;
        this.cadence = hatchTaskCadence;
    }

    public final HatchTaskEntry copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, HatchTaskCadence hatchTaskCadence) {
        C7384Etj.A0Y(str, 0);
        return new HatchTaskEntry(str, str2, str3, str4, str5, z, str6, z2, l, str7, hatchTaskCadence);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTaskEntry) {
                HatchTaskEntry hatchTaskEntry = (HatchTaskEntry) obj;
                if (!C7384Etj.areEqual(this.id, hatchTaskEntry.id) || !C7384Etj.areEqual(this.title, hatchTaskEntry.title) || !C7384Etj.areEqual(this.path, hatchTaskEntry.path) || !C7384Etj.areEqual(this.scheduleKey, hatchTaskEntry.scheduleKey) || !C7384Etj.areEqual(this.mode, hatchTaskEntry.mode) || this.enabled != hatchTaskEntry.enabled || !C7384Etj.areEqual(this.executionTarget, hatchTaskEntry.executionTarget) || this.isHeartbeat != hatchTaskEntry.isHeartbeat || !C7384Etj.areEqual(this.nextRunAtUtc, hatchTaskEntry.nextRunAtUtc) || !C7384Etj.areEqual(this.timezone, hatchTaskEntry.timezone) || !C7384Etj.areEqual(this.cadence, hatchTaskEntry.cadence)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTaskEntry copy$default(HatchTaskEntry hatchTaskEntry, String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, HatchTaskCadence hatchTaskCadence, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTaskEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchTaskEntry.title;
        }
        if ((i & 4) != 0) {
            str3 = hatchTaskEntry.path;
        }
        if ((i & 8) != 0) {
            str4 = hatchTaskEntry.scheduleKey;
        }
        if ((i & 16) != 0) {
            str5 = hatchTaskEntry.mode;
        }
        if ((i & 32) != 0) {
            z = hatchTaskEntry.enabled;
        }
        if ((i & 64) != 0) {
            str6 = hatchTaskEntry.executionTarget;
        }
        if ((i & 128) != 0) {
            z2 = hatchTaskEntry.isHeartbeat;
        }
        if ((i & 256) != 0) {
            l = hatchTaskEntry.nextRunAtUtc;
        }
        if ((i & 512) != 0) {
            str7 = hatchTaskEntry.timezone;
        }
        if ((i & 1024) != 0) {
            hatchTaskCadence = hatchTaskEntry.cadence;
        }
        return hatchTaskEntry.copy(str, str2, str3, str4, str5, z, str6, z2, l, str7, hatchTaskCadence);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.timezone;
    }

    public final HatchTaskCadence component11() {
        return this.cadence;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.scheduleKey;
    }

    public final String component5() {
        return this.mode;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final String component7() {
        return this.executionTarget;
    }

    public final boolean component8() {
        return this.isHeartbeat;
    }

    public final Long component9() {
        return this.nextRunAtUtc;
    }

    public final HatchTaskCadence getCadence() {
        return this.cadence;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getExecutionTarget() {
        return this.executionTarget;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Long getNextRunAtUtc() {
        return this.nextRunAtUtc;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getScheduleKey() {
        return this.scheduleKey;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((C0KA.A01((C0KA.A01((((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.path)) * 31) + AnonymousClass006.A0G(this.scheduleKey)) * 31) + AnonymousClass006.A0G(this.mode)) * 31, this.enabled) + AnonymousClass006.A0G(this.executionTarget)) * 31, this.isHeartbeat) + AnonymousClass006.A0D(this.nextRunAtUtc)) * 31) + AnonymousClass006.A0G(this.timezone)) * 31) + C3cH.A02(this.cadence);
    }

    public final boolean isHeartbeat() {
        return this.isHeartbeat;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTaskEntry(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, HatchTaskCadence hatchTaskCadence, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : hatchTaskCadence);
    }
}
