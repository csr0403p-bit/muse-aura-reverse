package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsLibraryEntryJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long modified_ms;
    public final String name;
    public final String path;
    public final long size;

    public final class Companion {
        public final C9hr<FsLibraryEntryJson> serializer() {
            return FsLibraryEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FsLibraryEntryJson copy$default(FsLibraryEntryJson fsLibraryEntryJson, String str, String str2, long j, long j2, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            str3 = fsLibraryEntryJson.name;
        }
        if ((i & 2) != 0) {
            str4 = fsLibraryEntryJson.path;
        }
        if ((i & 4) != 0) {
            j3 = fsLibraryEntryJson.size;
        }
        if ((i & 8) != 0) {
            j4 = fsLibraryEntryJson.modified_ms;
        }
        AnonymousClass003.A0u(str3, str4);
        return new FsLibraryEntryJson(str3, str4, j3, j4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsLibraryEntryJson fsLibraryEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(fsLibraryEntryJson.name)) {
            c9j5.AAV(fsLibraryEntryJson.name, c9iZ, 0);
        }
        if (zAfR || !"".equals(fsLibraryEntryJson.path)) {
            c9j5.AAV(fsLibraryEntryJson.path, c9iZ, 1);
        }
        if (zAfR || fsLibraryEntryJson.size != 0) {
            c9j5.AAN(c9iZ, 2, fsLibraryEntryJson.size);
        }
        if (zAfR || fsLibraryEntryJson.modified_ms != 0) {
            c9j5.AAN(c9iZ, 3, fsLibraryEntryJson.modified_ms);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsLibraryEntryJson) {
                FsLibraryEntryJson fsLibraryEntryJson = (FsLibraryEntryJson) obj;
                if (!C7384Etj.areEqual(this.name, fsLibraryEntryJson.name) || !C7384Etj.areEqual(this.path, fsLibraryEntryJson.path) || this.size != fsLibraryEntryJson.size || this.modified_ms != fsLibraryEntryJson.modified_ms) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.path;
    }

    public final long component3() {
        return this.size;
    }

    public final long component4() {
        return this.modified_ms;
    }

    public final long getModified_ms() {
        return this.modified_ms;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.size, AnonymousClass005.A0I(this.path, AnonymousClass001.A0G(this.name))) + C3cG.A02(this.modified_ms);
    }

    public /* synthetic */ FsLibraryEntryJson(int i, String str, String str2, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.path = "";
        } else {
            this.path = str2;
        }
        if ((i & 4) == 0) {
            this.size = 0L;
        } else {
            this.size = j;
        }
        if ((i & 8) == 0) {
            this.modified_ms = 0L;
        } else {
            this.modified_ms = j2;
        }
    }

    public final FsLibraryEntryJson copy(String str, String str2, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        return new FsLibraryEntryJson(str, str2, j, j2);
    }

    public String toString() {
        return super.toString();
    }

    public FsLibraryEntryJson(String str, String str2, long j, long j2) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.path = str2;
        this.size = j;
        this.modified_ms = j2;
    }

    public /* synthetic */ FsLibraryEntryJson(String str, String str2, long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, C3cH.A03(i & 8, j2));
    }

    public FsLibraryEntryJson() {
        this("", "", 0L, 0L);
    }
}
