package com.facebook.aura.commands.calendar;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class CalendarFullSnapshotPayloadJson extends C06G {
    public final List<CalendarEventPayloadJson> events;
    public final String platform;
    public final String synced_at;
    public final String window_end;
    public final String window_start;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, CalendarFullSnapshotPayloadJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<CalendarFullSnapshotPayloadJson> serializer() {
            return CalendarFullSnapshotPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarFullSnapshotPayloadJson) {
                CalendarFullSnapshotPayloadJson calendarFullSnapshotPayloadJson = (CalendarFullSnapshotPayloadJson) obj;
                if (!C7384Etj.areEqual(this.platform, calendarFullSnapshotPayloadJson.platform) || !C7384Etj.areEqual(this.synced_at, calendarFullSnapshotPayloadJson.synced_at) || !C7384Etj.areEqual(this.window_start, calendarFullSnapshotPayloadJson.window_start) || !C7384Etj.areEqual(this.window_end, calendarFullSnapshotPayloadJson.window_end) || !C7384Etj.areEqual(this.events, calendarFullSnapshotPayloadJson.events)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarFullSnapshotPayloadJson copy$default(CalendarFullSnapshotPayloadJson calendarFullSnapshotPayloadJson, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarFullSnapshotPayloadJson.platform;
        }
        if ((i & 2) != 0) {
            str2 = calendarFullSnapshotPayloadJson.synced_at;
        }
        if ((i & 4) != 0) {
            str3 = calendarFullSnapshotPayloadJson.window_start;
        }
        if ((i & 8) != 0) {
            str4 = calendarFullSnapshotPayloadJson.window_end;
        }
        if ((i & 16) != 0) {
            list = calendarFullSnapshotPayloadJson.events;
        }
        return calendarFullSnapshotPayloadJson.copy(str, str2, str3, str4, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(CalendarFullSnapshotPayloadJson calendarFullSnapshotPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"android".equals(calendarFullSnapshotPayloadJson.platform)) {
            c9j5.AAV(calendarFullSnapshotPayloadJson.platform, c9iZ, 0);
        }
        if (zAfR || !"".equals(calendarFullSnapshotPayloadJson.synced_at)) {
            c9j5.AAV(calendarFullSnapshotPayloadJson.synced_at, c9iZ, 1);
        }
        if (zAfR || !"".equals(calendarFullSnapshotPayloadJson.window_start)) {
            c9j5.AAV(calendarFullSnapshotPayloadJson.window_start, c9iZ, 2);
        }
        if (zAfR || !"".equals(calendarFullSnapshotPayloadJson.window_end)) {
            c9j5.AAV(calendarFullSnapshotPayloadJson.window_end, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(calendarFullSnapshotPayloadJson.events)) {
            c9j5.AAQ(calendarFullSnapshotPayloadJson.events, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.synced_at;
    }

    public final String component3() {
        return this.window_start;
    }

    public final String component4() {
        return this.window_end;
    }

    public final List<CalendarEventPayloadJson> component5() {
        return this.events;
    }

    public final List<CalendarEventPayloadJson> getEvents() {
        return this.events;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSynced_at() {
        return this.synced_at;
    }

    public final String getWindow_end() {
        return this.window_end;
    }

    public final String getWindow_start() {
        return this.window_start;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.events, AnonymousClass005.A0I(this.window_end, AnonymousClass005.A0I(this.window_start, AnonymousClass005.A0I(this.synced_at, AnonymousClass001.A0G(this.platform)))));
    }

    public CalendarFullSnapshotPayloadJson(String str, String str2, String str3, String str4, List<CalendarEventPayloadJson> list) {
        AnonymousClass005.A17(str, str2, str3, str4, list);
        this.platform = str;
        this.synced_at = str2;
        this.window_start = str3;
        this.window_end = str4;
        this.events = list;
    }

    public final CalendarFullSnapshotPayloadJson copy(String str, String str2, String str3, String str4, List<CalendarEventPayloadJson> list) {
        AnonymousClass005.A17(str, str2, str3, str4, list);
        return new CalendarFullSnapshotPayloadJson(str, str2, str3, str4, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CalendarFullSnapshotPayloadJson(String str, String str2, String str3, String str4, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "android" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ CalendarFullSnapshotPayloadJson(int i, String str, String str2, String str3, String str4, List list, C2hx c2hx) {
        this.platform = (i & 1) == 0 ? "android" : str;
        if ((i & 2) == 0) {
            this.synced_at = "";
        } else {
            this.synced_at = str2;
        }
        if ((i & 4) == 0) {
            this.window_start = "";
        } else {
            this.window_start = str3;
        }
        if ((i & 8) == 0) {
            this.window_end = "";
        } else {
            this.window_end = str4;
        }
        if ((i & 16) == 0) {
            this.events = C0881AGi.A00;
        } else {
            this.events = list;
        }
    }

    public CalendarFullSnapshotPayloadJson() {
        this("android", "", "", "", C0881AGi.A00);
    }
}
