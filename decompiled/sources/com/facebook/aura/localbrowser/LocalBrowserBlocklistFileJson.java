package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C3cJ;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistFileJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String file;
    public final String sha256;
    public final long size;
    public final String version;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistFileJson> serializer() {
            return LocalBrowserBlocklistFileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ LocalBrowserBlocklistFileJson copy$default(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, String str, String str2, long j, String str3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        long j2 = j;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = localBrowserBlocklistFileJson.file;
        }
        if ((i & 2) != 0) {
            str5 = localBrowserBlocklistFileJson.version;
        }
        if ((i & 4) != 0) {
            j2 = localBrowserBlocklistFileJson.size;
        }
        if ((i & 8) != 0) {
            str6 = localBrowserBlocklistFileJson.sha256;
        }
        AnonymousClass005.A0y(str4, str5, str6);
        return new LocalBrowserBlocklistFileJson(str4, str5, j2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(localBrowserBlocklistFileJson.file, c9iZ, 0);
        c9j5.AAV(localBrowserBlocklistFileJson.version, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, localBrowserBlocklistFileJson.size);
        c9j5.AAV(localBrowserBlocklistFileJson.sha256, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistFileJson) {
                LocalBrowserBlocklistFileJson localBrowserBlocklistFileJson = (LocalBrowserBlocklistFileJson) obj;
                if (!C7384Etj.areEqual(this.file, localBrowserBlocklistFileJson.file) || !C7384Etj.areEqual(this.version, localBrowserBlocklistFileJson.version) || this.size != localBrowserBlocklistFileJson.size || !C7384Etj.areEqual(this.sha256, localBrowserBlocklistFileJson.sha256)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.file;
    }

    public final String component2() {
        return this.version;
    }

    public final long component3() {
        return this.size;
    }

    public final String component4() {
        return this.sha256;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sha256, C60R.A00(this.size, AnonymousClass005.A0I(this.version, AnonymousClass001.A0G(this.file))));
    }

    public String toString() {
        String str = this.file;
        String str2 = this.version;
        long j = this.size;
        String str3 = this.sha256;
        StringBuilder sbA0x = C3cI.A0x("LocalBrowserBlocklistFileJson(file=", str);
        sbA0x.append(", version=");
        sbA0x.append(str2);
        sbA0x.append(", size=");
        sbA0x.append(j);
        return C3cJ.A0N(", sha256=", str3, sbA0x);
    }

    public LocalBrowserBlocklistFileJson(String str, String str2, long j, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        this.file = str;
        this.version = str2;
        this.size = j;
        this.sha256 = str3;
    }

    public final LocalBrowserBlocklistFileJson copy(String str, String str2, long j, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        return new LocalBrowserBlocklistFileJson(str, str2, j, str3);
    }

    public /* synthetic */ LocalBrowserBlocklistFileJson(int i, String str, String str2, long j, String str3, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(LocalBrowserBlocklistFileJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.file = str;
        this.version = str2;
        this.size = j;
        this.sha256 = str3;
    }
}
