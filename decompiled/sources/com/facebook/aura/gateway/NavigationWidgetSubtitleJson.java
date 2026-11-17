package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class NavigationWidgetSubtitleJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String subtitle;

    public final class Companion {
        public final C9hr<NavigationWidgetSubtitleJson> serializer() {
            return NavigationWidgetSubtitleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(NavigationWidgetSubtitleJson navigationWidgetSubtitleJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || navigationWidgetSubtitleJson.subtitle != null) {
            c9j5.AAP(navigationWidgetSubtitleJson.subtitle, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof NavigationWidgetSubtitleJson) && C7384Etj.areEqual(this.subtitle, ((NavigationWidgetSubtitleJson) obj).subtitle));
    }

    public static /* synthetic */ NavigationWidgetSubtitleJson copy$default(NavigationWidgetSubtitleJson navigationWidgetSubtitleJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationWidgetSubtitleJson.subtitle;
        }
        return new NavigationWidgetSubtitleJson(str);
    }

    public final String component1() {
        return this.subtitle;
    }

    public final NavigationWidgetSubtitleJson copy(String str) {
        return new NavigationWidgetSubtitleJson(str);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.subtitle);
    }

    public /* synthetic */ NavigationWidgetSubtitleJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public NavigationWidgetSubtitleJson(String str) {
        this.subtitle = str;
    }

    public /* synthetic */ NavigationWidgetSubtitleJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public NavigationWidgetSubtitleJson() {
        this(null);
    }
}
