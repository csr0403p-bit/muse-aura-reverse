package com.facebook.aura.skills.connect.repository;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectoJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> hosts;
    public final String mode;
    public final String name;
    public final List<CustomConnectorApiKeyTokenProxyRuleJson> token_proxy;
    public final List<CustomConnectorTokenRefreshJson> token_refresh;

    public final class Companion {
        public final C9hr<CustomConnectoJson> serializer() {
            return CustomConnectoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, CustomConnectoJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CustomConnectoJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, CustomConnectoJson$Companion$$childSerializers$3.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectoJson) {
                CustomConnectoJson customConnectoJson = (CustomConnectoJson) obj;
                if (!C7384Etj.areEqual(this.name, customConnectoJson.name) || !C7384Etj.areEqual(this.mode, customConnectoJson.mode) || !C7384Etj.areEqual(this.hosts, customConnectoJson.hosts) || !C7384Etj.areEqual(this.token_proxy, customConnectoJson.token_proxy) || !C7384Etj.areEqual(this.token_refresh, customConnectoJson.token_refresh)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CustomConnectoJson(int i, String str, String str2, List list, List list2, List list3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(CustomConnectoJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.mode = str2;
        this.hosts = list;
        if ((i & 8) == 0) {
            this.token_proxy = null;
        } else {
            this.token_proxy = list2;
        }
        if ((i & 16) == 0) {
            this.token_refresh = null;
        } else {
            this.token_refresh = list3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectoJson copy$default(CustomConnectoJson customConnectoJson, String str, String str2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectoJson.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectoJson.mode;
        }
        if ((i & 4) != 0) {
            list = customConnectoJson.hosts;
        }
        if ((i & 8) != 0) {
            list2 = customConnectoJson.token_proxy;
        }
        if ((i & 16) != 0) {
            list3 = customConnectoJson.token_refresh;
        }
        return customConnectoJson.copy(str, str2, list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_repository_repository(CustomConnectoJson customConnectoJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(customConnectoJson.name, c9iZ, 0);
        c9j5.AAV(customConnectoJson.mode, c9iZ, 1);
        c9j5.AAQ(customConnectoJson.hosts, C3cH.A15(f0cArr, 2), c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || customConnectoJson.token_proxy != null) {
            c9j5.AAP(customConnectoJson.token_proxy, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
        if (zAfR || customConnectoJson.token_refresh != null) {
            c9j5.AAP(customConnectoJson.token_refresh, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mode;
    }

    public final List<String> component3() {
        return this.hosts;
    }

    public final List<CustomConnectorApiKeyTokenProxyRuleJson> component4() {
        return this.token_proxy;
    }

    public final List<CustomConnectorTokenRefreshJson> component5() {
        return this.token_refresh;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final List<CustomConnectorApiKeyTokenProxyRuleJson> getToken_proxy() {
        return this.token_proxy;
    }

    public final List<CustomConnectorTokenRefreshJson> getToken_refresh() {
        return this.token_refresh;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.hosts, AnonymousClass005.A0I(this.mode, AnonymousClass001.A0G(this.name))) + AnonymousClass006.A0D(this.token_proxy)) * 31) + C3cH.A02(this.token_refresh);
    }

    public final CustomConnectoJson copy(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRuleJson> list2, List<CustomConnectorTokenRefreshJson> list3) {
        AnonymousClass005.A0x(str, str2, list);
        return new CustomConnectoJson(str, str2, list, list2, list3);
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectoJson(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRuleJson> list2, List<CustomConnectorTokenRefreshJson> list3) {
        AnonymousClass005.A0x(str, str2, list);
        this.name = str;
        this.mode = str2;
        this.hosts = list;
        this.token_proxy = list2;
        this.token_refresh = list3;
    }

    public /* synthetic */ CustomConnectoJson(String str, String str2, List list, List list2, List list3, int i, C06H c06h) {
        this(str, str2, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
