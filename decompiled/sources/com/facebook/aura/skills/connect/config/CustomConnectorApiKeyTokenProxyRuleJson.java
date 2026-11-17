package com.facebook.aura.skills.connect.config;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;

@Serializable
/* loaded from: classes4.dex */
public final class CustomConnectorApiKeyTokenProxyRuleJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String field;
    public final JsonElement placement;

    public final class Companion {
        public final C9hr<CustomConnectorApiKeyTokenProxyRuleJson> serializer() {
            return CustomConnectorApiKeyTokenProxyRuleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_connect_config_config(CustomConnectorApiKeyTokenProxyRuleJson customConnectorApiKeyTokenProxyRuleJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(customConnectorApiKeyTokenProxyRuleJson.field)) {
            c9j5.AAV(customConnectorApiKeyTokenProxyRuleJson.field, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(customConnectorApiKeyTokenProxyRuleJson.placement, JsonNull.A00)) {
            c9j5.AAQ(customConnectorApiKeyTokenProxyRuleJson.placement, JsonElementSerializer.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomConnectorApiKeyTokenProxyRuleJson) {
                CustomConnectorApiKeyTokenProxyRuleJson customConnectorApiKeyTokenProxyRuleJson = (CustomConnectorApiKeyTokenProxyRuleJson) obj;
                if (!C7384Etj.areEqual(this.field, customConnectorApiKeyTokenProxyRuleJson.field) || !C7384Etj.areEqual(this.placement, customConnectorApiKeyTokenProxyRuleJson.placement)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CustomConnectorApiKeyTokenProxyRuleJson copy$default(CustomConnectorApiKeyTokenProxyRuleJson customConnectorApiKeyTokenProxyRuleJson, String str, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customConnectorApiKeyTokenProxyRuleJson.field;
        }
        if ((i & 2) != 0) {
            jsonElement = customConnectorApiKeyTokenProxyRuleJson.placement;
        }
        AnonymousClass003.A0u(str, jsonElement);
        return new CustomConnectorApiKeyTokenProxyRuleJson(str, jsonElement);
    }

    public final String component1() {
        return this.field;
    }

    public final JsonElement component2() {
        return this.placement;
    }

    public final String getField() {
        return this.field;
    }

    public final JsonElement getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.placement, AnonymousClass001.A0G(this.field));
    }

    public final CustomConnectorApiKeyTokenProxyRule toDomain() {
        return new CustomConnectorApiKeyTokenProxyRule(this.field, CustomConnectorConfigJsonKt.toDomain(this.placement));
    }

    public CustomConnectorApiKeyTokenProxyRuleJson(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        this.field = str;
        this.placement = jsonElement;
    }

    public final CustomConnectorApiKeyTokenProxyRuleJson copy(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        return new CustomConnectorApiKeyTokenProxyRuleJson(str, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CustomConnectorApiKeyTokenProxyRuleJson(int i, String str, JsonElement jsonElement, C2hx c2hx) {
        this.field = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.placement = JsonNull.A00;
        } else {
            this.placement = jsonElement;
        }
    }

    public /* synthetic */ CustomConnectorApiKeyTokenProxyRuleJson(String str, JsonElement jsonElement, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? JsonNull.A00 : jsonElement);
    }

    public CustomConnectorApiKeyTokenProxyRuleJson() {
        this("", JsonNull.A00);
    }
}
