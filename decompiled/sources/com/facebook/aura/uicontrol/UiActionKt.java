package com.facebook.aura.uicontrol;

import X.C7384Etj;
import com.facebook.aura.uicontrol.UiAction;

/* loaded from: classes6.dex */
public abstract class UiActionKt {
    public static final boolean isPerformOnly(UiAction uiAction) {
        C7384Etj.A0Y(uiAction, 0);
        return uiAction.equals(UiAction.NavigateBack.INSTANCE) || ((uiAction instanceof UiAction.Contributed) && ((UiAction.Contributed) uiAction).action.getSuggestionLabel() == null);
    }
}
