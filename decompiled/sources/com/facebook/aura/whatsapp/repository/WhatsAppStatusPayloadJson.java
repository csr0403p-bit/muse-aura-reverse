package com.facebook.aura.whatsapp.repository;

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
public final class WhatsAppStatusPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String error;
    public final String link_code;
    public final String message;
    public final String state;
    public final String status;

    public final class Companion {
        public final C9hr<WhatsAppStatusPayloadJson> serializer() {
            return WhatsAppStatusPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_whatsapp_repository_repository(WhatsAppStatusPayloadJson whatsAppStatusPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || whatsAppStatusPayloadJson.status != null) {
            c9j5.AAP(whatsAppStatusPayloadJson.status, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || whatsAppStatusPayloadJson.state != null) {
            c9j5.AAP(whatsAppStatusPayloadJson.state, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || whatsAppStatusPayloadJson.link_code != null) {
            c9j5.AAP(whatsAppStatusPayloadJson.link_code, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || whatsAppStatusPayloadJson.error != null) {
            c9j5.AAP(whatsAppStatusPayloadJson.error, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || whatsAppStatusPayloadJson.message != null) {
            c9j5.AAP(whatsAppStatusPayloadJson.message, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppStatusPayloadJson) {
                WhatsAppStatusPayloadJson whatsAppStatusPayloadJson = (WhatsAppStatusPayloadJson) obj;
                if (!C7384Etj.areEqual(this.status, whatsAppStatusPayloadJson.status) || !C7384Etj.areEqual(this.state, whatsAppStatusPayloadJson.state) || !C7384Etj.areEqual(this.link_code, whatsAppStatusPayloadJson.link_code) || !C7384Etj.areEqual(this.error, whatsAppStatusPayloadJson.error) || !C7384Etj.areEqual(this.message, whatsAppStatusPayloadJson.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppStatusPayloadJson copy$default(WhatsAppStatusPayloadJson whatsAppStatusPayloadJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whatsAppStatusPayloadJson.status;
        }
        if ((i & 2) != 0) {
            str2 = whatsAppStatusPayloadJson.state;
        }
        if ((i & 4) != 0) {
            str3 = whatsAppStatusPayloadJson.link_code;
        }
        if ((i & 8) != 0) {
            str4 = whatsAppStatusPayloadJson.error;
        }
        if ((i & 16) != 0) {
            str5 = whatsAppStatusPayloadJson.message;
        }
        return whatsAppStatusPayloadJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.link_code;
    }

    public final String component4() {
        return this.error;
    }

    public final String component5() {
        return this.message;
    }

    public final WhatsAppStatusPayloadJson copy(String str, String str2, String str3, String str4, String str5) {
        return new WhatsAppStatusPayloadJson(str, str2, str3, str4, str5);
    }

    public final String getError() {
        return this.error;
    }

    public final String getLink_code() {
        return this.link_code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.status) * 31) + AnonymousClass006.A0G(this.state)) * 31) + AnonymousClass006.A0G(this.link_code)) * 31) + AnonymousClass006.A0G(this.error)) * 31) + AnonymousClass005.A0H(this.message);
    }

    public final WhatsAppCompanionStatusResult toDomain() {
        String str = this.status;
        if (str == null) {
            str = this.state;
        }
        return new WhatsAppCompanionStatusResult("connected".equals(str) ? WhatsAppCompanionStatus.CONNECTED : "failed".equals(str) ? WhatsAppCompanionStatus.FAILED : WhatsAppCompanionStatus.PENDING, this.link_code, this.error, this.message);
    }

    public /* synthetic */ WhatsAppStatusPayloadJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.status = null;
        } else {
            this.status = str;
        }
        if ((i & 2) == 0) {
            this.state = null;
        } else {
            this.state = str2;
        }
        if ((i & 4) == 0) {
            this.link_code = null;
        } else {
            this.link_code = str3;
        }
        if ((i & 8) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i & 16) == 0) {
            this.message = null;
        } else {
            this.message = str5;
        }
    }

    public String toString() {
        return super.toString();
    }

    public WhatsAppStatusPayloadJson(String str, String str2, String str3, String str4, String str5) {
        this.status = str;
        this.state = str2;
        this.link_code = str3;
        this.error = str4;
        this.message = str5;
    }

    public /* synthetic */ WhatsAppStatusPayloadJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public WhatsAppStatusPayloadJson() {
        this(null, null, null, null, null);
    }
}
