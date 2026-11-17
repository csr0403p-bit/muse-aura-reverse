package com.facebook.aura.appupdate;

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
public final class LatestAppVersionResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String version;

    public final class Companion {
        public final C9hr<LatestAppVersionResponseJson> serializer() {
            return LatestAppVersionResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_appupdate_appupdate(LatestAppVersionResponseJson latestAppVersionResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(latestAppVersionResponseJson.version)) {
            c9j5.AAV(latestAppVersionResponseJson.version, c9iZ, 0);
        }
    }

    public final LatestAppVersionResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new LatestAppVersionResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LatestAppVersionResponseJson) && C7384Etj.areEqual(this.version, ((LatestAppVersionResponseJson) obj).version));
    }

    public static /* synthetic */ LatestAppVersionResponseJson copy$default(LatestAppVersionResponseJson latestAppVersionResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = latestAppVersionResponseJson.version;
        }
        C7384Etj.A0Y(str, 0);
        return new LatestAppVersionResponseJson(str);
    }

    public final String component1() {
        return this.version;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode();
    }

    public /* synthetic */ LatestAppVersionResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.version = "";
        } else {
            this.version = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LatestAppVersionResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.version = str;
    }

    public /* synthetic */ LatestAppVersionResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public LatestAppVersionResponseJson() {
        this("");
    }
}
