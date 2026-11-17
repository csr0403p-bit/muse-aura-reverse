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
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsExclusiveUploadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long bytes_written;
    public final boolean ok;
    public final FsExclusiveUploadWrittenJson result;

    public final class Companion {
        public final C9hr<FsExclusiveUploadResponseJson> serializer() {
            return FsExclusiveUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsExclusiveUploadResponseJson fsExclusiveUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsExclusiveUploadResponseJson.ok) {
            c9j5.AA7(c9iZ, 0, fsExclusiveUploadResponseJson.ok);
        }
        if (zAfR || fsExclusiveUploadResponseJson.result != null) {
            c9j5.AAP(fsExclusiveUploadResponseJson.result, FsExclusiveUploadWrittenJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || fsExclusiveUploadResponseJson.bytes_written != null) {
            c9j5.AAP(fsExclusiveUploadResponseJson.bytes_written, C9j1.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsExclusiveUploadResponseJson) {
                FsExclusiveUploadResponseJson fsExclusiveUploadResponseJson = (FsExclusiveUploadResponseJson) obj;
                if (this.ok != fsExclusiveUploadResponseJson.ok || !C7384Etj.areEqual(this.result, fsExclusiveUploadResponseJson.result) || !C7384Etj.areEqual(this.bytes_written, fsExclusiveUploadResponseJson.bytes_written)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsExclusiveUploadResponseJson copy$default(FsExclusiveUploadResponseJson fsExclusiveUploadResponseJson, boolean z, FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fsExclusiveUploadResponseJson.ok;
        }
        if ((i & 2) != 0) {
            fsExclusiveUploadWrittenJson = fsExclusiveUploadResponseJson.result;
        }
        if ((i & 4) != 0) {
            l = fsExclusiveUploadResponseJson.bytes_written;
        }
        return new FsExclusiveUploadResponseJson(z, fsExclusiveUploadWrittenJson, l);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final FsExclusiveUploadWrittenJson component2() {
        return this.result;
    }

    public final Long component3() {
        return this.bytes_written;
    }

    public final FsExclusiveUploadResponseJson copy(boolean z, FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l) {
        return new FsExclusiveUploadResponseJson(z, fsExclusiveUploadWrittenJson, l);
    }

    public final Long getBytes_written() {
        return this.bytes_written;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final FsExclusiveUploadWrittenJson getResult() {
        return this.result;
    }

    public int hashCode() {
        return ((C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result)) * 31) + C3cH.A02(this.bytes_written);
    }

    public FsExclusiveUploadResponseJson(boolean z, FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l) {
        this.ok = z;
        this.result = fsExclusiveUploadWrittenJson;
        this.bytes_written = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsExclusiveUploadResponseJson(int i, boolean z, FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = fsExclusiveUploadWrittenJson;
        }
        if ((i & 4) == 0) {
            this.bytes_written = null;
        } else {
            this.bytes_written = l;
        }
    }

    public /* synthetic */ FsExclusiveUploadResponseJson(boolean z, FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : fsExclusiveUploadWrittenJson, (i & 4) != 0 ? null : l);
    }

    public FsExclusiveUploadResponseJson() {
        this(false, null, null);
    }
}
