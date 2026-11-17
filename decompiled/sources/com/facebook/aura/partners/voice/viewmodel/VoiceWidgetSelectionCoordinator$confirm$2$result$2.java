package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.JSONState;

/* loaded from: classes4.dex */
public final class VoiceWidgetSelectionCoordinator$confirm$2$result$2 extends AbstractC7559F3s implements G0U<JSONState, Boolean> {
    public static final VoiceWidgetSelectionCoordinator$confirm$2$result$2 INSTANCE = new VoiceWidgetSelectionCoordinator$confirm$2$result$2();

    public VoiceWidgetSelectionCoordinator$confirm$2$result$2() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        return Boolean.valueOf(AnonymousClass002.A1Y(VoiceWidgetSelectionCoordinatorKt.voiceWidgetSelectedVoiceId(jSONState)));
    }
}
