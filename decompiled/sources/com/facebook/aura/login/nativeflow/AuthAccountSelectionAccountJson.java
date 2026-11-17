package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class AuthAccountSelectionAccountJson extends C06G {
    public final String account_ref;
    public final String account_status;
    public final List<AuthAccountSelectionProfileJson> profiles;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, AuthAccountSelectionAccountJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AuthAccountSelectionAccountJson> serializer() {
            return AuthAccountSelectionAccountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthAccountSelectionAccountJson) {
                AuthAccountSelectionAccountJson authAccountSelectionAccountJson = (AuthAccountSelectionAccountJson) obj;
                if (!C7384Etj.areEqual(this.account_ref, authAccountSelectionAccountJson.account_ref) || !C7384Etj.areEqual(this.profiles, authAccountSelectionAccountJson.profiles) || !C7384Etj.areEqual(this.account_status, authAccountSelectionAccountJson.account_status)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthAccountSelectionAccountJson copy$default(AuthAccountSelectionAccountJson authAccountSelectionAccountJson, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authAccountSelectionAccountJson.account_ref;
        }
        if ((i & 2) != 0) {
            list = authAccountSelectionAccountJson.profiles;
        }
        if ((i & 4) != 0) {
            str2 = authAccountSelectionAccountJson.account_status;
        }
        return authAccountSelectionAccountJson.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthAccountSelectionAccountJson authAccountSelectionAccountJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(authAccountSelectionAccountJson.account_ref)) {
            c9j5.AAV(authAccountSelectionAccountJson.account_ref, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(authAccountSelectionAccountJson.profiles)) {
            c9j5.AAQ(authAccountSelectionAccountJson.profiles, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || authAccountSelectionAccountJson.account_status != null) {
            c9j5.AAP(authAccountSelectionAccountJson.account_status, C07779iq.A01, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.account_ref;
    }

    public final List<AuthAccountSelectionProfileJson> component2() {
        return this.profiles;
    }

    public final String component3() {
        return this.account_status;
    }

    public final String getAccount_ref() {
        return this.account_ref;
    }

    public final String getAccount_status() {
        return this.account_status;
    }

    public final List<AuthAccountSelectionProfileJson> getProfiles() {
        return this.profiles;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.profiles, AnonymousClass001.A0G(this.account_ref)) + AnonymousClass006.A0G(this.account_status);
    }

    public AuthAccountSelectionAccountJson(String str, List<AuthAccountSelectionProfileJson> list, String str2) {
        AnonymousClass003.A0u(str, list);
        this.account_ref = str;
        this.profiles = list;
        this.account_status = str2;
    }

    public final AuthAccountSelectionAccountJson copy(String str, List<AuthAccountSelectionProfileJson> list, String str2) {
        AnonymousClass003.A0u(str, list);
        return new AuthAccountSelectionAccountJson(str, list, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthAccountSelectionAccountJson(int i, String str, List list, String str2, C2hx c2hx) {
        this.account_ref = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.profiles = C0881AGi.A00;
        } else {
            this.profiles = list;
        }
        if ((i & 4) == 0) {
            this.account_status = null;
        } else {
            this.account_status = str2;
        }
    }

    public /* synthetic */ AuthAccountSelectionAccountJson(String str, List list, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i), AnonymousClass006.A0t(i, str2));
    }

    public AuthAccountSelectionAccountJson() {
        this("", C0881AGi.A00, null);
    }
}
