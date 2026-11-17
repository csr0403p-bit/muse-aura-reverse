package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NotificationOptInCardJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String cron_id;
    public final String reason;

    public final class Companion {
        public final C9hr<NotificationOptInCardJson> serializer() {
            return NotificationOptInCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(NotificationOptInCardJson notificationOptInCardJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(notificationOptInCardJson.cron_id)) {
            c9j5.AAV(notificationOptInCardJson.cron_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(notificationOptInCardJson.reason)) {
            c9j5.AAV(notificationOptInCardJson.reason, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NotificationOptInCardJson) {
                NotificationOptInCardJson notificationOptInCardJson = (NotificationOptInCardJson) obj;
                if (!C7384Etj.areEqual(this.cron_id, notificationOptInCardJson.cron_id) || !C7384Etj.areEqual(this.reason, notificationOptInCardJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NotificationOptInCardJson copy$default(NotificationOptInCardJson notificationOptInCardJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationOptInCardJson.cron_id;
        }
        if ((i & 2) != 0) {
            str2 = notificationOptInCardJson.reason;
        }
        AnonymousClass003.A0u(str, str2);
        return new NotificationOptInCardJson(str, str2);
    }

    public final String component1() {
        return this.cron_id;
    }

    public final String component2() {
        return this.reason;
    }

    public final String getCron_id() {
        return this.cron_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, AnonymousClass001.A0G(this.cron_id));
    }

    public final NotificationOptInCardData toDomain() {
        if (C7BY.A0j(this.cron_id) || !"cron_created".equals(AnonymousClass002.A0l(this.reason))) {
            return null;
        }
        return new NotificationOptInCardData(AnonymousClass002.A0l(this.cron_id));
    }

    public NotificationOptInCardJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.cron_id = str;
        this.reason = str2;
    }

    public final NotificationOptInCardJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new NotificationOptInCardJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NotificationOptInCardJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.cron_id = "";
        } else {
            this.cron_id = str;
        }
        if ((i & 2) == 0) {
            this.reason = "";
        } else {
            this.reason = str2;
        }
    }

    public /* synthetic */ NotificationOptInCardJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public NotificationOptInCardJson() {
        this("", "");
    }
}
