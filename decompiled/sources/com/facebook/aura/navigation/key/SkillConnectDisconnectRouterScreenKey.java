package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
public final class SkillConnectDisconnectRouterScreenKey extends C06G implements AuraBottomSheetNavKey {
    public final boolean dismissIfAlreadyInRequestedState;
    public final String identifier;
    public final boolean isConnectFlow;
    public final HatchSkillOAuthOrigin origin;
    public final String sourceSessionId;
    public final HatchSkillDetailScreenKey sourceSkillKey;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, AbstractC5321DgF.A02(C79.A01, SkillConnectDisconnectRouterScreenKey$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<SkillConnectDisconnectRouterScreenKey> serializer() {
            return SkillConnectDisconnectRouterScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SkillConnectDisconnectRouterScreenKey copy$default(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, boolean z2, int i, Object obj) {
        String str3 = str;
        boolean z3 = z;
        HatchSkillDetailScreenKey hatchSkillDetailScreenKey2 = hatchSkillDetailScreenKey;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin2 = hatchSkillOAuthOrigin;
        String str4 = str2;
        boolean z4 = z2;
        if ((i & 1) != 0) {
            str3 = skillConnectDisconnectRouterScreenKey.identifier;
        }
        if ((i & 2) != 0) {
            z3 = skillConnectDisconnectRouterScreenKey.isConnectFlow;
        }
        if ((i & 4) != 0) {
            hatchSkillDetailScreenKey2 = skillConnectDisconnectRouterScreenKey.sourceSkillKey;
        }
        if ((i & 8) != 0) {
            hatchSkillOAuthOrigin2 = skillConnectDisconnectRouterScreenKey.origin;
        }
        if ((i & 16) != 0) {
            str4 = skillConnectDisconnectRouterScreenKey.sourceSessionId;
        }
        if ((i & 32) != 0) {
            z4 = skillConnectDisconnectRouterScreenKey.dismissIfAlreadyInRequestedState;
        }
        AnonymousClass003.A0w(str3, hatchSkillOAuthOrigin2);
        return new SkillConnectDisconnectRouterScreenKey(str3, z3, hatchSkillDetailScreenKey2, hatchSkillOAuthOrigin2, str4, z4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillConnectDisconnectRouterScreenKey) {
                SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey = (SkillConnectDisconnectRouterScreenKey) obj;
                if (!C7384Etj.areEqual(this.identifier, skillConnectDisconnectRouterScreenKey.identifier) || this.isConnectFlow != skillConnectDisconnectRouterScreenKey.isConnectFlow || !C7384Etj.areEqual(this.sourceSkillKey, skillConnectDisconnectRouterScreenKey.sourceSkillKey) || this.origin != skillConnectDisconnectRouterScreenKey.origin || !C7384Etj.areEqual(this.sourceSessionId, skillConnectDisconnectRouterScreenKey.sourceSessionId) || this.dismissIfAlreadyInRequestedState != skillConnectDisconnectRouterScreenKey.dismissIfAlreadyInRequestedState) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SkillConnectDisconnectRouterScreenKey skillConnectDisconnectRouterScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(skillConnectDisconnectRouterScreenKey.identifier, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, skillConnectDisconnectRouterScreenKey.isConnectFlow);
        boolean zAfR = c9j5.AfR();
        if (zAfR || skillConnectDisconnectRouterScreenKey.sourceSkillKey != null) {
            c9j5.AAP(skillConnectDisconnectRouterScreenKey.sourceSkillKey, HatchSkillDetailScreenKey$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || skillConnectDisconnectRouterScreenKey.origin != HatchSkillOAuthOrigin.SETTINGS) {
            c9j5.AAQ(skillConnectDisconnectRouterScreenKey.origin, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || skillConnectDisconnectRouterScreenKey.sourceSessionId != null) {
            c9j5.AAP(skillConnectDisconnectRouterScreenKey.sourceSessionId, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || skillConnectDisconnectRouterScreenKey.dismissIfAlreadyInRequestedState) {
            c9j5.AA7(c9iZ, 5, skillConnectDisconnectRouterScreenKey.dismissIfAlreadyInRequestedState);
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

    public final boolean component6() {
        return this.dismissIfAlreadyInRequestedState;
    }

    public final boolean getDismissIfAlreadyInRequestedState() {
        return this.dismissIfAlreadyInRequestedState;
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
        return C0KA.A00((AnonymousClass005.A0F(this.origin, (C0KA.A01(AnonymousClass001.A0G(this.identifier), this.isConnectFlow) + AnonymousClass006.A0D(this.sourceSkillKey)) * 31) + AnonymousClass005.A0H(this.sourceSessionId)) * 31, this.dismissIfAlreadyInRequestedState);
    }

    public final boolean isConnectFlow() {
        return this.isConnectFlow;
    }

    public SkillConnectDisconnectRouterScreenKey(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, boolean z2) {
        AnonymousClass003.A0w(str, hatchSkillOAuthOrigin);
        this.identifier = str;
        this.isConnectFlow = z;
        this.sourceSkillKey = hatchSkillDetailScreenKey;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
        this.dismissIfAlreadyInRequestedState = z2;
    }

    public final SkillConnectDisconnectRouterScreenKey copy(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, boolean z2) {
        AnonymousClass003.A0w(str, hatchSkillOAuthOrigin);
        return new SkillConnectDisconnectRouterScreenKey(str, z, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, str2, z2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillConnectDisconnectRouterScreenKey(String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, boolean z2, int i, C06H c06h) {
        this(str, z, (i & 4) != 0 ? null : hatchSkillDetailScreenKey, (i & 8) != 0 ? HatchSkillOAuthOrigin.SETTINGS : hatchSkillOAuthOrigin, (i & 16) != 0 ? null : str2, AnonymousClass002.A1R(i, z2));
    }

    public /* synthetic */ SkillConnectDisconnectRouterScreenKey(int i, String str, boolean z, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, boolean z2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SkillConnectDisconnectRouterScreenKey$$serializer.descriptor, i, 3);
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
        if ((i & 32) == 0) {
            this.dismissIfAlreadyInRequestedState = false;
        } else {
            this.dismissIfAlreadyInRequestedState = z2;
        }
    }
}
