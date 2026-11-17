package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class AuthTosConsentItemJson extends C06G {
    public final boolean mandatory;
    public final List<AuthTosBodyRunJson> subtitle_runs;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, AuthTosConsentItemJson$Companion$$childSerializers$1.INSTANCE), null};

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<AuthTosConsentItemJson> serializer() {
            return AuthTosConsentItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthTosConsentItemJson) {
                AuthTosConsentItemJson authTosConsentItemJson = (AuthTosConsentItemJson) obj;
                if (!C7384Etj.areEqual(this.title, authTosConsentItemJson.title) || !C7384Etj.areEqual(this.subtitle_runs, authTosConsentItemJson.subtitle_runs) || this.mandatory != authTosConsentItemJson.mandatory) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthTosConsentItemJson copy$default(AuthTosConsentItemJson authTosConsentItemJson, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authTosConsentItemJson.title;
        }
        if ((i & 2) != 0) {
            list = authTosConsentItemJson.subtitle_runs;
        }
        if ((i & 4) != 0) {
            z = authTosConsentItemJson.mandatory;
        }
        return authTosConsentItemJson.copy(str, list, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthTosConsentItemJson authTosConsentItemJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authTosConsentItemJson.title)) {
            c9j5.AAV(authTosConsentItemJson.title, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(authTosConsentItemJson.subtitle_runs, C0881AGi.A00)) {
            c9j5.AAQ(authTosConsentItemJson.subtitle_runs, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || authTosConsentItemJson.mandatory) {
            c9j5.AA7(c9iZ, 2, authTosConsentItemJson.mandatory);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final List<AuthTosBodyRunJson> component2() {
        return this.subtitle_runs;
    }

    public final boolean component3() {
        return this.mandatory;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final List<AuthTosBodyRunJson> getSubtitle_runs() {
        return this.subtitle_runs;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.subtitle_runs, AnonymousClass001.A0G(this.title)), this.mandatory);
    }

    public AuthTosConsentItemJson(String str, List<AuthTosBodyRunJson> list, boolean z) {
        AnonymousClass003.A0u(str, list);
        this.title = str;
        this.subtitle_runs = list;
        this.mandatory = z;
    }

    public final AuthTosConsentItemJson copy(String str, List<AuthTosBodyRunJson> list, boolean z) {
        AnonymousClass003.A0u(str, list);
        return new AuthTosConsentItemJson(str, list, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthTosConsentItemJson(String str, List list, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C0881AGi.A00 : list, AnonymousClass005.A1O(i, z));
    }

    public /* synthetic */ AuthTosConsentItemJson(int i, String str, List list, boolean z, C2hx c2hx) {
        this.title = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.subtitle_runs = C0881AGi.A00;
        } else {
            this.subtitle_runs = list;
        }
        if ((i & 4) == 0) {
            this.mandatory = false;
        } else {
            this.mandatory = z;
        }
    }

    public AuthTosConsentItemJson() {
        this("", C0881AGi.A00, false);
    }
}
