package com.facebook.aura.nodes.cards;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NotificationOptInCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String cronId;

    public NotificationOptInCardData(String str) {
        C7384Etj.A0Y(str, 0);
        this.cronId = str;
    }

    public final NotificationOptInCardData copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new NotificationOptInCardData(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NotificationOptInCardData) && C7384Etj.areEqual(this.cronId, ((NotificationOptInCardData) obj).cronId));
    }

    public static /* synthetic */ NotificationOptInCardData copy$default(NotificationOptInCardData notificationOptInCardData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationOptInCardData.cronId;
        }
        C7384Etj.A0Y(str, 0);
        return new NotificationOptInCardData(str);
    }

    public final String component1() {
        return this.cronId;
    }

    public final String getCronId() {
        return this.cronId;
    }

    public int hashCode() {
        return this.cronId.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
