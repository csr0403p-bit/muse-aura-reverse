package com.facebook.aura.notifications.push;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AuraCvmPushPlaintextJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String body;
    public final AuraCvmPushPlaintextDataJson data;
    public final String notification_type;
    public final String title;

    public final class Companion {
        public final C9hr<AuraCvmPushPlaintextJson> serializer() {
            return AuraCvmPushPlaintextJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(AuraCvmPushPlaintextJson auraCvmPushPlaintextJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || auraCvmPushPlaintextJson.title != null) {
            c9j5.AAP(auraCvmPushPlaintextJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || auraCvmPushPlaintextJson.body != null) {
            c9j5.AAP(auraCvmPushPlaintextJson.body, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cH.A1Q(auraCvmPushPlaintextJson.notification_type)) {
            c9j5.AAV(auraCvmPushPlaintextJson.notification_type, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(auraCvmPushPlaintextJson.data, new AuraCvmPushPlaintextDataJson("", null, null, ""))) {
            c9j5.AAQ(auraCvmPushPlaintextJson.data, AuraCvmPushPlaintextDataJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final AuraCvmPushPlaintextJson copy(String str, String str2, String str3, AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson) {
        AnonymousClass002.A1B(str3, 2, auraCvmPushPlaintextDataJson);
        return new AuraCvmPushPlaintextJson(str, str2, str3, auraCvmPushPlaintextDataJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCvmPushPlaintextJson) {
                AuraCvmPushPlaintextJson auraCvmPushPlaintextJson = (AuraCvmPushPlaintextJson) obj;
                if (!C7384Etj.areEqual(this.title, auraCvmPushPlaintextJson.title) || !C7384Etj.areEqual(this.body, auraCvmPushPlaintextJson.body) || !C7384Etj.areEqual(this.notification_type, auraCvmPushPlaintextJson.notification_type) || !C7384Etj.areEqual(this.data, auraCvmPushPlaintextJson.data)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraCvmPushPlaintextJson() {
        this((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (AuraCvmPushPlaintextDataJson) (0 == true ? 1 : 0), 15, (C06H) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ AuraCvmPushPlaintextJson copy$default(AuraCvmPushPlaintextJson auraCvmPushPlaintextJson, String str, String str2, String str3, AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraCvmPushPlaintextJson.title;
        }
        if ((i & 2) != 0) {
            str2 = auraCvmPushPlaintextJson.body;
        }
        if ((i & 4) != 0) {
            str3 = auraCvmPushPlaintextJson.notification_type;
        }
        if ((i & 8) != 0) {
            auraCvmPushPlaintextDataJson = auraCvmPushPlaintextJson.data;
        }
        AnonymousClass002.A1B(str3, 2, auraCvmPushPlaintextDataJson);
        return new AuraCvmPushPlaintextJson(str, str2, str3, auraCvmPushPlaintextDataJson);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.notification_type;
    }

    public final AuraCvmPushPlaintextDataJson component4() {
        return this.data;
    }

    public final String getBody() {
        return this.body;
    }

    public final AuraCvmPushPlaintextDataJson getData() {
        return this.data;
    }

    public final String getNotification_type() {
        return this.notification_type;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.data, AnonymousClass005.A0I(this.notification_type, ((AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.body)) * 31));
    }

    public String toString() {
        return super.toString();
    }

    public AuraCvmPushPlaintextJson(String str, String str2, String str3, AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson) {
        AnonymousClass002.A1B(str3, 2, auraCvmPushPlaintextDataJson);
        this.title = str;
        this.body = str2;
        this.notification_type = str3;
        this.data = auraCvmPushPlaintextDataJson;
    }

    public /* synthetic */ AuraCvmPushPlaintextJson(String str, String str2, String str3, AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new AuraCvmPushPlaintextDataJson("", null, null, "") : auraCvmPushPlaintextDataJson);
    }

    public /* synthetic */ AuraCvmPushPlaintextJson(int i, String str, String str2, String str3, AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.body = null;
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.notification_type = "";
        } else {
            this.notification_type = str3;
        }
        if ((i & 8) == 0) {
            this.data = new AuraCvmPushPlaintextDataJson("", null, null, "");
        } else {
            this.data = auraCvmPushPlaintextDataJson;
        }
    }
}
