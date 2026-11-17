package com.facebook.aura.skills.connect.repository;

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
public final class CustomConnectorApiKeyCredentialJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String key;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyCredentialJson> serializer() {
            return CustomConnectorApiKeyCredentialJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CustomConnectorApiKeyCredentialJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorApiKeyCredentialJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorApiKeyCredentialJson) && C7384Etj.areEqual(this.key, ((CustomConnectorApiKeyCredentialJson) obj).key));
    }

    public /* synthetic */ CustomConnectorApiKeyCredentialJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CustomConnectorApiKeyCredentialJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.key = str;
    }

    public static /* synthetic */ CustomConnectorApiKeyCredentialJson copy$default(CustomConnectorApiKeyCredentialJson customConnectorApiKeyCredentialJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorApiKeyCredentialJson.key;
        }
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorApiKeyCredentialJson(str);
    }

    public final String component1() {
        return this.key;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorApiKeyCredentialJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
    }
}
