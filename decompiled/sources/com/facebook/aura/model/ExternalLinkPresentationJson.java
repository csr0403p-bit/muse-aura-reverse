package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass006;
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
/* loaded from: classes3.dex */
public final class ExternalLinkPresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String url;

    public final class Companion {
        public final C9hr<ExternalLinkPresentationJson> serializer() {
            return ExternalLinkPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ExternalLinkPresentationJson externalLinkPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(externalLinkPresentationJson.url)) {
            c9j5.AAV(externalLinkPresentationJson.url, c9iZ, 0);
        }
    }

    public final ExternalLinkPresentationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ExternalLinkPresentationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ExternalLinkPresentationJson) && C7384Etj.areEqual(this.url, ((ExternalLinkPresentationJson) obj).url));
    }

    public static /* synthetic */ ExternalLinkPresentationJson copy$default(ExternalLinkPresentationJson externalLinkPresentationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalLinkPresentationJson.url;
        }
        C7384Etj.A0Y(str, 0);
        return new ExternalLinkPresentationJson(str);
    }

    public final String component1() {
        return this.url;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final ExternalLinkPresentation toDomain(String str, ShoppingCheckoutAttribution shoppingCheckoutAttribution) {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.url);
        String str2 = null;
        if (strA0l2.length() <= 0 || !(AnonymousClass006.A1b("https://", strA0l2) || AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, strA0l2))) {
            return null;
        }
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        return new ExternalLinkPresentation(strA0l2, str2, shoppingCheckoutAttribution);
    }

    public /* synthetic */ ExternalLinkPresentationJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ExternalLinkPresentationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
    }

    public /* synthetic */ ExternalLinkPresentationJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public ExternalLinkPresentationJson() {
        this("");
    }
}
