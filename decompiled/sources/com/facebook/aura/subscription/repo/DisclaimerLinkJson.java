package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DisclaimerLinkJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String token;
    public final String url;

    public final class Companion {
        public final C9hr<DisclaimerLinkJson> serializer() {
            return DisclaimerLinkJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(DisclaimerLinkJson disclaimerLinkJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(disclaimerLinkJson.token)) {
            c9j5.AAV(disclaimerLinkJson.token, c9iZ, 0);
        }
        if (zAfR || !"".equals(disclaimerLinkJson.url)) {
            c9j5.AAV(disclaimerLinkJson.url, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerLinkJson) {
                DisclaimerLinkJson disclaimerLinkJson = (DisclaimerLinkJson) obj;
                if (!C7384Etj.areEqual(this.token, disclaimerLinkJson.token) || !C7384Etj.areEqual(this.url, disclaimerLinkJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DisclaimerLinkJson copy$default(DisclaimerLinkJson disclaimerLinkJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclaimerLinkJson.token;
        }
        if ((i & 2) != 0) {
            str2 = disclaimerLinkJson.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new DisclaimerLinkJson(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.url;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.token));
    }

    public DisclaimerLinkJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.token = str;
        this.url = str2;
    }

    public final DisclaimerLinkJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new DisclaimerLinkJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DisclaimerLinkJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.token = "";
        } else {
            this.token = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
    }

    public /* synthetic */ DisclaimerLinkJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public DisclaimerLinkJson() {
        this("", "");
    }
}
