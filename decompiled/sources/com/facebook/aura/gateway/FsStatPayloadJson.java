package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsStatPayloadJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final long modified_ms;
    public final String path;
    public final long size;

    public final class Companion {
        public final C9hr<FsStatPayloadJson> serializer() {
            return FsStatPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FsStatPayloadJson copy$default(FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            str3 = fsStatPayloadJson.path;
        }
        if ((i & 2) != 0) {
            str4 = fsStatPayloadJson.kind;
        }
        if ((i & 4) != 0) {
            j3 = fsStatPayloadJson.size;
        }
        if ((i & 8) != 0) {
            j4 = fsStatPayloadJson.modified_ms;
        }
        AnonymousClass003.A0u(str3, str4);
        return new FsStatPayloadJson(str3, str4, j3, j4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsStatPayloadJson fsStatPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(fsStatPayloadJson.path)) {
            c9j5.AAV(fsStatPayloadJson.path, c9iZ, 0);
        }
        if (zAfR || !"".equals(fsStatPayloadJson.kind)) {
            c9j5.AAV(fsStatPayloadJson.kind, c9iZ, 1);
        }
        if (zAfR || fsStatPayloadJson.size != 0) {
            c9j5.AAN(c9iZ, 2, fsStatPayloadJson.size);
        }
        if (zAfR || fsStatPayloadJson.modified_ms != -1) {
            c9j5.AAN(c9iZ, 3, fsStatPayloadJson.modified_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsStatPayloadJson) {
                FsStatPayloadJson fsStatPayloadJson = (FsStatPayloadJson) obj;
                if (!C7384Etj.areEqual(this.path, fsStatPayloadJson.path) || !C7384Etj.areEqual(this.kind, fsStatPayloadJson.kind) || this.size != fsStatPayloadJson.size || this.modified_ms != fsStatPayloadJson.modified_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.kind;
    }

    public final long component3() {
        return this.size;
    }

    public final long component4() {
        return this.modified_ms;
    }

    public final String getKind() {
        return this.kind;
    }

    public final long getModified_ms() {
        return this.modified_ms;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.path))) + C3cG.A02(this.modified_ms);
    }

    public /* synthetic */ FsStatPayloadJson(int i, String str, String str2, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 4) == 0) {
            this.size = 0L;
        } else {
            this.size = j;
        }
        if ((i & 8) == 0) {
            this.modified_ms = -1L;
        } else {
            this.modified_ms = j2;
        }
    }

    public final FsStatPayloadJson copy(String str, String str2, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new FsStatPayloadJson(str, str2, j, j2);
    }

    public String toString() {
        return super.toString();
    }

    public FsStatPayloadJson(String str, String str2, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.kind = str2;
        this.size = j;
        this.modified_ms = j2;
    }

    public /* synthetic */ FsStatPayloadJson(String str, String str2, long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? -1L : j2);
    }

    public FsStatPayloadJson() {
        this("", "", 0L, -1L);
    }
}
