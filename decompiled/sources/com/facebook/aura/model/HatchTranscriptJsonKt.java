package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HatchTranscriptJsonKt {
    public static final ToolCallMetadataJson toToolCallMetadata(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = ToolCallMetadataJson.$stable;
            objA0s = (ToolCallMetadataJson) c9sU.A01(ToolCallMetadataJson$$serializer.INSTANCE, (JsonObject) jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (ToolCallMetadataJson) (objA0s instanceof C10571Hud ? null : objA0s);
    }
}
