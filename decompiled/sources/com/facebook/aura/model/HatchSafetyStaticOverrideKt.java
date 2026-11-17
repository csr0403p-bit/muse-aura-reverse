package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C3cG;
import X.CFK;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.SafetyStaticOverride;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public abstract class HatchSafetyStaticOverrideKt {
    public static final String STATIC_RESPONSE_OVERRIDE = "static_response";
    public static final String TAG = "HatchSafetyStaticOverride";

    public static final String extractStaticRefusalText(JsonElement jsonElement, String str) {
        Object objPrevious;
        HatchTranscriptMessage hatchTranscriptMessage;
        Object objPrevious2;
        if (jsonElement == null) {
            return null;
        }
        HatchDeltaTranscript hatchDeltaTranscriptFromJson = HatchDeltaTranscript.Companion.fromJson(jsonElement);
        if (hatchDeltaTranscriptFromJson == null) {
            CFK.A04(TAG, "transcript parse failed");
            return null;
        }
        if (str == null || str.length() == 0) {
            ListIterator listIteratorA0n = C3cG.A0n(hatchDeltaTranscriptFromJson.messages);
            while (true) {
                if (!listIteratorA0n.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIteratorA0n.previous();
                if ("assistant".equals(((HatchTranscriptMessage) objPrevious).role)) {
                    break;
                }
            }
            hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious;
        } else {
            ListIterator listIteratorA0n2 = C3cG.A0n(hatchDeltaTranscriptFromJson.messages);
            while (true) {
                if (!listIteratorA0n2.hasPrevious()) {
                    objPrevious2 = null;
                    break;
                }
                objPrevious2 = listIteratorA0n2.previous();
                HatchTranscriptMessage hatchTranscriptMessage2 = (HatchTranscriptMessage) objPrevious2;
                if (str.equals(hatchTranscriptMessage2.id) && "assistant".equals(hatchTranscriptMessage2.role)) {
                    break;
                }
            }
            hatchTranscriptMessage = (HatchTranscriptMessage) objPrevious2;
        }
        if (hatchTranscriptMessage == null) {
            return null;
        }
        List<HatchContentBlock> list = hatchTranscriptMessage.content;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchContentBlock hatchContentBlock : list) {
            if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
                arrayListA0h.add(hatchContentBlock);
            }
        }
        String strA0l = AnonymousClass002.A0l(AbstractC0878AGe.A0L("", "", "", arrayListA0h, HatchSafetyStaticOverrideKt$extractStaticRefusalText$text$1.INSTANCE));
        if (strA0l.length() > 0) {
            return strA0l;
        }
        return null;
    }

    public static final boolean isStaticResponseOverride(String str) {
        return STATIC_RESPONSE_OVERRIDE.equals(str);
    }

    public static final SafetyStaticOverride safetyStaticOverride(String str, JsonElement jsonElement, String str2) {
        if (!STATIC_RESPONSE_OVERRIDE.equals(str)) {
            return SafetyStaticOverride.None.INSTANCE;
        }
        String strExtractStaticRefusalText = extractStaticRefusalText(jsonElement, str2);
        return strExtractStaticRefusalText != null ? new SafetyStaticOverride.Refusal(strExtractStaticRefusalText) : SafetyStaticOverride.Invalid.INSTANCE;
    }
}
