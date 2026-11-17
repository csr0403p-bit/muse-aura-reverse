package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthTwoFactorDeclineJson extends C06G {
    public final String completion_handle;
    public final String disclosure_presentation;
    public final boolean requires_name;
    public final AuthTosJson tos;
    public final List<AuthTosConsentItemJson> tos_consent_items;
    public final AuthTosConsentScreenJson tos_consent_screen;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, AuthTwoFactorDeclineJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<AuthTwoFactorDeclineJson> serializer() {
            return AuthTwoFactorDeclineJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuthTwoFactorDeclineJson() {
        this("", false, null, "", C0881AGi.A00, null);
    }

    public final AuthTwoFactorDeclineJson copy(String str, boolean z, AuthTosJson authTosJson, String str2, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson) {
        AnonymousClass005.A12(str, str2, list, 0);
        return new AuthTwoFactorDeclineJson(str, z, authTosJson, str2, list, authTosConsentScreenJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTwoFactorDeclineJson) {
                AuthTwoFactorDeclineJson authTwoFactorDeclineJson = (AuthTwoFactorDeclineJson) obj;
                if (!C7384Etj.areEqual(this.completion_handle, authTwoFactorDeclineJson.completion_handle) || this.requires_name != authTwoFactorDeclineJson.requires_name || !C7384Etj.areEqual(this.tos, authTwoFactorDeclineJson.tos) || !C7384Etj.areEqual(this.disclosure_presentation, authTwoFactorDeclineJson.disclosure_presentation) || !C7384Etj.areEqual(this.tos_consent_items, authTwoFactorDeclineJson.tos_consent_items) || !C7384Etj.areEqual(this.tos_consent_screen, authTwoFactorDeclineJson.tos_consent_screen)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTwoFactorDeclineJson copy$default(AuthTwoFactorDeclineJson authTwoFactorDeclineJson, String str, boolean z, AuthTosJson authTosJson, String str2, List list, AuthTosConsentScreenJson authTosConsentScreenJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTwoFactorDeclineJson.completion_handle;
        }
        if ((i & 2) != 0) {
            z = authTwoFactorDeclineJson.requires_name;
        }
        if ((i & 4) != 0) {
            authTosJson = authTwoFactorDeclineJson.tos;
        }
        if ((i & 8) != 0) {
            str2 = authTwoFactorDeclineJson.disclosure_presentation;
        }
        if ((i & 16) != 0) {
            list = authTwoFactorDeclineJson.tos_consent_items;
        }
        if ((i & 32) != 0) {
            authTosConsentScreenJson = authTwoFactorDeclineJson.tos_consent_screen;
        }
        return authTwoFactorDeclineJson.copy(str, z, authTosJson, str2, list, authTosConsentScreenJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTwoFactorDeclineJson authTwoFactorDeclineJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTwoFactorDeclineJson.completion_handle)) {
            c9j5.AAV(authTwoFactorDeclineJson.completion_handle, c9iZ, 0);
        }
        if (zAfR || authTwoFactorDeclineJson.requires_name) {
            c9j5.AA7(c9iZ, 1, authTwoFactorDeclineJson.requires_name);
        }
        if (zAfR || authTwoFactorDeclineJson.tos != null) {
            c9j5.AAP(authTwoFactorDeclineJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || !"".equals(authTwoFactorDeclineJson.disclosure_presentation)) {
            c9j5.AAV(authTwoFactorDeclineJson.disclosure_presentation, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(authTwoFactorDeclineJson.tos_consent_items)) {
            c9j5.AAQ(authTwoFactorDeclineJson.tos_consent_items, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || authTwoFactorDeclineJson.tos_consent_screen != null) {
            c9j5.AAP(authTwoFactorDeclineJson.tos_consent_screen, AuthTosConsentScreenJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.completion_handle;
    }

    public final boolean component2() {
        return this.requires_name;
    }

    public final AuthTosJson component3() {
        return this.tos;
    }

    public final String component4() {
        return this.disclosure_presentation;
    }

    public final List<AuthTosConsentItemJson> component5() {
        return this.tos_consent_items;
    }

    public final AuthTosConsentScreenJson component6() {
        return this.tos_consent_screen;
    }

    public final String getCompletion_handle() {
        return this.completion_handle;
    }

    public final String getDisclosure_presentation() {
        return this.disclosure_presentation;
    }

    public final boolean getRequires_name() {
        return this.requires_name;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public final List<AuthTosConsentItemJson> getTos_consent_items() {
        return this.tos_consent_items;
    }

    public final AuthTosConsentScreenJson getTos_consent_screen() {
        return this.tos_consent_screen;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.tos_consent_items, AnonymousClass005.A0I(this.disclosure_presentation, (C0KA.A01(AnonymousClass001.A0G(this.completion_handle), this.requires_name) + AnonymousClass006.A0D(this.tos)) * 31)) + C3cH.A02(this.tos_consent_screen);
    }

    public String toString() {
        return super.toString();
    }

    public AuthTwoFactorDeclineJson(String str, boolean z, AuthTosJson authTosJson, String str2, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson) {
        AnonymousClass005.A12(str, str2, list, 0);
        this.completion_handle = str;
        this.requires_name = z;
        this.tos = authTosJson;
        this.disclosure_presentation = str2;
        this.tos_consent_items = list;
        this.tos_consent_screen = authTosConsentScreenJson;
    }

    public /* synthetic */ AuthTwoFactorDeclineJson(String str, boolean z, AuthTosJson authTosJson, String str2, List list, AuthTosConsentScreenJson authTosConsentScreenJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : authTosJson, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? null : authTosConsentScreenJson);
    }

    public /* synthetic */ AuthTwoFactorDeclineJson(int i, String str, boolean z, AuthTosJson authTosJson, String str2, List list, AuthTosConsentScreenJson authTosConsentScreenJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.completion_handle = "";
        } else {
            this.completion_handle = str;
        }
        if ((i & 2) == 0) {
            this.requires_name = false;
        } else {
            this.requires_name = z;
        }
        if ((i & 4) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
        if ((i & 8) == 0) {
            this.disclosure_presentation = "";
        } else {
            this.disclosure_presentation = str2;
        }
        if ((i & 16) == 0) {
            this.tos_consent_items = C0881AGi.A00;
        } else {
            this.tos_consent_items = list;
        }
        if ((i & 32) == 0) {
            this.tos_consent_screen = null;
        } else {
            this.tos_consent_screen = authTosConsentScreenJson;
        }
    }
}
