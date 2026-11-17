package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsSearchRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<String> extensions;
    public final Integer limit;
    public final FsSearchNameJson name;
    public final Integer offset;
    public final String path;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, FsSearchRequestJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<FsSearchRequestJson> serializer() {
            return FsSearchRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsSearchRequestJson) {
                FsSearchRequestJson fsSearchRequestJson = (FsSearchRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, fsSearchRequestJson.path) || !C7384Etj.areEqual(this.name, fsSearchRequestJson.name) || !C7384Etj.areEqual(this.extensions, fsSearchRequestJson.extensions) || !C7384Etj.areEqual(this.limit, fsSearchRequestJson.limit) || !C7384Etj.areEqual(this.offset, fsSearchRequestJson.offset)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FsSearchRequestJson copy$default(FsSearchRequestJson fsSearchRequestJson, String str, FsSearchNameJson fsSearchNameJson, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsSearchRequestJson.path;
        }
        if ((i & 2) != 0) {
            fsSearchNameJson = fsSearchRequestJson.name;
        }
        if ((i & 4) != 0) {
            list = fsSearchRequestJson.extensions;
        }
        if ((i & 8) != 0) {
            num = fsSearchRequestJson.limit;
        }
        if ((i & 16) != 0) {
            num2 = fsSearchRequestJson.offset;
        }
        return fsSearchRequestJson.copy(str, fsSearchNameJson, list, num, num2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsSearchRequestJson fsSearchRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsSearchRequestJson.path != null) {
            c9j5.AAP(fsSearchRequestJson.path, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || fsSearchRequestJson.name != null) {
            c9j5.AAP(fsSearchRequestJson.name, FsSearchNameJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || fsSearchRequestJson.extensions != null) {
            c9j5.AAP(fsSearchRequestJson.extensions, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || fsSearchRequestJson.limit != null) {
            c9j5.AAP(fsSearchRequestJson.limit, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || fsSearchRequestJson.offset != null) {
            c9j5.AAP(fsSearchRequestJson.offset, C07729ii.A00, c9iZ, 4);
        }
    }

    public final String component1() {
        return this.path;
    }

    public final FsSearchNameJson component2() {
        return this.name;
    }

    public final List<String> component3() {
        return this.extensions;
    }

    public final Integer component4() {
        return this.limit;
    }

    public final Integer component5() {
        return this.offset;
    }

    public final FsSearchRequestJson copy(String str, FsSearchNameJson fsSearchNameJson, List<String> list, Integer num, Integer num2) {
        return new FsSearchRequestJson(str, fsSearchNameJson, list, num, num2);
    }

    public final List<String> getExtensions() {
        return this.extensions;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final FsSearchNameJson getName() {
        return this.name;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.path) * 31) + AnonymousClass006.A0D(this.name)) * 31) + AnonymousClass006.A0D(this.extensions)) * 31) + AnonymousClass006.A0D(this.limit)) * 31) + C3cH.A02(this.offset);
    }

    public FsSearchRequestJson(String str, FsSearchNameJson fsSearchNameJson, List<String> list, Integer num, Integer num2) {
        this.path = str;
        this.name = fsSearchNameJson;
        this.extensions = list;
        this.limit = num;
        this.offset = num2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsSearchRequestJson(String str, FsSearchNameJson fsSearchNameJson, List list, Integer num, Integer num2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : fsSearchNameJson, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    public /* synthetic */ FsSearchRequestJson(int i, String str, FsSearchNameJson fsSearchNameJson, List list, Integer num, Integer num2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = fsSearchNameJson;
        }
        if ((i & 4) == 0) {
            this.extensions = null;
        } else {
            this.extensions = list;
        }
        if ((i & 8) == 0) {
            this.limit = null;
        } else {
            this.limit = num;
        }
        if ((i & 16) == 0) {
            this.offset = null;
        } else {
            this.offset = num2;
        }
    }

    public FsSearchRequestJson() {
        this(null, null, null, null, null);
    }
}
