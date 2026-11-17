package com.facebook.aura.partners.voice.uicontrol;

import X.AbstractC3358CGz;
import X.HtJ;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiSuggestionLabel;

/* loaded from: classes2.dex */
public final class InvalidCallAvatarUpdateUiAction implements ContributedUiAction {
    public static final InvalidCallAvatarUpdateUiAction INSTANCE = new InvalidCallAvatarUpdateUiAction();

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof InvalidCallAvatarUpdateUiAction);
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
        return new UiActionExecutor.Result.Unsupported("call_avatar_updated params could not be decoded.", "invalid_params");
    }

    public String toString() {
        return "InvalidCallAvatarUpdateUiAction";
    }

    public int hashCode() {
        return -1309637779;
    }
}
