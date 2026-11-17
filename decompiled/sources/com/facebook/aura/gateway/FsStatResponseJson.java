package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
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
/* loaded from: classes3.dex */
public final class FsStatResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final FsErrorJson error;
    public final String kind;
    public final long modified_ms;
    public final String path;
    public final FsStatPayloadJson result;
    public final long size;

    public final class Companion {
        public final C9hr<FsStatResponseJson> serializer() {
            return FsStatResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FsStatResponseJson copy$default(FsStatResponseJson fsStatResponseJson, FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, FsErrorJson fsErrorJson, int i, Object obj) {
        FsStatPayloadJson fsStatPayloadJson2 = fsStatPayloadJson;
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        FsErrorJson fsErrorJson2 = fsErrorJson;
        if ((i & 1) != 0) {
            fsStatPayloadJson2 = fsStatResponseJson.result;
        }
        if ((i & 2) != 0) {
            str3 = fsStatResponseJson.path;
        }
        if ((i & 4) != 0) {
            str4 = fsStatResponseJson.kind;
        }
        if ((i & 8) != 0) {
            j3 = fsStatResponseJson.size;
        }
        if ((i & 16) != 0) {
            j4 = fsStatResponseJson.modified_ms;
        }
        if ((i & 32) != 0) {
            fsErrorJson2 = fsStatResponseJson.error;
        }
        AnonymousClass003.A0x(str3, str4);
        return new FsStatResponseJson(fsStatPayloadJson2, str3, str4, j3, j4, fsErrorJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsStatResponseJson fsStatResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsStatResponseJson.result != null) {
            c9j5.AAP(fsStatResponseJson.result, FsStatPayloadJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !"".equals(fsStatResponseJson.path)) {
            c9j5.AAV(fsStatResponseJson.path, c9iZ, 1);
        }
        if (zAfR || !"".equals(fsStatResponseJson.kind)) {
            c9j5.AAV(fsStatResponseJson.kind, c9iZ, 2);
        }
        if (zAfR || fsStatResponseJson.size != 0) {
            c9j5.AAN(c9iZ, 3, fsStatResponseJson.size);
        }
        if (zAfR || fsStatResponseJson.modified_ms != -1) {
            c9j5.AAN(c9iZ, 4, fsStatResponseJson.modified_ms);
        }
        if (zAfR || fsStatResponseJson.error != null) {
            c9j5.AAP(fsStatResponseJson.error, FsErrorJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsStatResponseJson) {
                FsStatResponseJson fsStatResponseJson = (FsStatResponseJson) obj;
                if (!C7384Etj.areEqual(this.result, fsStatResponseJson.result) || !C7384Etj.areEqual(this.path, fsStatResponseJson.path) || !C7384Etj.areEqual(this.kind, fsStatResponseJson.kind) || this.size != fsStatResponseJson.size || this.modified_ms != fsStatResponseJson.modified_ms || !C7384Etj.areEqual(this.error, fsStatResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public final FsStatPayloadJson component1() {
        return this.result;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.kind;
    }

    public final long component4() {
        return this.size;
    }

    public final long component5() {
        return this.modified_ms;
    }

    public final FsErrorJson component6() {
        return this.error;
    }

    public final FsErrorJson getError() {
        return this.error;
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

    public final FsStatPayloadJson getResult() {
        return this.result;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.modified_ms, AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.kind, AnonymousClass005.A0I(this.path, AnonymousClass006.A0D(this.result) * 31)))) + C3cH.A02(this.error);
    }

    public final FsStatPayloadJson resultOrFlat() {
        FsStatPayloadJson fsStatPayloadJson = this.result;
        return fsStatPayloadJson == null ? new FsStatPayloadJson(this.path, this.kind, this.size, this.modified_ms) : fsStatPayloadJson;
    }

    public FsStatResponseJson(FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, FsErrorJson fsErrorJson) {
        AnonymousClass003.A0x(str, str2);
        this.result = fsStatPayloadJson;
        this.path = str;
        this.kind = str2;
        this.size = j;
        this.modified_ms = j2;
        this.error = fsErrorJson;
    }

    public final FsStatResponseJson copy(FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, FsErrorJson fsErrorJson) {
        AnonymousClass003.A0x(str, str2);
        return new FsStatResponseJson(fsStatPayloadJson, str, str2, j, j2, fsErrorJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsStatResponseJson(FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, FsErrorJson fsErrorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : fsStatPayloadJson, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? -1L : j2, (i & 32) != 0 ? null : fsErrorJson);
    }

    public /* synthetic */ FsStatResponseJson(int i, FsStatPayloadJson fsStatPayloadJson, String str, String str2, long j, long j2, FsErrorJson fsErrorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = fsStatPayloadJson;
        }
        if ((i & 2) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        if ((i & 4) == 0) {
            this.kind = "";
        } else {
            this.kind = str2;
        }
        if ((i & 8) == 0) {
            this.size = 0L;
        } else {
            this.size = j;
        }
        if ((i & 16) == 0) {
            this.modified_ms = -1L;
        } else {
            this.modified_ms = j2;
        }
        if ((i & 32) == 0) {
            this.error = null;
        } else {
            this.error = fsErrorJson;
        }
    }

    public FsStatResponseJson() {
        this(null, "", "", 0L, -1L, null);
    }
}
