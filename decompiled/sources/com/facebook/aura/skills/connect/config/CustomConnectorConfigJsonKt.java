package com.facebook.aura.skills.connect.config;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.F60;
import X.FGI;
import android.util.Base64;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class CustomConnectorConfigJsonKt {
    public static final String parseCustomConnectorName(CustomConnectorMode customConnectorMode, String str) {
        Object objA0s;
        boolean zA1a = AnonymousClass002.A1a(customConnectorMode, str);
        try {
            int iOrdinal = customConnectorMode.ordinal();
            if (iOrdinal == 0) {
                objA0s = ((CustomConnectorApiKeyNameProbeJson) HatchJsonKt.HatchJson.A00(parseBase64UrlJsonString(str), CustomConnectorApiKeyNameProbeJson$$serializer.INSTANCE)).connector.name;
            } else {
                if (iOrdinal != zA1a) {
                    throw C3cG.A0q();
                }
                objA0s = ((CustomConnectorOAuthNameProbeJson) HatchJsonKt.HatchJson.A00(parseBase64UrlJsonString(str), CustomConnectorOAuthNameProbeJson$$serializer.INSTANCE)).credential.name;
            }
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        String str2 = (String) objA0s;
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        return str2;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomConnectorMode.values().length];
            try {
                AnonymousClass002.A13(CustomConnectorMode.API_KEY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CustomConnectorMode.OAUTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String asStringOrNull(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement toDomain(kotlinx.serialization.json.JsonElement r1) {
        /*
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L17
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            java.lang.String r1 = r1.A00()
            java.lang.String r0 = "bearer_header"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$BearerHeader r1 = com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement.BearerHeader.INSTANCE
        L14:
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement r1 = (com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement) r1
            return r1
        L17:
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L5f
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            java.lang.String r0 = "custom_header"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L33
            java.lang.String r0 = asStringOrNull(r0)
            if (r0 == 0) goto L33
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$CustomHeader r1 = new com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$CustomHeader
            r1.<init>(r0)
            goto L14
        L33:
            java.lang.String r0 = "url_path_segment"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L49
            java.lang.String r0 = asStringOrNull(r0)
            if (r0 == 0) goto L49
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$UrlPathSegment r1 = new com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$UrlPathSegment
            r1.<init>(r0)
            goto L14
        L49:
            java.lang.String r0 = "query_param"
            java.lang.Object r0 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0
            if (r0 == 0) goto L5f
            java.lang.String r0 = asStringOrNull(r0)
            if (r0 == 0) goto L5f
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$QueryParam r1 = new com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$QueryParam
            r1.<init>(r0)
            return r1
        L5f:
            com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement$Invalid r1 = com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement.Invalid.INSTANCE
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.config.CustomConnectorConfigJsonKt.toDomain(kotlinx.serialization.json.JsonElement):com.facebook.aura.skills.connect.config.CustomConnectorApiKeyPlacement");
    }

    public static final /* synthetic */ <T> T parseBase64UrlJson(String str) {
        parseBase64UrlJsonString(str);
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public static final String parseBase64UrlJsonString(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() <= 0) {
            throw C60O.A0i("config is empty");
        }
        if (strA0l.startsWith("{")) {
            return strA0l;
        }
        String strReplace = strA0l.replace('-', '+').replace('_', '/');
        byte[] bArrDecode = Base64.decode(FGI.A0M(strReplace, AbstractC2159Azp.A0y(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, (4 - (strReplace.length() % 4)) % 4)), 0);
        C7384Etj.A0X(bArrDecode);
        Charset charset = StandardCharsets.UTF_8;
        C7384Etj.A0V(charset);
        return new String(bArrDecode, charset);
    }

    public static final CustomConnectorApiKeyConfig parseCustomConnectorApiKeyConfig(String str) {
        return ((CustomConnectorApiKeyConfigJson) C8j3.A1G(str).A00(parseBase64UrlJsonString(str), CustomConnectorApiKeyConfigJson$$serializer.INSTANCE)).toDomain();
    }

    public static final CustomConnectorOAuthConfig parseCustomConnectorOAuthConfig(String str) {
        return ((CustomConnectorOAuthConfigJson) C8j3.A1G(str).A00(parseBase64UrlJsonString(str), CustomConnectorOAuthConfigJson$$serializer.INSTANCE)).toDomain();
    }
}
