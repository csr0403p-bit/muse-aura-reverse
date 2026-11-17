package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
public final class FsWriteRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean append;
    public final boolean create_parent;
    public final String data_base64;
    public final boolean overwrite;
    public final String path;

    public final class Companion {
        public final C9hr<FsWriteRequestJson> serializer() {
            return FsWriteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsWriteRequestJson fsWriteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsWriteRequestJson.path, c9iZ, 0);
        c9j5.AAV(fsWriteRequestJson.data_base64, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, fsWriteRequestJson.overwrite);
        c9j5.AA7(c9iZ, 3, fsWriteRequestJson.append);
        c9j5.AA7(c9iZ, 4, fsWriteRequestJson.create_parent);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsWriteRequestJson) {
                FsWriteRequestJson fsWriteRequestJson = (FsWriteRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsWriteRequestJson.path) || !C7384Etj.areEqual(this.data_base64, fsWriteRequestJson.data_base64) || this.overwrite != fsWriteRequestJson.overwrite || this.append != fsWriteRequestJson.append || this.create_parent != fsWriteRequestJson.create_parent) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsWriteRequestJson copy$default(FsWriteRequestJson fsWriteRequestJson, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsWriteRequestJson.path;
        }
        if ((i & 2) != 0) {
            str2 = fsWriteRequestJson.data_base64;
        }
        if ((i & 4) != 0) {
            z = fsWriteRequestJson.overwrite;
        }
        if ((i & 8) != 0) {
            z2 = fsWriteRequestJson.append;
        }
        if ((i & 16) != 0) {
            z3 = fsWriteRequestJson.create_parent;
        }
        return fsWriteRequestJson.copy(str, str2, z, z2, z3);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.data_base64;
    }

    public final boolean component3() {
        return this.overwrite;
    }

    public final boolean component4() {
        return this.append;
    }

    public final boolean component5() {
        return this.create_parent;
    }

    public final boolean getAppend() {
        return this.append;
    }

    public final boolean getCreate_parent() {
        return this.create_parent;
    }

    public final String getData_base64() {
        return this.data_base64;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.data_base64, AnonymousClass001.A0G(this.path)), this.overwrite), this.append), this.create_parent);
    }

    public FsWriteRequestJson(String str, String str2, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.data_base64 = str2;
        this.overwrite = z;
        this.append = z2;
        this.create_parent = z3;
    }

    public final FsWriteRequestJson copy(String str, String str2, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        return new FsWriteRequestJson(str, str2, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsWriteRequestJson(int i, String str, String str2, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(FsWriteRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.data_base64 = str2;
        this.overwrite = z;
        this.append = z2;
        this.create_parent = z3;
    }
}
