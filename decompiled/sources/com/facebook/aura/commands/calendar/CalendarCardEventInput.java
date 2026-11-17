package com.facebook.aura.commands.calendar;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes3.dex */
public final class CalendarCardEventInput {
    public final boolean allDay;
    public final Long endMillis;
    public final Long eventId;
    public final String location;
    public final Long startMillis;
    public final String title;

    public final boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndMillis() {
        return this.endMillis;
    }

    public final Long getEventId() {
        return this.eventId;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Long getStartMillis() {
        return this.startMillis;
    }

    public final String getTitle() {
        return this.title;
    }

    public CalendarCardEventInput(Long l, String str, Long l2, Long l3, boolean z, String str2) {
        this.eventId = l;
        this.title = str;
        this.startMillis = l2;
        this.endMillis = l3;
        this.allDay = z;
        this.location = str2;
    }

    public /* synthetic */ CalendarCardEventInput(Long l, String str, Long l2, Long l3, boolean z, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str2);
    }

    public CalendarCardEventInput() {
        this(null, null, null, null, false, null);
    }
}
