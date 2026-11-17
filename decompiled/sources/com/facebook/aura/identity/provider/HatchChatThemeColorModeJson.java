package com.facebook.aura.identity.provider;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchChatThemeColorModeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String dark;
    public final String light;

    public final class Companion {
        public final C9hr<HatchChatThemeColorModeJson> serializer() {
            return HatchChatThemeColorModeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider(HatchChatThemeColorModeJson hatchChatThemeColorModeJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchChatThemeColorModeJson.light, c9iZ, 0);
        c9j5.AAV(hatchChatThemeColorModeJson.dark, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemeColorModeJson) {
                HatchChatThemeColorModeJson hatchChatThemeColorModeJson = (HatchChatThemeColorModeJson) obj;
                if (!C7384Etj.areEqual(this.light, hatchChatThemeColorModeJson.light) || !C7384Etj.areEqual(this.dark, hatchChatThemeColorModeJson.dark)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChatThemeColorModeJson copy$default(HatchChatThemeColorModeJson hatchChatThemeColorModeJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatThemeColorModeJson.light;
        }
        if ((i & 2) != 0) {
            str2 = hatchChatThemeColorModeJson.dark;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchChatThemeColorModeJson(str, str2);
    }

    public final String component1() {
        return this.light;
    }

    public final String component2() {
        return this.dark;
    }

    /* renamed from: darkColor-QN2ZGVo, reason: not valid java name */
    public final B6A m1100darkColorQN2ZGVo() {
        return HatchChatThemeJsonKt.colorFromHexString(this.dark);
    }

    public final String getDark() {
        return this.dark;
    }

    public final String getLight() {
        return this.light;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.dark, AnonymousClass001.A0G(this.light));
    }

    /* renamed from: lightColor-QN2ZGVo, reason: not valid java name */
    public final B6A m1101lightColorQN2ZGVo() {
        return HatchChatThemeJsonKt.colorFromHexString(this.light);
    }

    public HatchChatThemeColorModeJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.light = str;
        this.dark = str2;
    }

    public final HatchChatThemeColorModeJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchChatThemeColorModeJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchChatThemeColorModeJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchChatThemeColorModeJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.light = str;
        this.dark = str2;
    }
}
