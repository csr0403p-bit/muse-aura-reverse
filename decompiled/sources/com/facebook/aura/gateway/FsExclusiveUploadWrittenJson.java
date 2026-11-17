package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsExclusiveUploadWrittenJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long bytes_written;

    public final class Companion {
        public final C9hr<FsExclusiveUploadWrittenJson> serializer() {
            return FsExclusiveUploadWrittenJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || fsExclusiveUploadWrittenJson.bytes_written != null) {
            c9j5.AAP(fsExclusiveUploadWrittenJson.bytes_written, C9j1.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FsExclusiveUploadWrittenJson) && C7384Etj.areEqual(this.bytes_written, ((FsExclusiveUploadWrittenJson) obj).bytes_written));
    }

    public static /* synthetic */ FsExclusiveUploadWrittenJson copy$default(FsExclusiveUploadWrittenJson fsExclusiveUploadWrittenJson, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = fsExclusiveUploadWrittenJson.bytes_written;
        }
        return new FsExclusiveUploadWrittenJson(l);
    }

    public final Long component1() {
        return this.bytes_written;
    }

    public final FsExclusiveUploadWrittenJson copy(Long l) {
        return new FsExclusiveUploadWrittenJson(l);
    }

    public final Long getBytes_written() {
        return this.bytes_written;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.bytes_written);
    }

    public /* synthetic */ FsExclusiveUploadWrittenJson(int i, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.bytes_written = null;
        } else {
            this.bytes_written = l;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FsExclusiveUploadWrittenJson(Long l) {
        this.bytes_written = l;
    }

    public /* synthetic */ FsExclusiveUploadWrittenJson(Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : l);
    }

    public FsExclusiveUploadWrittenJson() {
        this(null);
    }
}
