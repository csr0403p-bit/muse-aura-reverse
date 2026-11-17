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
public final class CustomConnectorTokenRefreshJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String path;

    public final class Companion {
        public final C9hr<CustomConnectorTokenRefreshJson> serializer() {
            return CustomConnectorTokenRefreshJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final CustomConnectorTokenRefreshJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorTokenRefreshJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CustomConnectorTokenRefreshJson) && C7384Etj.areEqual(this.path, ((CustomConnectorTokenRefreshJson) obj).path));
    }

    public /* synthetic */ CustomConnectorTokenRefreshJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(CustomConnectorTokenRefreshJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.path = str;
    }

    public static /* synthetic */ CustomConnectorTokenRefreshJson copy$default(CustomConnectorTokenRefreshJson customConnectorTokenRefreshJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorTokenRefreshJson.path;
        }
        C7384Etj.A0Y(str, 0);
        return new CustomConnectorTokenRefreshJson(str);
    }

    public final String component1() {
        return this.path;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorTokenRefreshJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
    }
}
