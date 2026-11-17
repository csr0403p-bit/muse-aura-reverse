package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraContentAreaNavKey;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchStatusScreenKey extends C06G implements AuraContentAreaNavKey, AuraFullScreenNavKey {
    public final String initialExtensionAction;
    public final String initialExtensionTab;
    public final HatchStatusTab initialTab;
    public final String sessionId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, HatchStatusScreenKey$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<HatchStatusScreenKey> serializer() {
            return HatchStatusScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStatusScreenKey) {
                HatchStatusScreenKey hatchStatusScreenKey = (HatchStatusScreenKey) obj;
                if (this.initialTab != hatchStatusScreenKey.initialTab || !C7384Etj.areEqual(this.sessionId, hatchStatusScreenKey.sessionId) || !C7384Etj.areEqual(this.initialExtensionTab, hatchStatusScreenKey.initialExtensionTab) || !C7384Etj.areEqual(this.initialExtensionAction, hatchStatusScreenKey.initialExtensionAction)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStatusScreenKey copy$default(HatchStatusScreenKey hatchStatusScreenKey, HatchStatusTab hatchStatusTab, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchStatusTab = hatchStatusScreenKey.initialTab;
        }
        if ((i & 2) != 0) {
            str = hatchStatusScreenKey.sessionId;
        }
        if ((i & 4) != 0) {
            str2 = hatchStatusScreenKey.initialExtensionTab;
        }
        if ((i & 8) != 0) {
            str3 = hatchStatusScreenKey.initialExtensionAction;
        }
        return new HatchStatusScreenKey(hatchStatusTab, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchStatusScreenKey hatchStatusScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchStatusScreenKey.initialTab != null) {
            c9j5.AAP(hatchStatusScreenKey.initialTab, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || hatchStatusScreenKey.sessionId != null) {
            c9j5.AAP(hatchStatusScreenKey.sessionId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchStatusScreenKey.initialExtensionTab != null) {
            c9j5.AAP(hatchStatusScreenKey.initialExtensionTab, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchStatusScreenKey.initialExtensionAction != null) {
            c9j5.AAP(hatchStatusScreenKey.initialExtensionAction, C07779iq.A01, c9iZ, 3);
        }
    }

    public final HatchStatusTab component1() {
        return this.initialTab;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.initialExtensionTab;
    }

    public final String component4() {
        return this.initialExtensionAction;
    }

    public final HatchStatusScreenKey copy(HatchStatusTab hatchStatusTab, String str, String str2, String str3) {
        return new HatchStatusScreenKey(hatchStatusTab, str, str2, str3);
    }

    public final String getInitialExtensionAction() {
        return this.initialExtensionAction;
    }

    public final String getInitialExtensionTab() {
        return this.initialExtensionTab;
    }

    public final HatchStatusTab getInitialTab() {
        return this.initialTab;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0D(this.initialTab) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.initialExtensionTab)) * 31) + AnonymousClass005.A0H(this.initialExtensionAction);
    }

    public /* synthetic */ HatchStatusScreenKey(int i, HatchStatusTab hatchStatusTab, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.initialTab = null;
        } else {
            this.initialTab = hatchStatusTab;
        }
        if ((i & 2) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str;
        }
        if ((i & 4) == 0) {
            this.initialExtensionTab = null;
        } else {
            this.initialExtensionTab = str2;
        }
        if ((i & 8) == 0) {
            this.initialExtensionAction = null;
        } else {
            this.initialExtensionAction = str3;
        }
    }

    public String toString() {
        return super.toString();
    }

    public HatchStatusScreenKey(HatchStatusTab hatchStatusTab, String str, String str2, String str3) {
        this.initialTab = hatchStatusTab;
        this.sessionId = str;
        this.initialExtensionTab = str2;
        this.initialExtensionAction = str3;
    }

    public /* synthetic */ HatchStatusScreenKey(HatchStatusTab hatchStatusTab, String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchStatusTab, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public HatchStatusScreenKey() {
        this(null, null, null, null);
    }
}
