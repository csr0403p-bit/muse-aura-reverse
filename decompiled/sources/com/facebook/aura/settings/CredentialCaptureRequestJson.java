package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class CredentialCaptureRequestJson extends C06G {
    public static final int $stable = 8;
    public final String auth_provider;
    public final String capture_authorization;
    public final List<CredentialCaptureFieldJson> fields;
    public final String grant;
    public final String idempotency_key;
    public final String label;
    public final String lifetime;
    public final String page_url;
    public final String session_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, CredentialCaptureRequestJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<CredentialCaptureRequestJson> serializer() {
            return CredentialCaptureRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCaptureRequestJson) {
                CredentialCaptureRequestJson credentialCaptureRequestJson = (CredentialCaptureRequestJson) obj;
                if (!C7384Etj.areEqual(this.page_url, credentialCaptureRequestJson.page_url) || !C7384Etj.areEqual(this.idempotency_key, credentialCaptureRequestJson.idempotency_key) || !C7384Etj.areEqual(this.capture_authorization, credentialCaptureRequestJson.capture_authorization) || !C7384Etj.areEqual(this.label, credentialCaptureRequestJson.label) || !C7384Etj.areEqual(this.fields, credentialCaptureRequestJson.fields) || !C7384Etj.areEqual(this.lifetime, credentialCaptureRequestJson.lifetime) || !C7384Etj.areEqual(this.session_id, credentialCaptureRequestJson.session_id) || !C7384Etj.areEqual(this.auth_provider, credentialCaptureRequestJson.auth_provider) || !C7384Etj.areEqual(this.grant, credentialCaptureRequestJson.grant)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CredentialCaptureRequestJson(int i, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CredentialCaptureRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.page_url = str;
        this.idempotency_key = str2;
        if ((i & 4) == 0) {
            this.capture_authorization = null;
        } else {
            this.capture_authorization = str3;
        }
        if ((i & 8) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i & 16) == 0) {
            this.fields = null;
        } else {
            this.fields = list;
        }
        if ((i & 32) == 0) {
            this.lifetime = "persist";
        } else {
            this.lifetime = str5;
        }
        if ((i & 64) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str6;
        }
        if ((i & 128) == 0) {
            this.auth_provider = null;
        } else {
            this.auth_provider = str7;
        }
        if ((i & 256) == 0) {
            this.grant = null;
        } else {
            this.grant = str8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CredentialCaptureRequestJson copy$default(CredentialCaptureRequestJson credentialCaptureRequestJson, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCaptureRequestJson.page_url;
        }
        if ((i & 2) != 0) {
            str2 = credentialCaptureRequestJson.idempotency_key;
        }
        if ((i & 4) != 0) {
            str3 = credentialCaptureRequestJson.capture_authorization;
        }
        if ((i & 8) != 0) {
            str4 = credentialCaptureRequestJson.label;
        }
        if ((i & 16) != 0) {
            list = credentialCaptureRequestJson.fields;
        }
        if ((i & 32) != 0) {
            str5 = credentialCaptureRequestJson.lifetime;
        }
        if ((i & 64) != 0) {
            str6 = credentialCaptureRequestJson.session_id;
        }
        if ((i & 128) != 0) {
            str7 = credentialCaptureRequestJson.auth_provider;
        }
        if ((i & 256) != 0) {
            str8 = credentialCaptureRequestJson.grant;
        }
        return credentialCaptureRequestJson.copy(str, str2, str3, str4, list, str5, str6, str7, str8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCaptureRequestJson credentialCaptureRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(credentialCaptureRequestJson.page_url, c9iZ, 0);
        c9j5.AAV(credentialCaptureRequestJson.idempotency_key, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || credentialCaptureRequestJson.capture_authorization != null) {
            c9j5.AAP(credentialCaptureRequestJson.capture_authorization, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || credentialCaptureRequestJson.label != null) {
            c9j5.AAP(credentialCaptureRequestJson.label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || credentialCaptureRequestJson.fields != null) {
            c9j5.AAP(credentialCaptureRequestJson.fields, C06G.A0e(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !"persist".equals(credentialCaptureRequestJson.lifetime)) {
            c9j5.AAV(credentialCaptureRequestJson.lifetime, c9iZ, 5);
        }
        if (zAfR || credentialCaptureRequestJson.session_id != null) {
            c9j5.AAP(credentialCaptureRequestJson.session_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || credentialCaptureRequestJson.auth_provider != null) {
            c9j5.AAP(credentialCaptureRequestJson.auth_provider, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || credentialCaptureRequestJson.grant != null) {
            c9j5.AAP(credentialCaptureRequestJson.grant, C07779iq.A01, c9iZ, 8);
        }
    }

    public final String component1() {
        return this.page_url;
    }

    public final String component2() {
        return this.idempotency_key;
    }

    public final String component3() {
        return this.capture_authorization;
    }

    public final String component4() {
        return this.label;
    }

    public final List<CredentialCaptureFieldJson> component5() {
        return this.fields;
    }

    public final String component6() {
        return this.lifetime;
    }

    public final String component7() {
        return this.session_id;
    }

    public final String component8() {
        return this.auth_provider;
    }

    public final String component9() {
        return this.grant;
    }

    public final String getAuth_provider() {
        return this.auth_provider;
    }

    public final String getCapture_authorization() {
        return this.capture_authorization;
    }

    public final List<CredentialCaptureFieldJson> getFields() {
        return this.fields;
    }

    public final String getGrant() {
        return this.grant;
    }

    public final String getIdempotency_key() {
        return this.idempotency_key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLifetime() {
        return this.lifetime;
    }

    public final String getPage_url() {
        return this.page_url;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.lifetime, (((((AnonymousClass005.A0I(this.idempotency_key, AnonymousClass001.A0G(this.page_url)) + AnonymousClass006.A0G(this.capture_authorization)) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0D(this.fields)) * 31) + AnonymousClass006.A0G(this.session_id)) * 31) + AnonymousClass006.A0G(this.auth_provider)) * 31) + AnonymousClass005.A0H(this.grant);
    }

    public final CredentialCaptureRequestJson copy(String str, String str2, String str3, String str4, List<CredentialCaptureFieldJson> list, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 5);
        return new CredentialCaptureRequestJson(str, str2, str3, str4, list, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public CredentialCaptureRequestJson(String str, String str2, String str3, String str4, List<CredentialCaptureFieldJson> list, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 5);
        this.page_url = str;
        this.idempotency_key = str2;
        this.capture_authorization = str3;
        this.label = str4;
        this.fields = list;
        this.lifetime = str5;
        this.session_id = str6;
        this.auth_provider = str7;
        this.grant = str8;
    }

    public /* synthetic */ CredentialCaptureRequestJson(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? "persist" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }
}
