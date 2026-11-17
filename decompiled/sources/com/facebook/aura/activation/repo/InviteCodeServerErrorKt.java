package com.facebook.aura.activation.repo;

import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7BY;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class InviteCodeServerErrorKt {
    public static final String SERVER_ERROR_DETAIL_FIELD = "detail";
    public static final String SERVER_ERROR_TYPE_FIELD = "type";
    public static final Map<String, String> USER_FACING_ERROR_TYPES = C3cH.A0n("inviteCodeWindowExpired", "redemption_window_expired", C3cG.A0r("inviteCodeInvalid", "invalid_code"), C3cG.A0r("inviteCodeRevoked", "code_revoked"), C3cG.A0r("inviteCodeUsedUp", "code_used_up"));

    public static final HxE<String, JsonObject> parseUserFacingErrorType(String str) {
        String strA0l;
        Object objA0s;
        String strOptStringOrNull;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        try {
            objA0s = JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(strA0l));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        JsonObject jsonObject = (JsonObject) objA0s;
        if (jsonObject == null || (strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "type")) == null || !USER_FACING_ERROR_TYPES.containsKey(strOptStringOrNull)) {
            return null;
        }
        return C3cG.A0r(strOptStringOrNull, jsonObject);
    }

    public static final String parseInviteCodeServerErrorMessage(String str) {
        String strOptStringOrNull;
        HxE<String, JsonObject> userFacingErrorType = parseUserFacingErrorType(str);
        if (userFacingErrorType == null || (strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(userFacingErrorType.second, SERVER_ERROR_DETAIL_FIELD)) == null || C7BY.A0j(strOptStringOrNull)) {
            return null;
        }
        return strOptStringOrNull;
    }

    public static final String parseInviteCodeServerErrorResult(String str) {
        HxE<String, JsonObject> userFacingErrorType = parseUserFacingErrorType(str);
        if (userFacingErrorType == null) {
            return null;
        }
        return C60O.A0p(userFacingErrorType.first, USER_FACING_ERROR_TYPES);
    }
}
