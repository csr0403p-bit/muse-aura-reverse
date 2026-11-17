package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
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
public final class HatchCheckoutNextActionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final HatchCheckoutRedirectUrlJson redirect_url;

    public final class Companion {
        public final C9hr<HatchCheckoutNextActionJson> serializer() {
            return HatchCheckoutNextActionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutNextActionJson hatchCheckoutNextActionJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchCheckoutNextActionJson.redirect_url != null) {
            c9j5.AAP(hatchCheckoutNextActionJson.redirect_url, HatchCheckoutRedirectUrlJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchCheckoutNextActionJson) && C7384Etj.areEqual(this.redirect_url, ((HatchCheckoutNextActionJson) obj).redirect_url));
    }

    public static /* synthetic */ HatchCheckoutNextActionJson copy$default(HatchCheckoutNextActionJson hatchCheckoutNextActionJson, HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchCheckoutRedirectUrlJson = hatchCheckoutNextActionJson.redirect_url;
        }
        return new HatchCheckoutNextActionJson(hatchCheckoutRedirectUrlJson);
    }

    public final HatchCheckoutRedirectUrlJson component1() {
        return this.redirect_url;
    }

    public final HatchCheckoutNextActionJson copy(HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson) {
        return new HatchCheckoutNextActionJson(hatchCheckoutRedirectUrlJson);
    }

    public final HatchCheckoutRedirectUrlJson getRedirect_url() {
        return this.redirect_url;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.redirect_url);
    }

    public /* synthetic */ HatchCheckoutNextActionJson(int i, HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.redirect_url = null;
        } else {
            this.redirect_url = hatchCheckoutRedirectUrlJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchCheckoutNextActionJson(HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson) {
        this.redirect_url = hatchCheckoutRedirectUrlJson;
    }

    public /* synthetic */ HatchCheckoutNextActionJson(HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchCheckoutRedirectUrlJson);
    }

    public HatchCheckoutNextActionJson() {
        this(null);
    }
}
