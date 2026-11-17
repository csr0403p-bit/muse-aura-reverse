package com.facebook.aura.partners.voice.viewmodel;

import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.model.JSONState;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class VoiceWidgetSelectionCoordinatorKt {
    public static final String SELECTION_SOURCE_BROWSE_ALL = "browse_all";
    public static final String SELECTION_SOURCE_KEY = "selection_source";
    public static final String TAG = "VoiceWidgetSelectionCoordinator";

    public static final String confirmedWidgetVoiceId(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        if (VoiceGating.INSTANCE.isWidgetConfirmationEnabled()) {
            return voiceWidgetSelectedVoiceId(jSONState);
        }
        return null;
    }

    public static final boolean voiceWidgetPickedFromBrowseAll(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        return SELECTION_SOURCE_BROWSE_ALL.equals(stringValue(jSONState, SELECTION_SOURCE_KEY));
    }

    public static final String voiceWidgetSelectedVoiceId(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        String strStringValue = stringValue(jSONState, "selectedVoiceId");
        return strStringValue == null ? stringValue(jSONState, "selectedValue") : strStringValue;
    }

    public static final String stringValue(JSONState jSONState, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jSONState.data.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01()) {
            String strA00 = jsonPrimitive.A00();
            if (!C7BY.A0j(strA00)) {
                return strA00;
            }
        }
        return null;
    }

    public static final boolean voiceOptionPlays(String str, boolean z) {
        return str == null && !z;
    }
}
