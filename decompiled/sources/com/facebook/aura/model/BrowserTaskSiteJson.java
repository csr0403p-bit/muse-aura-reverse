package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskSiteJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String domain;

    public final class Companion {
        public final C9hr<BrowserTaskSiteJson> serializer() {
            return BrowserTaskSiteJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(BrowserTaskSiteJson browserTaskSiteJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(browserTaskSiteJson.domain)) {
            c9j5.AAV(browserTaskSiteJson.domain, c9iZ, 0);
        }
    }

    public final BrowserTaskSiteJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskSiteJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserTaskSiteJson) && C7384Etj.areEqual(this.domain, ((BrowserTaskSiteJson) obj).domain));
    }

    public static /* synthetic */ BrowserTaskSiteJson copy$default(BrowserTaskSiteJson browserTaskSiteJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserTaskSiteJson.domain;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserTaskSiteJson(str);
    }

    public final String component1() {
        return this.domain;
    }

    public final String getDomain() {
        return this.domain;
    }

    public int hashCode() {
        return this.domain.hashCode();
    }

    public /* synthetic */ BrowserTaskSiteJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.domain = "";
        } else {
            this.domain = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public BrowserTaskSiteJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.domain = str;
    }

    public /* synthetic */ BrowserTaskSiteJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public BrowserTaskSiteJson() {
        this("");
    }
}
