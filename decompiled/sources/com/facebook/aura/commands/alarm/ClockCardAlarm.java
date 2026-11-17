package com.facebook.aura.commands.alarm;

import X.C06H;

/* loaded from: classes3.dex */
public final class ClockCardAlarm {
    public final Integer hour;
    public final String label;
    public final Integer minute;

    public final Integer getHour() {
        return this.hour;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMinute() {
        return this.minute;
    }

    public ClockCardAlarm(Integer num, Integer num2, String str) {
        this.hour = num;
        this.minute = num2;
        this.label = str;
    }

    public /* synthetic */ ClockCardAlarm(Integer num, Integer num2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }

    public ClockCardAlarm() {
        this(null, null, null);
    }
}
