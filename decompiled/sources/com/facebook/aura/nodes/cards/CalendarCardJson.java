package com.facebook.aura.nodes.cards;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CalendarCardJson extends C06G {
    public static final int $stable = 8;
    public final String account_type;
    public final String action;
    public final Integer calendar_color;
    public final String calendar_name;
    public final List<CalendarCardEventJson> events;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, CalendarCardJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<CalendarCardJson> serializer() {
            return CalendarCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CalendarCardJson(String str, String str2, Integer num, String str3, List<CalendarCardEventJson> list) {
        AnonymousClass002.A1C(str, 0, list);
        this.action = str;
        this.calendar_name = str2;
        this.calendar_color = num;
        this.account_type = str3;
        this.events = list;
    }

    public final CalendarCardJson copy(String str, String str2, Integer num, String str3, List<CalendarCardEventJson> list) {
        AnonymousClass002.A1C(str, 0, list);
        return new CalendarCardJson(str, str2, num, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarCardJson) {
                CalendarCardJson calendarCardJson = (CalendarCardJson) obj;
                if (!C7384Etj.areEqual(this.action, calendarCardJson.action) || !C7384Etj.areEqual(this.calendar_name, calendarCardJson.calendar_name) || !C7384Etj.areEqual(this.calendar_color, calendarCardJson.calendar_color) || !C7384Etj.areEqual(this.account_type, calendarCardJson.account_type) || !C7384Etj.areEqual(this.events, calendarCardJson.events)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarCardJson copy$default(CalendarCardJson calendarCardJson, String str, String str2, Integer num, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calendarCardJson.action;
        }
        if ((i & 2) != 0) {
            str2 = calendarCardJson.calendar_name;
        }
        if ((i & 4) != 0) {
            num = calendarCardJson.calendar_color;
        }
        if ((i & 8) != 0) {
            str3 = calendarCardJson.account_type;
        }
        if ((i & 16) != 0) {
            list = calendarCardJson.events;
        }
        return calendarCardJson.copy(str, str2, num, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(CalendarCardJson calendarCardJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(calendarCardJson.action)) {
            c9j5.AAV(calendarCardJson.action, c9iZ, 0);
        }
        if (zAfR || calendarCardJson.calendar_name != null) {
            c9j5.AAP(calendarCardJson.calendar_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || calendarCardJson.calendar_color != null) {
            c9j5.AAP(calendarCardJson.calendar_color, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || calendarCardJson.account_type != null) {
            c9j5.AAP(calendarCardJson.account_type, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(calendarCardJson.events)) {
            c9j5.AAQ(calendarCardJson.events, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.calendar_name;
    }

    public final Integer component3() {
        return this.calendar_color;
    }

    public final String component4() {
        return this.account_type;
    }

    public final List<CalendarCardEventJson> component5() {
        return this.events;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getCalendar_color() {
        return this.calendar_color;
    }

    public final String getCalendar_name() {
        return this.calendar_name;
    }

    public final List<CalendarCardEventJson> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.events, (((((AnonymousClass001.A0G(this.action) + AnonymousClass006.A0G(this.calendar_name)) * 31) + AnonymousClass006.A0D(this.calendar_color)) * 31) + AnonymousClass005.A0H(this.account_type)) * 31);
    }

    public final CalendarCardData toDomain() {
        String strA0l;
        String strA0l2;
        String strA0J = C3cJ.A0J(this.action);
        if (strA0J.length() <= 0) {
            return null;
        }
        String str = this.calendar_name;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        Integer num = this.calendar_color;
        String str2 = this.account_type;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        List<CalendarCardEventJson> list = this.events;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<CalendarCardEventJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new CalendarCardData(strA0J, AGI.A07(arrayListA0i), strA0l, num, strA0l2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CalendarCardJson(String str, String str2, Integer num, String str3, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ CalendarCardJson(int i, String str, String str2, Integer num, String str3, List list, C2hx c2hx) {
        this.action = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.calendar_name = null;
        } else {
            this.calendar_name = str2;
        }
        if ((i & 4) == 0) {
            this.calendar_color = null;
        } else {
            this.calendar_color = num;
        }
        if ((i & 8) == 0) {
            this.account_type = null;
        } else {
            this.account_type = str3;
        }
        if ((i & 16) == 0) {
            this.events = C0881AGi.A00;
        } else {
            this.events = list;
        }
    }

    public CalendarCardJson() {
        this("", null, null, null, C0881AGi.A00);
    }
}
