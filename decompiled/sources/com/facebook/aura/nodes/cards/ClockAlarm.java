package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ClockAlarm extends C06G {
    public static final int $stable = 0;
    public final Integer hour;
    public final String label;
    public final Integer minute;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClockAlarm) {
                ClockAlarm clockAlarm = (ClockAlarm) obj;
                if (!C7384Etj.areEqual(this.hour, clockAlarm.hour) || !C7384Etj.areEqual(this.minute, clockAlarm.minute) || !C7384Etj.areEqual(this.label, clockAlarm.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClockAlarm copy$default(ClockAlarm clockAlarm, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = clockAlarm.hour;
        }
        if ((i & 2) != 0) {
            num2 = clockAlarm.minute;
        }
        if ((i & 4) != 0) {
            str = clockAlarm.label;
        }
        return new ClockAlarm(num, num2, str);
    }

    public final Integer component1() {
        return this.hour;
    }

    public final Integer component2() {
        return this.minute;
    }

    public final String component3() {
        return this.label;
    }

    public final ClockAlarm copy(Integer num, Integer num2, String str) {
        return new ClockAlarm(num, num2, str);
    }

    public final Integer getHour() {
        return this.hour;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMinute() {
        return this.minute;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.hour) * 31) + AnonymousClass006.A0D(this.minute)) * 31) + AnonymousClass005.A0H(this.label);
    }

    public ClockAlarm(Integer num, Integer num2, String str) {
        this.hour = num;
        this.minute = num2;
        this.label = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ClockAlarm(Integer num, Integer num2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }

    public ClockAlarm() {
        this(null, null, null);
    }
}
