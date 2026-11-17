package com.facebook.aura.identity.provider;

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
/* loaded from: classes2.dex */
public final class HatchChatThemesSetResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String selected_theme_id;

    public final class Companion {
        public final C9hr<HatchChatThemesSetResponseJson> serializer() {
            return HatchChatThemesSetResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider(HatchChatThemesSetResponseJson hatchChatThemesSetResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || hatchChatThemesSetResponseJson.selected_theme_id != null) {
            c9j5.AAP(hatchChatThemesSetResponseJson.selected_theme_id, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchChatThemesSetResponseJson) && C7384Etj.areEqual(this.selected_theme_id, ((HatchChatThemesSetResponseJson) obj).selected_theme_id));
    }

    public static /* synthetic */ HatchChatThemesSetResponseJson copy$default(HatchChatThemesSetResponseJson hatchChatThemesSetResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatThemesSetResponseJson.selected_theme_id;
        }
        return new HatchChatThemesSetResponseJson(str);
    }

    public final String component1() {
        return this.selected_theme_id;
    }

    public final HatchChatThemesSetResponseJson copy(String str) {
        return new HatchChatThemesSetResponseJson(str);
    }

    public final String getSelected_theme_id() {
        return this.selected_theme_id;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.selected_theme_id);
    }

    public /* synthetic */ HatchChatThemesSetResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.selected_theme_id = null;
        } else {
            this.selected_theme_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchChatThemesSetResponseJson(String str) {
        this.selected_theme_id = str;
    }

    public /* synthetic */ HatchChatThemesSetResponseJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public HatchChatThemesSetResponseJson() {
        this(null);
    }
}
