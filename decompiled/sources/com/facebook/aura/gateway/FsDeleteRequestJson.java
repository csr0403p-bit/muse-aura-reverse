package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsDeleteRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String path;
    public final boolean recursive;

    public final class Companion {
        public final C9hr<FsDeleteRequestJson> serializer() {
            return FsDeleteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsDeleteRequestJson(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.recursive = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsDeleteRequestJson fsDeleteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsDeleteRequestJson.path, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, fsDeleteRequestJson.recursive);
    }

    public final FsDeleteRequestJson copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new FsDeleteRequestJson(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsDeleteRequestJson) {
                FsDeleteRequestJson fsDeleteRequestJson = (FsDeleteRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsDeleteRequestJson.path) || this.recursive != fsDeleteRequestJson.recursive) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsDeleteRequestJson copy$default(FsDeleteRequestJson fsDeleteRequestJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsDeleteRequestJson.path;
        }
        if ((i & 2) != 0) {
            z = fsDeleteRequestJson.recursive;
        }
        C7384Etj.A0Y(str, 0);
        return new FsDeleteRequestJson(str, z);
    }

    public final String component1() {
        return this.path;
    }

    public final boolean component2() {
        return this.recursive;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getRecursive() {
        return this.recursive;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.path), this.recursive);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsDeleteRequestJson(int i, String str, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FsDeleteRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.recursive = z;
    }
}
