package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
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
public final class FsExportRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String format;
    public final String path;

    public final class Companion {
        public final C9hr<FsExportRequestJson> serializer() {
            return FsExportRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsExportRequestJson fsExportRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsExportRequestJson.path, c9iZ, 0);
        c9j5.AAV(fsExportRequestJson.format, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsExportRequestJson) {
                FsExportRequestJson fsExportRequestJson = (FsExportRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsExportRequestJson.path) || !C7384Etj.areEqual(this.format, fsExportRequestJson.format)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsExportRequestJson copy$default(FsExportRequestJson fsExportRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsExportRequestJson.path;
        }
        if ((i & 2) != 0) {
            str2 = fsExportRequestJson.format;
        }
        AnonymousClass003.A0u(str, str2);
        return new FsExportRequestJson(str, str2);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.format;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.format, AnonymousClass001.A0G(this.path));
    }

    public FsExportRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.format = str2;
    }

    public final FsExportRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FsExportRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsExportRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FsExportRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.format = str2;
    }
}
