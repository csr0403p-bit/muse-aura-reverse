package com.facebook.aura.nodes.cards;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ReminderCardItem extends C06G {
    public static final int $stable = 0;
    public final Integer hour;
    public final String label;
    public final Integer minute;
    public final Long triggerTimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReminderCardItem) {
                ReminderCardItem reminderCardItem = (ReminderCardItem) obj;
                if (!C7384Etj.areEqual(this.label, reminderCardItem.label) || !C7384Etj.areEqual(this.hour, reminderCardItem.hour) || !C7384Etj.areEqual(this.minute, reminderCardItem.minute) || !C7384Etj.areEqual(this.triggerTimeMs, reminderCardItem.triggerTimeMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReminderCardItem copy$default(ReminderCardItem reminderCardItem, String str, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderCardItem.label;
        }
        if ((i & 2) != 0) {
            num = reminderCardItem.hour;
        }
        if ((i & 4) != 0) {
            num2 = reminderCardItem.minute;
        }
        if ((i & 8) != 0) {
            l = reminderCardItem.triggerTimeMs;
        }
        return new ReminderCardItem(str, num, num2, l);
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
        return this.triggerTimeMs;
    }

    public final ReminderCardItem copy(String str, Integer num, Integer num2, Long l) {
        return new ReminderCardItem(str, num, num2, l);
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

    public final Long getTriggerTimeMs() {
        return this.triggerTimeMs;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.label) * 31) + AnonymousClass006.A0D(this.hour)) * 31) + AnonymousClass006.A0D(this.minute)) * 31) + C3cH.A02(this.triggerTimeMs);
    }

    public ReminderCardItem(String str, Integer num, Integer num2, Long l) {
        this.label = str;
        this.hour = num;
        this.minute = num2;
        this.triggerTimeMs = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReminderCardItem(String str, Integer num, Integer num2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : l);
    }

    public ReminderCardItem() {
        this(null, null, null, null);
    }
}
