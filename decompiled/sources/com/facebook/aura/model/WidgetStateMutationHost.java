package com.facebook.aura.model;

import X.G0U;
import X.HtJ;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public interface WidgetStateMutationHost {
    WidgetStateSource captureWidgetState(String str, String str2);

    Object patchWidgetState(WidgetStateSource widgetStateSource, JsonObject jsonObject, G0U<? super JSONState, Boolean> g0u, HtJ<? super WidgetStateMutationResult> htJ);

    Object restoreWidgetState(String str, String str2, HtJ<? super WidgetStateSource> htJ);
}
