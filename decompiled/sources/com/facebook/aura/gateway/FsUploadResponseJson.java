package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class FsUploadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int bytes_written;
    public final FsErrorJson error;
    public final boolean ok;
    public final String path;

    public final class Companion {
        public final C9hr<FsUploadResponseJson> serializer() {
            return FsUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsUploadResponseJson fsUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsUploadResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, fsUploadResponseJson.ok);
        }
        if (zAfR || !C3cH.A1Q(fsUploadResponseJson.path)) {
            c9j5.AAV(fsUploadResponseJson.path, c9iZ, 1);
        }
        if (zAfR || fsUploadResponseJson.bytes_written != 0) {
            c9j5.AAK(c9iZ, 2, fsUploadResponseJson.bytes_written);
        }
        if (zAfR || fsUploadResponseJson.error != null) {
            c9j5.AAP(fsUploadResponseJson.error, FsErrorJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final FsUploadResponseJson copy(boolean z, String str, int i, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(str, 1);
        return new FsUploadResponseJson(z, str, i, fsErrorJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsUploadResponseJson) {
                FsUploadResponseJson fsUploadResponseJson = (FsUploadResponseJson) obj;
                if (this.ok != fsUploadResponseJson.ok || !C7384Etj.areEqual(this.path, fsUploadResponseJson.path) || this.bytes_written != fsUploadResponseJson.bytes_written || !C7384Etj.areEqual(this.error, fsUploadResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsUploadResponseJson copy$default(FsUploadResponseJson fsUploadResponseJson, boolean z, String str, int i, FsErrorJson fsErrorJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = fsUploadResponseJson.ok;
        }
        if ((i2 & 2) != 0) {
            str = fsUploadResponseJson.path;
        }
        if ((i2 & 4) != 0) {
            i = fsUploadResponseJson.bytes_written;
        }
        if ((i2 & 8) != 0) {
            fsErrorJson = fsUploadResponseJson.error;
        }
        C7384Etj.A0Y(str, 1);
        return new FsUploadResponseJson(z, str, i, fsErrorJson);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component2() {
        return this.path;
    }

    public final int component3() {
        return this.bytes_written;
    }

    public final FsErrorJson component4() {
        return this.error;
    }

    public final int getBytes_written() {
        return this.bytes_written;
    }

    public final FsErrorJson getError() {
        return this.error;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.path, C0KA.A02(this.ok)) + this.bytes_written) * 31) + AnonymousClass006.A0D(this.error);
    }

    public /* synthetic */ FsUploadResponseJson(int i, boolean z, String str, int i2, FsErrorJson fsErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        if ((i & 2) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        if ((i & 4) == 0) {
            this.bytes_written = 0;
        } else {
            this.bytes_written = i2;
        }
        if ((i & 8) == 0) {
            this.error = null;
        } else {
            this.error = fsErrorJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FsUploadResponseJson(boolean z, String str, int i, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(str, 1);
        this.ok = z;
        this.path = str;
        this.bytes_written = i;
        this.error = fsErrorJson;
    }

    public /* synthetic */ FsUploadResponseJson(boolean z, String str, int i, FsErrorJson fsErrorJson, int i2, C06H c06h) {
        this(AnonymousClass001.A1P(i2, z), (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fsErrorJson);
    }

    public FsUploadResponseJson() {
        this(false, "", 0, null);
    }
}
