package com.facebook.aura.nodes.cards;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CalendarCardEventJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean all_day;
    public final Long end_time;
    public final Long event_id;
    public final String location;
    public final Long start_time;
    public final String title;

    public final class Companion {
        public final C9hr<CalendarCardEventJson> serializer() {
            return CalendarCardEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CalendarCardEventJson() {
        this(null, null, null, null, false, null);
    }

    public static /* synthetic */ CalendarCardEventJson copy$default(CalendarCardEventJson calendarCardEventJson, Long l, String str, Long l2, Long l3, boolean z, String str2, int i, Object obj) {
        Long l4 = l;
        String str3 = str;
        Long l5 = l2;
        Long l6 = l3;
        boolean z2 = z;
        String str4 = str2;
        if ((i & 1) != 0) {
            l4 = calendarCardEventJson.event_id;
        }
        if ((i & 2) != 0) {
            str3 = calendarCardEventJson.title;
        }
        if ((i & 4) != 0) {
            l5 = calendarCardEventJson.start_time;
        }
        if ((i & 8) != 0) {
            l6 = calendarCardEventJson.end_time;
        }
        if ((i & 16) != 0) {
            z2 = calendarCardEventJson.all_day;
        }
        if ((i & 32) != 0) {
            str4 = calendarCardEventJson.location;
        }
        return new CalendarCardEventJson(l4, str3, l5, l6, z2, str4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(CalendarCardEventJson calendarCardEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || calendarCardEventJson.event_id != null) {
            c9j5.AAP(calendarCardEventJson.event_id, C9j1.A00, c9iZ, 0);
        }
        if (zAfR || calendarCardEventJson.title != null) {
            c9j5.AAP(calendarCardEventJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || calendarCardEventJson.start_time != null) {
            c9j5.AAP(calendarCardEventJson.start_time, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || calendarCardEventJson.end_time != null) {
            c9j5.AAP(calendarCardEventJson.end_time, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || calendarCardEventJson.all_day) {
            c9j5.AA7(c9iZ, 4, calendarCardEventJson.all_day);
        }
        if (zAfR || calendarCardEventJson.location != null) {
            c9j5.AAP(calendarCardEventJson.location, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarCardEventJson) {
                CalendarCardEventJson calendarCardEventJson = (CalendarCardEventJson) obj;
                if (!C7384Etj.areEqual(this.event_id, calendarCardEventJson.event_id) || !C7384Etj.areEqual(this.title, calendarCardEventJson.title) || !C7384Etj.areEqual(this.start_time, calendarCardEventJson.start_time) || !C7384Etj.areEqual(this.end_time, calendarCardEventJson.end_time) || this.all_day != calendarCardEventJson.all_day || !C7384Etj.areEqual(this.location, calendarCardEventJson.location)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Long component1() {
        return this.event_id;
    }

    public final String component2() {
        return this.title;
    }

    public final Long component3() {
        return this.start_time;
    }

    public final Long component4() {
        return this.end_time;
    }

    public final boolean component5() {
        return this.all_day;
    }

    public final String component6() {
        return this.location;
    }

    public final CalendarCardEventJson copy(Long l, String str, Long l2, Long l3, boolean z, String str2) {
        return new CalendarCardEventJson(l, str, l2, l3, z, str2);
    }

    public final boolean getAll_day() {
        return this.all_day;
    }

    public final Long getEnd_time() {
        return this.end_time;
    }

    public final Long getEvent_id() {
        return this.event_id;
    }

    public final String getLocation() {
        return this.location;
    }

    public final Long getStart_time() {
        return this.start_time;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A01(((((((AnonymousClass006.A0D(this.event_id) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0D(this.start_time)) * 31) + AnonymousClass006.A0D(this.end_time)) * 31, this.all_day) + AnonymousClass005.A0H(this.location);
    }

    public final CalendarCardEvent toDomain() {
        String strA0l;
        String strA0l2;
        Long l = this.event_id;
        String str = this.title;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        Long l2 = this.start_time;
        Long l3 = this.end_time;
        boolean z = this.all_day;
        String str2 = this.location;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        return new CalendarCardEvent(l, strA0l, l2, l3, z, strA0l2);
    }

    public String toString() {
        return super.toString();
    }

    public CalendarCardEventJson(Long l, String str, Long l2, Long l3, boolean z, String str2) {
        this.event_id = l;
        this.title = str;
        this.start_time = l2;
        this.end_time = l3;
        this.all_day = z;
        this.location = str2;
    }

    public /* synthetic */ CalendarCardEventJson(Long l, String str, Long l2, Long l3, boolean z, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : str2);
    }

    public /* synthetic */ CalendarCardEventJson(int i, Long l, String str, Long l2, Long l3, boolean z, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.event_id = null;
        } else {
            this.event_id = l;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.start_time = null;
        } else {
            this.start_time = l2;
        }
        if ((i & 8) == 0) {
            this.end_time = null;
        } else {
            this.end_time = l3;
        }
        if ((i & 16) == 0) {
            this.all_day = false;
        } else {
            this.all_day = z;
        }
        if ((i & 32) == 0) {
            this.location = null;
        } else {
            this.location = str2;
        }
    }
}
