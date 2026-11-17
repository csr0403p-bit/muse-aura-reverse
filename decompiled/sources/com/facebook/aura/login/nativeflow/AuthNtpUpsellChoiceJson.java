package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final class AuthNtpUpsellChoiceJson extends C06G {
    public final List<AuthNtpUpsellChoiceRowJson> accounts;
    public final String landing_presentation;
    public final AuthTosJson tos;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, AuthNtpUpsellChoiceJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuthNtpUpsellChoiceJson> serializer() {
            return AuthNtpUpsellChoiceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthNtpUpsellChoiceJson) {
                AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson = (AuthNtpUpsellChoiceJson) obj;
                if (!C7384Etj.areEqual(this.accounts, authNtpUpsellChoiceJson.accounts) || !C7384Etj.areEqual(this.tos, authNtpUpsellChoiceJson.tos) || !C7384Etj.areEqual(this.landing_presentation, authNtpUpsellChoiceJson.landing_presentation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthNtpUpsellChoiceJson copy$default(AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, List list, AuthTosJson authTosJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = authNtpUpsellChoiceJson.accounts;
        }
        if ((i & 2) != 0) {
            authTosJson = authNtpUpsellChoiceJson.tos;
        }
        if ((i & 4) != 0) {
            str = authNtpUpsellChoiceJson.landing_presentation;
        }
        return authNtpUpsellChoiceJson.copy(list, authTosJson, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(authNtpUpsellChoiceJson.accounts)) {
            c9j5.AAQ(authNtpUpsellChoiceJson.accounts, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || authNtpUpsellChoiceJson.tos != null) {
            c9j5.AAP(authNtpUpsellChoiceJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cH.A1Q(authNtpUpsellChoiceJson.landing_presentation)) {
            c9j5.AAV(authNtpUpsellChoiceJson.landing_presentation, c9iZ, 2);
        }
    }

    public final List<AuthNtpUpsellChoiceRowJson> component1() {
        return this.accounts;
    }

    public final AuthTosJson component2() {
        return this.tos;
    }

    public final String component3() {
        return this.landing_presentation;
    }

    public final List<AuthNtpUpsellChoiceRowJson> getAccounts() {
        return this.accounts;
    }

    public final String getLanding_presentation() {
        return this.landing_presentation;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.landing_presentation, (AnonymousClass005.A0E(this.accounts) + AnonymousClass006.A0D(this.tos)) * 31);
    }

    public AuthNtpUpsellChoiceJson(List<AuthNtpUpsellChoiceRowJson> list, AuthTosJson authTosJson, String str) {
        AnonymousClass003.A0v(list, str);
        this.accounts = list;
        this.tos = authTosJson;
        this.landing_presentation = str;
    }

    public final AuthNtpUpsellChoiceJson copy(List<AuthNtpUpsellChoiceRowJson> list, AuthTosJson authTosJson, String str) {
        AnonymousClass003.A0v(list, str);
        return new AuthNtpUpsellChoiceJson(list, authTosJson, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthNtpUpsellChoiceJson(int i, List list, AuthTosJson authTosJson, String str, C2hx c2hx) {
        this.accounts = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
        if ((i & 4) == 0) {
            this.landing_presentation = "";
        } else {
            this.landing_presentation = str;
        }
    }

    public /* synthetic */ AuthNtpUpsellChoiceJson(List list, AuthTosJson authTosJson, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : authTosJson, (i & 4) != 0 ? "" : str);
    }

    public AuthNtpUpsellChoiceJson() {
        this(C0881AGi.A00, null, "");
    }
}
