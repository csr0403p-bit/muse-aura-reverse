package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
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
public final class SkillAlreadyConnectedOrDisconnectedSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String identifier;
    public final boolean isConnectFlow;
    public final HatchSkillOAuthOrigin origin;
    public final String sourceSessionId;
    public final HatchSkillDetailScreenKey sourceSkillKey;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, SkillAlreadyConnectedOrDisconnectedSheetKey$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<SkillAlreadyConnectedOrDisconnectedSheetKey> serializer() {
            return SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillAlreadyConnectedOrDisconnectedSheetKey) {
                SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey = (SkillAlreadyConnectedOrDisconnectedSheetKey) obj;
                if (!C7384Etj.areEqual(this.identifier, skillAlreadyConnectedOrDisconnectedSheetKey.identifier) || this.isConnectFlow != skillAlreadyConnectedOrDisconnectedSheetKey.isConnectFlow || !C7384Etj.areEqual(this.sourceSkillKey, skillAlreadyConnectedOrDisconnectedSheetKey.sourceSkillKey) || this.origin != skillAlreadyConnectedOrDisconnectedSheetKey.origin || !C7384Etj.areEqual(this.sourceSessionId, skillAlreadyConnectedOrDisconnectedSheetKey.sourceSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey copy$default(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillAlreadyConnectedOrDisconnectedSheetKey.identifier;
        }
        if ((i & 2) != 0) {
            z = skillAlreadyConnectedOrDisconnectedSheetKey.isConnectFlow;
        }
        if ((i & 4) != 0) {
            hatchSkillDetailScreenKey = skillAlreadyConnectedOrDisconnectedSheetKey.sourceSkillKey;
        }
        if ((i & 8) != 0) {
            hatchSkillOAuthOrigin = skillAlreadyConnectedOrDisconnectedSheetKey.origin;
        }
        if ((i & 16) != 0) {
            str2 = skillAlreadyConnectedOrDisconnectedSheetKey.sourceSessionId;
        }
        return skillAlreadyConnectedOrDisconnectedSheetKey.copy(str, z, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(skillAlreadyConnectedOrDisconnectedSheetKey.identifier, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, skillAlreadyConnectedOrDisconnectedSheetKey.isConnectFlow);
        boolean zAfR = c9j5.AfR();
        if (zAfR || skillAlreadyConnectedOrDisconnectedSheetKey.sourceSkillKey != null) {
            c9j5.AAP(skillAlreadyConnectedOrDisconnectedSheetKey.sourceSkillKey, HatchSkillDetailScreenKey$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || skillAlreadyConnectedOrDisconnectedSheetKey.origin != HatchSkillOAuthOrigin.SETTINGS) {
            c9j5.AAQ(skillAlreadyConnectedOrDisconnectedSheetKey.origin, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || skillAlreadyConnectedOrDisconnectedSheetKey.sourceSessionId != null) {
            c9j5.AAP(skillAlreadyConnectedOrDisconnectedSheetKey.sourceSessionId, C07779iq.A01, c9iZ, 4);
        }
    }

    public final String component1() {
        return this.identifier;
    }

    public final boolean component2() {
        return this.isConnectFlow;
    }

    public final HatchSkillDetailScreenKey component3() {
        return this.sourceSkillKey;
    }

    public final HatchSkillOAuthOrigin component4() {
        return this.origin;
    }

    public final String component5() {
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
        return AnonymousClass005.A0F(this.origin, (C0KA.A01(AnonymousClass001.A0G(this.identifier), this.isConnectFlow) + AnonymousClass006.A0D(this.sourceSkillKey)) * 31) + AnonymousClass005.A0H(this.sourceSessionId);
    }

    public final boolean isConnectFlow() {
        return this.isConnectFlow;
    }

    public SkillAlreadyConnectedOrDisconnectedSheetKey(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0w(str, hatchSkillOAuthOrigin);
        this.identifier = str;
        this.isConnectFlow = z;
        this.sourceSkillKey = hatchSkillDetailScreenKey;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
    }

    public final SkillAlreadyConnectedOrDisconnectedSheetKey copy(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0w(str, hatchSkillOAuthOrigin);
        return new SkillAlreadyConnectedOrDisconnectedSheetKey(str, z, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, C06H c06h) {
        this(str, z, (i & 4) != 0 ? null : hatchSkillDetailScreenKey, (i & 8) != 0 ? HatchSkillOAuthOrigin.SETTINGS : hatchSkillOAuthOrigin, (i & 16) != 0 ? null : str2);
    }

    public /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey(int i, String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SkillAlreadyConnectedOrDisconnectedSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.identifier = str;
        this.isConnectFlow = z;
        if ((i & 4) == 0) {
            this.sourceSkillKey = null;
        } else {
            this.sourceSkillKey = hatchSkillDetailScreenKey;
        }
        if ((i & 8) == 0) {
            this.origin = HatchSkillOAuthOrigin.SETTINGS;
        } else {
            this.origin = hatchSkillOAuthOrigin;
        }
        if ((i & 16) == 0) {
            this.sourceSessionId = null;
        } else {
            this.sourceSessionId = str2;
        }
    }
}
