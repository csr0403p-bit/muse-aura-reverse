package com.facebook.aura.notifications.push;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AuraCvmPushPlaintextDataJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final String message_id;
    public final String thread_id;
    public final String unread_count;

    public final class Companion {
        public final C9hr<AuraCvmPushPlaintextDataJson> serializer() {
            return AuraCvmPushPlaintextDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraCvmPushPlaintextDataJson() {
        this("", null, null, "");
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(auraCvmPushPlaintextDataJson.message_id)) {
            c9j5.AAV(auraCvmPushPlaintextDataJson.message_id, c9iZ, 0);
        }
        if (zAfR || auraCvmPushPlaintextDataJson.thread_id != null) {
            c9j5.AAP(auraCvmPushPlaintextDataJson.thread_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || auraCvmPushPlaintextDataJson.unread_count != null) {
            c9j5.AAP(auraCvmPushPlaintextDataJson.unread_count, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !"".equals(auraCvmPushPlaintextDataJson.approval_id)) {
            c9j5.AAV(auraCvmPushPlaintextDataJson.approval_id, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCvmPushPlaintextDataJson) {
                AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson = (AuraCvmPushPlaintextDataJson) obj;
                if (!C7384Etj.areEqual(this.message_id, auraCvmPushPlaintextDataJson.message_id) || !C7384Etj.areEqual(this.thread_id, auraCvmPushPlaintextDataJson.thread_id) || !C7384Etj.areEqual(this.unread_count, auraCvmPushPlaintextDataJson.unread_count) || !C7384Etj.areEqual(this.approval_id, auraCvmPushPlaintextDataJson.approval_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraCvmPushPlaintextDataJson copy$default(AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraCvmPushPlaintextDataJson.message_id;
        }
        if ((i & 2) != 0) {
            str2 = auraCvmPushPlaintextDataJson.thread_id;
        }
        if ((i & 4) != 0) {
            str3 = auraCvmPushPlaintextDataJson.unread_count;
        }
        if ((i & 8) != 0) {
            str4 = auraCvmPushPlaintextDataJson.approval_id;
        }
        AnonymousClass003.A0w(str, str4);
        return new AuraCvmPushPlaintextDataJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.message_id;
    }

    public final String component2() {
        return this.thread_id;
    }

    public final String component3() {
        return this.unread_count;
    }

    public final String component4() {
        return this.approval_id;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public final String getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.approval_id, (((AnonymousClass001.A0G(this.message_id) + AnonymousClass006.A0G(this.thread_id)) * 31) + AnonymousClass005.A0H(this.unread_count)) * 31);
    }

    public final AuraCvmPushPlaintextDataJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0w(str, str4);
        return new AuraCvmPushPlaintextDataJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public AuraCvmPushPlaintextDataJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0w(str, str4);
        this.message_id = str;
        this.thread_id = str2;
        this.unread_count = str3;
        this.approval_id = str4;
    }

    public /* synthetic */ AuraCvmPushPlaintextDataJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
    }

    public /* synthetic */ AuraCvmPushPlaintextDataJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.message_id = "";
        } else {
            this.message_id = str;
        }
        if ((i & 2) == 0) {
            this.thread_id = null;
        } else {
            this.thread_id = str2;
        }
        if ((i & 4) == 0) {
            this.unread_count = null;
        } else {
            this.unread_count = str3;
        }
        if ((i & 8) == 0) {
            this.approval_id = "";
        } else {
            this.approval_id = str4;
        }
    }
}
