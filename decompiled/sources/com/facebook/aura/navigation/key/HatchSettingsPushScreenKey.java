package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchSettingsPushScreenKey extends C06G implements AuraFullScreenNavKey {
    public final HatchSettingsSubdestination subdestination;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, HatchSettingsPushScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HatchSettingsPushScreenKey> serializer() {
            return HatchSettingsPushScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchSettingsPushScreenKey) && this.subdestination == ((HatchSettingsPushScreenKey) obj).subdestination);
    }

    public static /* synthetic */ HatchSettingsPushScreenKey copy$default(HatchSettingsPushScreenKey hatchSettingsPushScreenKey, HatchSettingsSubdestination hatchSettingsSubdestination, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSettingsSubdestination = hatchSettingsPushScreenKey.subdestination;
        }
        return new HatchSettingsPushScreenKey(hatchSettingsSubdestination);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchSettingsPushScreenKey hatchSettingsPushScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || hatchSettingsPushScreenKey.subdestination != null) {
            c9j5.AAP(hatchSettingsPushScreenKey.subdestination, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final HatchSettingsSubdestination component1() {
        return this.subdestination;
    }

    public final HatchSettingsPushScreenKey copy(HatchSettingsSubdestination hatchSettingsSubdestination) {
        return new HatchSettingsPushScreenKey(hatchSettingsSubdestination);
    }

    public final HatchSettingsSubdestination getSubdestination() {
        return this.subdestination;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.subdestination);
    }

    public /* synthetic */ HatchSettingsPushScreenKey(int i, HatchSettingsSubdestination hatchSettingsSubdestination, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.subdestination = null;
        } else {
            this.subdestination = hatchSettingsSubdestination;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchSettingsPushScreenKey(HatchSettingsSubdestination hatchSettingsSubdestination) {
        this.subdestination = hatchSettingsSubdestination;
    }

    public /* synthetic */ HatchSettingsPushScreenKey(HatchSettingsSubdestination hatchSettingsSubdestination, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchSettingsSubdestination);
    }

    public HatchSettingsPushScreenKey() {
        this(null);
    }
}
