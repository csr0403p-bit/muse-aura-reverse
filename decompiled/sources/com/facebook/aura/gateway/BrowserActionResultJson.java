package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserActionResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String error;
    public final String message;
    public final boolean ok;

    public final class Companion {
        public final C9hr<BrowserActionResultJson> serializer() {
            return BrowserActionResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(BrowserActionResultJson browserActionResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || browserActionResultJson.ok) {
            c9j5.AA7(c9iZ, 0, browserActionResultJson.ok);
        }
        if (zAfR || browserActionResultJson.error != null) {
            c9j5.AAP(browserActionResultJson.error, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || browserActionResultJson.message != null) {
            c9j5.AAP(browserActionResultJson.message, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserActionResultJson) {
                BrowserActionResultJson browserActionResultJson = (BrowserActionResultJson) obj;
                if (this.ok != browserActionResultJson.ok || !C7384Etj.areEqual(this.error, browserActionResultJson.error) || !C7384Etj.areEqual(this.message, browserActionResultJson.message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BrowserActionResultJson copy$default(BrowserActionResultJson browserActionResultJson, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = browserActionResultJson.ok;
        }
        if ((i & 2) != 0) {
            str = browserActionResultJson.error;
        }
        if ((i & 4) != 0) {
            str2 = browserActionResultJson.message;
        }
        return new BrowserActionResultJson(z, str, str2);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component2() {
        return this.error;
    }

    public final String component3() {
        return this.message;
    }

    public final BrowserActionResultJson copy(boolean z, String str, String str2) {
        return new BrowserActionResultJson(z, str, str2);
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public int hashCode() {
        return ((C0KA.A02(this.ok) + AnonymousClass006.A0G(this.error)) * 31) + AnonymousClass005.A0H(this.message);
    }

    public BrowserActionResultJson(boolean z, String str, String str2) {
        this.ok = z;
        this.error = str;
        this.message = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BrowserActionResultJson(int i, boolean z, String str, String str2, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
    }

    public /* synthetic */ BrowserActionResultJson(boolean z, String str, String str2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public BrowserActionResultJson() {
        this(false, null, null);
    }
}
