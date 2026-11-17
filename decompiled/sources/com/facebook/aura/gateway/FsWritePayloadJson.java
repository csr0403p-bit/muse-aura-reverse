package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsWritePayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int bytes_written;
    public final String path;

    public final class Companion {
        public final C9hr<FsWritePayloadJson> serializer() {
            return FsWritePayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsWritePayloadJson fsWritePayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsWritePayloadJson.path != null) {
            c9j5.AAP(fsWritePayloadJson.path, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fsWritePayloadJson.bytes_written != 0) {
            c9j5.AAK(c9iZ, 1, fsWritePayloadJson.bytes_written);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsWritePayloadJson) {
                FsWritePayloadJson fsWritePayloadJson = (FsWritePayloadJson) obj;
                if (!C7384Etj.areEqual(this.path, fsWritePayloadJson.path) || this.bytes_written != fsWritePayloadJson.bytes_written) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsWritePayloadJson copy$default(FsWritePayloadJson fsWritePayloadJson, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fsWritePayloadJson.path;
        }
        if ((i2 & 2) != 0) {
            i = fsWritePayloadJson.bytes_written;
        }
        return new FsWritePayloadJson(str, i);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.bytes_written;
    }

    public final FsWritePayloadJson copy(String str, int i) {
        return new FsWritePayloadJson(str, i);
    }

    public final int getBytes_written() {
        return this.bytes_written;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.path) * 31) + this.bytes_written;
    }

    public FsWritePayloadJson(String str, int i) {
        this.path = str;
        this.bytes_written = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsWritePayloadJson(int i, String str, int i2, C2hx c2hx) {
        this.path = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.bytes_written = 0;
        } else {
            this.bytes_written = i2;
        }
    }

    public /* synthetic */ FsWritePayloadJson(String str, int i, int i2, C06H c06h) {
        this(AnonymousClass006.A0r(i2, str), C3cG.A01(i2, i));
    }

    public FsWritePayloadJson() {
        this(null, 0);
    }
}
