package com.facebook.aura.gateway;

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
public final class FsDeletePayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String path;

    public final class Companion {
        public final C9hr<FsDeletePayloadJson> serializer() {
            return FsDeletePayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsDeletePayloadJson fsDeletePayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || fsDeletePayloadJson.path != null) {
            c9j5.AAP(fsDeletePayloadJson.path, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FsDeletePayloadJson) && C7384Etj.areEqual(this.path, ((FsDeletePayloadJson) obj).path));
    }

    public static /* synthetic */ FsDeletePayloadJson copy$default(FsDeletePayloadJson fsDeletePayloadJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsDeletePayloadJson.path;
        }
        return new FsDeletePayloadJson(str);
    }

    public final String component1() {
        return this.path;
    }

    public final FsDeletePayloadJson copy(String str) {
        return new FsDeletePayloadJson(str);
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.path);
    }

    public /* synthetic */ FsDeletePayloadJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FsDeletePayloadJson(String str) {
        this.path = str;
    }

    public /* synthetic */ FsDeletePayloadJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public FsDeletePayloadJson() {
        this(null);
    }
}
