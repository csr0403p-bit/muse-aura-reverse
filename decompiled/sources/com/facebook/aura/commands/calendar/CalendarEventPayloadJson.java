package com.facebook.aura.commands.calendar;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class CalendarEventPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String availability;
    public final String calendar_color;
    public final String calendar_id;
    public final String calendar_name;
    public final String end_date;
    public final String end_local;
    public final String end_local_date;
    public final String end_weekday;
    public final String event_id;
    public final boolean is_all_day;
    public final boolean is_recurring;
    public final String location;
    public final String notes;
    public final String occurrence_date;
    public final String start_date;
    public final String start_local;
    public final String start_local_date;
    public final String start_weekday;
    public final String status;
    public final String time_zone;
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<CalendarEventPayloadJson> serializer() {
            return CalendarEventPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(CalendarEventPayloadJson calendarEventPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(calendarEventPayloadJson.event_id)) {
            c9j5.AAV(calendarEventPayloadJson.event_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(calendarEventPayloadJson.title)) {
            c9j5.AAV(calendarEventPayloadJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(calendarEventPayloadJson.start_date)) {
            c9j5.AAV(calendarEventPayloadJson.start_date, c9iZ, 2);
        }
        if (zAfR || !"".equals(calendarEventPayloadJson.end_date)) {
            c9j5.AAV(calendarEventPayloadJson.end_date, c9iZ, 3);
        }
        if (zAfR || calendarEventPayloadJson.is_all_day) {
            c9j5.AA7(c9iZ, 4, calendarEventPayloadJson.is_all_day);
        }
        if (zAfR || !"".equals(calendarEventPayloadJson.calendar_name)) {
            c9j5.AAV(calendarEventPayloadJson.calendar_name, c9iZ, 5);
        }
        if (zAfR || !"".equals(calendarEventPayloadJson.calendar_id)) {
            c9j5.AAV(calendarEventPayloadJson.calendar_id, c9iZ, 6);
        }
        if (zAfR || !"unknown".equals(calendarEventPayloadJson.availability)) {
            c9j5.AAV(calendarEventPayloadJson.availability, c9iZ, 7);
        }
        if (zAfR || calendarEventPayloadJson.location != null) {
            c9j5.AAP(calendarEventPayloadJson.location, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || calendarEventPayloadJson.notes != null) {
            c9j5.AAP(calendarEventPayloadJson.notes, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || calendarEventPayloadJson.time_zone != null) {
            c9j5.AAP(calendarEventPayloadJson.time_zone, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || calendarEventPayloadJson.start_local_date != null) {
            c9j5.AAP(calendarEventPayloadJson.start_local_date, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || calendarEventPayloadJson.end_local_date != null) {
            c9j5.AAP(calendarEventPayloadJson.end_local_date, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || calendarEventPayloadJson.start_local != null) {
            c9j5.AAP(calendarEventPayloadJson.start_local, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || calendarEventPayloadJson.end_local != null) {
            c9j5.AAP(calendarEventPayloadJson.end_local, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || calendarEventPayloadJson.start_weekday != null) {
            c9j5.AAP(calendarEventPayloadJson.start_weekday, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || calendarEventPayloadJson.end_weekday != null) {
            c9j5.AAP(calendarEventPayloadJson.end_weekday, C07779iq.A01, c9iZ, 16);
        }
        if (zAfR || calendarEventPayloadJson.is_recurring) {
            c9j5.AA7(c9iZ, 17, calendarEventPayloadJson.is_recurring);
        }
        if (zAfR || calendarEventPayloadJson.occurrence_date != null) {
            c9j5.AAP(calendarEventPayloadJson.occurrence_date, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || calendarEventPayloadJson.url != null) {
            c9j5.AAP(calendarEventPayloadJson.url, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || !"none".equals(calendarEventPayloadJson.status)) {
            c9j5.AAV(calendarEventPayloadJson.status, c9iZ, 20);
        }
        if (zAfR || calendarEventPayloadJson.calendar_color != null) {
            c9j5.AAP(calendarEventPayloadJson.calendar_color, C07779iq.A01, c9iZ, 21);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarEventPayloadJson) {
                CalendarEventPayloadJson calendarEventPayloadJson = (CalendarEventPayloadJson) obj;
                if (!C7384Etj.areEqual(this.event_id, calendarEventPayloadJson.event_id) || !C7384Etj.areEqual(this.title, calendarEventPayloadJson.title) || !C7384Etj.areEqual(this.start_date, calendarEventPayloadJson.start_date) || !C7384Etj.areEqual(this.end_date, calendarEventPayloadJson.end_date) || this.is_all_day != calendarEventPayloadJson.is_all_day || !C7384Etj.areEqual(this.calendar_name, calendarEventPayloadJson.calendar_name) || !C7384Etj.areEqual(this.calendar_id, calendarEventPayloadJson.calendar_id) || !C7384Etj.areEqual(this.availability, calendarEventPayloadJson.availability) || !C7384Etj.areEqual(this.location, calendarEventPayloadJson.location) || !C7384Etj.areEqual(this.notes, calendarEventPayloadJson.notes) || !C7384Etj.areEqual(this.time_zone, calendarEventPayloadJson.time_zone) || !C7384Etj.areEqual(this.start_local_date, calendarEventPayloadJson.start_local_date) || !C7384Etj.areEqual(this.end_local_date, calendarEventPayloadJson.end_local_date) || !C7384Etj.areEqual(this.start_local, calendarEventPayloadJson.start_local) || !C7384Etj.areEqual(this.end_local, calendarEventPayloadJson.end_local) || !C7384Etj.areEqual(this.start_weekday, calendarEventPayloadJson.start_weekday) || !C7384Etj.areEqual(this.end_weekday, calendarEventPayloadJson.end_weekday) || this.is_recurring != calendarEventPayloadJson.is_recurring || !C7384Etj.areEqual(this.occurrence_date, calendarEventPayloadJson.occurrence_date) || !C7384Etj.areEqual(this.url, calendarEventPayloadJson.url) || !C7384Etj.areEqual(this.status, calendarEventPayloadJson.status) || !C7384Etj.areEqual(this.calendar_color, calendarEventPayloadJson.calendar_color)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.event_id;
    }

    public final String component10() {
        return this.notes;
    }

    public final String component11() {
        return this.time_zone;
    }

    public final String component12() {
        return this.start_local_date;
    }

    public final String component13() {
        return this.end_local_date;
    }

    public final String component14() {
        return this.start_local;
    }

    public final String component15() {
        return this.end_local;
    }

    public final String component16() {
        return this.start_weekday;
    }

    public final String component17() {
        return this.end_weekday;
    }

    public final boolean component18() {
        return this.is_recurring;
    }

    public final String component19() {
        return this.occurrence_date;
    }

    public final String component2() {
        return this.title;
    }

    public final String component20() {
        return this.url;
    }

    public final String component21() {
        return this.status;
    }

    public final String component22() {
        return this.calendar_color;
    }

    public final String component3() {
        return this.start_date;
    }

    public final String component4() {
        return this.end_date;
    }

    public final boolean component5() {
        return this.is_all_day;
    }

    public final String component6() {
        return this.calendar_name;
    }

    public final String component7() {
        return this.calendar_id;
    }

    public final String component8() {
        return this.availability;
    }

    public final String component9() {
        return this.location;
    }

    public final String getAvailability() {
        return this.availability;
    }

    public final String getCalendar_color() {
        return this.calendar_color;
    }

    public final String getCalendar_id() {
        return this.calendar_id;
    }

    public final String getCalendar_name() {
        return this.calendar_name;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    public final String getEnd_local() {
        return this.end_local;
    }

    public final String getEnd_local_date() {
        return this.end_local_date;
    }

    public final String getEnd_weekday() {
        return this.end_weekday;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getOccurrence_date() {
        return this.occurrence_date;
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getStart_local() {
        return this.start_local;
    }

    public final String getStart_local_date() {
        return this.start_local_date;
    }

    public final String getStart_weekday() {
        return this.start_weekday;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTime_zone() {
        return this.time_zone;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.status, (((C0KA.A01((((((((((((((((((AnonymousClass005.A0I(this.availability, AnonymousClass005.A0I(this.calendar_id, AnonymousClass005.A0I(this.calendar_name, C0KA.A01(AnonymousClass005.A0I(this.end_date, AnonymousClass005.A0I(this.start_date, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.event_id)))), this.is_all_day)))) + AnonymousClass006.A0G(this.location)) * 31) + AnonymousClass006.A0G(this.notes)) * 31) + AnonymousClass006.A0G(this.time_zone)) * 31) + AnonymousClass006.A0G(this.start_local_date)) * 31) + AnonymousClass006.A0G(this.end_local_date)) * 31) + AnonymousClass006.A0G(this.start_local)) * 31) + AnonymousClass006.A0G(this.end_local)) * 31) + AnonymousClass006.A0G(this.start_weekday)) * 31) + AnonymousClass006.A0G(this.end_weekday)) * 31, this.is_recurring) + AnonymousClass006.A0G(this.occurrence_date)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass005.A0H(this.calendar_color);
    }

    public final boolean is_all_day() {
        return this.is_all_day;
    }

    public final boolean is_recurring() {
        return this.is_recurring;
    }

    public final CalendarEventPayloadJson copy(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass005.A0z(str5, str6, str7);
        C7384Etj.A0Y(str19, 20);
        return new CalendarEventPayloadJson(str, str2, str3, str4, z, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, z2, str17, str18, str19, str20);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CalendarEventPayloadJson(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20, C2hx c2hx) {
        String str21 = str19;
        if ((i & 1) == 0) {
            this.event_id = "";
        } else {
            this.event_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.start_date = "";
        } else {
            this.start_date = str3;
        }
        if ((i & 8) == 0) {
            this.end_date = "";
        } else {
            this.end_date = str4;
        }
        if ((i & 16) == 0) {
            this.is_all_day = false;
        } else {
            this.is_all_day = z;
        }
        if ((i & 32) == 0) {
            this.calendar_name = "";
        } else {
            this.calendar_name = str5;
        }
        if ((i & 64) == 0) {
            this.calendar_id = "";
        } else {
            this.calendar_id = str6;
        }
        if ((i & 128) == 0) {
            this.availability = "unknown";
        } else {
            this.availability = str7;
        }
        if ((i & 256) == 0) {
            this.location = null;
        } else {
            this.location = str8;
        }
        if ((i & 512) == 0) {
            this.notes = null;
        } else {
            this.notes = str9;
        }
        if ((i & 1024) == 0) {
            this.time_zone = null;
        } else {
            this.time_zone = str10;
        }
        if ((i & 2048) == 0) {
            this.start_local_date = null;
        } else {
            this.start_local_date = str11;
        }
        if ((i & 4096) == 0) {
            this.end_local_date = null;
        } else {
            this.end_local_date = str12;
        }
        if ((i & 8192) == 0) {
            this.start_local = null;
        } else {
            this.start_local = str13;
        }
        if ((i & 16384) == 0) {
            this.end_local = null;
        } else {
            this.end_local = str14;
        }
        if ((32768 & i) == 0) {
            this.start_weekday = null;
        } else {
            this.start_weekday = str15;
        }
        if ((65536 & i) == 0) {
            this.end_weekday = null;
        } else {
            this.end_weekday = str16;
        }
        if ((131072 & i) == 0) {
            this.is_recurring = false;
        } else {
            this.is_recurring = z2;
        }
        if ((262144 & i) == 0) {
            this.occurrence_date = null;
        } else {
            this.occurrence_date = str17;
        }
        if ((524288 & i) == 0) {
            this.url = null;
        } else {
            this.url = str18;
        }
        this.status = (1048576 & i) == 0 ? "none" : str21;
        if ((i & 2097152) == 0) {
            this.calendar_color = null;
        } else {
            this.calendar_color = str20;
        }
    }

    public static /* synthetic */ CalendarEventPayloadJson copy$default(CalendarEventPayloadJson calendarEventPayloadJson, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20, int i, Object obj) {
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str4;
        boolean z3 = z;
        String str25 = str5;
        String str26 = str6;
        String str27 = str7;
        String str28 = str8;
        String str29 = str9;
        String str30 = str10;
        String str31 = str11;
        String str32 = str12;
        String str33 = str13;
        String str34 = str14;
        String str35 = str15;
        String str36 = str16;
        boolean z4 = z2;
        String str37 = str17;
        String str38 = str18;
        String str39 = str19;
        String str40 = str20;
        if ((i & 1) != 0) {
            str21 = calendarEventPayloadJson.event_id;
        }
        if ((i & 2) != 0) {
            str22 = calendarEventPayloadJson.title;
        }
        if ((i & 4) != 0) {
            str23 = calendarEventPayloadJson.start_date;
        }
        if ((i & 8) != 0) {
            str24 = calendarEventPayloadJson.end_date;
        }
        if ((i & 16) != 0) {
            z3 = calendarEventPayloadJson.is_all_day;
        }
        if ((i & 32) != 0) {
            str25 = calendarEventPayloadJson.calendar_name;
        }
        if ((i & 64) != 0) {
            str26 = calendarEventPayloadJson.calendar_id;
        }
        if ((i & 128) != 0) {
            str27 = calendarEventPayloadJson.availability;
        }
        if ((i & 256) != 0) {
            str28 = calendarEventPayloadJson.location;
        }
        if ((i & 512) != 0) {
            str29 = calendarEventPayloadJson.notes;
        }
        if ((i & 1024) != 0) {
            str30 = calendarEventPayloadJson.time_zone;
        }
        if ((i & 2048) != 0) {
            str31 = calendarEventPayloadJson.start_local_date;
        }
        if ((i & 4096) != 0) {
            str32 = calendarEventPayloadJson.end_local_date;
        }
        if ((i & 8192) != 0) {
            str33 = calendarEventPayloadJson.start_local;
        }
        if ((i & 16384) != 0) {
            str34 = calendarEventPayloadJson.end_local;
        }
        if ((i & 32768) != 0) {
            str35 = calendarEventPayloadJson.start_weekday;
        }
        if ((i & 65536) != 0) {
            str36 = calendarEventPayloadJson.end_weekday;
        }
        if ((i & 131072) != 0) {
            z4 = calendarEventPayloadJson.is_recurring;
        }
        if ((i & 262144) != 0) {
            str37 = calendarEventPayloadJson.occurrence_date;
        }
        if ((i & 524288) != 0) {
            str38 = calendarEventPayloadJson.url;
        }
        if ((i & 1048576) != 0) {
            str39 = calendarEventPayloadJson.status;
        }
        if ((i & 2097152) != 0) {
            str40 = calendarEventPayloadJson.calendar_color;
        }
        String str41 = str29;
        String str42 = str30;
        String str43 = str31;
        String str44 = str32;
        return calendarEventPayloadJson.copy(str21, str22, str23, str24, z3, str25, str26, str27, str28, str41, str42, str43, str44, str33, str34, str35, str36, z4, str37, str38, str39, str40);
    }

    public /* synthetic */ CalendarEventPayloadJson(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, C3cI.A1S(i, z), (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? "unknown" : str7, C3cG.A0e(str8, i & 256), C3cG.A0e(str9, i & 512), C3cG.A0e(str10, i & 1024), C3cG.A0e(str11, i & 2048), C3cG.A0e(str12, i & 4096), C3cG.A0e(str13, i & 8192), C3cG.A0e(str14, i & 16384), C3cI.A0V(i, 32768, str15), C3cI.A0V(i, 65536, str16), C3cH.A1L(i, 131072, z2), C3cI.A0V(i, 262144, str17), C3cI.A0V(i, 524288, str18), (i & 1048576) != 0 ? "none" : str19, C3cI.A0V(i, 2097152, str20));
    }

    public CalendarEventPayloadJson(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2, String str17, String str18, String str19, String str20) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass005.A0z(str5, str6, str7);
        C7384Etj.A0Y(str19, 20);
        this.event_id = str;
        this.title = str2;
        this.start_date = str3;
        this.end_date = str4;
        this.is_all_day = z;
        this.calendar_name = str5;
        this.calendar_id = str6;
        this.availability = str7;
        this.location = str8;
        this.notes = str9;
        this.time_zone = str10;
        this.start_local_date = str11;
        this.end_local_date = str12;
        this.start_local = str13;
        this.end_local = str14;
        this.start_weekday = str15;
        this.end_weekday = str16;
        this.is_recurring = z2;
        this.occurrence_date = str17;
        this.url = str18;
        this.status = str19;
        this.calendar_color = str20;
    }

    public CalendarEventPayloadJson() {
        this("", "", "", "", false, "", "", "unknown", null, null, null, null, null, null, null, null, null, false, null, null, "none", null);
    }
}
