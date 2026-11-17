package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
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
public final class CredentialCatalogItemJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String auth_provider;
    public final boolean available;
    public final String credential_type;
    public final String id;
    public final String label;
    public final List<String> origins;
    public final List<String> protected_field_names;

    public final class Companion {
        public final C9hr<CredentialCatalogItemJson> serializer() {
            return CredentialCatalogItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, CredentialCatalogItemJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CredentialCatalogItemJson$Companion$$childSerializers$2.INSTANCE), null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CredentialCatalogItemJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", c0881AGi, c0881AGi, null, false, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogItemJson) {
                CredentialCatalogItemJson credentialCatalogItemJson = (CredentialCatalogItemJson) obj;
                if (!C7384Etj.areEqual(this.id, credentialCatalogItemJson.id) || !C7384Etj.areEqual(this.credential_type, credentialCatalogItemJson.credential_type) || !C7384Etj.areEqual(this.origins, credentialCatalogItemJson.origins) || !C7384Etj.areEqual(this.protected_field_names, credentialCatalogItemJson.protected_field_names) || !C7384Etj.areEqual(this.label, credentialCatalogItemJson.label) || this.available != credentialCatalogItemJson.available || !C7384Etj.areEqual(this.auth_provider, credentialCatalogItemJson.auth_provider)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CredentialCatalogItemJson copy$default(CredentialCatalogItemJson credentialCatalogItemJson, String str, String str2, List list, List list2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCatalogItemJson.id;
        }
        if ((i & 2) != 0) {
            str2 = credentialCatalogItemJson.credential_type;
        }
        if ((i & 4) != 0) {
            list = credentialCatalogItemJson.origins;
        }
        if ((i & 8) != 0) {
            list2 = credentialCatalogItemJson.protected_field_names;
        }
        if ((i & 16) != 0) {
            str3 = credentialCatalogItemJson.label;
        }
        if ((i & 32) != 0) {
            z = credentialCatalogItemJson.available;
        }
        if ((i & 64) != 0) {
            str4 = credentialCatalogItemJson.auth_provider;
        }
        return credentialCatalogItemJson.copy(str, str2, list, list2, str3, z, str4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogItemJson credentialCatalogItemJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(credentialCatalogItemJson.id)) {
            c9j5.AAV(credentialCatalogItemJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(credentialCatalogItemJson.credential_type)) {
            c9j5.AAV(credentialCatalogItemJson.credential_type, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(credentialCatalogItemJson.origins)) {
            c9j5.AAQ(credentialCatalogItemJson.origins, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(credentialCatalogItemJson.protected_field_names)) {
            c9j5.AAQ(credentialCatalogItemJson.protected_field_names, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || credentialCatalogItemJson.label != null) {
            c9j5.AAP(credentialCatalogItemJson.label, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || credentialCatalogItemJson.available) {
            c9j5.AA7(c9iZ, 5, credentialCatalogItemJson.available);
        }
        if (zAfR || credentialCatalogItemJson.auth_provider != null) {
            c9j5.AAP(credentialCatalogItemJson.auth_provider, C07779iq.A01, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.credential_type;
    }

    public final List<String> component3() {
        return this.origins;
    }

    public final List<String> component4() {
        return this.protected_field_names;
    }

    public final String component5() {
        return this.label;
    }

    public final boolean component6() {
        return this.available;
    }

    public final String component7() {
        return this.auth_provider;
    }

    public final String getAuth_provider() {
        return this.auth_provider;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getCredential_type() {
        return this.credential_type;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<String> getOrigins() {
        return this.origins;
    }

    public final List<String> getProtected_field_names() {
        return this.protected_field_names;
    }

    public int hashCode() {
        return C0KA.A01((AnonymousClass005.A0F(this.protected_field_names, AnonymousClass005.A0F(this.origins, AnonymousClass005.A0I(this.credential_type, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.label)) * 31, this.available) + AnonymousClass005.A0H(this.auth_provider);
    }

    public final CredentialCatalogItemJson copy(String str, String str2, List<String> list, List<String> list2, String str3, boolean z, String str4) {
        AnonymousClass005.A14(str, str2, list, list2);
        return new CredentialCatalogItemJson(str, str2, list, list2, str3, z, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogItemJson(int i, String str, String str2, List list, List list2, String str3, boolean z, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.credential_type = "";
        } else {
            this.credential_type = str2;
        }
        if ((i & 4) == 0) {
            this.origins = C0881AGi.A00;
        } else {
            this.origins = list;
        }
        if ((i & 8) == 0) {
            this.protected_field_names = C0881AGi.A00;
        } else {
            this.protected_field_names = list2;
        }
        if ((i & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i & 32) == 0) {
            this.available = false;
        } else {
            this.available = z;
        }
        if ((i & 64) == 0) {
            this.auth_provider = null;
        } else {
            this.auth_provider = str4;
        }
    }

    public CredentialCatalogItemJson(String str, String str2, List<String> list, List<String> list2, String str3, boolean z, String str4) {
        AnonymousClass005.A14(str, str2, list, list2);
        this.id = str;
        this.credential_type = str2;
        this.origins = list;
        this.protected_field_names = list2;
        this.label = str3;
        this.available = z;
        this.auth_provider = str4;
    }

    public /* synthetic */ CredentialCatalogItemJson(String str, String str2, List list, List list2, String str3, boolean z, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i), (i & 8) != 0 ? C0881AGi.A00 : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str4);
    }
}
