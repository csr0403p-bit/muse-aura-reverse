package com.facebook.aura.settings;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class CredentialCaptureResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;

    public final class Companion {
        public final C9hr<CredentialCaptureResponseJson> serializer() {
            return CredentialCaptureResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCaptureResponseJson credentialCaptureResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"".equals(credentialCaptureResponseJson.id)) {
            c9j5.AAV(credentialCaptureResponseJson.id, c9iZ, 0);
        }
    }

    public final CredentialCaptureResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CredentialCaptureResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CredentialCaptureResponseJson) && C7384Etj.areEqual(this.id, ((CredentialCaptureResponseJson) obj).id));
    }

    public /* synthetic */ CredentialCaptureResponseJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ CredentialCaptureResponseJson copy$default(CredentialCaptureResponseJson credentialCaptureResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCaptureResponseJson.id;
        }
        C7384Etj.A0Y(str, 0);
        return new CredentialCaptureResponseJson(str);
    }

    public final String component1() {
        return this.id;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CredentialCaptureResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
    }

    public /* synthetic */ CredentialCaptureResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
    }

    public CredentialCaptureResponseJson() {
        this("");
    }
}
