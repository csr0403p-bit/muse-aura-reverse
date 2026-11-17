package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
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
public final class PasswordAuthSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String identifier;
    public final HatchSkillOAuthOrigin origin;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, PasswordAuthSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PasswordAuthSheetKey> serializer() {
            return PasswordAuthSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PasswordAuthSheetKey) {
                PasswordAuthSheetKey passwordAuthSheetKey = (PasswordAuthSheetKey) obj;
                if (!C7384Etj.areEqual(this.identifier, passwordAuthSheetKey.identifier) || this.origin != passwordAuthSheetKey.origin) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PasswordAuthSheetKey copy$default(PasswordAuthSheetKey passwordAuthSheetKey, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passwordAuthSheetKey.identifier;
        }
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = passwordAuthSheetKey.origin;
        }
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        return new PasswordAuthSheetKey(str, hatchSkillOAuthOrigin);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(PasswordAuthSheetKey passwordAuthSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(passwordAuthSheetKey.identifier, c9iZ, 0);
        c9j5.AAQ(passwordAuthSheetKey.origin, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.identifier;
    }

    public final HatchSkillOAuthOrigin component2() {
        return this.origin;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final HatchSkillOAuthOrigin getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.origin, AnonymousClass001.A0G(this.identifier));
    }

    public PasswordAuthSheetKey(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        this.identifier = str;
        this.origin = hatchSkillOAuthOrigin;
    }

    public final PasswordAuthSheetKey copy(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        return new PasswordAuthSheetKey(str, hatchSkillOAuthOrigin);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PasswordAuthSheetKey(int i, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PasswordAuthSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.identifier = str;
        this.origin = hatchSkillOAuthOrigin;
    }
}
