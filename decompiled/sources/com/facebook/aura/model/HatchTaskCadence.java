package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchTaskCadence extends C06G {
    public static final int $stable = 8;
    public final Long intervalSeconds;
    public final HatchTaskCadenceKind kind;
    public final Long runAtUtc;
    public final String time;
    public final List<String> weekdays;

    public HatchTaskCadence(HatchTaskCadenceKind hatchTaskCadenceKind, Long l, Long l2, String str, List<String> list) {
        AnonymousClass002.A1C(hatchTaskCadenceKind, 0, list);
        this.kind = hatchTaskCadenceKind;
        this.runAtUtc = l;
        this.intervalSeconds = l2;
        this.time = str;
        this.weekdays = list;
    }

    public final HatchTaskCadence copy(HatchTaskCadenceKind hatchTaskCadenceKind, Long l, Long l2, String str, List<String> list) {
        AnonymousClass002.A1C(hatchTaskCadenceKind, 0, list);
        return new HatchTaskCadence(hatchTaskCadenceKind, l, l2, str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTaskCadence) {
                HatchTaskCadence hatchTaskCadence = (HatchTaskCadence) obj;
                if (this.kind != hatchTaskCadence.kind || !C7384Etj.areEqual(this.runAtUtc, hatchTaskCadence.runAtUtc) || !C7384Etj.areEqual(this.intervalSeconds, hatchTaskCadence.intervalSeconds) || !C7384Etj.areEqual(this.time, hatchTaskCadence.time) || !C7384Etj.areEqual(this.weekdays, hatchTaskCadence.weekdays)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchTaskCadence copy$default(HatchTaskCadence hatchTaskCadence, HatchTaskCadenceKind hatchTaskCadenceKind, Long l, Long l2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchTaskCadenceKind = hatchTaskCadence.kind;
        }
        if ((i & 2) != 0) {
            l = hatchTaskCadence.runAtUtc;
        }
        if ((i & 4) != 0) {
            l2 = hatchTaskCadence.intervalSeconds;
        }
        if ((i & 8) != 0) {
            str = hatchTaskCadence.time;
        }
        if ((i & 16) != 0) {
            list = hatchTaskCadence.weekdays;
        }
        return hatchTaskCadence.copy(hatchTaskCadenceKind, l, l2, str, list);
    }

    public final HatchTaskCadenceKind component1() {
        return this.kind;
    }

    public final Long component2() {
        return this.runAtUtc;
    }

    public final Long component3() {
        return this.intervalSeconds;
    }

    public final String component4() {
        return this.time;
    }

    public final List<String> component5() {
        return this.weekdays;
    }

    public final Long getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public final HatchTaskCadenceKind getKind() {
        return this.kind;
    }

    public final Long getRunAtUtc() {
        return this.runAtUtc;
    }

    public final String getTime() {
        return this.time;
    }

    public final List<String> getWeekdays() {
        return this.weekdays;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.weekdays, (((((AnonymousClass005.A0E(this.kind) + AnonymousClass006.A0D(this.runAtUtc)) * 31) + AnonymousClass006.A0D(this.intervalSeconds)) * 31) + AnonymousClass005.A0H(this.time)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTaskCadence(HatchTaskCadenceKind hatchTaskCadenceKind, Long l, Long l2, String str, List list, int i, C06H c06h) {
        this(hatchTaskCadenceKind, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? C0881AGi.A00 : list);
    }
}
