package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsLibraryRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer limit;
    public final Integer offset;
    public final String preset;

    public final class Companion {
        public final C9hr<FsLibraryRequestJson> serializer() {
            return FsLibraryRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FsLibraryRequestJson(String str, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 0);
        this.preset = str;
        this.limit = num;
        this.offset = num2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsLibraryRequestJson fsLibraryRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsLibraryRequestJson.preset, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || fsLibraryRequestJson.limit != null) {
            c9j5.AAP(fsLibraryRequestJson.limit, C07729ii.A00, c9iZ, 1);
        }
        if (zAfR || fsLibraryRequestJson.offset != null) {
            c9j5.AAP(fsLibraryRequestJson.offset, C07729ii.A00, c9iZ, 2);
        }
    }

    public final FsLibraryRequestJson copy(String str, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 0);
        return new FsLibraryRequestJson(str, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsLibraryRequestJson) {
                FsLibraryRequestJson fsLibraryRequestJson = (FsLibraryRequestJson) obj;
                if (!C7384Etj.areEqual(this.preset, fsLibraryRequestJson.preset) || !C7384Etj.areEqual(this.limit, fsLibraryRequestJson.limit) || !C7384Etj.areEqual(this.offset, fsLibraryRequestJson.offset)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsLibraryRequestJson copy$default(FsLibraryRequestJson fsLibraryRequestJson, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsLibraryRequestJson.preset;
        }
        if ((i & 2) != 0) {
            num = fsLibraryRequestJson.limit;
        }
        if ((i & 4) != 0) {
            num2 = fsLibraryRequestJson.offset;
        }
        return fsLibraryRequestJson.copy(str, num, num2);
    }

    public final String component1() {
        return this.preset;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final Integer component3() {
        return this.offset;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getPreset() {
        return this.preset;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.preset) + AnonymousClass006.A0D(this.limit)) * 31) + C3cH.A02(this.offset);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsLibraryRequestJson(int i, String str, Integer num, Integer num2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FsLibraryRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.preset = str;
        if ((i & 2) == 0) {
            this.limit = null;
        } else {
            this.limit = num;
        }
        if ((i & 4) == 0) {
            this.offset = null;
        } else {
            this.offset = num2;
        }
    }

    public /* synthetic */ FsLibraryRequestJson(String str, Integer num, Integer num2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
