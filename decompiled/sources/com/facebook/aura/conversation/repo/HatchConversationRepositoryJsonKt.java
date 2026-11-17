package com.facebook.aura.conversation.repo;

import X.C10571Hud;
import X.C3cG;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HatchConversationRepositoryJsonKt {
    public static final CancelChatResult parseCancelChatResponse(JsonElement jsonElement) {
        Object objA0s;
        String str = null;
        JsonElement jsonElement2 = null;
        if (jsonElement instanceof JsonObject) {
            jsonElement2 = jsonElement;
        }
        boolean z = false;
        if (jsonElement2 != null) {
            try {
                objA0s = ((CancelChatResponseJson) HatchJsonKt.HatchJson.A01(CancelChatResponseJson$$serializer.INSTANCE, jsonElement2)).payload;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            CancelChatPayloadJson cancelChatPayloadJson = (CancelChatPayloadJson) objA0s;
            if (cancelChatPayloadJson != null) {
                z = cancelChatPayloadJson.cancelled;
                String str2 = cancelChatPayloadJson.message_id;
                if (str2.length() > 0) {
                    str = str2;
                }
            }
        }
        return new CancelChatResult(z, str);
    }
}
