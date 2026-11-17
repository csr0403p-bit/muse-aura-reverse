package com.facebook.aura.skills.connect.repository;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorRegisterResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String authorize_url;
    public final String config_path;
    public final String name;
    public final boolean replaced;

    public final class Companion {
        public final C9hr<CustomConnectorRegisterResponseJson> serializer() {
            return CustomConnectorRegisterResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(CustomConnectorRegisterResponseJson customConnectorRegisterResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(customConnectorRegisterResponseJson.name, c9iZ, 0);
        c9j5.AAV(customConnectorRegisterResponseJson.config_path, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, customConnectorRegisterResponseJson.replaced);
        if (c9j5.AfR() || customConnectorRegisterResponseJson.authorize_url != null) {
            c9j5.AAP(customConnectorRegisterResponseJson.authorize_url, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorRegisterResponseJson) {
                CustomConnectorRegisterResponseJson customConnectorRegisterResponseJson = (CustomConnectorRegisterResponseJson) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorRegisterResponseJson.name) || !C7384Etj.areEqual(this.config_path, customConnectorRegisterResponseJson.config_path) || this.replaced != customConnectorRegisterResponseJson.replaced || !C7384Etj.areEqual(this.authorize_url, customConnectorRegisterResponseJson.authorize_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorRegisterResponseJson copy$default(CustomConnectorRegisterResponseJson customConnectorRegisterResponseJson, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorRegisterResponseJson.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorRegisterResponseJson.config_path;
        }
        if ((i & 4) != 0) {
            z = customConnectorRegisterResponseJson.replaced;
        }
        if ((i & 8) != 0) {
            str3 = customConnectorRegisterResponseJson.authorize_url;
        }
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorRegisterResponseJson(str, str2, z, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.config_path;
    }

    public final boolean component3() {
        return this.replaced;
    }

    public final String component4() {
        return this.authorize_url;
    }

    public final String getAuthorize_url() {
        return this.authorize_url;
    }

    public final String getConfig_path() {
        return this.config_path;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getReplaced() {
        return this.replaced;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass005.A0I(this.config_path, AnonymousClass001.A0G(this.name)), this.replaced) + AnonymousClass006.A0G(this.authorize_url);
    }

    public final CustomConnectorRegisterResponse toDomain() {
        return new CustomConnectorRegisterResponse(this.name, this.config_path, this.replaced, this.authorize_url);
    }

    public CustomConnectorRegisterResponseJson(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.config_path = str2;
        this.replaced = z;
        this.authorize_url = str3;
    }

    public final CustomConnectorRegisterResponseJson copy(String str, String str2, boolean z, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new CustomConnectorRegisterResponseJson(str, str2, z, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorRegisterResponseJson(int i, String str, String str2, boolean z, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(CustomConnectorRegisterResponseJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.config_path = str2;
        this.replaced = z;
        this.authorize_url = (i & 8) == 0 ? null : str3;
    }

    public /* synthetic */ CustomConnectorRegisterResponseJson(String str, String str2, boolean z, String str3, int i, C06H c06h) {
        this(str, str2, z, AnonymousClass006.A0u(i, str3));
    }
}
