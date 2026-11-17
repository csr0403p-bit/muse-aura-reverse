package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ScheduledTaskCreatedPresentationJsonKt {
    public static final ScheduledTaskCreatedPresentation parseScheduledTaskCreatedPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (ScheduledTaskCreatedPresentationJson) HatchJsonKt.HatchJson.A01(ScheduledTaskCreatedPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ScheduledTaskCreatedPresentationJson scheduledTaskCreatedPresentationJson = (ScheduledTaskCreatedPresentationJson) objA0s;
        if (scheduledTaskCreatedPresentationJson != null) {
            return scheduledTaskCreatedPresentationJson.toDomain();
        }
        return null;
    }
}
