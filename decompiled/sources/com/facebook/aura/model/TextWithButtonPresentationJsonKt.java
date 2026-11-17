package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class TextWithButtonPresentationJsonKt {
    public static final String TEXT_WITH_BUTTON_STYLE_PRIMARY = "primary";

    public static final TextWithButtonPresentation parseTextWithButtonPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = TextWithButtonPresentationJson.$stable;
            objA0s = (TextWithButtonPresentationJson) c9sU.A01(TextWithButtonPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        TextWithButtonPresentationJson textWithButtonPresentationJson = (TextWithButtonPresentationJson) objA0s;
        if (textWithButtonPresentationJson != null) {
            return textWithButtonPresentationJson.toDomain();
        }
        return null;
    }
}
