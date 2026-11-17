package com.facebook.aura.commands.alarm;

import X.C06H;

/* loaded from: classes3.dex */
public final class ReminderCardItemInput {
    public final Integer hour;
    public final String label;
    public final Integer minute;
    public final Long triggerTimeMs;

    public /* synthetic */ ReminderCardItemInput(String str, Integer num, Integer num2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l);
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

    public final Long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }

    public ReminderCardItemInput(String str, Integer num, Integer num2, Long l) {
        this.label = str;
        this.hour = num;
        this.minute = num2;
        this.triggerTimeMs = l;
    }

    public ReminderCardItemInput() {
        this(null, null, null, null);
    }
}
