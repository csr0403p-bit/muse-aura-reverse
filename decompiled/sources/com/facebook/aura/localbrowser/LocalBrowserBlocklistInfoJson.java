package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistInfoJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean loaded;
    public final String source_ds;
    public final String version;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistInfoJson> serializer() {
            return LocalBrowserBlocklistInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(com.facebook.aura.localbrowser.LocalBrowserBlocklistInfoJson r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r1 = 0
            boolean r3 = r5.AfR()
            r2 = 1
            if (r3 != 0) goto Lc
            boolean r0 = r4.loaded
            if (r0 == r2) goto L29
        Lc:
            boolean r0 = r4.loaded
            r5.AA7(r6, r1, r0)
            if (r3 == 0) goto L29
        L13:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r4.version
            r5.AAP(r0, r1, r6, r2)
        L1a:
            r2 = 2
            if (r3 != 0) goto L21
            java.lang.String r0 = r4.source_ds
            if (r0 == 0) goto L28
        L21:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r4.source_ds
            r5.AAP(r0, r1, r6, r2)
        L28:
            return
        L29:
            java.lang.String r0 = r4.version
            if (r0 == 0) goto L1a
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserBlocklistInfoJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(com.facebook.aura.localbrowser.LocalBrowserBlocklistInfoJson, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistInfoJson) {
                LocalBrowserBlocklistInfoJson localBrowserBlocklistInfoJson = (LocalBrowserBlocklistInfoJson) obj;
                if (this.loaded != localBrowserBlocklistInfoJson.loaded || !C7384Etj.areEqual(this.version, localBrowserBlocklistInfoJson.version) || !C7384Etj.areEqual(this.source_ds, localBrowserBlocklistInfoJson.source_ds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserBlocklistInfoJson copy$default(LocalBrowserBlocklistInfoJson localBrowserBlocklistInfoJson, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localBrowserBlocklistInfoJson.loaded;
        }
        if ((i & 2) != 0) {
            str = localBrowserBlocklistInfoJson.version;
        }
        if ((i & 4) != 0) {
            str2 = localBrowserBlocklistInfoJson.source_ds;
        }
        return new LocalBrowserBlocklistInfoJson(z, str, str2);
    }

    public final boolean component1() {
        return this.loaded;
    }

    public final String component2() {
        return this.version;
    }

    public final String component3() {
        return this.source_ds;
    }

    public final LocalBrowserBlocklistInfoJson copy(boolean z, String str, String str2) {
        return new LocalBrowserBlocklistInfoJson(z, str, str2);
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    public final String getSource_ds() {
        return this.source_ds;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((C0KA.A02(this.loaded) + AnonymousClass006.A0G(this.version)) * 31) + AnonymousClass005.A0H(this.source_ds);
    }

    public String toString() {
        boolean z = this.loaded;
        String str = this.version;
        String str2 = this.source_ds;
        StringBuilder sbA10 = C60O.A10("LocalBrowserBlocklistInfoJson(loaded=", z);
        sbA10.append(", version=");
        sbA10.append(str);
        return C3cJ.A0N(", source_ds=", str2, sbA10);
    }

    public LocalBrowserBlocklistInfoJson(boolean z, String str, String str2) {
        this.loaded = z;
        this.version = str;
        this.source_ds = str2;
    }

    public /* synthetic */ LocalBrowserBlocklistInfoJson(int i, boolean z, String str, String str2, C2hx c2hx) {
        this.loaded = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.version = null;
        } else {
            this.version = str;
        }
        if ((i & 4) == 0) {
            this.source_ds = null;
        } else {
            this.source_ds = str2;
        }
    }

    public /* synthetic */ LocalBrowserBlocklistInfoJson(boolean z, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public LocalBrowserBlocklistInfoJson() {
        this(true, null, null);
    }
}
