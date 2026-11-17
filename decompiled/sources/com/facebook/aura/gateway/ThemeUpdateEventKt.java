package com.facebook.aura.gateway;

import X.C60O;
import X.C7384Etj;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ThemeUpdateEventKt {
    public static final ThemeUpdateEvent parseThemeUpdateEvent(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject jsonObjectA1J = C60O.A1J(jsonObject);
        if (jsonObjectA1J == null) {
            return null;
        }
        String strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObjectA1J, "selected_theme_id");
        if (strOptStringOrNull == null) {
            strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObjectA1J, "selectedThemeId");
        }
        return new ThemeUpdateEvent(strOptStringOrNull);
    }
}
