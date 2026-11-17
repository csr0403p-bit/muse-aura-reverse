package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DisclaimerRunJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String text;
    public final String token;

    public final class Companion {
        public final C9hr<DisclaimerRunJson> serializer() {
            return DisclaimerRunJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DisclaimerRunJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.token = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(DisclaimerRunJson disclaimerRunJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(disclaimerRunJson.text)) {
            c9j5.AAV(disclaimerRunJson.text, c9iZ, 0);
        }
        if (zAfR || disclaimerRunJson.token != null) {
            c9j5.AAP(disclaimerRunJson.token, C07779iq.A01, c9iZ, 1);
        }
    }

    public final DisclaimerRunJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new DisclaimerRunJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerRunJson) {
                DisclaimerRunJson disclaimerRunJson = (DisclaimerRunJson) obj;
                if (!C7384Etj.areEqual(this.text, disclaimerRunJson.text) || !C7384Etj.areEqual(this.token, disclaimerRunJson.token)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DisclaimerRunJson copy$default(DisclaimerRunJson disclaimerRunJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disclaimerRunJson.text;
        }
        if ((i & 2) != 0) {
            str2 = disclaimerRunJson.token;
        }
        C7384Etj.A0Y(str, 0);
        return new DisclaimerRunJson(str, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.token;
    }

    public final String getText() {
        return this.text;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.text) + AnonymousClass006.A0G(this.token);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DisclaimerRunJson(int i, String str, String str2, C2hx c2hx) {
        this.text = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
    }

    public /* synthetic */ DisclaimerRunJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public DisclaimerRunJson() {
        this("", null);
    }
}
