package com.facebook.aura.auth;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class AuraTokenExchangerJsonKt {
    public static final String TAG = "AuraTokenExchanger";

    public static final RefreshedTokens parseRefreshAccessTokenResponse(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (RefreshAccessTokenResponseJson) HatchJsonKt.HatchJson.A00(str, RefreshAccessTokenResponseJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A("AuraTokenExchanger", "refresh access token response parse failed", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        RefreshAccessTokenResponseJson refreshAccessTokenResponseJson = (RefreshAccessTokenResponseJson) objA0s;
        if (refreshAccessTokenResponseJson == null) {
            return null;
        }
        String str2 = refreshAccessTokenResponseJson.access_token;
        if (C7BY.A0j(str2) || str2 == null) {
            return null;
        }
        String str3 = refreshAccessTokenResponseJson.refresh_token;
        if (C7BY.A0j(str3) || str3 == null) {
            return null;
        }
        return new RefreshedTokens(str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:3:0x0005, B:5:0x0013, B:9:0x001c, B:11:0x0020, B:16:0x002a, B:18:0x002e), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String parseTokenExchangeErrorMessage(java.lang.String r4) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            r3 = 0
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L37
            com.facebook.aura.auth.TokenExchangeErrorJson$$serializer r0 = com.facebook.aura.auth.TokenExchangeErrorJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L37
            java.lang.Object r2 = r1.A00(r4, r0)     // Catch: java.lang.Exception -> L37
            com.facebook.aura.auth.TokenExchangeErrorJson r2 = (com.facebook.aura.auth.TokenExchangeErrorJson) r2     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r2.detail     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L1c
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L1a
            r1 = r3
        L1a:
            if (r1 != 0) goto L36
        L1c:
            java.lang.String r1 = r2.message     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L27
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L27
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 != 0) goto L36
            java.lang.String r1 = r2.error     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L35
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Exception -> L37
            if (r0 != 0) goto L35
            goto L36
        L35:
            return r3
        L36:
            return r1
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.AuraTokenExchangerJsonKt.parseTokenExchangeErrorMessage(java.lang.String):java.lang.String");
    }

    public static final TokenExchangeResult parseTokenExchangeResponse(String str) {
        Object objA0s;
        String strA00;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (TokenExchangeResponseJson) HatchJsonKt.HatchJson.A00(str, TokenExchangeResponseJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A("AuraTokenExchanger", "token exchange response parse failed", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        TokenExchangeResponseJson tokenExchangeResponseJson = (TokenExchangeResponseJson) objA0s;
        if (tokenExchangeResponseJson == null) {
            return null;
        }
        String str2 = tokenExchangeResponseJson.access_token;
        if (str2.length() <= 0) {
            return null;
        }
        JsonPrimitive jsonPrimitiveAsJsonPrimitiveOrNull = JsonObjectExtensionsKt.asJsonPrimitiveOrNull(tokenExchangeResponseJson.abra_user_id);
        if (jsonPrimitiveAsJsonPrimitiveOrNull == null || (strA00 = jsonPrimitiveAsJsonPrimitiveOrNull.A00()) == null || strA00.length() <= 0) {
            strA00 = tokenExchangeResponseJson.user_id;
            if (strA00.length() <= 0) {
                return null;
            }
        }
        String str3 = tokenExchangeResponseJson.refresh_token;
        return new TokenExchangeResult(str2, strA00, C7BY.A0j(str3) ? null : str3);
    }

    public static final String buildLogoutRequestBody(String str) {
        return HatchJsonKt.HatchJson.A02(new LogoutRequestJson(str), LogoutRequestJson$$serializer.INSTANCE);
    }

    public static final String buildRefreshAccessTokenRequestBody(String str) {
        return C8j3.A1G(str).A02(new RefreshAccessTokenRequestJson(str), RefreshAccessTokenRequestJson$$serializer.INSTANCE);
    }

    public static final String buildTokenExchangeRequestBody(String str) {
        return C8j3.A1G(str).A02(new TokenExchangeRequestJson(str), TokenExchangeRequestJson$$serializer.INSTANCE);
    }
}
