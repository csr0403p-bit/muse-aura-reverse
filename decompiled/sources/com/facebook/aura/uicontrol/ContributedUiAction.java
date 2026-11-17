package com.facebook.aura.uicontrol;

import X.AbstractC3358CGz;
import X.HtJ;
import com.facebook.aura.uicontrol.UiActionExecutor;

/* loaded from: classes6.dex */
public interface ContributedUiAction {
    Integer getIconRes();

    UiSuggestionLabel getSuggestionLabel();

    Object perform(AbstractC3358CGz abstractC3358CGz, HtJ<? super UiActionExecutor.Result> htJ);
}
