package com.facebook.aura.nodes.cards;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ReminderCardItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer hour;
    public final String label;
    public final Integer minute;
    public final Long trigger_time_ms;

    public final class Companion {
        public final C9hr<ReminderCardItemJson> serializer() {
            return ReminderCardItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(ReminderCardItemJson reminderCardItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || reminderCardItemJson.label != null) {
            c9j5.AAP(reminderCardItemJson.label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || reminderCardItemJson.hour != null) {
            c9j5.AAP(reminderCardItemJson.hour, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || reminderCardItemJson.minute != null) {
            c9j5.AAP(reminderCardItemJson.minute, C07729ii.A00, c9iZ, 2);
        }
        if (zAfR || reminderCardItemJson.trigger_time_ms != null) {
            c9j5.AAP(reminderCardItemJson.trigger_time_ms, C9j1.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReminderCardItemJson) {
                ReminderCardItemJson reminderCardItemJson = (ReminderCardItemJson) obj;
                if (!C7384Etj.areEqual(this.label, reminderCardItemJson.label) || !C7384Etj.areEqual(this.hour, reminderCardItemJson.hour) || !C7384Etj.areEqual(this.minute, reminderCardItemJson.minute) || !C7384Etj.areEqual(this.trigger_time_ms, reminderCardItemJson.trigger_time_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReminderCardItemJson copy$default(ReminderCardItemJson reminderCardItemJson, String str, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderCardItemJson.label;
        }
        if ((i & 2) != 0) {
            num = reminderCardItemJson.hour;
        }
        if ((i & 4) != 0) {
            num2 = reminderCardItemJson.minute;
        }
        if ((i & 8) != 0) {
            l = reminderCardItemJson.trigger_time_ms;
        }
        return new ReminderCardItemJson(str, num, num2, l);
    }

    public final String component1() {
        return this.label;
    }

    public final Integer component2() {
        return this.hour;
    }

    public final Integer component3() {
        return this.minute;
    }

    public final Long component4() {
        return this.trigger_time_ms;
    }

    public final ReminderCardItemJson copy(String str, Integer num, Integer num2, Long l) {
        return new ReminderCardItemJson(str, num, num2, l);
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

    public final Long getTrigger_time_ms() {
        return this.trigger_time_ms;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.label) * 31) + AnonymousClass006.A0D(this.hour)) * 31) + AnonymousClass006.A0D(this.minute)) * 31) + C3cH.A02(this.trigger_time_ms);
    }

    public final ReminderCardItem toDomain() {
        String strA0l;
        String str = this.label;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        return new ReminderCardItem(str2, this.hour, this.minute, this.trigger_time_ms);
    }

    public ReminderCardItemJson(String str, Integer num, Integer num2, Long l) {
        this.label = str;
        this.hour = num;
        this.minute = num2;
        this.trigger_time_ms = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReminderCardItemJson(int i, String str, Integer num, Integer num2, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.hour = null;
        } else {
            this.hour = num;
        }
        if ((i & 4) == 0) {
            this.minute = null;
        } else {
            this.minute = num2;
        }
        if ((i & 8) == 0) {
            this.trigger_time_ms = null;
        } else {
            this.trigger_time_ms = l;
        }
    }

    public /* synthetic */ ReminderCardItemJson(String str, Integer num, Integer num2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l);
    }

    public ReminderCardItemJson() {
        this(null, null, null, null);
    }
}
