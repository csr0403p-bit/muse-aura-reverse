package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C9hr;
import X.F0C;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class IdeaSharingJsonKt {
    public static final IdeaSharing parseIdeaSharing(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            F0C<C9hr<Object>>[] f0cArr = IdeaSharing.$childSerializers;
            return new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        }
        try {
            objA0s = ((IdeaSharingJson) HatchJsonKt.HatchJson.A01(IdeaSharingJson$$serializer.INSTANCE, jsonElement)).toDomain();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        F0C<C9hr<Object>>[] f0cArr2 = IdeaSharing.$childSerializers;
        Object ideaSharing = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        if (objA0s instanceof C10571Hud) {
            objA0s = ideaSharing;
        }
        return (IdeaSharing) objA0s;
    }
}
