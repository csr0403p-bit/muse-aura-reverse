package com.facebook.aura.partners.voice.uicontrol;

import X.AbstractC3358CGz;
import X.CFK;
import X.HtJ;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiSuggestionLabel;

/* loaded from: classes2.dex */
public final class IgnoredCallAvatarUpdateUiAction implements ContributedUiAction {
    public static final IgnoredCallAvatarUpdateUiAction INSTANCE = new IgnoredCallAvatarUpdateUiAction();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof IgnoredCallAvatarUpdateUiAction);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Object perform(AbstractC3358CGz abstractC3358CGz, HtJ<? super UiActionExecutor.Result> htJ) {
        if (!VoiceCallSupport.INSTANCE.isLiveAvatarUpdateSupported()) {
            return new UiActionExecutor.Result.Unsupported("Live avatar updates are not available on this client.", "unsupported_target");
        }
        CFK.A06(VoiceUiCommandsKt.TAG, "Ignoring call_avatar_updated with an unknown status or no target_call_id");
        return UiActionExecutor.Result.Performed.INSTANCE;
    }

    public String toString() {
        return "IgnoredCallAvatarUpdateUiAction";
    }

    public int hashCode() {
        return -559403704;
    }
}
