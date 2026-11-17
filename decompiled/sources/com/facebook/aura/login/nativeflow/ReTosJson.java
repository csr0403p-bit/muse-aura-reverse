package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
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
public final class ReTosJson extends C06G {
    public final String confirm_label;
    public final String disclosure_presentation;
    public final String title;
    public final AuthTosJson tos;
    public final List<AuthTosConsentItemJson> tos_consent_items;
    public final AuthTosConsentScreenJson tos_consent_screen;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, ReTosJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<ReTosJson> serializer() {
            return ReTosJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ReTosJson() {
        this("", "", "", null, C0881AGi.A00, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReTosJson) {
                ReTosJson reTosJson = (ReTosJson) obj;
                if (!C7384Etj.areEqual(this.title, reTosJson.title) || !C7384Etj.areEqual(this.confirm_label, reTosJson.confirm_label) || !C7384Etj.areEqual(this.disclosure_presentation, reTosJson.disclosure_presentation) || !C7384Etj.areEqual(this.tos, reTosJson.tos) || !C7384Etj.areEqual(this.tos_consent_items, reTosJson.tos_consent_items) || !C7384Etj.areEqual(this.tos_consent_screen, reTosJson.tos_consent_screen)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReTosJson copy$default(ReTosJson reTosJson, String str, String str2, String str3, AuthTosJson authTosJson, List list, AuthTosConsentScreenJson authTosConsentScreenJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reTosJson.title;
        }
        if ((i & 2) != 0) {
            str2 = reTosJson.confirm_label;
        }
        if ((i & 4) != 0) {
            str3 = reTosJson.disclosure_presentation;
        }
        if ((i & 8) != 0) {
            authTosJson = reTosJson.tos;
        }
        if ((i & 16) != 0) {
            list = reTosJson.tos_consent_items;
        }
        if ((i & 32) != 0) {
            authTosConsentScreenJson = reTosJson.tos_consent_screen;
        }
        return reTosJson.copy(str, str2, str3, authTosJson, list, authTosConsentScreenJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(ReTosJson reTosJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(reTosJson.title)) {
            c9j5.AAV(reTosJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(reTosJson.confirm_label)) {
            c9j5.AAV(reTosJson.confirm_label, c9iZ, 1);
        }
        if (zAfR || !"".equals(reTosJson.disclosure_presentation)) {
            c9j5.AAV(reTosJson.disclosure_presentation, c9iZ, 2);
        }
        if (zAfR || reTosJson.tos != null) {
            c9j5.AAP(reTosJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(reTosJson.tos_consent_items)) {
            c9j5.AAQ(reTosJson.tos_consent_items, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || reTosJson.tos_consent_screen != null) {
            c9j5.AAP(reTosJson.tos_consent_screen, AuthTosConsentScreenJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.confirm_label;
    }

    public final String component3() {
        return this.disclosure_presentation;
    }

    public final AuthTosJson component4() {
        return this.tos;
    }

    public final List<AuthTosConsentItemJson> component5() {
        return this.tos_consent_items;
    }

    public final AuthTosConsentScreenJson component6() {
        return this.tos_consent_screen;
    }

    public final String getConfirm_label() {
        return this.confirm_label;
    }

    public final String getDisclosure_presentation() {
        return this.disclosure_presentation;
    }

    public final String getTitle() {
        return this.title;
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
        return AnonymousClass005.A0F(this.tos_consent_items, (AnonymousClass005.A0I(this.disclosure_presentation, AnonymousClass005.A0I(this.confirm_label, AnonymousClass001.A0G(this.title))) + AnonymousClass006.A0D(this.tos)) * 31) + C3cH.A02(this.tos_consent_screen);
    }

    public final ReTosJson copy(String str, String str2, String str3, AuthTosJson authTosJson, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        return new ReTosJson(str, str2, str3, authTosJson, list, authTosConsentScreenJson);
    }

    public String toString() {
        return super.toString();
    }

    public ReTosJson(String str, String str2, String str3, AuthTosJson authTosJson, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        this.title = str;
        this.confirm_label = str2;
        this.disclosure_presentation = str3;
        this.tos = authTosJson;
        this.tos_consent_items = list;
        this.tos_consent_screen = authTosConsentScreenJson;
    }

    public /* synthetic */ ReTosJson(String str, String str2, String str3, AuthTosJson authTosJson, List list, AuthTosConsentScreenJson authTosConsentScreenJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : authTosJson, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? null : authTosConsentScreenJson);
    }

    public /* synthetic */ ReTosJson(int i, String str, String str2, String str3, AuthTosJson authTosJson, List list, AuthTosConsentScreenJson authTosConsentScreenJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.confirm_label = "";
        } else {
            this.confirm_label = str2;
        }
        if ((i & 4) == 0) {
            this.disclosure_presentation = "";
        } else {
            this.disclosure_presentation = str3;
        }
        if ((i & 8) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
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
