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
import X.C3cI;
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
public final class CalendarDeltaPayloadJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<CalendarEventPayloadJson> added;
    public final String platform;
    public final List<CalendarEventPayloadJson> removed;
    public final String synced_at;
    public final List<CalendarEventPayloadJson> updated;

    public final class Companion {
        public final C9hr<CalendarDeltaPayloadJson> serializer() {
            return CalendarDeltaPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, CalendarDeltaPayloadJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CalendarDeltaPayloadJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, CalendarDeltaPayloadJson$Companion$$childSerializers$3.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarDeltaPayloadJson) {
                CalendarDeltaPayloadJson calendarDeltaPayloadJson = (CalendarDeltaPayloadJson) obj;
                if (!C7384Etj.areEqual(this.platform, calendarDeltaPayloadJson.platform) || !C7384Etj.areEqual(this.synced_at, calendarDeltaPayloadJson.synced_at) || !C7384Etj.areEqual(this.added, calendarDeltaPayloadJson.added) || !C7384Etj.areEqual(this.updated, calendarDeltaPayloadJson.updated) || !C7384Etj.areEqual(this.removed, calendarDeltaPayloadJson.removed)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarDeltaPayloadJson copy$default(CalendarDeltaPayloadJson calendarDeltaPayloadJson, String str, String str2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarDeltaPayloadJson.platform;
        }
        if ((i & 2) != 0) {
            str2 = calendarDeltaPayloadJson.synced_at;
        }
        if ((i & 4) != 0) {
            list = calendarDeltaPayloadJson.added;
        }
        if ((i & 8) != 0) {
            list2 = calendarDeltaPayloadJson.updated;
        }
        if ((i & 16) != 0) {
            list3 = calendarDeltaPayloadJson.removed;
        }
        return calendarDeltaPayloadJson.copy(str, str2, list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(CalendarDeltaPayloadJson calendarDeltaPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"android".equals(calendarDeltaPayloadJson.platform)) {
            c9j5.AAV(calendarDeltaPayloadJson.platform, c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(calendarDeltaPayloadJson.synced_at)) {
            c9j5.AAV(calendarDeltaPayloadJson.synced_at, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(calendarDeltaPayloadJson.added)) {
            c9j5.AAQ(calendarDeltaPayloadJson.added, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(calendarDeltaPayloadJson.updated)) {
            c9j5.AAQ(calendarDeltaPayloadJson.updated, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(calendarDeltaPayloadJson.removed)) {
            c9j5.AAQ(calendarDeltaPayloadJson.removed, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.platform;
    }

    public final String component2() {
        return this.synced_at;
    }

    public final List<CalendarEventPayloadJson> component3() {
        return this.added;
    }

    public final List<CalendarEventPayloadJson> component4() {
        return this.updated;
    }

    public final List<CalendarEventPayloadJson> component5() {
        return this.removed;
    }

    public final List<CalendarEventPayloadJson> getAdded() {
        return this.added;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final List<CalendarEventPayloadJson> getRemoved() {
        return this.removed;
    }

    public final String getSynced_at() {
        return this.synced_at;
    }

    public final List<CalendarEventPayloadJson> getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.removed, AnonymousClass005.A0F(this.updated, AnonymousClass005.A0F(this.added, AnonymousClass005.A0I(this.synced_at, AnonymousClass001.A0G(this.platform)))));
    }

    public CalendarDeltaPayloadJson(String str, String str2, List<CalendarEventPayloadJson> list, List<CalendarEventPayloadJson> list2, List<CalendarEventPayloadJson> list3) {
        AnonymousClass005.A17(str, str2, list, list2, list3);
        this.platform = str;
        this.synced_at = str2;
        this.added = list;
        this.updated = list2;
        this.removed = list3;
    }

    public final CalendarDeltaPayloadJson copy(String str, String str2, List<CalendarEventPayloadJson> list, List<CalendarEventPayloadJson> list2, List<CalendarEventPayloadJson> list3) {
        AnonymousClass005.A17(str, str2, list, list2, list3);
        return new CalendarDeltaPayloadJson(str, str2, list, list2, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CalendarDeltaPayloadJson(String str, String str2, List list, List list2, List list3, int i, C06H c06h) {
        this((i & 1) != 0 ? "android" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i), (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? C0881AGi.A00 : list3);
    }

    public /* synthetic */ CalendarDeltaPayloadJson(int i, String str, String str2, List list, List list2, List list3, C2hx c2hx) {
        this.platform = (i & 1) == 0 ? "android" : str;
        if ((i & 2) == 0) {
            this.synced_at = "";
        } else {
            this.synced_at = str2;
        }
        if ((i & 4) == 0) {
            this.added = C0881AGi.A00;
        } else {
            this.added = list;
        }
        if ((i & 8) == 0) {
            this.updated = C0881AGi.A00;
        } else {
            this.updated = list2;
        }
        if ((i & 16) == 0) {
            this.removed = C0881AGi.A00;
        } else {
            this.removed = list3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarDeltaPayloadJson() {
        this((String) null, (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 31, (C06H) (0 == true ? 1 : 0));
    }
}
