package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CalendarCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String accountType;
    public final String action;
    public final Integer calendarColor;
    public final String calendarName;
    public final AHD<CalendarCardEvent> events;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarCardData) {
                CalendarCardData calendarCardData = (CalendarCardData) obj;
                if (!C7384Etj.areEqual(this.action, calendarCardData.action) || !C7384Etj.areEqual(this.events, calendarCardData.events) || !C7384Etj.areEqual(this.calendarName, calendarCardData.calendarName) || !C7384Etj.areEqual(this.calendarColor, calendarCardData.calendarColor) || !C7384Etj.areEqual(this.accountType, calendarCardData.accountType)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarCardData copy$default(CalendarCardData calendarCardData, String str, AHD ahd, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarCardData.action;
        }
        if ((i & 2) != 0) {
            ahd = calendarCardData.events;
        }
        if ((i & 4) != 0) {
            str2 = calendarCardData.calendarName;
        }
        if ((i & 8) != 0) {
            num = calendarCardData.calendarColor;
        }
        if ((i & 16) != 0) {
            str3 = calendarCardData.accountType;
        }
        return calendarCardData.copy(str, ahd, str2, num, str3);
    }

    public final String component1() {
        return this.action;
    }

    public final AHD<CalendarCardEvent> component2() {
        return this.events;
    }

    public final String component3() {
        return this.calendarName;
    }

    public final Integer component4() {
        return this.calendarColor;
    }

    public final String component5() {
        return this.accountType;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getCalendarColor() {
        return this.calendarColor;
    }

    public final String getCalendarName() {
        return this.calendarName;
    }

    public final AHD<CalendarCardEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.events, AnonymousClass001.A0G(this.action)) + AnonymousClass006.A0G(this.calendarName)) * 31) + AnonymousClass006.A0D(this.calendarColor)) * 31) + AnonymousClass005.A0H(this.accountType);
    }

    public CalendarCardData(String str, AHD<CalendarCardEvent> ahd, String str2, Integer num, String str3) {
        AnonymousClass003.A0u(str, ahd);
        this.action = str;
        this.events = ahd;
        this.calendarName = str2;
        this.calendarColor = num;
        this.accountType = str3;
    }

    public final CalendarCardData copy(String str, AHD<CalendarCardEvent> ahd, String str2, Integer num, String str3) {
        AnonymousClass003.A0u(str, ahd);
        return new CalendarCardData(str, ahd, str2, num, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CalendarCardData(String str, AHD ahd, String str2, Integer num, String str3, int i, C06H c06h) {
        this(str, ahd, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3);
    }
}
