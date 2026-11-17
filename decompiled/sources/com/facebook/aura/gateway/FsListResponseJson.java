package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final class FsListResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<FsEntryJson> entries;
    public final FsErrorJson error;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, FsListResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<FsListResponseJson> serializer() {
            return FsListResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsListResponseJson(List<FsEntryJson> list, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(list, 0);
        this.entries = list;
        this.error = fsErrorJson;
    }

    public final FsListResponseJson copy(List<FsEntryJson> list, FsErrorJson fsErrorJson) {
        C7384Etj.A0Y(list, 0);
        return new FsListResponseJson(list, fsErrorJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsListResponseJson) {
                FsListResponseJson fsListResponseJson = (FsListResponseJson) obj;
                if (!C7384Etj.areEqual(this.entries, fsListResponseJson.entries) || !C7384Etj.areEqual(this.error, fsListResponseJson.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsListResponseJson copy$default(FsListResponseJson fsListResponseJson, List list, FsErrorJson fsErrorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fsListResponseJson.entries;
        }
        if ((i & 2) != 0) {
            fsErrorJson = fsListResponseJson.error;
        }
        C7384Etj.A0Y(list, 0);
        return new FsListResponseJson(list, fsErrorJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsListResponseJson fsListResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(fsListResponseJson.entries)) {
            c9j5.AAQ(fsListResponseJson.entries, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || fsListResponseJson.error != null) {
            c9j5.AAP(fsListResponseJson.error, FsErrorJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<FsEntryJson> component1() {
        return this.entries;
    }

    public final FsErrorJson component2() {
        return this.error;
    }

    public final List<FsEntryJson> getEntries() {
        return this.entries;
    }

    public final FsErrorJson getError() {
        return this.error;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.entries) + AnonymousClass006.A0D(this.error);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsListResponseJson(int i, List list, FsErrorJson fsErrorJson, C2hx c2hx) {
        this.entries = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = fsErrorJson;
        }
    }

    public /* synthetic */ FsListResponseJson(List list, FsErrorJson fsErrorJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : fsErrorJson);
    }

    public FsListResponseJson() {
        this(C0881AGi.A00, null);
    }
}
