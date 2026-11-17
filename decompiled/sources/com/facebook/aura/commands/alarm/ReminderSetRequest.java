package com.facebook.aura.commands.alarm;

import X.AnonymousClass002;

/* loaded from: classes3.dex */
public final class ReminderSetRequest {
    public final long anchorMs;
    public final String days;
    public final int hour;
    public final String label;
    public final int minute;
    public final Recurrence recurrence;
    public final String timezone;
    public final long triggerTimeMs;

    public ReminderSetRequest(int i, int i2, String str, String str2, long j, Recurrence recurrence, long j2, String str3) {
        AnonymousClass002.A1B(str, 2, str2);
        this.hour = i;
        this.minute = i2;
        this.label = str;
        this.days = str2;
        this.triggerTimeMs = j;
        this.recurrence = recurrence;
        this.anchorMs = j2;
        this.timezone = str3;
    }

    public final long getAnchorMs() {
        return this.anchorMs;
    }

    public final String getDays() {
        return this.days;
    }

    public final int getHour() {
        return this.hour;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final Recurrence getRecurrence() {
        return this.recurrence;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }
}
