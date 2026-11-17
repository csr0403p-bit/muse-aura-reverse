package com.facebook.aura.whatsapp.repository;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class WhatsAppLinkRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String phone_number;

    public final class Companion {
        public final C9hr<WhatsAppLinkRequestJson> serializer() {
            return WhatsAppLinkRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final WhatsAppLinkRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new WhatsAppLinkRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WhatsAppLinkRequestJson) && C7384Etj.areEqual(this.phone_number, ((WhatsAppLinkRequestJson) obj).phone_number));
    }

    public /* synthetic */ WhatsAppLinkRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(WhatsAppLinkRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.phone_number = str;
    }

    public static /* synthetic */ WhatsAppLinkRequestJson copy$default(WhatsAppLinkRequestJson whatsAppLinkRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whatsAppLinkRequestJson.phone_number;
        }
        C7384Etj.A0Y(str, 0);
        return new WhatsAppLinkRequestJson(str);
    }

    public final String component1() {
        return this.phone_number;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public int hashCode() {
        return this.phone_number.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public WhatsAppLinkRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.phone_number = str;
    }
}
