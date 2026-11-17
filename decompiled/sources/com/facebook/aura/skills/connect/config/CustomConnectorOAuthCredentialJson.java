package com.facebook.aura.skills.connect.config;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
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
/* loaded from: classes4.dex */
public final class CustomConnectorOAuthCredentialJson extends C06G {
    public final List<String> domains;
    public final String name;
    public final CustomConnectorOAuthDetailsJson oauth;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, CustomConnectorOAuthCredentialJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<CustomConnectorOAuthCredentialJson> serializer() {
            return CustomConnectorOAuthCredentialJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorOAuthCredentialJson) {
                CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson = (CustomConnectorOAuthCredentialJson) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorOAuthCredentialJson.name) || !C7384Etj.areEqual(this.domains, customConnectorOAuthCredentialJson.domains) || !C7384Etj.areEqual(this.oauth, customConnectorOAuthCredentialJson.oauth)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectorOAuthCredentialJson copy$default(CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson, String str, List list, CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorOAuthCredentialJson.name;
        }
        if ((i & 2) != 0) {
            list = customConnectorOAuthCredentialJson.domains;
        }
        if ((i & 4) != 0) {
            customConnectorOAuthDetailsJson = customConnectorOAuthCredentialJson.oauth;
        }
        return customConnectorOAuthCredentialJson.copy(str, list, customConnectorOAuthDetailsJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorOAuthCredentialJson customConnectorOAuthCredentialJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(customConnectorOAuthCredentialJson.name)) {
            c9j5.AAV(customConnectorOAuthCredentialJson.name, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(customConnectorOAuthCredentialJson.domains)) {
            c9j5.AAQ(customConnectorOAuthCredentialJson.domains, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(customConnectorOAuthCredentialJson.oauth, new CustomConnectorOAuthDetailsJson("", "", "", "", null, null, null, null))) {
            c9j5.AAQ(customConnectorOAuthCredentialJson.oauth, CustomConnectorOAuthDetailsJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.domains;
    }

    public final CustomConnectorOAuthDetailsJson component3() {
        return this.oauth;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public final String getName() {
        return this.name;
    }

    public final CustomConnectorOAuthDetailsJson getOauth() {
        return this.oauth;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.oauth, AnonymousClass005.A0F(this.domains, AnonymousClass001.A0G(this.name)));
    }

    public final CustomConnectorOAuthCredential toDomain() {
        return new CustomConnectorOAuthCredential(this.name, this.domains, this.oauth.toDomain());
    }

    public CustomConnectorOAuthCredentialJson(String str, List<String> list, CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson) {
        AnonymousClass005.A0x(str, list, customConnectorOAuthDetailsJson);
        this.name = str;
        this.domains = list;
        this.oauth = customConnectorOAuthDetailsJson;
    }

    public final CustomConnectorOAuthCredentialJson copy(String str, List<String> list, CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson) {
        AnonymousClass005.A0x(str, list, customConnectorOAuthDetailsJson);
        return new CustomConnectorOAuthCredentialJson(str, list, customConnectorOAuthDetailsJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorOAuthCredentialJson(int i, String str, List list, CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson, C2hx c2hx) {
        this.name = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.domains = C0881AGi.A00;
        } else {
            this.domains = list;
        }
        if ((i & 4) == 0) {
            this.oauth = new CustomConnectorOAuthDetailsJson("", "", "", "", null, null, null, null);
        } else {
            this.oauth = customConnectorOAuthDetailsJson;
        }
    }

    public /* synthetic */ CustomConnectorOAuthCredentialJson(String str, List list, CustomConnectorOAuthDetailsJson customConnectorOAuthDetailsJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? C0881AGi.A00 : list, (i & 4) != 0 ? new CustomConnectorOAuthDetailsJson("", "", "", "", null, null, null, null) : customConnectorOAuthDetailsJson);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorOAuthCredentialJson() {
        this((String) null, (List) (0 == true ? 1 : 0), (CustomConnectorOAuthDetailsJson) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
    }
}
