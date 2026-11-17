package com.facebook.aura.skills.connect.config;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyConnectorJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> hosts;
    public final String mode;
    public final String name;
    public final List<CustomConnectorApiKeyTokenProxyRuleJson> token_proxy;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyConnectorJson> serializer() {
            return CustomConnectorApiKeyConnectorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, CustomConnectorApiKeyConnectorJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, CustomConnectorApiKeyConnectorJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyConnectorJson) {
                CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson = (CustomConnectorApiKeyConnectorJson) obj;
                if (!C7384Etj.areEqual(this.name, customConnectorApiKeyConnectorJson.name) || !C7384Etj.areEqual(this.mode, customConnectorApiKeyConnectorJson.mode) || !C7384Etj.areEqual(this.hosts, customConnectorApiKeyConnectorJson.hosts) || !C7384Etj.areEqual(this.token_proxy, customConnectorApiKeyConnectorJson.token_proxy)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomConnectorApiKeyConnectorJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", c0881AGi, c0881AGi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomConnectorApiKeyConnectorJson copy$default(CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorApiKeyConnectorJson.name;
        }
        if ((i & 2) != 0) {
            str2 = customConnectorApiKeyConnectorJson.mode;
        }
        if ((i & 4) != 0) {
            list = customConnectorApiKeyConnectorJson.hosts;
        }
        if ((i & 8) != 0) {
            list2 = customConnectorApiKeyConnectorJson.token_proxy;
        }
        return customConnectorApiKeyConnectorJson.copy(str, str2, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorApiKeyConnectorJson customConnectorApiKeyConnectorJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(customConnectorApiKeyConnectorJson.name)) {
            c9j5.AAV(customConnectorApiKeyConnectorJson.name, c9iZ, 0);
        }
        if (zAfR || !"".equals(customConnectorApiKeyConnectorJson.mode)) {
            c9j5.AAV(customConnectorApiKeyConnectorJson.mode, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(customConnectorApiKeyConnectorJson.hosts)) {
            c9j5.AAQ(customConnectorApiKeyConnectorJson.hosts, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(customConnectorApiKeyConnectorJson.token_proxy)) {
            c9j5.AAQ(customConnectorApiKeyConnectorJson.token_proxy, C3cH.A15(f0cArr, 3), c9iZ, 3);
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

    public int hashCode() {
        return AnonymousClass005.A0G(this.token_proxy, AnonymousClass005.A0F(this.hosts, AnonymousClass005.A0I(this.mode, AnonymousClass001.A0G(this.name))));
    }

    public final CustomConnectorApiKeyConnector toDomain() {
        String str = this.name;
        String str2 = this.mode;
        List<String> list = this.hosts;
        List<CustomConnectorApiKeyTokenProxyRuleJson> list2 = this.token_proxy;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<CustomConnectorApiKeyTokenProxyRuleJson> it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new CustomConnectorApiKeyConnector(str, str2, list, arrayListA0i);
    }

    public final CustomConnectorApiKeyConnectorJson copy(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRuleJson> list2) {
        AnonymousClass005.A14(str, str2, list, list2);
        return new CustomConnectorApiKeyConnectorJson(str, str2, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public CustomConnectorApiKeyConnectorJson(String str, String str2, List<String> list, List<CustomConnectorApiKeyTokenProxyRuleJson> list2) {
        AnonymousClass005.A14(str, str2, list, list2);
        this.name = str;
        this.mode = str2;
        this.hosts = list;
        this.token_proxy = list2;
    }

    public /* synthetic */ CustomConnectorApiKeyConnectorJson(String str, String str2, List list, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C0881AGi.A00 : list, (i & 8) != 0 ? C0881AGi.A00 : list2);
    }

    public /* synthetic */ CustomConnectorApiKeyConnectorJson(int i, String str, String str2, List list, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.mode = "";
        } else {
            this.mode = str2;
        }
        if ((i & 4) == 0) {
            this.hosts = C0881AGi.A00;
        } else {
            this.hosts = list;
        }
        if ((i & 8) == 0) {
            this.token_proxy = C0881AGi.A00;
        } else {
            this.token_proxy = list2;
        }
    }
}
