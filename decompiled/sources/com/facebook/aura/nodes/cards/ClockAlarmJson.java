package com.facebook.aura.nodes.cards;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ClockAlarmJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer hour;
    public final String label;
    public final Integer minute;

    public final class Companion {
        public final C9hr<ClockAlarmJson> serializer() {
            return ClockAlarmJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(ClockAlarmJson clockAlarmJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || clockAlarmJson.hour != null) {
            c9j5.AAP(clockAlarmJson.hour, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || clockAlarmJson.minute != null) {
            c9j5.AAP(clockAlarmJson.minute, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || clockAlarmJson.label != null) {
            c9j5.AAP(clockAlarmJson.label, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClockAlarmJson) {
                ClockAlarmJson clockAlarmJson = (ClockAlarmJson) obj;
                if (!C7384Etj.areEqual(this.hour, clockAlarmJson.hour) || !C7384Etj.areEqual(this.minute, clockAlarmJson.minute) || !C7384Etj.areEqual(this.label, clockAlarmJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClockAlarmJson copy$default(ClockAlarmJson clockAlarmJson, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = clockAlarmJson.hour;
        }
        if ((i & 2) != 0) {
            num2 = clockAlarmJson.minute;
        }
        if ((i & 4) != 0) {
            str = clockAlarmJson.label;
        }
        return new ClockAlarmJson(num, num2, str);
    }

    public final Integer component1() {
        return this.hour;
    }

    public final Integer component2() {
        return this.minute;
    }

    public final String component3() {
        return this.label;
    }

    public final ClockAlarmJson copy(Integer num, Integer num2, String str) {
        return new ClockAlarmJson(num, num2, str);
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

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.hour) * 31) + AnonymousClass006.A0D(this.minute)) * 31) + AnonymousClass005.A0H(this.label);
    }

    public final ClockAlarm toDomain() {
        String strA0l;
        Integer num = this.hour;
        Integer num2 = this.minute;
        String str = this.label;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        return new ClockAlarm(num, num2, str2);
    }

    public ClockAlarmJson(Integer num, Integer num2, String str) {
        this.hour = num;
        this.minute = num2;
        this.label = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ClockAlarmJson(int i, Integer num, Integer num2, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.hour = null;
        } else {
            this.hour = num;
        }
        if ((i & 2) == 0) {
            this.minute = null;
        } else {
            this.minute = num2;
        }
        if ((i & 4) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
    }

    public /* synthetic */ ClockAlarmJson(Integer num, Integer num2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }

    public ClockAlarmJson() {
        this(null, null, null);
    }
}
