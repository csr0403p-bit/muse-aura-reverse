package com.facebook.aura.model;

import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class InternalLinkActionCardPresentationJsonKt {
    public static final int MAX_ACTION_LABEL_LENGTH = 40;

    public static final InternalLinkActionCardPresentation parseInternalLinkActionCardPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (InternalLinkActionCardPresentationJson) HatchJsonKt.HatchJson.A01(InternalLinkActionCardPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        InternalLinkActionCardPresentationJson internalLinkActionCardPresentationJson = (InternalLinkActionCardPresentationJson) objA0s;
        if (internalLinkActionCardPresentationJson != null) {
            return internalLinkActionCardPresentationJson.toDomain();
        }
        return null;
    }

    public static final String toCardActionLabel(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (length > 0 && length <= 40) {
            int i = 0;
            while (!Character.isISOControl(strA0l.charAt(i))) {
                i++;
                if (i >= length) {
                    return strA0l;
                }
            }
        }
        return null;
    }
}
