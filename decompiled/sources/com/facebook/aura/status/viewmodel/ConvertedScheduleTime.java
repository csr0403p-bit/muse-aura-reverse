package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ConvertedScheduleTime extends C06G {
    public final int dayOffset;
    public final String text;

    public ConvertedScheduleTime(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.dayOffset = i;
    }

    public final ConvertedScheduleTime copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new ConvertedScheduleTime(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConvertedScheduleTime) {
                ConvertedScheduleTime convertedScheduleTime = (ConvertedScheduleTime) obj;
                if (!C7384Etj.areEqual(this.text, convertedScheduleTime.text) || this.dayOffset != convertedScheduleTime.dayOffset) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConvertedScheduleTime copy$default(ConvertedScheduleTime convertedScheduleTime, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = convertedScheduleTime.text;
        }
        if ((i2 & 2) != 0) {
            i = convertedScheduleTime.dayOffset;
        }
        C7384Etj.A0Y(str, 0);
        return new ConvertedScheduleTime(str, i);
    }

    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.dayOffset;
    }

    public final int getDayOffset() {
        return this.dayOffset;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + this.dayOffset;
    }

    public String toString() {
        return super.toString();
    }
}
