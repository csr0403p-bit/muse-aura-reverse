package com.facebook.aura.identity.provider;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchChatThemesSetRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String theme_id;

    public final class Companion {
        public final C9hr<HatchChatThemesSetRequestJson> serializer() {
            return HatchChatThemesSetRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchChatThemesSetRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchChatThemesSetRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchChatThemesSetRequestJson) && C7384Etj.areEqual(this.theme_id, ((HatchChatThemesSetRequestJson) obj).theme_id));
    }

    public /* synthetic */ HatchChatThemesSetRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchChatThemesSetRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.theme_id = str;
    }

    public static /* synthetic */ HatchChatThemesSetRequestJson copy$default(HatchChatThemesSetRequestJson hatchChatThemesSetRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatThemesSetRequestJson.theme_id;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchChatThemesSetRequestJson(str);
    }

    public final String component1() {
        return this.theme_id;
    }

    public final String getTheme_id() {
        return this.theme_id;
    }

    public int hashCode() {
        return this.theme_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchChatThemesSetRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.theme_id = str;
    }
}
