package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistFilterJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String sha256;
    public final Long size;
    public final String url;
    public final String version;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistFilterJson> serializer() {
            return LocalBrowserBlocklistFilterJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserBlocklistFilterJson(String str, String str2, String str3, Long l) {
        C7384Etj.A0Y(str, 0);
        this.version = str;
        this.url = str2;
        this.sha256 = str3;
        this.size = l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserBlocklistFilterJson localBrowserBlocklistFilterJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(localBrowserBlocklistFilterJson.version, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || localBrowserBlocklistFilterJson.url != null) {
            c9j5.AAP(localBrowserBlocklistFilterJson.url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || localBrowserBlocklistFilterJson.sha256 != null) {
            c9j5.AAP(localBrowserBlocklistFilterJson.sha256, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || localBrowserBlocklistFilterJson.size != null) {
            c9j5.AAP(localBrowserBlocklistFilterJson.size, C9j1.A00, c9iZ, 3);
        }
    }

    public final LocalBrowserBlocklistFilterJson copy(String str, String str2, String str3, Long l) {
        C7384Etj.A0Y(str, 0);
        return new LocalBrowserBlocklistFilterJson(str, str2, str3, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistFilterJson) {
                LocalBrowserBlocklistFilterJson localBrowserBlocklistFilterJson = (LocalBrowserBlocklistFilterJson) obj;
                if (!C7384Etj.areEqual(this.version, localBrowserBlocklistFilterJson.version) || !C7384Etj.areEqual(this.url, localBrowserBlocklistFilterJson.url) || !C7384Etj.areEqual(this.sha256, localBrowserBlocklistFilterJson.sha256) || !C7384Etj.areEqual(this.size, localBrowserBlocklistFilterJson.size)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserBlocklistFilterJson copy$default(LocalBrowserBlocklistFilterJson localBrowserBlocklistFilterJson, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBrowserBlocklistFilterJson.version;
        }
        if ((i & 2) != 0) {
            str2 = localBrowserBlocklistFilterJson.url;
        }
        if ((i & 4) != 0) {
            str3 = localBrowserBlocklistFilterJson.sha256;
        }
        if ((i & 8) != 0) {
            l = localBrowserBlocklistFilterJson.size;
        }
        C7384Etj.A0Y(str, 0);
        return new LocalBrowserBlocklistFilterJson(str, str2, str3, l);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.sha256;
    }

    public final Long component4() {
        return this.size;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.version) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.sha256)) * 31) + C3cH.A02(this.size);
    }

    public String toString() {
        String str = this.version;
        String str2 = this.url;
        String str3 = this.sha256;
        Long l = this.size;
        StringBuilder sbA0x = C3cI.A0x("LocalBrowserBlocklistFilterJson(version=", str);
        sbA0x.append(", url=");
        sbA0x.append(str2);
        sbA0x.append(", sha256=");
        sbA0x.append(str3);
        return C3cJ.A0L(l, ", size=", sbA0x);
    }

    public /* synthetic */ LocalBrowserBlocklistFilterJson(int i, String str, String str2, String str3, Long l, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LocalBrowserBlocklistFilterJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.version = str;
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.sha256 = null;
        } else {
            this.sha256 = str3;
        }
        if ((i & 8) == 0) {
            this.size = null;
        } else {
            this.size = l;
        }
    }

    public /* synthetic */ LocalBrowserBlocklistFilterJson(String str, String str2, String str3, Long l, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }
}
