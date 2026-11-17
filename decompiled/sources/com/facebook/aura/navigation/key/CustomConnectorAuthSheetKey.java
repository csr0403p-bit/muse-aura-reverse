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
/* loaded from: classes.dex */
public final class CustomConnectorAuthSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final HatchSkillOAuthOrigin origin;
    public final String sourceSessionId;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, CustomConnectorAuthSheetKey$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<CustomConnectorAuthSheetKey> serializer() {
            return CustomConnectorAuthSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorAuthSheetKey) {
                CustomConnectorAuthSheetKey customConnectorAuthSheetKey = (CustomConnectorAuthSheetKey) obj;
                if (!C7384Etj.areEqual(this.url, customConnectorAuthSheetKey.url) || this.origin != customConnectorAuthSheetKey.origin || !C7384Etj.areEqual(this.sourceSessionId, customConnectorAuthSheetKey.sourceSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorAuthSheetKey copy$default(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorAuthSheetKey.url;
        }
        if ((i & 2) != 0) {
            hatchSkillOAuthOrigin = customConnectorAuthSheetKey.origin;
        }
        if ((i & 4) != 0) {
            str2 = customConnectorAuthSheetKey.sourceSessionId;
        }
        return customConnectorAuthSheetKey.copy(str, hatchSkillOAuthOrigin, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(CustomConnectorAuthSheetKey customConnectorAuthSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(customConnectorAuthSheetKey.url, c9iZ, 0);
        c9j5.AAQ(customConnectorAuthSheetKey.origin, C06G.A0e(f0cArr, 1), c9iZ, 1);
        if (c9j5.AfR() || customConnectorAuthSheetKey.sourceSessionId != null) {
            c9j5.AAP(customConnectorAuthSheetKey.sourceSessionId, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.url;
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

    public final String getSourceSessionId() {
        return this.sourceSessionId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.origin, AnonymousClass001.A0G(this.url)) + AnonymousClass006.A0G(this.sourceSessionId);
    }

    public CustomConnectorAuthSheetKey(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        this.url = str;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = str2;
    }

    public final CustomConnectorAuthSheetKey copy(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        return new CustomConnectorAuthSheetKey(str, hatchSkillOAuthOrigin, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorAuthSheetKey(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, int i, C06H c06h) {
        this(str, hatchSkillOAuthOrigin, AnonymousClass006.A0t(i, str2));
    }

    public /* synthetic */ CustomConnectorAuthSheetKey(int i, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CustomConnectorAuthSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.url = str;
        this.origin = hatchSkillOAuthOrigin;
        this.sourceSessionId = (i & 4) == 0 ? null : str2;
    }
}
