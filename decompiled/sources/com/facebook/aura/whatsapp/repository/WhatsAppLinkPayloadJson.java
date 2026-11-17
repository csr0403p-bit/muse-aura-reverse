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
public final class WhatsAppLinkPayloadJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String error;
    public final String link_code;

    public final class Companion {
        public final C9hr<WhatsAppLinkPayloadJson> serializer() {
            return WhatsAppLinkPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_whatsapp_repository_repository(WhatsAppLinkPayloadJson whatsAppLinkPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || whatsAppLinkPayloadJson.link_code != null) {
            c9j5.AAP(whatsAppLinkPayloadJson.link_code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || whatsAppLinkPayloadJson.error != null) {
            c9j5.AAP(whatsAppLinkPayloadJson.error, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppLinkPayloadJson) {
                WhatsAppLinkPayloadJson whatsAppLinkPayloadJson = (WhatsAppLinkPayloadJson) obj;
                if (!C7384Etj.areEqual(this.link_code, whatsAppLinkPayloadJson.link_code) || !C7384Etj.areEqual(this.error, whatsAppLinkPayloadJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WhatsAppLinkPayloadJson copy$default(WhatsAppLinkPayloadJson whatsAppLinkPayloadJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whatsAppLinkPayloadJson.link_code;
        }
        if ((i & 2) != 0) {
            str2 = whatsAppLinkPayloadJson.error;
        }
        return new WhatsAppLinkPayloadJson(str, str2);
    }

    public final String component1() {
        return this.link_code;
    }

    public final String component2() {
        return this.error;
    }

    public final WhatsAppLinkPayloadJson copy(String str, String str2) {
        return new WhatsAppLinkPayloadJson(str, str2);
    }

    public final String getError() {
        return this.error;
    }

    public final String getLink_code() {
        return this.link_code;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.link_code) * 31) + AnonymousClass005.A0H(this.error);
    }

    public final WhatsAppCompanionLinkResult toDomain() {
        String str = this.link_code;
        if (str != null) {
            return new WhatsAppCompanionLinkResult(true, str, null);
        }
        String str2 = this.error;
        if (str2 == null) {
            str2 = "No link code received";
        }
        return new WhatsAppCompanionLinkResult(false, null, str2);
    }

    public WhatsAppLinkPayloadJson(String str, String str2) {
        this.link_code = str;
        this.error = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WhatsAppLinkPayloadJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.link_code = null;
        } else {
            this.link_code = str;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
    }

    public /* synthetic */ WhatsAppLinkPayloadJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public WhatsAppLinkPayloadJson() {
        this(null, null);
    }
}
