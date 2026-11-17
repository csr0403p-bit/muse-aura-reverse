package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ClockCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String action;
    public final AHD<ClockAlarm> alarms;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClockCardData) {
                ClockCardData clockCardData = (ClockCardData) obj;
                if (!C7384Etj.areEqual(this.action, clockCardData.action) || !C7384Etj.areEqual(this.alarms, clockCardData.alarms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClockCardData copy$default(ClockCardData clockCardData, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clockCardData.action;
        }
        if ((i & 2) != 0) {
            ahd = clockCardData.alarms;
        }
        AnonymousClass003.A0u(str, ahd);
        return new ClockCardData(str, ahd);
    }

    public final String component1() {
        return this.action;
    }

    public final AHD<ClockAlarm> component2() {
        return this.alarms;
    }

    public final String getAction() {
        return this.action;
    }

    public final AHD<ClockAlarm> getAlarms() {
        return this.alarms;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.alarms, AnonymousClass001.A0G(this.action));
    }

    public ClockCardData(String str, AHD<ClockAlarm> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.action = str;
        this.alarms = ahd;
    }

    public final ClockCardData copy(String str, AHD<ClockAlarm> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new ClockCardData(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
