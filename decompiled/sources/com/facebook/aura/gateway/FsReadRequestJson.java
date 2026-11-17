package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsReadRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long len;
    public final long offset;
    public final String path;

    public final class Companion {
        public final C9hr<FsReadRequestJson> serializer() {
            return FsReadRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsReadRequestJson(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.offset = j;
        this.len = j2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsReadRequestJson fsReadRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsReadRequestJson.path, c9iZ, 0);
        if (c9j5.AfR() || fsReadRequestJson.offset != 0) {
            c9j5.AAN(c9iZ, 1, fsReadRequestJson.offset);
        }
        c9j5.AAN(c9iZ, 2, fsReadRequestJson.len);
    }

    public final FsReadRequestJson copy(String str, long j, long j2) {
        C7384Etj.A0Y(str, 0);
        return new FsReadRequestJson(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsReadRequestJson) {
                FsReadRequestJson fsReadRequestJson = (FsReadRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsReadRequestJson.path) || this.offset != fsReadRequestJson.offset || this.len != fsReadRequestJson.len) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsReadRequestJson copy$default(FsReadRequestJson fsReadRequestJson, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsReadRequestJson.path;
        }
        if ((i & 2) != 0) {
            j = fsReadRequestJson.offset;
        }
        if ((i & 4) != 0) {
            j2 = fsReadRequestJson.len;
        }
        return fsReadRequestJson.copy(str, j, j2);
    }

    public final String component1() {
        return this.path;
    }

    public final long component2() {
        return this.offset;
    }

    public final long component3() {
        return this.len;
    }

    public final long getLen() {
        return this.len;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.offset, AnonymousClass001.A0G(this.path)) + C3cG.A02(this.len);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsReadRequestJson(int i, String str, long j, long j2, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(FsReadRequestJson$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.offset = (i & 2) == 0 ? 0L : j;
        this.len = j2;
    }

    public /* synthetic */ FsReadRequestJson(String str, long j, long j2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? 0L : j, j2);
    }
}
