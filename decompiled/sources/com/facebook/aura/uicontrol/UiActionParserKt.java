package com.facebook.aura.uicontrol;

import X.AnonymousClass002;
import X.C60O;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.uicontrol.UiActionParseResult;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes6.dex */
public abstract class UiActionParserKt {
    public static final String ERROR_CODE_INVALID_PARAMS = "invalid_params";

    public static final UiActionMode parseMode(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        JsonElement jsonElementA1F = jsonObject != null ? C60O.A1F(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, jsonObject) : null;
        if ((jsonElementA1F instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA1F) != null && (strA04 = C9oY.A04(jsonPrimitive)) != null) {
            if (strA04.equalsIgnoreCase("suggest")) {
                return UiActionMode.SUGGEST;
            }
            if (strA04.equalsIgnoreCase("lightup")) {
                return UiActionMode.LIGHTUP;
            }
        }
        return UiActionMode.PERFORM;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.uicontrol.UiActionParseResult parseUiAction(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiActionParserKt.parseUiAction(java.lang.String, java.lang.String):com.facebook.aura.uicontrol.UiActionParseResult");
    }

    public static final String trimmedStringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA00;
        String strA0l;
        C7384Etj.A0Y(str, 1);
        JsonElement jsonElementA1F = jsonObject != null ? C60O.A1F(str, jsonObject) : null;
        if (!(jsonElementA1F instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElementA1F) == null || !jsonPrimitive.A01() || (strA00 = jsonPrimitive.A00()) == null || (strA0l = AnonymousClass002.A0l(strA00)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final UiAction uiActionForCommandId(String str, String str2) {
        UiActionParseResult.Parsed parsed;
        C7384Etj.A0Y(str, 0);
        UiActionParseResult uiAction = parseUiAction(str, str2);
        if (!(uiAction instanceof UiActionParseResult.Parsed) || (parsed = (UiActionParseResult.Parsed) uiAction) == null) {
            return null;
        }
        return parsed.action;
    }

    public static /* synthetic */ UiAction uiActionForCommandId$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return uiActionForCommandId(str, str2);
    }
}
