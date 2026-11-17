package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistEchoJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String filter_version;
    public final String mode;
    public final String source_ds;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistEchoJson> serializer() {
            return LocalBrowserBlocklistEchoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalBrowserBlocklistEchoJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.mode = str;
        this.filter_version = str2;
        this.source_ds = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserBlocklistEchoJson localBrowserBlocklistEchoJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(localBrowserBlocklistEchoJson.mode, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || localBrowserBlocklistEchoJson.filter_version != null) {
            c9j5.AAP(localBrowserBlocklistEchoJson.filter_version, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || localBrowserBlocklistEchoJson.source_ds != null) {
            c9j5.AAP(localBrowserBlocklistEchoJson.source_ds, C07779iq.A01, c9iZ, 2);
        }
    }

    public final LocalBrowserBlocklistEchoJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new LocalBrowserBlocklistEchoJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistEchoJson) {
                LocalBrowserBlocklistEchoJson localBrowserBlocklistEchoJson = (LocalBrowserBlocklistEchoJson) obj;
                if (!C7384Etj.areEqual(this.mode, localBrowserBlocklistEchoJson.mode) || !C7384Etj.areEqual(this.filter_version, localBrowserBlocklistEchoJson.filter_version) || !C7384Etj.areEqual(this.source_ds, localBrowserBlocklistEchoJson.source_ds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserBlocklistEchoJson copy$default(LocalBrowserBlocklistEchoJson localBrowserBlocklistEchoJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBrowserBlocklistEchoJson.mode;
        }
        if ((i & 2) != 0) {
            str2 = localBrowserBlocklistEchoJson.filter_version;
        }
        if ((i & 4) != 0) {
            str3 = localBrowserBlocklistEchoJson.source_ds;
        }
        return localBrowserBlocklistEchoJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.mode;
    }

    public final String component2() {
        return this.filter_version;
    }

    public final String component3() {
        return this.source_ds;
    }

    public final String getFilter_version() {
        return this.filter_version;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getSource_ds() {
        return this.source_ds;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.mode) + AnonymousClass006.A0G(this.filter_version)) * 31) + AnonymousClass005.A0H(this.source_ds);
    }

    public String toString() {
        return FGI.A0k("LocalBrowserBlocklistEchoJson(mode=", this.mode, ", filter_version=", this.filter_version, ", source_ds=", this.source_ds, ")");
    }

    public /* synthetic */ LocalBrowserBlocklistEchoJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LocalBrowserBlocklistEchoJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.mode = str;
        if ((i & 2) == 0) {
            this.filter_version = null;
        } else {
            this.filter_version = str2;
        }
        if ((i & 4) == 0) {
            this.source_ds = null;
        } else {
            this.source_ds = str3;
        }
    }

    public /* synthetic */ LocalBrowserBlocklistEchoJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
