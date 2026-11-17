package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
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
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class DisconnectConfirmationSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String identifier;
    public final HatchSkillOAuthOrigin origin;
    public final String sourceSessionId;
    public final HatchSkillDetailScreenKey sourceSkillKey;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, DisconnectConfirmationSheetKey$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<DisconnectConfirmationSheetKey> serializer() {
            return DisconnectConfirmationSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisconnectConfirmationSheetKey) {
                DisconnectConfirmationSheetKey disconnectConfirmationSheetKey = (DisconnectConfirmationSheetKey) obj;
                if (!C7384Etj.areEqual(this.identifier, disconnectConfirmationSheetKey.identifier) || !C7384Etj.areEqual(this.sourceSkillKey, disconnectConfirmationSheetKey.sourceSkillKey) || this.origin != disconnectConfirmationSheetKey.origin || !C7384Etj.areEqual(this.sourceSessionId, disconnectConfirmationSheetKey.sourceSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ DisconnectConfirmationSheetKey(int i, String str, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DisconnectConfirmationSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.identifier = str;
        if ((i & 2) == 0) {
            this.sourceSkillKey = null;
        } else {
            this.sourceSkillKey = hatchSkillDetailScreenKey;
        }
        if ((i & 4) == 0) {
            this.origin = HatchSkillOAuthOrigin.SETTINGS;
        } else {
            this.origin = hatchSkillOAuthOrigin;
        }
        if ((i & 8) == 0) {
            this.sourceSessionId = null;
        } else {
            this.sourceSessionId = str2;
        }
    }

    public static /* synthetic */ DisconnectConfirmationSheetKey copy$default(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, String str, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disconnectConfirmationSheetKey.identifier;
        }
        if ((i & 2) != 0) {
            hatchSkillDetailScreenKey = disconnectConfirmationSheetKey.sourceSkillKey;
        }
        if ((i & 4) != 0) {
            hatchSkillOAuthOrigin = disconnectConfirmationSheetKey.origin;
        }
        if ((i & 8) != 0) {
            str2 = disconnectConfirmationSheetKey.sourceSessionId;
        }
        AnonymousClass003.A0v(str, hatchSkillOAuthOrigin);
        return new DisconnectConfirmationSheetKey(str, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(disconnectConfirmationSheetKey.identifier, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || disconnectConfirmationSheetKey.sourceSkillKey != null) {
            c9j5.AAP(disconnectConfirmationSheetKey.sourceSkillKey, HatchSkillDetailScreenKey$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || disconnectConfirmationSheetKey.origin != HatchSkillOAuthOrigin.SETTINGS) {
            c9j5.AAQ(disconnectConfirmationSheetKey.origin, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || disconnectConfirmationSheetKey.sourceSessionId != null) {
            c9j5.AAP(disconnectConfirmationSheetKey.sourceSessionId, C07779iq.A01, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.identifier;
    }

    public final HatchSkillDetailScreenKey component2() {
        return this.sourceSkillKey;
    }

    public final HatchSkillOAuthOrigin component3() {
        return this.origin;
    }

    public final String component4() {
        return this.sourceSessionId;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final HatchSkillOAuthOrigin getOrigin() {
        return this.origin;
    }

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public final HatchSkillDetailScreenKey getSourceSkillKey() {
        return this.sourceSkillKey;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.origin, (AnonymousClass001.A0G(this.identifier) + AnonymousClass006.A0D(this.sourceSkillKey)) * 31) + AnonymousClass005.A0H(this.sourceSessionId);
    }

    public final DisconnectConfirmationSheetKey copy(String str, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0v(str, hatchSkillOAuthOrigin);
        return new DisconnectConfirmationSheetKey(str, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, str2);
    }

    public String toString() {
        return super.toString();
    }

    public DisconnectConfirmationSheetKey(String str, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0v(str, hatchSkillOAuthOrigin);
        this.identifier = str;
        this.sourceSkillKey = hatchSkillDetailScreenKey;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
    }

    public /* synthetic */ DisconnectConfirmationSheetKey(String str, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : hatchSkillDetailScreenKey, (i & 4) != 0 ? HatchSkillOAuthOrigin.SETTINGS : hatchSkillOAuthOrigin, (i & 8) != 0 ? null : str2);
    }
}
