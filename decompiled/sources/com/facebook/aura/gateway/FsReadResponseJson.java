package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsReadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FsErrorJson error;
    public final boolean ok;
    public final FsReadPayloadJson result;

    public final class Companion {
        public final C9hr<FsReadResponseJson> serializer() {
            return FsReadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsReadResponseJson fsReadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsReadResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, fsReadResponseJson.ok);
        }
        if (zAfR || fsReadResponseJson.result != null) {
            c9j5.AAP(fsReadResponseJson.result, FsReadPayloadJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || fsReadResponseJson.error != null) {
            c9j5.AAP(fsReadResponseJson.error, FsErrorJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsReadResponseJson) {
                FsReadResponseJson fsReadResponseJson = (FsReadResponseJson) obj;
                if (this.ok != fsReadResponseJson.ok || !C7384Etj.areEqual(this.result, fsReadResponseJson.result) || !C7384Etj.areEqual(this.error, fsReadResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsReadResponseJson copy$default(FsReadResponseJson fsReadResponseJson, boolean z, FsReadPayloadJson fsReadPayloadJson, FsErrorJson fsErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fsReadResponseJson.ok;
        }
        if ((i & 2) != 0) {
            fsReadPayloadJson = fsReadResponseJson.result;
        }
        if ((i & 4) != 0) {
            fsErrorJson = fsReadResponseJson.error;
        }
        return new FsReadResponseJson(z, fsReadPayloadJson, fsErrorJson);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final FsReadPayloadJson component2() {
        return this.result;
    }

    public final FsErrorJson component3() {
        return this.error;
    }

    public final FsReadResponseJson copy(boolean z, FsReadPayloadJson fsReadPayloadJson, FsErrorJson fsErrorJson) {
        return new FsReadResponseJson(z, fsReadPayloadJson, fsErrorJson);
    }

    public final FsErrorJson getError() {
        return this.error;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final FsReadPayloadJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return ((C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result)) * 31) + C3cH.A02(this.error);
    }

    public FsReadResponseJson(boolean z, FsReadPayloadJson fsReadPayloadJson, FsErrorJson fsErrorJson) {
        this.ok = z;
        this.result = fsReadPayloadJson;
        this.error = fsErrorJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsReadResponseJson(int i, boolean z, FsReadPayloadJson fsReadPayloadJson, FsErrorJson fsErrorJson, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = fsReadPayloadJson;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = fsErrorJson;
        }
    }

    public /* synthetic */ FsReadResponseJson(boolean z, FsReadPayloadJson fsReadPayloadJson, FsErrorJson fsErrorJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : fsReadPayloadJson, (i & 4) != 0 ? null : fsErrorJson);
    }

    public FsReadResponseJson() {
        this(false, null, null);
    }
}
