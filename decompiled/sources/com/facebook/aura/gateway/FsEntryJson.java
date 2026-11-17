package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class FsEntryJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String modifiedAt;
    public final String name;
    public final long size;
    public final String type;

    public final class Companion {
        public final C9hr<FsEntryJson> serializer() {
            return FsEntryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ FsEntryJson copy$default(FsEntryJson fsEntryJson, String str, String str2, long j, String str3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = fsEntryJson.name;
        }
        if ((i & 2) != 0) {
            str5 = fsEntryJson.type;
        }
        if ((i & 4) != 0) {
            j2 = fsEntryJson.size;
        }
        if ((i & 8) != 0) {
            str6 = fsEntryJson.modifiedAt;
        }
        AnonymousClass003.A0u(str4, str5);
        return new FsEntryJson(str4, str5, j2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FsEntryJson fsEntryJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(fsEntryJson.name)) {
            c9j5.AAV(fsEntryJson.name, c9iZ, 0);
        }
        if (zAfR || !"".equals(fsEntryJson.type)) {
            c9j5.AAV(fsEntryJson.type, c9iZ, 1);
        }
        if (zAfR || fsEntryJson.size != 0) {
            c9j5.AAN(c9iZ, 2, fsEntryJson.size);
        }
        if (zAfR || fsEntryJson.modifiedAt != null) {
            c9j5.AAP(fsEntryJson.modifiedAt, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsEntryJson) {
                FsEntryJson fsEntryJson = (FsEntryJson) obj;
                if (!C7384Etj.areEqual(this.name, fsEntryJson.name) || !C7384Etj.areEqual(this.type, fsEntryJson.type) || this.size != fsEntryJson.size || !C7384Etj.areEqual(this.modifiedAt, fsEntryJson.modifiedAt)) {
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
        return this.type;
    }

    public final long component3() {
        return this.size;
    }

    public final String component4() {
        return this.modifiedAt;
    }

    public final String getModifiedAt() {
        return this.modifiedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return C60R.A00(this.size, AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.name))) + AnonymousClass006.A0G(this.modifiedAt);
    }

    public /* synthetic */ FsEntryJson(int i, String str, String str2, long j, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.size = 0L;
        } else {
            this.size = j;
        }
        if ((i & 8) == 0) {
            this.modifiedAt = null;
        } else {
            this.modifiedAt = str3;
        }
    }

    public final FsEntryJson copy(String str, String str2, long j, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new FsEntryJson(str, str2, j, str3);
    }

    public String toString() {
        return super.toString();
    }

    public FsEntryJson(String str, String str2, long j, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.type = str2;
        this.size = j;
        this.modifiedAt = str3;
    }

    public /* synthetic */ FsEntryJson(String str, String str2, long j, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, AnonymousClass006.A0u(i, str3));
    }

    public FsEntryJson() {
        this("", "", 0L, null);
    }
}
