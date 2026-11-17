package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsSearchNameJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String contains;

    public final class Companion {
        public final C9hr<FsSearchNameJson> serializer() {
            return FsSearchNameJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final FsSearchNameJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FsSearchNameJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FsSearchNameJson) && C7384Etj.areEqual(this.contains, ((FsSearchNameJson) obj).contains));
    }

    public /* synthetic */ FsSearchNameJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FsSearchNameJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.contains = str;
    }

    public static /* synthetic */ FsSearchNameJson copy$default(FsSearchNameJson fsSearchNameJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsSearchNameJson.contains;
        }
        C7384Etj.A0Y(str, 0);
        return new FsSearchNameJson(str);
    }

    public final String component1() {
        return this.contains;
    }

    public final String getContains() {
        return this.contains;
    }

    public int hashCode() {
        return this.contains.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public FsSearchNameJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.contains = str;
    }
}
