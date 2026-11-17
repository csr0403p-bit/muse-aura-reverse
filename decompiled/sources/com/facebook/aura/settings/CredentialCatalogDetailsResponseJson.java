package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
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
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CredentialCatalogDetailsResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String agent_permission;
    public final String auth_provider;
    public final boolean available;
    public final String credential_type;
    public final String id;
    public final String label;
    public final List<String> origins;
    public final boolean password_present;
    public final List<String> protected_field_names;
    public final String username;

    public final class Companion {
        public final C9hr<CredentialCatalogDetailsResponseJson> serializer() {
            return CredentialCatalogDetailsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, CredentialCatalogDetailsResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CredentialCatalogDetailsResponseJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CredentialCatalogDetailsResponseJson) {
                CredentialCatalogDetailsResponseJson credentialCatalogDetailsResponseJson = (CredentialCatalogDetailsResponseJson) obj;
                if (!C7384Etj.areEqual(this.id, credentialCatalogDetailsResponseJson.id) || !C7384Etj.areEqual(this.credential_type, credentialCatalogDetailsResponseJson.credential_type) || !C7384Etj.areEqual(this.origins, credentialCatalogDetailsResponseJson.origins) || !C7384Etj.areEqual(this.protected_field_names, credentialCatalogDetailsResponseJson.protected_field_names) || !C7384Etj.areEqual(this.label, credentialCatalogDetailsResponseJson.label) || this.available != credentialCatalogDetailsResponseJson.available || !C7384Etj.areEqual(this.username, credentialCatalogDetailsResponseJson.username) || this.password_present != credentialCatalogDetailsResponseJson.password_present || !C7384Etj.areEqual(this.agent_permission, credentialCatalogDetailsResponseJson.agent_permission) || !C7384Etj.areEqual(this.auth_provider, credentialCatalogDetailsResponseJson.auth_provider)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CredentialCatalogDetailsResponseJson copy$default(CredentialCatalogDetailsResponseJson credentialCatalogDetailsResponseJson, String str, String str2, List list, List list2, String str3, boolean z, String str4, boolean z2, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialCatalogDetailsResponseJson.id;
        }
        if ((i & 2) != 0) {
            str2 = credentialCatalogDetailsResponseJson.credential_type;
        }
        if ((i & 4) != 0) {
            list = credentialCatalogDetailsResponseJson.origins;
        }
        if ((i & 8) != 0) {
            list2 = credentialCatalogDetailsResponseJson.protected_field_names;
        }
        if ((i & 16) != 0) {
            str3 = credentialCatalogDetailsResponseJson.label;
        }
        if ((i & 32) != 0) {
            z = credentialCatalogDetailsResponseJson.available;
        }
        if ((i & 64) != 0) {
            str4 = credentialCatalogDetailsResponseJson.username;
        }
        if ((i & 128) != 0) {
            z2 = credentialCatalogDetailsResponseJson.password_present;
        }
        if ((i & 256) != 0) {
            str5 = credentialCatalogDetailsResponseJson.agent_permission;
        }
        if ((i & 512) != 0) {
            str6 = credentialCatalogDetailsResponseJson.auth_provider;
        }
        return credentialCatalogDetailsResponseJson.copy(str, str2, list, list2, str3, z, str4, z2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(CredentialCatalogDetailsResponseJson credentialCatalogDetailsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(credentialCatalogDetailsResponseJson.id, c9iZ, 0);
        c9j5.AAV(credentialCatalogDetailsResponseJson.credential_type, c9iZ, 1);
        c9j5.AAQ(credentialCatalogDetailsResponseJson.origins, C3cH.A15(f0cArr, 2), c9iZ, 2);
        c9j5.AAQ(credentialCatalogDetailsResponseJson.protected_field_names, C3cH.A15(f0cArr, 3), c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || credentialCatalogDetailsResponseJson.label != null) {
            c9j5.AAP(credentialCatalogDetailsResponseJson.label, C07779iq.A01, c9iZ, 4);
        }
        c9j5.AA7(c9iZ, 5, credentialCatalogDetailsResponseJson.available);
        if (zAfR || credentialCatalogDetailsResponseJson.username != null) {
            c9j5.AAP(credentialCatalogDetailsResponseJson.username, C07779iq.A01, c9iZ, 6);
        }
        c9j5.AA7(c9iZ, 7, credentialCatalogDetailsResponseJson.password_present);
        if (zAfR || credentialCatalogDetailsResponseJson.agent_permission != null) {
            c9j5.AAP(credentialCatalogDetailsResponseJson.agent_permission, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || credentialCatalogDetailsResponseJson.auth_provider != null) {
            c9j5.AAP(credentialCatalogDetailsResponseJson.auth_provider, C07779iq.A01, c9iZ, 9);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.auth_provider;
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
        return this.username;
    }

    public final boolean component8() {
        return this.password_present;
    }

    public final String component9() {
        return this.agent_permission;
    }

    public final String getAgent_permission() {
        return this.agent_permission;
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

    public final boolean getPassword_present() {
        return this.password_present;
    }

    public final List<String> getProtected_field_names() {
        return this.protected_field_names;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return ((C0KA.A01((C0KA.A01((AnonymousClass005.A0F(this.protected_field_names, AnonymousClass005.A0F(this.origins, AnonymousClass005.A0I(this.credential_type, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.label)) * 31, this.available) + AnonymousClass006.A0G(this.username)) * 31, this.password_present) + AnonymousClass006.A0G(this.agent_permission)) * 31) + AnonymousClass005.A0H(this.auth_provider);
    }

    public CredentialCatalogDetailsResponseJson(String str, String str2, List<String> list, List<String> list2, String str3, boolean z, String str4, boolean z2, String str5, String str6) {
        AnonymousClass005.A14(str, str2, list, list2);
        this.id = str;
        this.credential_type = str2;
        this.origins = list;
        this.protected_field_names = list2;
        this.label = str3;
        this.available = z;
        this.username = str4;
        this.password_present = z2;
        this.agent_permission = str5;
        this.auth_provider = str6;
    }

    public final CredentialCatalogDetailsResponseJson copy(String str, String str2, List<String> list, List<String> list2, String str3, boolean z, String str4, boolean z2, String str5, String str6) {
        AnonymousClass005.A14(str, str2, list, list2);
        return new CredentialCatalogDetailsResponseJson(str, str2, list, list2, str3, z, str4, z2, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CredentialCatalogDetailsResponseJson(String str, String str2, List list, List list2, String str3, boolean z, String str4, boolean z2, String str5, String str6, int i, C06H c06h) {
        this(str, str2, list, list2, (i & 16) != 0 ? null : str3, z, (i & 64) != 0 ? null : str4, z2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    public /* synthetic */ CredentialCatalogDetailsResponseJson(int i, String str, String str2, List list, List list2, String str3, boolean z, String str4, boolean z2, String str5, String str6, C2hx c2hx) {
        if (175 != (i & HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS)) {
            C9iI.A00(CredentialCatalogDetailsResponseJson$$serializer.descriptor, i, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.credential_type = str2;
        this.origins = list;
        this.protected_field_names = list2;
        if ((i & 16) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        this.available = z;
        if ((i & 64) == 0) {
            this.username = null;
        } else {
            this.username = str4;
        }
        this.password_present = z2;
        if ((i & 256) == 0) {
            this.agent_permission = null;
        } else {
            this.agent_permission = str5;
        }
        if ((i & 512) == 0) {
            this.auth_provider = null;
        } else {
            this.auth_provider = str6;
        }
    }
}
