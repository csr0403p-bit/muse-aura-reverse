package com.facebook.aura.network.acs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FastlyOhaiAcsConfigEnvelopeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String config_json_ser_b64url;
    public final String signature_b64url;

    public final class Companion {
        public final C9hr<FastlyOhaiAcsConfigEnvelopeJson> serializer() {
            return FastlyOhaiAcsConfigEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_network_acs_acs(FastlyOhaiAcsConfigEnvelopeJson fastlyOhaiAcsConfigEnvelopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url)) {
            c9j5.AAV(fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url, c9iZ, 0);
        }
        if (zAfR || !"".equals(fastlyOhaiAcsConfigEnvelopeJson.signature_b64url)) {
            c9j5.AAV(fastlyOhaiAcsConfigEnvelopeJson.signature_b64url, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FastlyOhaiAcsConfigEnvelopeJson) {
                FastlyOhaiAcsConfigEnvelopeJson fastlyOhaiAcsConfigEnvelopeJson = (FastlyOhaiAcsConfigEnvelopeJson) obj;
                if (!C7384Etj.areEqual(this.config_json_ser_b64url, fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url) || !C7384Etj.areEqual(this.signature_b64url, fastlyOhaiAcsConfigEnvelopeJson.signature_b64url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FastlyOhaiAcsConfigEnvelopeJson copy$default(FastlyOhaiAcsConfigEnvelopeJson fastlyOhaiAcsConfigEnvelopeJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fastlyOhaiAcsConfigEnvelopeJson.config_json_ser_b64url;
        }
        if ((i & 2) != 0) {
            str2 = fastlyOhaiAcsConfigEnvelopeJson.signature_b64url;
        }
        AnonymousClass003.A0u(str, str2);
        return new FastlyOhaiAcsConfigEnvelopeJson(str, str2);
    }

    public final String component1() {
        return this.config_json_ser_b64url;
    }

    public final String component2() {
        return this.signature_b64url;
    }

    public final String getConfig_json_ser_b64url() {
        return this.config_json_ser_b64url;
    }

    public final String getSignature_b64url() {
        return this.signature_b64url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.signature_b64url, AnonymousClass001.A0G(this.config_json_ser_b64url));
    }

    public FastlyOhaiAcsConfigEnvelopeJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.config_json_ser_b64url = str;
        this.signature_b64url = str2;
    }

    public final FastlyOhaiAcsConfigEnvelopeJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FastlyOhaiAcsConfigEnvelopeJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FastlyOhaiAcsConfigEnvelopeJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.config_json_ser_b64url = "";
        } else {
            this.config_json_ser_b64url = str;
        }
        if ((i & 2) == 0) {
            this.signature_b64url = "";
        } else {
            this.signature_b64url = str2;
        }
    }

    public /* synthetic */ FastlyOhaiAcsConfigEnvelopeJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public FastlyOhaiAcsConfigEnvelopeJson() {
        this("", "");
    }
}
