package com.facebook.aura.nodes.cards;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ReminderCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String action;
    public final AHD<ReminderCardItem> reminders;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReminderCardData) {
                ReminderCardData reminderCardData = (ReminderCardData) obj;
                if (!C7384Etj.areEqual(this.action, reminderCardData.action) || !C7384Etj.areEqual(this.reminders, reminderCardData.reminders)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReminderCardData copy$default(ReminderCardData reminderCardData, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminderCardData.action;
        }
        if ((i & 2) != 0) {
            ahd = reminderCardData.reminders;
        }
        AnonymousClass003.A0u(str, ahd);
        return new ReminderCardData(str, ahd);
    }

    public final String component1() {
        return this.action;
    }

    public final AHD<ReminderCardItem> component2() {
        return this.reminders;
    }

    public final String getAction() {
        return this.action;
    }

    public final AHD<ReminderCardItem> getReminders() {
        return this.reminders;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.reminders, AnonymousClass001.A0G(this.action));
    }

    public ReminderCardData(String str, AHD<ReminderCardItem> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.action = str;
        this.reminders = ahd;
    }

    public final ReminderCardData copy(String str, AHD<ReminderCardItem> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new ReminderCardData(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
