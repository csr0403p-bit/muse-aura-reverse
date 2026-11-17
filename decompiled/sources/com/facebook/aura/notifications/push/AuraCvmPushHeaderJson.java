package com.facebook.aura.notifications.push;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AuraCvmPushHeaderJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String device_id;
    public final long expires_at_ms;
    public final long issued_at_ms;
    public final int key_epoch;
    public final String notification_id;
    public final String type;
    public final int v;
    public final String vm_id;

    public final class Companion {
        public final C9hr<AuraCvmPushHeaderJson> serializer() {
            return AuraCvmPushHeaderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraCvmPushHeaderJson(int i, String str, String str2, String str3, int i2, long j, long j2, String str4) {
        AnonymousClass005.A11(str, str2, str3, 1);
        C7384Etj.A0Y(str4, 7);
        this.v = i;
        this.vm_id = str;
        this.device_id = str2;
        this.notification_id = str3;
        this.key_epoch = i2;
        this.issued_at_ms = j;
        this.expires_at_ms = j2;
        this.type = str4;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(AuraCvmPushHeaderJson auraCvmPushHeaderJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || auraCvmPushHeaderJson.v != 0) {
            c9j5.AAK(c9iZ, 0, auraCvmPushHeaderJson.v);
        }
        if (zAfR || !"".equals(auraCvmPushHeaderJson.vm_id)) {
            c9j5.AAV(auraCvmPushHeaderJson.vm_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(auraCvmPushHeaderJson.device_id)) {
            c9j5.AAV(auraCvmPushHeaderJson.device_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(auraCvmPushHeaderJson.notification_id)) {
            c9j5.AAV(auraCvmPushHeaderJson.notification_id, c9iZ, 3);
        }
        if (zAfR || auraCvmPushHeaderJson.key_epoch != 0) {
            c9j5.AAK(c9iZ, 4, auraCvmPushHeaderJson.key_epoch);
        }
        if (zAfR || auraCvmPushHeaderJson.issued_at_ms != 0) {
            c9j5.AAN(c9iZ, 5, auraCvmPushHeaderJson.issued_at_ms);
        }
        if (zAfR || auraCvmPushHeaderJson.expires_at_ms != 0) {
            c9j5.AAN(c9iZ, 6, auraCvmPushHeaderJson.expires_at_ms);
        }
        if (zAfR || !"".equals(auraCvmPushHeaderJson.type)) {
            c9j5.AAV(auraCvmPushHeaderJson.type, c9iZ, 7);
        }
    }

    public final AuraCvmPushHeaderJson copy(int i, String str, String str2, String str3, int i2, long j, long j2, String str4) {
        AnonymousClass005.A11(str, str2, str3, 1);
        C7384Etj.A0Y(str4, 7);
        return new AuraCvmPushHeaderJson(i, str, str2, str3, i2, j, j2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCvmPushHeaderJson) {
                AuraCvmPushHeaderJson auraCvmPushHeaderJson = (AuraCvmPushHeaderJson) obj;
                if (this.v != auraCvmPushHeaderJson.v || !C7384Etj.areEqual(this.vm_id, auraCvmPushHeaderJson.vm_id) || !C7384Etj.areEqual(this.device_id, auraCvmPushHeaderJson.device_id) || !C7384Etj.areEqual(this.notification_id, auraCvmPushHeaderJson.notification_id) || this.key_epoch != auraCvmPushHeaderJson.key_epoch || this.issued_at_ms != auraCvmPushHeaderJson.issued_at_ms || this.expires_at_ms != auraCvmPushHeaderJson.expires_at_ms || !C7384Etj.areEqual(this.type, auraCvmPushHeaderJson.type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraCvmPushHeaderJson copy$default(AuraCvmPushHeaderJson auraCvmPushHeaderJson, int i, String str, String str2, String str3, int i2, long j, long j2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = auraCvmPushHeaderJson.v;
        }
        if ((i3 & 2) != 0) {
            str = auraCvmPushHeaderJson.vm_id;
        }
        if ((i3 & 4) != 0) {
            str2 = auraCvmPushHeaderJson.device_id;
        }
        if ((i3 & 8) != 0) {
            str3 = auraCvmPushHeaderJson.notification_id;
        }
        if ((i3 & 16) != 0) {
            i2 = auraCvmPushHeaderJson.key_epoch;
        }
        if ((i3 & 32) != 0) {
            j = auraCvmPushHeaderJson.issued_at_ms;
        }
        if ((i3 & 64) != 0) {
            j2 = auraCvmPushHeaderJson.expires_at_ms;
        }
        if ((i3 & 128) != 0) {
            str4 = auraCvmPushHeaderJson.type;
        }
        return auraCvmPushHeaderJson.copy(i, str, str2, str3, i2, j, j2, str4);
    }

    public final int component1() {
        return this.v;
    }

    public final String component2() {
        return this.vm_id;
    }

    public final String component3() {
        return this.device_id;
    }

    public final String component4() {
        return this.notification_id;
    }

    public final int component5() {
        return this.key_epoch;
    }

    public final long component6() {
        return this.issued_at_ms;
    }

    public final long component7() {
        return this.expires_at_ms;
    }

    public final String component8() {
        return this.type;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final long getIssued_at_ms() {
        return this.issued_at_ms;
    }

    public final int getKey_epoch() {
        return this.key_epoch;
    }

    public final String getNotification_id() {
        return this.notification_id;
    }

    public final String getType() {
        return this.type;
    }

    public final int getV() {
        return this.v;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.type, AnonymousClass006.A06(this.expires_at_ms, AnonymousClass006.A06(this.issued_at_ms, (AnonymousClass005.A0I(this.notification_id, AnonymousClass005.A0I(this.device_id, AnonymousClass005.A0I(this.vm_id, this.v * 31))) + this.key_epoch) * 31)));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraCvmPushHeaderJson(int i, String str, String str2, String str3, int i2, long j, long j2, String str4, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? i2 : 0, C3cH.A03(i3 & 32, j), (i3 & 64) == 0 ? j2 : 0L, (i3 & 128) != 0 ? "" : str4);
    }

    public /* synthetic */ AuraCvmPushHeaderJson(int i, int i2, String str, String str2, String str3, int i3, long j, long j2, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.v = 0;
        } else {
            this.v = i2;
        }
        if ((i & 2) == 0) {
            this.vm_id = "";
        } else {
            this.vm_id = str;
        }
        if ((i & 4) == 0) {
            this.device_id = "";
        } else {
            this.device_id = str2;
        }
        if ((i & 8) == 0) {
            this.notification_id = "";
        } else {
            this.notification_id = str3;
        }
        if ((i & 16) == 0) {
            this.key_epoch = 0;
        } else {
            this.key_epoch = i3;
        }
        if ((i & 32) == 0) {
            this.issued_at_ms = 0L;
        } else {
            this.issued_at_ms = j;
        }
        if ((i & 64) == 0) {
            this.expires_at_ms = 0L;
        } else {
            this.expires_at_ms = j2;
        }
        if ((i & 128) == 0) {
            this.type = "";
        } else {
            this.type = str4;
        }
    }

    public AuraCvmPushHeaderJson() {
        this(0, "", "", "", 0, 0L, 0L, "");
    }
}
