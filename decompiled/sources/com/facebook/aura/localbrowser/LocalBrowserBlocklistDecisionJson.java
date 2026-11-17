package com.facebook.aura.localbrowser;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cF;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalBrowserBlocklistDecisionJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String decision;
    public final String html;
    public final String reason;

    public final class Companion {
        public final C9hr<LocalBrowserBlocklistDecisionJson> serializer() {
            return LocalBrowserBlocklistDecisionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(LocalBrowserBlocklistDecisionJson localBrowserBlocklistDecisionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || localBrowserBlocklistDecisionJson.decision != null) {
            c9j5.AAP(localBrowserBlocklistDecisionJson.decision, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || localBrowserBlocklistDecisionJson.reason != null) {
            c9j5.AAP(localBrowserBlocklistDecisionJson.reason, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || localBrowserBlocklistDecisionJson.html != null) {
            c9j5.AAP(localBrowserBlocklistDecisionJson.html, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalBrowserBlocklistDecisionJson) {
                LocalBrowserBlocklistDecisionJson localBrowserBlocklistDecisionJson = (LocalBrowserBlocklistDecisionJson) obj;
                if (!C7384Etj.areEqual(this.decision, localBrowserBlocklistDecisionJson.decision) || !C7384Etj.areEqual(this.reason, localBrowserBlocklistDecisionJson.reason) || !C7384Etj.areEqual(this.html, localBrowserBlocklistDecisionJson.html)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalBrowserBlocklistDecisionJson copy$default(LocalBrowserBlocklistDecisionJson localBrowserBlocklistDecisionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localBrowserBlocklistDecisionJson.decision;
        }
        if ((i & 2) != 0) {
            str2 = localBrowserBlocklistDecisionJson.reason;
        }
        if ((i & 4) != 0) {
            str3 = localBrowserBlocklistDecisionJson.html;
        }
        return new LocalBrowserBlocklistDecisionJson(str, str2, str3);
    }

    public final String component1() {
        return this.decision;
    }

    public final String component2() {
        return this.reason;
    }

    public final String component3() {
        return this.html;
    }

    public final LocalBrowserBlocklistDecisionJson copy(String str, String str2, String str3) {
        return new LocalBrowserBlocklistDecisionJson(str, str2, str3);
    }

    public final String getDecision() {
        return this.decision;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.decision) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass005.A0H(this.html);
    }

    public String toString() {
        return FGI.A0k("LocalBrowserBlocklistDecisionJson(decision=", this.decision, C3cF.A00(0), this.reason, ", html=", this.html, ")");
    }

    public LocalBrowserBlocklistDecisionJson(String str, String str2, String str3) {
        this.decision = str;
        this.reason = str2;
        this.html = str3;
    }

    public /* synthetic */ LocalBrowserBlocklistDecisionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.decision = null;
        } else {
            this.decision = str;
        }
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
        if ((i & 4) == 0) {
            this.html = null;
        } else {
            this.html = str3;
        }
    }

    public /* synthetic */ LocalBrowserBlocklistDecisionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public LocalBrowserBlocklistDecisionJson() {
        this(null, null, null);
    }
}
