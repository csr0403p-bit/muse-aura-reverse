package com.facebook.aura.skills.connect.repository;

import X.C2nw;
import X.C3cG;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement;
import com.facebook.aura.skills.connect.config.CustomConnectorApiKeyTokenProxyRule;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class CustomConnectorRegisterJsonKt {
    public static final CustomConnectorApiKeyTokenProxyRuleJson toJson(CustomConnectorApiKeyTokenProxyRule customConnectorApiKeyTokenProxyRule) {
        C7384Etj.A0Y(customConnectorApiKeyTokenProxyRule, 0);
        return new CustomConnectorApiKeyTokenProxyRuleJson(customConnectorApiKeyTokenProxyRule.field, toJsonElement(customConnectorApiKeyTokenProxyRule.placement));
    }

    public static final JsonElement toJsonElement(CustomConnectorApiKeyPlacement customConnectorApiKeyPlacement) {
        String str;
        C2nw c2nw;
        JsonPrimitive jsonPrimitiveA07;
        String str2;
        JsonElement jsonElementA00;
        if (!C7384Etj.areEqual(customConnectorApiKeyPlacement, CustomConnectorApiKeyPlacement.BearerHeader.INSTANCE)) {
            if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.CustomHeader) {
                c2nw = new C2nw();
                jsonPrimitiveA07 = C9oY.A07(((CustomConnectorApiKeyPlacement.CustomHeader) customConnectorApiKeyPlacement).value);
                str2 = "custom_header";
            } else if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.UrlPathSegment) {
                c2nw = new C2nw();
                jsonPrimitiveA07 = C9oY.A07(((CustomConnectorApiKeyPlacement.UrlPathSegment) customConnectorApiKeyPlacement).value);
                str2 = "url_path_segment";
            } else if (customConnectorApiKeyPlacement instanceof CustomConnectorApiKeyPlacement.QueryParam) {
                c2nw = new C2nw();
                jsonPrimitiveA07 = C9oY.A07(((CustomConnectorApiKeyPlacement.QueryParam) customConnectorApiKeyPlacement).value);
                str2 = "query_param";
            } else {
                if (!C7384Etj.areEqual(customConnectorApiKeyPlacement, CustomConnectorApiKeyPlacement.Invalid.INSTANCE)) {
                    throw C3cG.A0q();
                }
                str = "";
            }
            c2nw.A01(str2, jsonPrimitiveA07);
            jsonElementA00 = c2nw.A00();
            return jsonElementA00;
        }
        str = "bearer_header";
        jsonElementA00 = C9oY.A07(str);
        return jsonElementA00;
    }
}
