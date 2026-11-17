package com.facebook.aura.partners.voice.uicontrol;

import X.AbstractC3358CGz;
import X.FGI;
import X.HtJ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.key.HatchSettingsSubdestination;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiControlActionSink;
import com.facebook.aura.uicontrol.UiSuggestionLabel;

/* loaded from: classes3.dex */
public final class OpenVoiceSettingsUiAction implements ContributedUiAction {
    public static final OpenVoiceSettingsUiAction INSTANCE = new OpenVoiceSettingsUiAction();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof OpenVoiceSettingsUiAction);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Object perform(AbstractC3358CGz abstractC3358CGz, HtJ<? super UiActionExecutor.Result> htJ) {
        UiControlActionSink.Companion.getInstance(abstractC3358CGz).publishNavigation(FGI.A0M("hatch://settings?section=", HatchSettingsSubdestination.VOICE.getWireValue()));
        return UiActionExecutor.Result.Performed.INSTANCE;
    }

    public String toString() {
        return "OpenVoiceSettingsUiAction";
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return Integer.valueOf(R.drawable.voice_phone_handset_outline_24);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return new UiSuggestionLabel(R.string._name_removed__res_0x7f120be9, R.string._name_removed__res_0x7f120bee);
    }

    public int hashCode() {
        return -956309343;
    }
}
