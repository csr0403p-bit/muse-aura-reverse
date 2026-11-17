package com.facebook.aura.uicontrol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class UiSuggestion extends C06G {
    public final UiAction action;
    public final String invokeId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UiSuggestion) {
                UiSuggestion uiSuggestion = (UiSuggestion) obj;
                if (!C7384Etj.areEqual(this.invokeId, uiSuggestion.invokeId) || !C7384Etj.areEqual(this.action, uiSuggestion.action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UiSuggestion copy$default(UiSuggestion uiSuggestion, String str, UiAction uiAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiSuggestion.invokeId;
        }
        if ((i & 2) != 0) {
            uiAction = uiSuggestion.action;
        }
        AnonymousClass003.A0u(str, uiAction);
        return new UiSuggestion(str, uiAction);
    }

    public final String component1() {
        return this.invokeId;
    }

    public final UiAction component2() {
        return this.action;
    }

    public final UiAction getAction() {
        return this.action;
    }

    public final String getInvokeId() {
        return this.invokeId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.action, AnonymousClass001.A0G(this.invokeId));
    }

    public UiSuggestion(String str, UiAction uiAction) {
        AnonymousClass003.A0u(str, uiAction);
        this.invokeId = str;
        this.action = uiAction;
    }

    public final UiSuggestion copy(String str, UiAction uiAction) {
        AnonymousClass003.A0u(str, uiAction);
        return new UiSuggestion(str, uiAction);
    }

    public String toString() {
        return super.toString();
    }
}
