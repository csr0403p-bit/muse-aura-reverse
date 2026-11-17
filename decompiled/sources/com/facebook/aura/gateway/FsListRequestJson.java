package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FsListRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<String> extensions;
    public final String path;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, FsListRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<FsListRequestJson> serializer() {
            return FsListRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsListRequestJson(String str, List<String> list) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.extensions = list;
    }

    public final FsListRequestJson copy(String str, List<String> list) {
        C7384Etj.A0Y(str, 0);
        return new FsListRequestJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsListRequestJson) {
                FsListRequestJson fsListRequestJson = (FsListRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsListRequestJson.path) || !C7384Etj.areEqual(this.extensions, fsListRequestJson.extensions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsListRequestJson copy$default(FsListRequestJson fsListRequestJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsListRequestJson.path;
        }
        if ((i & 2) != 0) {
            list = fsListRequestJson.extensions;
        }
        C7384Etj.A0Y(str, 0);
        return new FsListRequestJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsListRequestJson fsListRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(fsListRequestJson.path, c9iZ, 0);
        if (c9j5.AfR() || fsListRequestJson.extensions != null) {
            c9j5.AAP(fsListRequestJson.extensions, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.path;
    }

    public final List<String> component2() {
        return this.extensions;
    }

    public final List<String> getExtensions() {
        return this.extensions;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.path) + AnonymousClass006.A0D(this.extensions);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsListRequestJson(int i, String str, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FsListRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.extensions = (i & 2) == 0 ? null : list;
    }

    public /* synthetic */ FsListRequestJson(String str, List list, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
