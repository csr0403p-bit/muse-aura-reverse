package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C3cI;
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
public final class SkillConnectSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final HatchSkillOAuthOrigin origin;
    public final String skillId;
    public final String sourceSessionId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, SkillConnectSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SkillConnectSheetKey> serializer() {
            return SkillConnectSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillConnectSheetKey) {
                SkillConnectSheetKey skillConnectSheetKey = (SkillConnectSheetKey) obj;
                if (!C7384Etj.areEqual(this.skillId, skillConnectSheetKey.skillId) || this.origin != skillConnectSheetKey.origin || !C7384Etj.areEqual(this.sourceSessionId, skillConnectSheetKey.sourceSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillConnectSheetKey copy$default(SkillConnectSheetKey skillConnectSheetKey, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillConnectSheetKey.skillId;
        }
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = skillConnectSheetKey.origin;
        }
        if ((i & 4) != 0) {
            str2 = skillConnectSheetKey.sourceSessionId;
        }
        return skillConnectSheetKey.copy(str, hatchSkillOAuthOrigin, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SkillConnectSheetKey skillConnectSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(skillConnectSheetKey.skillId, c9iZ, 0);
        c9j5.AAQ(skillConnectSheetKey.origin, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || skillConnectSheetKey.sourceSessionId != null) {
            c9j5.AAP(skillConnectSheetKey.sourceSessionId, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.skillId;
    }

    public final HatchSkillOAuthOrigin component2() {
        return this.origin;
    }

    public final String component3() {
        return this.sourceSessionId;
    }

    public final HatchSkillOAuthOrigin getOrigin() {
        return this.origin;
    }

    public final String getSkillId() {
        return this.skillId;
    }

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.origin, AnonymousClass001.A0G(this.skillId)) + AnonymousClass006.A0G(this.sourceSessionId);
    }

    public SkillConnectSheetKey(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        this.skillId = str;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
    }

    public final SkillConnectSheetKey copy(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        return new SkillConnectSheetKey(str, hatchSkillOAuthOrigin, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillConnectSheetKey(int i, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SkillConnectSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.skillId = str;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = C3cI.A0W(i, str2);
    }

    public /* synthetic */ SkillConnectSheetKey(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, C06H c06h) {
        this(str, hatchSkillOAuthOrigin, AnonymousClass006.A0t(i, str2));
    }
}
