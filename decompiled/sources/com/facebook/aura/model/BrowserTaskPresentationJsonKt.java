package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class BrowserTaskPresentationJsonKt {
    public static final BrowserTaskPresentation parseBrowserTaskPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (BrowserTaskPresentationJson) HatchJsonKt.HatchJson.A01(BrowserTaskPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        BrowserTaskPresentationJson browserTaskPresentationJson = (BrowserTaskPresentationJson) objA0s;
        if (browserTaskPresentationJson != null) {
            return browserTaskPresentationJson.toDomain();
        }
        return null;
    }
}
