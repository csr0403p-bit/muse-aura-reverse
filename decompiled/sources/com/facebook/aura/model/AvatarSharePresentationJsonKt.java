package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C7BY;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class AvatarSharePresentationJsonKt {
    public static final String VIDEO_VARIANT_NOT_SENT = "video_variant_not_sent";

    public static final String firstNonBlank(String... strArr) {
        for (String str : strArr) {
            if (str != null && !C7BY.A0j(str)) {
                return str;
            }
        }
        return null;
    }

    public static final AvatarSharePresentationData parseAvatarSharePresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (AvatarSharePresentationJson) HatchJsonKt.HatchJson.A01(AvatarSharePresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        AvatarSharePresentationJson avatarSharePresentationJson = (AvatarSharePresentationJson) objA0s;
        if (avatarSharePresentationJson != null) {
            return avatarSharePresentationJson.toDomain();
        }
        return null;
    }
}
