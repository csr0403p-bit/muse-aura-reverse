package com.facebook.aura.gateway;

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
/* loaded from: classes3.dex */
public final class FsErrorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String code;
    public final String message;
    public final String type;

    public final class Companion {
        public final C9hr<FsErrorJson> serializer() {
            return FsErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsErrorJson fsErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsErrorJson.message != null) {
            c9j5.AAP(fsErrorJson.message, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fsErrorJson.code != null) {
            c9j5.AAP(fsErrorJson.code, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || fsErrorJson.type != null) {
            c9j5.AAP(fsErrorJson.type, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsErrorJson) {
                FsErrorJson fsErrorJson = (FsErrorJson) obj;
                if (!C7384Etj.areEqual(this.message, fsErrorJson.message) || !C7384Etj.areEqual(this.code, fsErrorJson.code) || !C7384Etj.areEqual(this.type, fsErrorJson.type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsErrorJson copy$default(FsErrorJson fsErrorJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsErrorJson.message;
        }
        if ((i & 2) != 0) {
            str2 = fsErrorJson.code;
        }
        if ((i & 4) != 0) {
            str3 = fsErrorJson.type;
        }
        return new FsErrorJson(str, str2, str3);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.type;
    }

    public final FsErrorJson copy(String str, String str2, String str3) {
        return new FsErrorJson(str, str2, str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.message) * 31) + AnonymousClass006.A0G(this.code)) * 31) + AnonymousClass005.A0H(this.type);
    }

    public FsErrorJson(String str, String str2, String str3) {
        this.message = str;
        this.code = str2;
        this.type = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsErrorJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.code = null;
        } else {
            this.code = str2;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
    }

    public /* synthetic */ FsErrorJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public FsErrorJson() {
        this(null, null, null);
    }
}
